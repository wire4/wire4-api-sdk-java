/*
 * Wire4RestAPI
 * Referencia de API. La API de Wire4 está organizada en torno a REST
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
import mx.wire4.model.DetailedErrorResponse;
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
     * Consulta de clasificaciones para operaciones SPID®
     *
     * Obtiene las clasificaciones para operaciones con dólares (SPID®) de Monex.&lt;br/&gt;&lt;br/&gt;Este recurso se debe invocar previo al realizar una operación SPID.&lt;br/&gt;&lt;br/&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpidClassificationsUsingGETTest() throws ApiException {
        String authorization = null;
        String subscription = null;
        SpidClassificationsResponseDTO response = api.getSpidClassificationsUsingGET(authorization, subscription);

        // TODO: test validations
    }
    /**
     * Registro de transferencias SPID®
     *
     * Registra un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción. En la respuesta se proporcionará una dirección URL que lo llevará al centro de autorización para que las transferencias sean confirmadas (autorizadas) por el cliente para que se efectúen, para ello debe ingresar la llave electrónica (Token).&lt;br&gt; Nota: Debe considerar que el concepto de cada una de las transacciones solo debe contener caracteres alfanuméricos por lo que en caso de que se reciban caracteres como ñ o acentos serán sustituidos por n o en su caso por la letra sin acento. Los caracteres no alfanuméricos como pueden ser caracteres especiales serán eliminados.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerOutgoingSpidTransactionUsingPOSTTest() throws ApiException {
        TransactionOutgoingSpid body = null;
        String authorization = null;
        String subscription = null;
        TokenRequiredResponse response = api.registerOutgoingSpidTransactionUsingPOST(body, authorization, subscription);

        // TODO: test validations
    }
}
