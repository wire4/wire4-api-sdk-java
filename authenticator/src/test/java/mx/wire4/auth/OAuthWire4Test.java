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

import mx.wire4.ApiClient;
import mx.wire4.ApiException;
import mx.wire4.ApiResponse;
import mx.wire4.Configuration;
import mx.wire4.api.ContactoApi;
import mx.wire4.api.SaldoApi;
import mx.wire4.core.EnvironmentEnum;
import mx.wire4.model.BalanceListResponse;
import mx.wire4.model.ContactRequest;
import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <i>Fecha de creación: 21 de octubre, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@Ignore
public class OAuthWire4Test {

    private OAuthWire4 oAuthWire4;

    /**
     * Solicitud de contacto
     *
     * Notifica a un asesor Monex para que se ponga en contacto con un posible cliente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oAuthWire4AppAuthorizationTest() throws ApiException {
        System.out.println("running...");

        this.oAuthWire4 = new OAuthWire4("FxUWmqYGZuv8O1qjxstvIyJothMa", "q_rmIiVWy4b2FLgbjfoJtujevDoa",
                EnvironmentEnum.SANDBOX);

        String bearer = "eyJ4NXQiOiJZamszWXpVM1kyTTFOV1V3WkRWa09XWTNOalF4TWpRM01XSTROMkkxWldFd1pUbGpZMll6WkEiLCJraWQiOiJ" +
                "ZamszWXpVM1kyTTFOV1V3WkRWa09XWTNOalF4TWpRM01XSTROMkkxWldFd1pUbGpZMll6WkEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiO" +
                "iJzYW50aWFnby5ncEBvdXRsb29rLmNvbUBkZXYtc2FpbnQuc3BlaW9rLmNvbSIsImF1ZCI6InJOOW82VVBXNmdnNzMzWDFxSDdQbjRi" +
                "bXhmQWEiLCJuYmYiOjE1NzEzNTMyNTQsImF6cCI6InJOOW82VVBXNmdnNzMzWDFxSDdQbjRibXhmQWEiLCJzY29wZSI6ImFtX2FwcGx" +
                "pY2F0aW9uX3Njb3BlIGdlbmVyYWwiLCJpc3MiOiJhcGltLWlkcCIsImV4cCI6MTU3MTM1Njg1NCwiaWF0IjoxNTcxMzUzMjU0LCJqdG" +
                "kiOiI3NTExYmE2Mi1lNDUzLTRkMGUtOTUzZi03YjQ3NWMxYTRiMDUifQ.eYnPi_HGTJCPTsYxIQ6TvMksFaLJ-xjzzhYEI0GXCiQ1Dy" +
                "Uudpnxz3OVZYmKiSTr_gzdWKlE8Eu3cnvpOWgylpUiuBcjXbExVrH0CR6OiRxZVXZmrhY0tJXW5x-st12z90kLVwMhl-E4sYsRwaXIq" +
                "y_rBxPvUqak4XXYaeFS26nIHOkpLS6IbVX_JPOSQME9JgR4xClvxxcQrdcDmTd_GXDV4oT49FkDibDAqF-PgiVrnbH_UM7dlUx2pUT3" +
                "2T-LlwlXdXirpIA2OiiWwPKNBN5QcdEUKEtHUX-WlnYbJ2U5jSRHHjBY87CfIHvWNbVynptarKn5TFm3REdMxiYgA";

        final ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
        //oauth2.setAccessToken(bearer);  //token.accessToken().toString()

        final ContactRequest body = new ContactRequest().address("eoeoeoeo")
                .company("eoekoekoe").contactPerson("aojsosj sojo")
                .email("algo@email.com").phoneNumber("4422102030");

        ContactoApi api;
        int cont = 0;
        do {

            try {

                oauth2.setAccessToken(bearer);
                System.out.println("bearer:" + bearer);
                api = new ContactoApi(defaultClient);
                final ApiResponse<Void> response = api.sendContactUsingPOSTWithHttpInfo(body,"AUTHORIZATION");
                System.out.println("response:" + response.getStatusCode());

                //break;
                if (cont < 5) {

                    bearer = this.oAuthWire4.obtainAccessTokenApp("general");
                    cont++;
                } else {

                    break;
                }
            } catch (ApiException ape) {

                if (ape.getCode() == 401 || ape.getCode() == 403 || cont < 5) {

                    bearer = this.oAuthWire4.obtainAccessTokenApp("general");
                    cont++;
                } else {

                    break;
                }
            }
        } while (true);

        // TODO: test validations
    }

    @Test
    public void oAuthWire4AppUserAuthorizationTest() throws ApiException {

        System.out.println("running...");

        /*
         * Client key: FxUWmqYGZuv8O1qjxstvIyJothMa
         * Client secret: q_rmIiVWy4b2FLgbjfoJtujevDoa
         *
         * subscription: f1504fea-3a8f-475a-a50a-90d3c40efc59
         * Monex contract: 5656561
         * Monex user: rasgado
         *
         * userKey: 071e2b59b354186b3a0158de493536@sandbox.wire4.mx
         * userSecret: 0d1e33e94604f01b4e00d2fcb6b48f
         */
        this.oAuthWire4 = new OAuthWire4("FxUWmqYGZuv8O1qjxstvIyJothMa", "q_rmIiVWy4b2FLgbjfoJtujevDoa",
                EnvironmentEnum.SANDBOX);

