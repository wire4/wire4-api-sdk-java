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
import mx.wire4.model.CompanyRegistered;
import mx.wire4.model.CompanyRequested;
import mx.wire4.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmpresasCoDiApi
 */
@Ignore
public class EmpresasCoDiApiTest {

    private final EmpresasCoDiApi api = new EmpresasCoDiApi();

    /**
     * Consulta de empresas CODI®
     *
     * Consulta de empresas CODI® registradas para la aplicación.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void obtainCompaniesTest() throws ApiException {
        String authorization = null;
        List<CompanyRegistered> response = api.obtainCompanies(authorization);

        // TODO: test validations
    }
    /**
     * Registro de empresas CODI®
     *
     * Registra una empresa para hacer uso de operaciones CODI®.&lt;br&gt;&lt;br&gt; &lt;b&gt;Nota:&lt;b&gt; Es requerido tener el certificado emitido por BANXICO® asi como el Nombre de la empresa, Nombre comercial y el Registro Federal de Contribuyentes (RFC) de la empresa.&lt;br/&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerCompanyUsingPOSTTest() throws ApiException {
        CompanyRequested body = null;
        String authorization = null;
        CompanyRegistered response = api.registerCompanyUsingPOST(body, authorization);

        // TODO: test validations
    }
}
