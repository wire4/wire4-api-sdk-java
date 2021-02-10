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
import mx.wire4.model.ContactRequest;
import mx.wire4.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactoApi
 */
@Ignore
public class ContactoApiTest {

    private final ContactoApi api = new ContactoApi();

    /**
     * Solicitud de contacto
     *
     * Notifica a un asesor Monex para que se ponga en contacto con un posible cliente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendContactUsingPOSTTest() throws ApiException {
        ContactRequest body = null;
        String authorization = null;
        api.sendContactUsingPOST(body, authorization);

        // TODO: test validations
    }
}
