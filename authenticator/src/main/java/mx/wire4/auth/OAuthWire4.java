/*
 * COPYRIGHT © 2017. TCPIP.
 * PATENT PENDING. ALL RIGHTS RESERVED.
 * SPEI GATEWAY IS REGISTERED TRADEMARKS OF TCPIP.
 *
 * This software is confidential and proprietary information of TCPIP.
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the company policy.
 */
package mx.wire4.auth;

import lombok.Getter;
import lombok.Setter;
import mx.wire4.ApiException;
import mx.wire4.Configuration;
import mx.wire4.core.CachedToken;
import mx.wire4.core.EnvironmentEnum;
import org.apache.commons.lang3.StringUtils;
import org.dmfs.httpessentials.HttpStatus;
import org.dmfs.httpessentials.client.HttpRequestExecutor;
import org.dmfs.httpessentials.exceptions.ProtocolError;
import org.dmfs.httpessentials.exceptions.ProtocolException;
import org.dmfs.httpessentials.httpurlconnection.HttpUrlConnectionExecutor;
import org.dmfs.oauth2.client.*;
import org.dmfs.oauth2.client.grants.ClientCredentialsGrant;
import org.dmfs.oauth2.client.grants.ResourceOwnerPasswordGrant;
import org.dmfs.oauth2.client.grants.TokenRefreshGrant;
import org.dmfs.oauth2.client.scope.BasicScope;
import org.dmfs.rfc3986.encoding.Precoded;
import org.dmfs.rfc3986.uris.LazyUri;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.rfc5545.Duration;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <i>Fecha de creación: 20 de octubre, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@Getter
@Setter
public class OAuthWire4 {

    private static final int MAX_APP_USER_SIZE_CACHED = 100;

    private final static Map<String, CachedToken> tokensCachedAppUser = Collections.synchronizedMap(
            new LinkedHashMap<String, CachedToken>() {

        @Override
        protected boolean removeEldestEntry(final Map.Entry eldest) {

            return size() > MAX_APP_USER_SIZE_CACHED;
        }
    });

    private final CachedToken tokenCachedApp;

    private String clientId;

    private String clientSecret;

    private String tokenUrl;

    public OAuthWire4(final String clientId, final String clientSecret, final EnvironmentEnum environment) {

        this.clientId = clientId;
        this.clientSecret = clientSecret;

        if (environment != null) {

            this.tokenUrl = environment.getTokenUrl();
            Configuration.getDefaultApiClient().setBasePath(environment.getServiceUrl());
        } else {

            throw new IllegalArgumentException("Environment enum value is required...");
        }

        this.tokenCachedApp = new CachedToken(null, null, null);
    }

    public String obtainAccessTokenApp(final String scope) throws ApiException {

        synchronized (this.tokenCachedApp) {

            String accessToken;
            try {

                if (StringUtils.isBlank(scope)) {

                    throw new ApiException(HttpStatus.UNAUTHORIZED.statusCode(), "A least one scope is required...");
                }

                if (this.tokenCachedApp.getToken() != null &&
                        StringUtils.contains(this.tokenCachedApp.getToken().scope().toString(), scope) &&
                        DateTime.now().before(this.tokenCachedApp.getToken().expirationDate())) {

                    return this.tokenCachedApp.getToken().accessToken().toString();
                }

                // Create HttpRequestExecutor to execute HTTP requests
                final HttpRequestExecutor executor = new HttpUrlConnectionExecutor();

                // Request access token using a Client Credentials Grant
                final OAuth2AccessToken token = new ClientCredentialsGrant(buildOAuthClient(),
                        new BasicScope(scope)).accessToken(executor);

                this.tokenCachedApp.setToken(token);
                accessToken = token.accessToken().toString();
            } catch (IOException | ProtocolError | ProtocolException e) {

                throw new ApiException(e);
            }

            return accessToken;
        }
    }

    public String obtainAccessTokenAppUser(final String userKey, final String secretKey,
                                           final String scope) throws ApiException {

        synchronized (tokensCachedAppUser) {

            final String accessToken;
            try {

                this.validObtainAccessTokenAppUser(userKey, secretKey, scope);

                final OAuth2Grant grant;
                final boolean useRefreshToken;
                final CachedToken cachedToken = tokensCachedAppUser.get(userKey + scope);
                if (cachedToken != null) {

                    if (DateTime.now().before(cachedToken.getToken().expirationDate())) {

                        return cachedToken.getToken().accessToken().toString();
                    } else {

                        grant = new TokenRefreshGrant(buildOAuthClient(), cachedToken.getToken());
                        useRefreshToken = true;
                    }
                } else {

                    grant = new ResourceOwnerPasswordGrant(buildOAuthClient(), new BasicScope(scope), userKey,
                            secretKey);
                    useRefreshToken = false;
                }

                // Request access token using a Resource Owner Password Grant
                final OAuth2AccessToken token = executeTokenRequest(userKey, secretKey, scope, grant, useRefreshToken);

                tokensCachedAppUser.put(userKey + scope, new CachedToken(userKey, secretKey, token));
                accessToken = token.accessToken().toString();
            } catch (ProtocolException e) {

                throw new ApiException(e);
            }

            return accessToken;
        }
    }

    private OAuth2AccessToken executeTokenRequest(final String userKey, final String secretKey,
                                                  final String scope, final OAuth2Grant grant,
                                                  final boolean useRefreshToken) throws ApiException {

        try {

            // Create HttpRequestExecutor to execute HTTP requests
            final HttpRequestExecutor executor = new HttpUrlConnectionExecutor();

            return grant.accessToken(executor);
        } catch (IOException | ProtocolError | ProtocolException e) {

            e.printStackTrace();
            if (useRefreshToken) {

                final OAuth2Grant grantRetry = new ResourceOwnerPasswordGrant(buildOAuthClient(), new BasicScope(scope),
                        userKey, secretKey);

                return executeTokenRequest(userKey, secretKey, scope, grantRetry, false);
            } else {

                throw new ApiException(e);
            }
        }
    }

    private void validObtainAccessTokenAppUser(final String userKey, final String secretKey,
                                               final String scope) throws ApiException {

        if (StringUtils.isBlank(userKey)) {

            throw new ApiException(HttpStatus.UNAUTHORIZED.statusCode(), "User key is required...");
        }


        if (StringUtils.isBlank(secretKey)) {

            throw new ApiException(HttpStatus.UNAUTHORIZED.statusCode(), "Secret key is required...");
        }

        if (StringUtils.isBlank(scope)) {

            throw new ApiException(HttpStatus.UNAUTHORIZED.statusCode(), "A least one scope is required...");
        }
    }

    private OAuth2Client buildOAuthClient() {

        // Create OAuth2 provider
        final OAuth2AuthorizationProvider provider = new BasicOAuth2AuthorizationProvider(
                URI.create(this.tokenUrl), // authorization URL - disable for Wire4
                URI.create(this.tokenUrl), // token URL
                new Duration(1,0,3600) /* default expiration time in case the server doesn't return any */);

        // Create OAuth2 client credentials
        final OAuth2ClientCredentials credentials = new BasicOAuth2ClientCredentials(
                this.clientId, this.clientSecret);

        // Create and return OAuth2 client
        return new BasicOAuth2Client(provider, credentials,
                new LazyUri(new Precoded("http://localhost")) /* Redirect URL for refresh token, not used */);
    }
}