        String bearer = "eyJ4NXQiOiJZamszWXpVM1kyTTFOV1V3WkRWa09XWTNOalF4TWpRM01XSTROMkkxWldFd1pUbGpZMll6WkEiLCJraWQiOi" +
                "JZamszWXpVM1kyTTFOV1V3WkRWa09XWTNOalF4TWpRM01XSTROMkkxWldFd1pUbGpZMll6WkEiLCJhbGciOiJSUzI1NiJ9.eyJzdWI" +
                "iOiIxZGMzNmM3MGExZjQ4OTI5YTE3ODE5MTE0MTA5YzhAZGV2LXNhaW50LnNwZWlvay5jb20iLCJhdWQiOiJyTjlvNlVQVzZnZzczM" +
                "1gxcUg3UG40Ym14ZkFhIiwibmJmIjoxNTY4NDEyMTczLCJhenAiOiJyTjlvNlVQVzZnZzczM1gxcUg3UG40Ym14ZkFhIiwic2NvcGU" +
                "iOiJzcGVpX2FkbWluIiwiaXNzIjoiYXBpbS1pZHAiLCJleHAiOjE1Njg0MTU3NzMsImlhdCI6MTU2ODQxMjE3MywianRpIjoiNmRkM" +
                "2ZjODQtMzA4Ny00OWViLWI3NTUtMTJmYjRmNjVjYTZmIn0.T746TFFkTDBfvhuA3xE6s6h2AxzNtHCqn7_f8slNGeNBdKQTrPgmI7I" +
                "NnLPOuhEZJIIz84eIMkCdwJ2sEo3IqB3kGvIzKPhLnuODtbRCvq-i2slrZ4TfKZard-7hdAdz52keSrqIowjgIz9Mi3xkgMFs0f7sz" +
                "yVRffCMPbLhTHruGPf7Bo2GX-_aVKLN21hMMflmKwXi20CvHscTYtqZ9Mo-paVWYWy8Om63Oi12qUWp-FtVuXCTlBccjNOGwXCgw6v" +
                "xEkMQUL54vqzBEFRGXu3qBY8YRcUV4cStVQjjx5KY6k2zKq6WXFNFu2VWDv3XVXxyIgxq9NYC-k_SZmvWPg";

        final ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");

        final String subscription = "f1504fea-3a8f-475a-a50a-90d3c40efc59";
        SaldoApi api;
        int cont = 0;
        do {

            try {

                oauth2.setAccessToken(bearer);
                System.out.println("bearer:" + bearer);
                api = new SaldoApi(defaultClient);
                final BalanceListResponse response = api.getBalanceUsingGET("AUTHORIZATION",subscription);
                System.out.println("response:" + response);

                //break;
                if (cont < 5) {

                    bearer = this.oAuthWire4.obtainAccessTokenAppUser("071e2b59b354186b3a0158de493536@sandbox.wire4.mx",
                            "0d1e33e94604f01b4e00d2fcb6b48f", "spei_admin");
                    cont++;
                } else {

                    break;
                }
            } catch (ApiException ape) {

                if (ape.getCode() == 401 || ape.getCode() == 403 || cont < 5) {

                    bearer = this.oAuthWire4.obtainAccessTokenAppUser("071e2b59b354186b3a0158de493536@sandbox.wire4.mx",
                            "0d1e33e94604f01b4e00d2fcb6b48f", "spei_admin");
                    cont++;
                } else {

                    break;
                }
            }
        } while (true);
    }

    @Test
    public void testLinkedLimitList() {

        final int maxSize = 4;
        final LinkedHashMap<String, String> cache = new LinkedHashMap<String, String>() {

            @Override
            protected boolean removeEldestEntry(final Map.Entry eldest) {
                return size() > maxSize;
            }
        };

        cache.put("A", "A");
        System.out.println(cache);
        cache.put("B", "A");
        System.out.println(cache);
        cache.put("C", "A");
        System.out.println(cache);
        cache.put("D", "A");
        System.out.println(cache);
        cache.put("E", "A");
        System.out.println(cache);
        cache.put("F", "A");
        System.out.println(cache);
        cache.put("G", "A");
        System.out.println(cache);
    }
}
