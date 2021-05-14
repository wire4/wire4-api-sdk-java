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
import mx.wire4.model.DepositantsRegister;
import mx.wire4.model.DepositantsResponse;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.GetDepositants;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepositantesApi
 */
@Ignore
public class DepositantesApiTest {

    private final DepositantesApi api = new DepositantesApi();

    /**
     * Consulta de cuentas de depositantes
     *
     * Obtiene una lista de depositantes asociados al contrato relacionado a la suscripción.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDepositantsUsingGETTest() throws ApiException {
        String authorization = null;
        String subscription = null;
        GetDepositants response = api.getDepositantsUsingGET(authorization, subscription);

        // TODO: test validations
    }
    /**
     * Registra un nuevo depositante
     *
     * Registra un nuevo depositante en el contrato asociado a la suscripción.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerDepositantsUsingPOSTTest() throws ApiException {
        DepositantsRegister body = null;
        String authorization = null;
        String subscription = null;
        DepositantsResponse response = api.registerDepositantsUsingPOST(body, authorization, subscription);

        // TODO: test validations
    }
}
