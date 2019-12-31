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
import mx.wire4.model.BalanceListResponse;
import mx.wire4.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SaldoApi
 */
@Ignore
public class SaldoApiTest {

    private final SaldoApi api = new SaldoApi();

    /**
     * Consulta los saldo de una cuenta
     *
     * Obtiene el de las divisas que se manejen en el contrato.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBalanceUsingGETTest() throws ApiException {
        String subscription = null;
        BalanceListResponse response = api.getBalanceUsingGET(subscription);

        // TODO: test validations
    }
}