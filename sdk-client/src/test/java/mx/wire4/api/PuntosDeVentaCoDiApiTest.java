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
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.SalesPointFound;
import mx.wire4.model.SalesPointRequest;
import mx.wire4.model.SalesPointRespose;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PuntosDeVentaCoDiApi
 */
@Ignore
public class PuntosDeVentaCoDiApiTest {

    private final PuntosDeVentaCoDiApi api = new PuntosDeVentaCoDiApi();

    /**
     * Registro de punto de venta.
     *
     * Se registra un punto de venta (TPV) desde donde se emitarán los cobros CODI®. El punto de venta se debe asociar a un cuenta CLABE registrada previamente ante Banxico para realizar cobros con CODI®.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSalesPointTest() throws ApiException {
        SalesPointRequest body = null;
        String authorization = null;
        String companyId = null;
        SalesPointRespose response = api.createSalesPoint(body, authorization, companyId);

        // TODO: test validations
    }
    /**
     * Consulta de puntos de venta
     *
     * Obtiene los puntos de venta asociados a una empresa en las cuales se hacen operaciones CODI®.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void obtainSalePointsTest() throws ApiException {
        String authorization = null;
        String companyId = null;
        List<SalesPointFound> response = api.obtainSalePoints(authorization, companyId);

        // TODO: test validations
    }
}
