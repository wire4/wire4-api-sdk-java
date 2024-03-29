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

import mx.wire4.model.AuthorizedUsers;
import mx.wire4.model.ContractDetailRequest;
import mx.wire4.model.ContractDetailResponse;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.PreMonexAuthorization;
import mx.wire4.model.TokenRequiredResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ContractsDetailsApi
 */
@Ignore
public class ContractsDetailsApiTest {

    private final ContractsDetailsApi api = new ContractsDetailsApi();

    /**
     * Devuelve la URL para autorización del usuario Monex
     *
     * Se obtiene la URL para la autorización del usuario Monex.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAuthorizationTest() throws Exception {
        PreMonexAuthorization body = null;
        String authorization = null;
        TokenRequiredResponse response = api.createAuthorization(body, authorization);

        // TODO: test validations
    }
    /**
     * Obtiene los usuarios autorizados
     *
     * Obtienen los detalles de los usuarios autorizados de Monex.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void obtainAuthorizedUsersTest() throws Exception {
        String authorization = null;
        String X_ACCESS_KEY = null;
        String requestId = null;
        List<AuthorizedUsers> response = api.obtainAuthorizedUsers(authorization, X_ACCESS_KEY, requestId);

        // TODO: test validations
    }
    /**
     * Obtiene los usuarios autorizados por contrato
     *
     * Obtienen los detalles de los usuarios autorizados por contrato Monex.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void obtainAuthorizedUsersByContractTest() throws Exception {
        String authorization = null;
        String X_ACCESS_KEY = null;
        String contract = null;
        List<AuthorizedUsers> response = api.obtainAuthorizedUsersByContract(authorization, X_ACCESS_KEY, contract);

        // TODO: test validations
    }
    /**
     * Obtiene los detalles de la empresa del contrato
     *
     * Detalles de la compañía relacionada con el contrato de Monex.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void obtainContractDetailsTest() throws Exception {
        ContractDetailRequest body = null;
        String authorization = null;
        String X_ACCESS_KEY = null;
        ContractDetailResponse response = api.obtainContractDetails(body, authorization, X_ACCESS_KEY);

        // TODO: test validations
    }
}
