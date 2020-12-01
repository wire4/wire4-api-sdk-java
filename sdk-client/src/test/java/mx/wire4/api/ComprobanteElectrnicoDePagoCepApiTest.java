/*
 * Wire4RestAPI
 * Referencia de API. La API de Wire4 está organizada en torno a REST.
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
import mx.wire4.model.CepResponse;
import mx.wire4.model.CepSearchBanxico;
import mx.wire4.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComprobanteElectrnicoDePagoCepApi
 */
@Ignore
public class ComprobanteElectrnicoDePagoCepApiTest {

    private final ComprobanteElectrnicoDePagoCepApi api = new ComprobanteElectrnicoDePagoCepApi();

    /**
     * Consulta de CEP
     *
     * Consulta el CEP de un pago realizado a través del SPEI, si es que este se encuentra disponible en BANXICO.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void obtainTransactionCepUsingPOSTTest() throws ApiException {
        CepSearchBanxico body = null;
        String authorization = null;
        CepResponse response = api.obtainTransactionCepUsingPOST(body, authorization);

        // TODO: test validations
    }
}
