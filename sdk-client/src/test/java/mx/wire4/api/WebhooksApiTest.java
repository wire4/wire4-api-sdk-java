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
import mx.wire4.model.WebhookRequest;
import mx.wire4.model.WebhookResponse;
import mx.wire4.model.WebhooksList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Consulta de Webhook
     *
     * Obtiene un webhook registrado en la plataforma mediante su identificador.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        String id = null;
        WebhookResponse response = api.getWebhook(id);

        // TODO: test validations
    }
    /**
     * Consulta de Webhooks
     *
     * Obtiene los webhooks registrados en la plataforma que tengan estatus &#x27;ACTIVE&#x27; e &#x27;INACTIVE&#x27;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        WebhooksList response = api.getWebhooks();

        // TODO: test validations
    }
    /**
     * Alta de Webhook
     *
     * Registra un webhook en la plataforma para su uso como notificador de eventos cuando estos ocurran.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerWebhookTest() throws ApiException {
        WebhookRequest body = null;
        WebhookResponse response = api.registerWebhook(body);

        // TODO: test validations
    }
}
