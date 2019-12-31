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

import lombok.extern.slf4j.Slf4j;
import mx.wire4.ApiClient;
import mx.wire4.ApiException;
import mx.wire4.ApiResponse;
import mx.wire4.api.*;
import mx.wire4.core.EnvironmentEnum;
import mx.wire4.model.*;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static mx.wire4.core.EnvironmentEnum.SANDBOX;

/**
 * <i>Fecha de creación: 22 de octubre, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@SuppressWarnings({"UnnecessaryLocalVariable", "UnnecessaryReturnStatement"})
@Ignore
@Slf4j
public class ExamplesTest {

    private static final String CLIENT_ID = "FxUWmqYGZuv8O1qjxstvIyJothMa";

    private static final String CLIENT_SECRET = "kjwbkrPVgXsnaUGzthj55dsFhx4a";

    private static final String SUBSCRIPTION = "f1504fea-3a8f-475a-a50a-90d3c40efc59";

    private static final String USER_KEY = "071e2b59b354186b3a0158de493536@sandbox.wire4.mx";

    private static final String SECRET_KEY = "0d1e33e94604f01b4e00d2fcb6b48f";

    private static final EnvironmentEnum AMBIENT = SANDBOX;

    @Test
    public void sendContact() {

        // Create the api component
        final ContactoApi api = new ContactoApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {

            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final ContactRequest body = new ContactRequest()
                .address("Calle Falsa 123, Col Fantasía")
                .company("Compu Mundo Hiper Mega Red")
                .contactPerson("Homer J Simpson")
                .email("homer.simpson@compumundohipermegared.com")
                .phoneNumber("4422102030");

        try {

            // Obtain the response
            final ApiResponse response = api.sendContactUsingPOSTWithHttpInfo(body);

            System.out.println("Response:" + response.getStatusCode());
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainCepExample() {

        // Create the api component
        final ComprobanteElectrnicoDePagoCepApi api = new ComprobanteElectrnicoDePagoCepApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {

            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final CepSearchBanxico body = new CepSearchBanxico()
                .amount(new BigDecimal("8963.25"))
                .beneficiaryAccount("072680004657656853")
                .beneficiaryBankKey("40072")
                .claveRastreo("58735618")
                .operationDate("05-12-2018")
                .reference("1122334")
                .senderAccount("112680000156896531")
                .senderBankKey("40112");

        try {

            // Obtain the response
            final CepResponse response = api.obtainTransactionCepUsingPOST(body);

            System.out.println("CEP:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void makePreSubscription() {

        // Create the api component
        final SuscripcionesApi api = new SuscripcionesApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {

            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final PreEnrollmentData body = new PreEnrollmentData()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel");

        try {

            // Obtain the response
            final PreEnrollmentResponse response = api.preEnrollmentMonexUserUsingPOST(body);

            System.out.println("Pre-SubscriptionResult:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void deletePreSubscription() {

        // Create the api component
        final SuscripcionesApi api = new SuscripcionesApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {

            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = "2e11655e-392d-48ff-a35f-22a270bbfe7f";

        try {

            // Obtain the response
            final ApiResponse<Void> response = api.removeSubscriptionPendingStatusUsingDELETEWithHttpInfo(subscription);

            System.out.println("Delete Pre-Subscription result:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void deleteSubscription() {

        // Create the api component
        final SuscripcionesApi api = new SuscripcionesApi();

        // Create the authenticator to obtain access token
        // The token URL and Service URL are defined for this environment enum value.
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            // The user_key and user_secret belongs to the subscription to delete
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(
                "86b348442874908861098f03ed9ffa@sandbox.wire4.mx", "9ee9ae9a86446c289656ff40934370",
                    "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = "81b282bb-9056-4412-82de-ab066eae08a4";

        try {

            // Obtain the response
            final ApiResponse<Void> response = api.removeEnrollmentUserUsingDELETEWithHttpInfo(subscription);

            System.out.println("Delete Pre-Subscription result:" + response.getStatusCode());
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainRelationships() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final RelationshipsResponse response = api.getAvailableRelationshipsMonexUsingGET(subscription);

            System.out.println("Relationships response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void preRegisterBeneficiaries() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final AccountRequest body = new AccountRequest()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel")
                .accounts(Collections.singletonList(
                        new Account()
                                .amountLimit(new BigDecimal("10000.00"))
                                .beneficiaryAccount("112680000156896531")
                                .email(Collections.singletonList("beneficiary@wire4.mx"))
                                .kindOfRelationship("RECURRENTE")
                                .numericReferenceSpei("1234567")
                                .paymentConceptSpei("concept spei")
                                .person(new Person()
                                        .name("Bartolomeo")
                                        .middleName("Jay")
                                        .lastName("Simpson"))
                                .relationship("ACREEDOR")
                                .rfc("SJBA920125AB1")
                ));
        try {

            // Obtain the response
            final TokenRequiredResponse response = api.preRegisterAccountsUsingPOST(body, subscription);

            System.out.println("TokenRequiredResponse response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void removeBeneficiariesPendingUsingDELETETest() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String requestId = "3f2c81c4-37e1-4931-9340-98ce1e732672";
        try {

            // Obtain the response
            final ApiResponse response = api.removeBeneficiariesPendingUsingDELETEWithHttpInfo(requestId, subscription);

            System.out.println("Response:" + response.getStatusCode());
        } catch (ApiException e) {

            System.err.println("Exception:" + e.getCause());
            e.printStackTrace();
            // Optional manage exception in consume Wire4 API
            return;
        }
    }

    @Test
    public void obtainBeneficiaries() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String rfc = null; //  null if you can't filter
        try {

            // Obtain the response
            final BeneficiariesResponse response = api.getBeneficiariesForAccountUsingGET(subscription, rfc);

            System.out.println("Relationships response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void changeAmountLimitBeneficiary() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String account = "112680000156896531";
        final AmountRequest body = new AmountRequest()
                .amountLimit(new BigDecimal("20000.00"))
                .currencyCode("MXP")
                .previousAmountLimit(new BigDecimal("10000.00"));
        try {

            // Obtain the response
            final ApiResponse response = api.updateAmountLimitAccountUsingPUTWithHttpInfo(body, account, subscription);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void deleteBeneficiary() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String account = "044680035044988526";

        try {

            // Obtain the response
            final ApiResponse response = api.deleteAccountUsingDELETEWithHttpInfo(account, subscription);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainInstitutions() {

        // Create the api component
        final InstitucionesApi api = new InstitucionesApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {

            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        try {

            // Obtain the response
            final InstitutionsList response = api.getAllInstitutionsUsingGET();

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainBalance() {

        // Create the api component
        final SaldoApi api = new SaldoApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final BalanceListResponse response = api.getBalanceUsingGET(subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void preRegisterBeneficiariesSPID() {

        // Create the api component
        final CuentasDeBeneficiariosSpidApi api = new CuentasDeBeneficiariosSpidApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spid");

        try {

            // Obtain an access token use password flow and scope "spid_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final AccountSpid body = new AccountSpid()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel")
                .amountLimit(new BigDecimal("1000.00"))
                .beneficiaryAccount("112680000156896531")
                .institution(new BeneficiaryInstitution().name("BMONEX"))
                .email(Collections.singletonList("beneficiary.spid@wire4.mx"))
                .kindOfRelationship("RECURRENTE")
                .numericReference("1234567")
                .paymentConcept("concept spid")
                .relationship("ACREEDOR")
                .rfc("SJBA920125AB1");
        try {

            // Obtain the response
            TokenRequiredResponse response = api.preRegisterAccountsUsingPOST1(body, subscription);

            System.out.println("TokenRequiredResponse response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainSPIDClassifications() {

        // Create the api component
        final TransferenciasSpidApi api = new TransferenciasSpidApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spid");

        try {

            // Obtain an access token use password flow and scope "spid_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spid_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final SpidClassificationsResponseDTO response = api.getSpidClassificationsUsingGET(subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void getDepositantsUsingGETTest() {

        // Create the api component
        final DepositantesApi api = new DepositantesApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;

        try {

            // Obtain the response
            final GetDepositants response = api.getDepositantsUsingGET(subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void registerDepositantsUsingPOSTTest() {

        // Create the api component
        final DepositantesApi api = new DepositantesApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final DepositantsRegister body = new DepositantsRegister()
                .alias("Depositant 0292920")
                .currencyCode("MXP")
                .addEmailItem("depositant@wire4.mx")
                .name("Marge Bouvier");

        try {

            // Obtain the response
            final DepositantsResponse response = api.registerDepositantsUsingPOST(body, subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void incomingSpeiTransactionsReport() {

        // Create the api component
        final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final List<Deposit> response = api.incomingSpeiTransactionsReportUsingGET(subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void outgoingSpeiTransactionsReport() {

        // Create the api component
        final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String orderId = null; // null for no filter
        try {

            // Obtain the response
            final List<Payment> response = api.outgoingSpeiTransactionsReportUsingGET(subscription, orderId);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void registerOutgoingSpeiTransactionUsingPOSTTest() {

        // Create the api component
        final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final TransactionsOutgoingRegister body = new TransactionsOutgoingRegister()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel")
                .addTransactionsItem(new TransactionOutgoing()
                        .orderId("3f85b276-0ef3-49d9-91b2-564a0e9298ea")
                        .amount(new BigDecimal("120.25"))
                        .beneficiaryAccount("112680000156896531")
                        .currencyCode("MXP")
                        .addEmailItem("notificar@wire4.mx")
                        .concept("Transfer out test 1")
                        .reference(1234567)
                );

        try {

            // Obtain the response
            final TokenRequiredResponse response = api.registerOutgoingSpeiTransactionUsingPOST(body, subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void deleteOutgoingSpeiTransactionUsingDELETETest() {

        // Create the api component
        final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spei");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String requestId = "fcb62831-cc04-4b3b-93d4-39e698a3bad6";
        try {

            // Obtain the response
            final ApiResponse response = api.dropTransactionsPendingUsingDELETEWithHttpInfo(requestId, subscription);

            System.out.println("Response:" + response.getStatusCode());
        } catch (ApiException e) {

            System.err.println("Exception:" + e.getCause());
            e.printStackTrace();
            // Optional manage exception in consume Wire4 API
            return;
        }
    }

    @Test
    public void registerOutgoingSpidTransactionUsingPOSTTest() {

        // Create the api component
        final TransferenciasSpidApi api = new TransferenciasSpidApi();

        // Create the authenticator to obtain access token
        //final OAuthWire4 oAuthWire4 = new OAuthWire4("rN9o6UPW6gg733X1qH7Pn4bmxfAa", "nNxxIsN_ErSNh20k440L7w2dTv8a", SANDBOX);
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);


        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app_user_spid");

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            //final String bearer = oAuthWire4.obtainAccessTokenAppUser("fd6a581b88440c58e39a0e179adb21@dev-saint.speiok.com", "95dd3b617e2425c89b5b3faff89749", "spid_admin");
            final String bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        //final String subscription = "ad30176d-c826-4f89-9b48-3d8b614ed826";
        final String subscription = SUBSCRIPTION;
        final TransactionOutgoingSpid body = new TransactionOutgoingSpid()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel")
                .orderId("c3fc9fa3-d2d1-4eef-8906-ae2514fefdfa")
                .amount(new BigDecimal("120.25"))
                .beneficiaryAccount("112680000156896531")
                .classificationId("01")
                .currencyCode("USD")
                .addEmailItem("notificar@wire4.mx")
                .paymentConceptSpid("Transfer out test 1")
                .numericReferenceSpid(1234567);

        try {

            // Obtain the response
            final TokenRequiredResponse response = api.registerOutgoingSpidTransactionUsingPOST(body, subscription);

            System.out.println("Response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void registerWebhookTest() {

        // Create the api component
        final WebhooksApi api = new WebhooksApi();
        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, AMBIENT);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {
            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
        try {
            final WebhookRequest request = new WebhookRequest()
                    .name("SDK-WEBHOOK-REGISTER")
                    .url("https://en0fpu357pjff.x.pipedream.net")
                    .events(Arrays.asList(
                            "ACCOUNT.CREATED",
                            "TRANSACTION.OUTGOING.RECEIVED",
                            "ENROLLMENT.CREATED"));
            WebhookResponse response = api.registerWebhook(request);
            System.out.println("Webhook registered :: " + response);
        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
    }

    @Test
    public void getWebhooksTest() {
        // Create the api component
        final WebhooksApi api = new WebhooksApi();
        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, AMBIENT);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {
            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
        try {
            WebhooksList response = api.getWebhooks();
            System.out.println("Webhooks :: " + response);
        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
    }

    @Test
    public void getWebhookTest() {
        // Create the api component
        final WebhooksApi api = new WebhooksApi();
        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, AMBIENT);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {
            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
        try {
            WebhookResponse response = api.getWebhook("wh_f16529713e6a4be88097740cc7db1f28");
            System.out.println("Webhook :: " + response);
        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
    }

    @Test
    public void getFacturasTest() {
        // Create the api component
        final FacturasApi api = new FacturasApi();
        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, AMBIENT);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {
            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            return;
        }
        try {
            List<Billing> responseList = api.billingsReportUsingGET ("2019-10");
            System.out.println("Facturas :: " + responseList);
        } catch (ApiException e) {
            System.out.println("staus code:"+e.getCode());

            if (e.getCode() != 204) {
                e.printStackTrace();
            }

            return;
        }
    }

    @Test
    public void getFacturasByIdTest() {
        // Create the api component
        final FacturasApi api = new FacturasApi();
        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, AMBIENT);

        // Configure OAuth2 access token for authorization: oauth2
        final OAuth oauth2 = (OAuth) api.getApiClient().getAuthentication("wire4_aut_app");

        try {
            // Obtain an access token use application flow and scope "general"
            final String bearer = oAuthWire4.obtainAccessTokenApp("general");
            // Add the bearer token to request
            oauth2.setAccessToken(bearer);
        } catch (ApiException e) {

            e.printStackTrace();
            return;
        }
        try {
            Billing response = api.billingsReportByIdUsingGET("834BA74A-BBBB-43C4-8400-A4528153C2BD");
            System.out.println("Factura :: " + response);
        } catch (ApiException e) {
            System.out.println("staus code:"+e.getCode());

            if (e.getCode() != 204) {
                e.printStackTrace();
            }

            return;
        }
    }
}
