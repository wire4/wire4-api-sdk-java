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
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.SpidClassificationsResponseDTO;
import mx.wire4.model.TokenRequiredResponse;
import mx.wire4.model.TransactionOutgoingSpid;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransferenciasSpidApi
 */
@Ignore
public class TransferenciasSpidApiTest {

    private final TransferenciasSpidApi api = new TransferenciasSpidApi();

    /**
     * Consulta las clasificaciones para operaciones con SPID
     *
     * Obtiene las clasificaciones para operaciones con dólares (SPID) de Monex.&lt;br/&gt;Este recurso se debe invocar previo al realizar una operación SPID.&lt;br/&gt;Se requiere que el token de autenticación se genere con scope spid_admin.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpidClassificationsUsingGETTest() throws ApiException {
        String subscription = null;
        SpidClassificationsResponseDTO response = api.getSpidClassificationsUsingGET(subscription);

        // TODO: test validations
    }
    /**
     * Registro de transferencias SPID
     *
     * Registra un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción, las transferencias deben ser confirmadas por el cliente para que se efectuen.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerOutgoingSpidTransactionUsingPOSTTest() throws ApiException {
        TransactionOutgoingSpid body = null;
        String subscription = null;
        TokenRequiredResponse response = api.registerOutgoingSpidTransactionUsingPOST(body, subscription);

        // TODO: test validations
    }
}