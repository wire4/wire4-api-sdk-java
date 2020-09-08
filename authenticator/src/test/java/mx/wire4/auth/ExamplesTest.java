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

import mx.wire4.ApiException;
import mx.wire4.ApiResponse;
import mx.wire4.api.*;
import mx.wire4.core.EnvironmentEnum;
import mx.wire4.model.*;
import mx.wire4.webhook.verification.signature.UtilsCompute;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static mx.wire4.core.EnvironmentEnum.SANDBOX;
import static org.junit.Assert.assertTrue;

/**
 * <i>Fecha de creación: 22 de octubre, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@SuppressWarnings({"UnnecessaryLocalVariable", "UnnecessaryReturnStatement"})
@Ignore
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

        final String bearer;
        try {

            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

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
            final ApiResponse<Void> response = api.sendContactUsingPOSTWithHttpInfo(body, bearer);

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

        final String bearer;
        try {

            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

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
            final CepResponse response = api.obtainTransactionCepUsingPOST(body, bearer);

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

        final String bearer;

        try {

            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

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
            final PreEnrollmentResponse response = api.preEnrollmentMonexUserUsingPOST(body, bearer);

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

        final String bearer;

        try {

            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = "2e11655e-392d-48ff-a35f-22a270bbfe7f";

        try {

            // Obtain the response
            final ApiResponse<Void> response = api.removeSubscriptionPendingStatusUsingDELETEWithHttpInfo(bearer, subscription);

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

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            // The user_key and user_secret belongs to the subscription to delete
            bearer = oAuthWire4.obtainAccessTokenAppUser(
                    "86b348442874908861098f03ed9ffa@sandbox.wire4.mx", "9ee9ae9a86446c289656ff40934370",
                    "spei_admin");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = "81b282bb-9056-4412-82de-ab066eae08a4";

        try {

            // Obtain the response
            final ApiResponse<Void> response = api.removeEnrollmentUserUsingDELETEWithHttpInfo(bearer, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final RelationshipsResponse response = api.getAvailableRelationshipsMonexUsingGET(bearer, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

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
            final TokenRequiredResponse response = api.preRegisterAccountsUsingPOST(body, bearer, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
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
            final ApiResponse<Void> response = api.removeBeneficiariesPendingUsingDELETEWithHttpInfo(bearer, requestId, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        // Optional filters, null If you don't want to filter
        final String account = null;
        final String beneficiaryBank = null;
        final String beneficiaryName = null;
        final String endDate = null;    // format dd-mm-yyyy
        final String initDate = null;   // format dd-mm-yyyy
        final String rfc = null;
        final String status = null;     // PENDING, REGISTERED
        try {

            // Obtain the response
            final BeneficiariesResponse response = api.getBeneficiariesForAccountUsingGET(bearer, subscription, account,
                    beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

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
                .previousAmountLimit(new BigDecimal("10000.00"))
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel");
        try {

            // Obtain the response
            final TokenRequiredResponse response = api.updateAmountLimitAccountUsingPUT(body, bearer, account, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

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
            final ApiResponse<Void> response = api.deleteAccountUsingDELETEWithHttpInfo(bearer, account, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        try {

            // Obtain the response
            final InstitutionsList response = api.getAllInstitutionsUsingGET(bearer);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final BalanceListResponse response = api.getBalanceUsingGET(bearer, subscription);

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

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spid_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

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
                .institution(new BeneficiaryInstitution().name("Compu Mundo Hiper Mega Red"))
                .email(Collections.singletonList("beneficiary.spid@wire4.mx"))
                .kindOfRelationship("RECURRENTE")
                .numericReference("1234567")
                .paymentConcept("concept spid")
                .relationship("ACREEDOR")
                .rfc("SJBA920125AB1");
        try {

            // Obtain the response
            TokenRequiredResponse response = api.preRegisterAccountsUsingPOST1(body, bearer, subscription);

            System.out.println("TokenRequiredResponse response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainBeneficiariesSpid() {

        // Create the api component
        final CuentasDeBeneficiariosSpidApi api = new CuentasDeBeneficiariosSpidApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spid_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spid_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        // Optional filters, null If you don't want to filter
        final String account = null;
        final String beneficiaryBank = null;
        final String beneficiaryName = null;
        final String endDate = null;    // format dd-mm-yyyy
        final String initDate = null;   // format dd-mm-yyyy
        final String rfc = null;
        final String status = null;     // PENDING, REGISTERED
        try {

            // Obtain the response
            final SpidBeneficiariesResponse response = api.getSpidBeneficiariesForAccount(bearer, subscription, account,
                    beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status);

            System.out.println("Beneficiaries Spid response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in request to API
            return;
        }
    }

    @Test
    public void obtainSPIDClassifications() {

        // Create the api component
        final TransferenciasSpidApi api = new TransferenciasSpidApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spid_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spid_admin");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final SpidClassificationsResponseDTO response = api.getSpidClassificationsUsingGET(bearer, subscription);

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

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;

        try {

            // Obtain the response
            final GetDepositants response = api.getDepositantsUsingGET(bearer, subscription);

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

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

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
            final DepositantsResponse response = api.registerDepositantsUsingPOST(body, bearer, subscription);

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

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        try {

            // Obtain the response
            final List<Deposit> response = api.incomingSpeiTransactionsReportUsingGET(bearer, subscription);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
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
            final List<Payment> response = api.outgoingSpeiTransactionsReportUsingGET(bearer, subscription, orderId);

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

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");

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
                        .orderId("2454ffb2-a699-408f-9812-9a12eed11bfc")
                        .amount(new BigDecimal("120.25"))
                        .beneficiaryAccount("112680000156896531")
                        .currencyCode("MXP")
                        .addEmailItem("notificar@wire4.mx")
                        .concept("Transfer out test 1")
                        .reference(1234567)
                );

        try {

            // Obtain the response
            final TokenRequiredResponse response = api.registerOutgoingSpeiTransactionUsingPOST(body, bearer, subscription);

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

        final String bearer;

        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String requestId = "fcb62831-cc04-4b3b-93d4-39e698a3bad6";
        final String orderIds = null; // Optional, comma separated order identifiers list or null
        try {

            // Obtain the response
            final ApiResponse<Void> response = api.dropTransactionsPendingUsingDELETEWithHttpInfo(bearer, requestId,
                    subscription, orderIds);

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
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
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
            final TokenRequiredResponse response = api.registerOutgoingSpidTransactionUsingPOST(
                    body, bearer, subscription);

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

        final String bearer;
        try {
            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

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
            WebhookResponse response = api.registerWebhook(request, bearer);
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

        final String bearer;

        try {
            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
        try {
            WebhooksList response = api.getWebhooks(bearer);
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

        final String bearer;

        try {
            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {
            e.printStackTrace();
            return;
        }
        try {
            WebhookResponse response = api.getWebhook(bearer, "wh_f16529713e6a4be88097740cc7db1f28");
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

        final String bearer;

        try {
            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {

            e.printStackTrace();
            return;
        }
        try {
            List<Billing> responseList = api.billingsReportUsingGET(bearer, "2019-10");
            System.out.println("Facturas :: " + responseList);
        } catch (ApiException e) {
            System.out.println("staus code:" + e.getCode());

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

        final String bearer;

        try {
            // Obtain an access token use application flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");

        } catch (ApiException e) {

            e.printStackTrace();
            return;
        }
        try {
            Billing response = api.billingsReportByIdUsingGET(bearer, "834BA74A-BBBB-43C4-8400-A4528153C2BD");
            System.out.println("Factura :: " + response);
        } catch (ApiException e) {
            System.out.println("staus code:" + e.getCode());

            if (e.getCode() != 204) {
                e.printStackTrace();
            }

            return;
        }
    }

    @Test
    public void outCommingSpeiRequestIdTransactionsReportUsingGET() {

        // Create the api component
        final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String orderId = "5fec50a8-d987-4e11-b23e-606ca296712b"; // null for no filter
        try {

            // Obtain the response

            final PaymentsRequestId paymentsRequestId = api.outCommingSpeiRequestIdTransactionsReportUsingGET(
                    bearer, subscription, orderId);

            System.out.println("Response:" + paymentsRequestId);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainBeneficiariesByRequestId() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final String requestId = "0726a947-deaf-4bdc-a411-dc40192c78d9";
        try {

            // Obtain the response
            final BeneficiariesResponse response = api.getBeneficiariesByRequestId(bearer, requestId, subscription);

            System.out.println("Relationships response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void shouldSignWebHookMessage() throws Exception {

        final String message = "{ \"responseCode\":0, \n" +
                "  \"message\":\"Ya existe este beneficiario de pago a ctas nacionales en el contrato\",\n" +
                "  \"statusCode\":\"ERROR\",\n" +
                "  \"externalReference\":\"8939TR\"\n" +
                "}";
        final String key = "9ie93030?=";
        final String signature = "8e63e88434679473bdb28546d7d91537601f4588e801972376d5c5addcb8fd706e6c92421b73151de3c" +
                "1945ce000a8a5aa1d5cc3cdd73f2769ee9980db420db9";

        assertTrue(UtilsCompute.compareWebHookMsgSignatures(message, key, signature));
    }

    @Test
    public void authorizeAccountsPendingPUT() {

        // Create the api component
        final CuentasDeBeneficiariosSpeiApi api = new CuentasDeBeneficiariosSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final UrlsRedirect urlsRedirect = new UrlsRedirect()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel");
        try {

            // Obtain the response
            final AuthorizedBeneficiariesResponse response = api.authorizeAccountsPendingPUT(urlsRedirect, bearer,
                    subscription);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void createAuthorizationTransactionsGroup() {

        // Create the api component
        final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "spei_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(USER_KEY, SECRET_KEY, "spei_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String subscription = SUBSCRIPTION;
        final AuthorizationTransactionGroup authorizationTransactionGroup = new AuthorizationTransactionGroup()
                .addTransactionsItem("2454ffb2-a699-408f-9812-9a12eed11bfc"); // Add N transactions order identifiers

        final UrlsRedirect urlsRedirect = new UrlsRedirect()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel");
        authorizationTransactionGroup.setRedirectUrls(urlsRedirect);
        try {

            // Obtain the response
            final TokenRequiredResponse response = api.createAuthorizationTransactionsGroup(
                    authorizationTransactionGroup, bearer, subscription);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void registerCompanyUsingPOST() {

        // Create the api component
        final EmpresasCoDiApi apiInstance = new EmpresasCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_general"
            bearer = oAuthWire4.obtainAccessTokenApp("codi_general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final CompanyRequested body = new CompanyRequested()
                .businessName("Tacos")
                .comercialName("Tacos el Compa")
                .rfc("TACO580926LA1")
                .certificate(new CertificateRequest()
                        .certificateNumber("4908439084390849084")
                        .alias("00040390904903904909")
                        .checkDigit("1")
                        .cipherData("4309jij3490j43jf0j3490fFFFDSDS4393490"));
        try {

            // Obtain the response
            final CompanyRegistered response = apiInstance.registerCompanyUsingPOST(body, bearer);
            System.out.println("response: " + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainCompanies() {

        // Create the api component
        final EmpresasCoDiApi apiInstance = new EmpresasCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_general"
            bearer = oAuthWire4.obtainAccessTokenApp("codi_general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        try {

            // Obtain the response
            final List<CompanyRegistered> response = apiInstance.obtainCompanies(bearer);
            System.out.println("response: " + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    private static final String COMPANY_ID = "0b43cbd2-2a86-4eb5-a51c-49a53d521295";

    @Test
    public void createSalesPoint() {

        // Create the api component
        final PuntosDeVentaCoDiApi api = new PuntosDeVentaCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_general"
            bearer = oAuthWire4.obtainAccessTokenApp("codi_general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String companyId = COMPANY_ID;
        final SalesPointRequest salesPointRequest = new SalesPointRequest()
                .name("Taqueria Sur, caja 1")
                .accessIp("189.180.255.229")
                .notificationsUrl("https://webhook.site/3e32e1c4-1346-4f5a-92d5-2a921c5c85df")
                .account("044680035044988526");
        try {

            // Obtain the response
            final SalesPointRespose response = api.createSalesPoint(salesPointRequest, bearer, companyId);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void obtainSalePoints() {

        // Create the api component
        final PuntosDeVentaCoDiApi api = new PuntosDeVentaCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_general"
            bearer = oAuthWire4.obtainAccessTokenApp("codi_general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String companyId = COMPANY_ID;
        try {

            // Obtain the response
            final List<SalesPointFound> response = api.obtainSalePoints(bearer, companyId);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    private static final String SALES_POINT_ID = "465ffc2c-10b5-4475-8d64-bc58e4ff098d";
    private static final String SALES_POINT_KEY = "097db4157b74619b88f40550e7c1ee@develop.wire4.mx";
    private static final String SALES_POINT_SECRET = "b722b8c8fc24d4bae0b1cd41b4c6af";

    @Test
    public void generateCodiCodeQR() {

        // Create the api component
        final PeticionesDePagoPorCoDiApi api = new PeticionesDePagoPorCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(SALES_POINT_KEY, SALES_POINT_SECRET, "codi_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        OffsetDateTime offsetDateTime;
        try {

            offsetDateTime = OffsetDateTime.ofInstant(Instant.ofEpochMilli(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                    .parse("2020-08-25T13:45:00").getTime()), ZoneId.systemDefault());
        } catch (ParseException e) {

            offsetDateTime = OffsetDateTime.now();
            // Nothing to do
            e.printStackTrace();
        }

        final String salesPointId = SALES_POINT_ID;
        final CodiCodeRequestDTO codiCodeRequestDTO = new CodiCodeRequestDTO()
                .amount(new BigDecimal("178.8"))
                .concept("consumo saintiago")
                .orderId("b4408b4d-17a0-4d39-85f2-f3da1e2825e9")
                .dueDate(offsetDateTime)
                .type(CodiCodeRequestDTO.TypeEnum.QR_CODE);
        try {

            // Obtain the response
            final CodiCodeQrResponseDTO response = api.generateCodiCodeQR(codiCodeRequestDTO, bearer, salesPointId);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    private final static String ORDER_ID = "b4408b4d-17a0-4d39-85f2-f3da1e2825e9";

    @Test
    public void consultCodiRequestByOrderId() {

        // Create the api component
        final PeticionesDePagoPorCoDiApi api = new PeticionesDePagoPorCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_admin"
            bearer = oAuthWire4.obtainAccessTokenAppUser(SALES_POINT_KEY, SALES_POINT_SECRET, "codi_admin");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String salesPointId = SALES_POINT_ID; // Sales point identifier
        final String orderId = ORDER_ID; // Order identifier
        try {

            // Obtain the response
            final PaymentRequestCodiResponseDTO response = api.consultCodiRequestByOrderId(bearer, orderId, salesPointId);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void consultCodiOperations() {

        // Create the api component
        final OperacionesCoDiApi api = new OperacionesCoDiApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "codi_report"
            bearer = oAuthWire4.obtainAccessTokenAppUser(SALES_POINT_KEY, SALES_POINT_SECRET, "codi_report");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String companyId = COMPANY_ID; // Company identifier
        final String salesPointId = SALES_POINT_ID; // Sales point identifier

        /*
         * All filters options are optional
         * orderId,
         * operationDateFrom, operationDateTo,
         * requestDateFrom, requestDateTo,
         * status (RECEIVED, COMPLETED, CANCELLED),
         * amountFrom, amountTo
         */
        final CodiOperationsFiltersRequestDTO codiOperationsFilters = new CodiOperationsFiltersRequestDTO()
                .orderId(ORDER_ID);
        try {

            // Obtain the response
            final PagerResponseDto response = api.consultCodiOperations(bearer, codiOperationsFilters,
                    companyId, "0", salesPointId, "20");

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    private static final String ACCESS_KEY = "YOUR_ACCESS_KEY_HERE";

    @Test
    public void obtainContractDetails() {

        // Create the api component
        final ContractsDetailsApi api = new ContractsDetailsApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String accessKey = ACCESS_KEY; // This ACCESS_KEY is provider from Wire4, contact support
        // Contract, Monex online bank username, password and token are required
        final ContractDetailRequest contractDetailRequest = new ContractDetailRequest()
                .contract("1234567")
                .userName("amolina")
                .password("whatever")
                .tokenCode("258963");
        try {

            // Obtain the response
            final ContractDetailResponse response = api.obtainContractDetails(contractDetailRequest, bearer, accessKey);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    @Test
    public void createAuthorization() {

        // Create the api component
        final ContractsDetailsApi api = new ContractsDetailsApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final PreMonexAuthorization preMonexAuthorization = new PreMonexAuthorization()
                .returnUrl("https://your-app-url.mx/return")
                .cancelReturnUrl("https://your-app-url.mx/cancel")
                .rfc("TACO890101LO0")
                .businessName("Compa Tacos");

        try {

            // Obtain the response
            final TokenRequiredResponse response = api.createAuthorization(preMonexAuthorization, bearer);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }

    private static final String REQUEST_ID = "17fa79db-759f-4105-bc47-688fed75ddac";

    @Test
    public void obtainAuthorizedUsers() {

        // Create the api component
        final ContractsDetailsApi api = new ContractsDetailsApi();

        // Create the authenticator to obtain access token
        final OAuthWire4 oAuthWire4 = new OAuthWire4(CLIENT_ID, CLIENT_SECRET, SANDBOX);

        final String bearer;
        try {

            // Obtain an access token use password flow and scope "general"
            bearer = oAuthWire4.obtainAccessTokenApp("general");
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }

        // Build body with info (check references for more info, types, required fields)
        final String accessKey = ACCESS_KEY; // This ACCESS_KEY is provider from Wire4, contact support
        final String requestId = REQUEST_ID;
        try {

            // Obtain the response
            final List<AuthorizedUsers> response = api.obtainAuthorizedUsers(bearer, accessKey, requestId);

            System.out.println("response:" + response);
        } catch (ApiException e) {

            e.printStackTrace();
            // Optional manage exception in access token flow
            return;
        }
    }
}
