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

import mx.wire4.model.Depositant;
import mx.wire4.model.DepositantCountResponse;
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
     * Número de depositantes por suscripción
     *
     * Obtiene la cantidad el total de depositantes asociados al contrato relacionado a la suscripción.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDepositantsTotalsUsingGETTest() throws Exception {
        String authorization = null;
        String subscription = null;
        DepositantCountResponse response = api.getDepositantsTotalsUsingGET(authorization, subscription);

        // TODO: test validations
    }
    /**
     * Consulta de cuentas de depositantes
     *
     * Obtiene una lista de depositantes asociados al contrato relacionado a la suscripción.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDepositantsUsingGETTest() throws Exception {
        String authorization = null;
        String subscription = null;
        GetDepositants response = api.getDepositantsUsingGET(authorization, subscription);

        // TODO: test validations
    }
    /**
     * Registra un nuevo depositante
     *
     * Registra un nuevo depositante en el contrato asociado a la suscripción. Si intenta registrar un depositante que previamente se había registrado, se devolverá la cuenta clabe asociada al Álias que está intentando registrar. Queda bajo responsabilidad del cliente verificar que los álias sean únicos en sus sistemas.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerDepositantsUsingPOSTTest() throws Exception {
        DepositantsRegister body = null;
        String authorization = null;
        String subscription = null;
        DepositantsResponse response = api.registerDepositantsUsingPOST(body, authorization, subscription);

        // TODO: test validations
    }
    /**
     * Solicitud para actualizar el estado de un depositante sin utilizar la suscripción
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateStatusDepositantsNoSuscrptionUsingPATCHTest() throws Exception {
        String authorization = null;
        String account = null;
        String action = null;
        String body = null;
        Depositant response = api.updateStatusDepositantsNoSuscrptionUsingPATCH(authorization, account, action, body);

        // TODO: test validations
    }
    /**
     * Solicitud para actualizar el estado de un depossitante
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateStatusDepositantsUsingPATCHTest() throws Exception {
        String authorization = null;
        String account = null;
        String action = null;
        String body = null;
        Depositant response = api.updateStatusDepositantsUsingPATCH(authorization, account, action, body);

        // TODO: test validations
    }
}
