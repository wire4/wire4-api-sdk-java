/*
 * Wire4RestAPI
 * Referencia de la API de Wire4
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package mx.wire4.api;

import mx.wire4.ApiException;
import mx.wire4.model.Deposit;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.Payment;
import mx.wire4.model.TokenRequiredResponse;
import mx.wire4.model.TransactionsOutgoingRegister;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransferenciasSpeiApi
 */
@Ignore
public class TransferenciasSpeiApiTest {

    private final TransferenciasSpeiApi api = new TransferenciasSpeiApi();

    /**
     * Eliminación de transferencias SPEI® pendientes
     *
     * Elimina un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción, las transferencias no deben haber sido confirmadas por el cliente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dropTransactionsPendingUsingDELETETest() throws ApiException {
        String requestId = null;
        String subscription = null;
        api.dropTransactionsPendingUsingDELETE(requestId, subscription);

        // TODO: test validations
    }
    /**
     * Consulta de transferencias recibidas
     *
     * Realiza una consulta de las transferencias recibidas (depósitos) en la cuenta del cliente Monex relacionada a la suscripción, las transferencias que regresa este recuso son únicamente las transferencias  recibidas durante el día en el que se realiza la consulta.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incomingSpeiTransactionsReportUsingGETTest() throws ApiException {
        String subscription = null;
        List<Deposit> response = api.incomingSpeiTransactionsReportUsingGET(subscription);

        // TODO: test validations
    }
    /**
     * Consulta de transferencias realizadas
     *
     * Consulta las transferencias realizadas en la cuenta del cliente Monex relacionada a la suscripción, las transferencias que regresa este recuso son únicamente las transferencias recibidas en el día en el que se realiza la consulta.&lt;br&gt;Se pueden realizar consultas por &lt;strong&gt;order_id&lt;/strong&gt; al realizar este tipo de consultas no importa el día en el que se realizó la transferencia
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void outgoingSpeiTransactionsReportUsingGETTest() throws ApiException {
        String subscription = null;
        String orderId = null;
        List<Payment> response = api.outgoingSpeiTransactionsReportUsingGET(subscription, orderId);

        // TODO: test validations
    }
    /**
     * Registro de transferencias
     *
     * Registra un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción, las transferencias deben ser confirmadas por el cliente para que se efectuen.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerOutgoingSpeiTransactionUsingPOSTTest() throws ApiException {
        TransactionsOutgoingRegister body = null;
        String subscription = null;
        TokenRequiredResponse response = api.registerOutgoingSpeiTransactionUsingPOST(body, subscription);

        // TODO: test validations
    }
}
