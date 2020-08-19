/*
 * Wire4RestAPI
 *  # Referencia de API La API de Wire4 está organizada en torno a REST. Nuestra API tiene URLs predecibles orientadas a los recursos, acepta peticiones en formato JSON, y las respuestas devueltas son formato JSON y utiliza códigos de respuesta HTTP, autenticación y verbos estándares.  Puede usar la API de Wire4 en nuestro entorno de prueba, que no afecta sus productivos ni interactúa con la red bancaria. La URL de conexión que se usa para invocar los servicios determina si la solicitud es en modo en de prueba o en modo producción.    # Autenticación La API de Wire4 utiliza el protocolo OAuth 2.0 para autenticación y autorización.   Para comenzar, es necesario que registre una cuenta en nuestro ambiente de pruebas en [registro](https://app-sndbx.wire4.mx/#/register) y obtenga las credenciales de cliente OAuth 2.0 desde la [consola de administración](https://app-sndbx.wire4.mx/#/dashboard/api-keys).   Esta página ofrece una descripción general de los escenarios de autorización de OAuth 2.0 que admite Wire4.   Después de crear su aplicación con Wire4, asegúrese de tener a la mano su `client_id` y `client_secret`. El siguiente paso es descubrir qué flujo de OAuth2 es el adecuado para sus propósitos.   ## URLS La siguiente tabla muestra las urls de los recursos de autenticación para el ambiente de pruebas.  URL                  | Descripción ------------------------------------ | ------------- https://sandbox-api.wire4.mx/token   | Obtener token de autorización llaves de API (*client_id*, *client_secret*), datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) o (*refresh_token*) https://sandbox-api.wire4.mx/revoke  | Revocación de token  **Nota:** De acuerdo con el RFC 6749, la URL del token sólo acepta el tipo de contenido x-www-form-urlencoded. El contenido JSON no está permitido y devolverá un error.  ## Scopes Los `scopes` limitan el acceso de una aplicación a los recursos de Wire4. Se ofrecen los siguientes scopes:   Scope                    | Descripción ------------------------------------ | ------------- general                              | Permite llamar a operaciones que no requieren a un cliente Monex suscrito en Wire4, los recursos que se pueden consumir con este scope son: consulta de Instituciones, CEP y generación de una presuscripción. spei_admin                           | Permite llamar a operaciones que requieren de un cliente Monex suscrito en Wire4, ya que se proporciona información de saldos, administración de transacciones, cuentas de beneficiarios y cuentas de depositantes. spid_admin                           | Permite llamar sólo a operaciones SPID, se requiere de un cliente Monex suscrito en Wire4. codi_admin                           | Permite llamar sólo a operaciones CoDi. codi_report                          | Permite generar reportes de operaciones CoDi.  ## Tipos de autenticación   Wire4 cuenta con dos tipos de autenticación: Autenticación de Aplicación (OAuth 2.0  Client Credentials Grant)  y Autenticación de Usuario de Aplicación (OAuth 2.0 Password Grant).  ### Autenticación de Aplicación  Esta autenticación se obtiene proporcionando únicamente las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) de la consola de administración.  La autenticación de aplicación sólo permite acceso a los recursos que no requieren una suscripción activa de un cliente Monex en Wire4.  Para este tipo de autenticación se sigue el flujo OAuth 2.0 Client Credentials Grant, que se describe más adelante en **Obtener el token de acceso de aplicación**, con este token se tiene acceso a los siguientes recursos:   * [/subscriptions/pre-subscription](link) * [/institutions](link>) * [/ceps](<link>)   ### Autenticación de Usuario de Aplicación  Esta autenticación se obtiene proporcionando las llaves de API las cuales se pueden consultar en [Llaves de API](https://app-sndbx.wire4.mx/#/dashboard/api-keys) más el ***user_key*** y ***user_secret*** que se proporcionan al momento de crear una suscripción, para más información puedes consultar la guía [creación de suscripción](https://www.wire4.mx/#/guides/subscriptions).  Con este tipo de autenticación se puede acceder a los recursos que proporcionan información de una cuenta Monex como saldos y administración de transacciones, cuentas de beneficiarios y cuentas de depositantes.    ## Obtener token de acceso Antes de que su aplicación pueda acceder a los datos mediante la API de Wire4, debe obtener un token de acceso ***(access_token)*** que le otorgue acceso a la API. En las siguientes secciones se muestra como obtener un token para cada una de las autenticaciones.     ### Obtener el token de acceso para autenticación de aplicación  El primer paso es crear la solicitud de token de acceso (*access_token*), con los parámetros que identifican su aplicación, el siguiente código muestra cómo obtener un `token`.  ``` curl -k -d \"grant_type= client_credentials&scope=general\"  -u \"<client id>:<client secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo:**   ``` curl -k -d \"grant_type=client_credentials&scope=general\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ``` Obtendrá una respuesta como la que se muestra  a continuación, donde se debe obtener el *access_token* para realizar llamadas posteriores a la API.   ``` {     \"access_token\":\"eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w\",    \"scope\":\"am_application_scope general\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 }  ```  Es posible generar tokens con mas de un scope, en caso que sea necesario utilizar dicho token para hacer mas de una operación. Para generarlo basta con agregarlo a la petición separado por un espacio.     ``` curl -k -d \"grant_type=client_credentials&scope=codi_general codi_report\"  -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\"  https://sandbox-api.wire4.mx /token ```  ### Obtener el token de acceso para autenticación usuario de aplicación   Antes de que su aplicación pueda acceder a los datos de una cuenta Monex mediante la API de Wire4, debe obtener un token de acceso  (*access_token*) que le otorgue acceso a la API y contar con el  *user_key* y *user_secret* que se proporcionan al momento de crear  una suscripción para más información puedes consultar [creación de suscripción](https://wire4.mx/#/guides/subscriptions) .   El primer paso es crear la solicitud de token de acceso con los parámetros que identifican su aplicación y la suscripción y con `scope` `spei_admin`  ```   curl -k -d \"grant_type=password&scope=spei_admin&username=<user_key>&password=<user_secret>\"  -u \"<client_id>:<client_secret>\" https://sandbox-api.wire4.mx/token ``` **Ejemplo**  ``` curl -k -d \"grant_type=password&scope=spei_admin&username=6 nbC5e99tTO@sandbox.wire4com&password= Nz7IqJGe9h\" -u \" zgMlQbqmOr:plkMJoPXCI\" https://sandbox-api.wire4.mx /token  ```  ``` {     \"access_token\":\"eyJ4NXQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJraWQiOiJPR1EyTURFM00yTmpObVZoTnpFeE5EWXlObUV4TURKa01qUTJaVEU0TWpGaE1tVmlZakV5TkEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiIzMzE0ODRlZTdjZDRkYWU5MzRmMjY2Zjc5YmY1YWFAZGV2LWllc2NhbWlsbGEuc3BlaW9rLmNvbSIsImF1ZCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJuYmYiOjE1NzEzNDk4ODMsImF6cCI6IkJVR0xjNWw1bW5CZXlPeGxtamNUZ0JoS19WTWEiLCJzY29wZSI6InNwZWlfYWRtaW4iLCJpc3MiOiJhcGltLWlkcCIsImV4cCI6MTU3MTM1MzQ4MywiaWF0IjoxNTcxMzQ5ODgzLCJqdGkiOiJiOWQ1M2Q0MC0xN2MwLTQxOTItYjUwNy0wZWFhN2ZkNDA1MGYifQ.hLTk8AFoIce1GpLcgch-U5aLLgiiFTo49wfBErD8D6VF-H9sG13ZyfAx9T-vQkk2m1zPapYVQjwibz3GRAJMN0Vczs6flV1mUJwFDQbEE-AELPdRcaRFOMBCfF6H9TVLfhFsGb9U2pVR9TLJcKqR57DyO_dIcc9I6d0tIkxqn2VcqypLVi5YQf36WzBbPeG-iPHYpMA-bhr4rwfjKA-O6jm1NSSxNHF4sHS0YHDPoO_x6cCc677MQEe0_CozfnQhoEWNfG8tcWUqhPtmcfjqon1p7PdQoXxriq_R85d06pVO9Se7Q6ok0V8Qgz0MOJ6z3ku6mtZSuba7niMAOt2TyA\",    \"refresh_token\":\"f962d5c6-0d99-3809-8275-11c7aa0aa020\",    \"scope\":\"spei_admin\",    \"token_type\":\"Bearer\",    \"expires_in\":3600 } ```  **Nota:** Los ejemplos anteriores se presentan considerando que se realiza una implementación desde cero,  esto se puede simplificar a sólo configurar sus llaves (*client_id*, *client_secret*),  datos de suscripción (*client_id*, *client_secret*, *user_key*, *user_secret*) si utiliza nuestros sdks.      ## Caducidad del token El token de acceso es válido durante 60 minutos (una hora), después de transcurrido este tiempo se debe solicitar un nuevo token,  cuando el token caduca se obtendrá un error ***401 Unauthorized*** con mensaje ***“Invalid Credentials”.***   El nuevo token se puede solicitar  utilizando el último token de actualización (***refresh_token***) que se devolvió en la solicitud del token,   esto sólo aplica para el token de tipo password (Autenticación de Usuario de Aplicación). El siguiente ejemplo muestra cómo obtener un toke con el token de actualización.  ``` curl -k -d \"grant_type=refresh_token&refresh_token=<refresh_token>\" -u \" Client_Id:Client_Secret\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/oauth2/token ```  **Ejemplo:**  ``` curl -k -d \"grant_type=refresh_token&refresh_token=f932d5c6-0d39-3809-8275-11c7ax0aa020\" -u \"zgMlQbqmOr:plkMJoPXCI\" -H \"Content-Type: application/x-www-form-urlencoded\" https://sandbox-api.wire4.mx/token ```  El token de actualización (***refresh_token***) tiene una duración de hasta 23 horas. Si en este periodo no se utiliza, se tienen que solicitar un nuevo token.  Un token de acceso podría dejar de funcionar por uno de estos motivos:  * El usuario ha revocado el acceso a su aplicación, si un usuario ha solicitado la baja de su aplicación de WIre4. * El token de acceso ha caducado: si el token de acceso ha pasado de una hora, recibirá un error ***401 Unauthorized*** mientras realiza una llamada a la API de Wire4. Cuando esto sucede, debe solicitar un nuevo token utilizando el token de actualización que recibió por última al solicitar un token, sólo aplica si el token en cuestión es de autenticación de usuario de aplicación, en caso contrario solicitar un nuevo token.   ## Revocar token Su aplicación puede revocar mediante programación el token de acceso, una vez revocado el token no podrá hacer uso de él para acceder a la API. El siguiente código muestra un ejemplo de cómo revocar el token:    ```  curl -X POST --basic -u \"<client id>:<client secret>\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=<token to revoke>&token_type_hint=access_token\" https://sandbox-api.wire4.mx/revoke ```      **Ejemplo:**  ```   curl -X POST --basic -u \"8e59YqaFW_Yo5dwWNxEY8Lid0u0a:AXahn79hfKWBXKzQfj011x8cvcQa\" -H \"Content-Type: application/x-www-form-urlencoded;charset=UTF-8\" -k -d \"token=eyJ4NXQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJraWQiOiJZak5sWVdWa05tWmlNR1ZoTldSaU1EUXpaREJpWlRJNU1qYzFZV1ZoWWpneU5UYzJPV05sWVEiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJpc21hZWwuZXNjYW1pbGxhQHRjcGlwLnRlY2hAc2FuZGJveC5zcGVpb2suY29tIiwiYXVkIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsIm5iZiI6MTU3MTMyMDg3NywiYXpwIjoiOGU1OVlxYUZXX1lvNWR3V054RVk4TGlkMHUwYSIsInNjb3BlIjoiYW1fYXBwbGljYXRpb25fc2NvcGUgZ2VuZXJhbCIsImlzcyI6ImFwaW0taWRwIiwiZXhwIjoxNTcxMzI0NDc3LCJpYXQiOjE1NzEzMjA4NzcsImp0aSI6ImJkMTdjMjcyLTg4MGQtNDk0ZS1iMTMwLTBiYTkwMjYyN2M4NCJ9.AjngGylkd_Chs5zlIjyLRPu9xPGyz4dfCd_aax2_ts653xrnNMoLpVHUDmaxIDFF2XyBJKH2IAbKxjo6VsFM07QkoPhlysO1PLoAF-Vkt4xYkh-f7nJRl0oOe2utDWFlUdgiAOmx5tPcStrdCEftgNNrjwJ50LXysFjXVshpoST-zIJPLgXknM3esGrkAsLcZRM7XUB187jxLHbtefVYPMvSO31T9pd5_Co9UXdeHpuA98sk_wZknASM1phxXQZAMLRLHz3LYvjCWCr_v80oVCM9SWTzf0vrMI6xphoIfirfWloADKPTTSUpIGBw9ePF_WbEPvbMm_BZaApJcEH2w&token_type_hint=access_token\"  https://sandbox-api.wire4.mx/revoke ```  # Ambientes  Wire4 cuentas con dos ambientes Pruebas (Sandbox) y Producción, son dos ambientes separados los cuales se pueden utilizar simultáneamente. Los usuarios que han sido creados en cada uno de los ambientes no son intercambiables.   Las ligas de acceso a la `api` para cada uno de los ambientes son:  * Pruebas  https://sandbox-api.wire4.mx * Producción https://api.wire4.mx     # Eventos  Los eventos son nuestra forma de informarle cuando algo  sucede en su cuenta. Cuando ocurre un evento se crea un objeto  [Evento](#tag/Webhook-Message). Por ejemplo, cuando se recibe un depósito, se crea un evento TRANSACTION.INCOMING.UPDATED.   Los eventos ocurren cuando cambia el estado de un recurso. El recurso se encuentra dentro del objeto [Evento](#tag/Webhook-Message) en el campo data.  Por ejemplo, un evento TRANSACTION.INCOMING.UPDATED contendrá un depósito y un evento ACCOUNT.CREATED contendrá una cuenta.   Wire4 puede agregar más campos en un futuro, o agregar nuevos valores a campos existentes, por lo que es recomendado que tu endpoint pueda manejar datos adicionales desconocidos. En esta [liga](#tag/Webhook-Message) se encuentra  la definición del objeto [Evento](#tag/Webhook-Message).  ## Tipos de Eventos  Wire4 cuenta con los siguientes tipos de eventos*   | Evento                     | Tipo                               | Objeto                                        | | -------------------------- |----------------------------------- | --------------------------------------------- | | Suscripción                | ENROLLMENT.CREATED                 | [suscription](#tag/subscription)              | | Cuenta de beneficiario     | ACCOUNT.CREATED                    | [beneficiary](#tag/BeneficiaryAccount)        | | Depósito recibido          | TRANSACTION.INCOMING.UPDATED       | [spei_incoming](#tag/deposit)                 | | Transferencia realizada    | TRANSACTION.OUTGOING.RECEIVED      | [spei_outgoing](#tag/transfer)                | | Transferencia SPID enviada | TRANSACTION.OUTGOING.SPID.RECEIVED | [spid_outgoing](#tag/transfer)                | | Transferencias Autorizadas | REQUEST.OUTGOING.CHANGED           | [request_outgoing](#tag/requestOutMsg)        | | Punto de venta CoDi        | SALE.POINT.CREATED                 |
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package mx.wire4.api;

import mx.wire4.ApiCallback;
import mx.wire4.ApiClient;
import mx.wire4.ApiException;
import mx.wire4.ApiResponse;
import mx.wire4.Configuration;
import mx.wire4.Pair;
import mx.wire4.ProgressRequestBody;
import mx.wire4.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import mx.wire4.model.AccountRequest;
import mx.wire4.model.AmountRequest;
import mx.wire4.model.AuthorizedBeneficiariesResponse;
import mx.wire4.model.BeneficiariesResponse;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.RelationshipsResponse;
import mx.wire4.model.TokenRequiredResponse;
import mx.wire4.model.UrlsRedirect;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuentasDeBeneficiariosSpeiApi {
    private ApiClient apiClient;

    public CuentasDeBeneficiariosSpeiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CuentasDeBeneficiariosSpeiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authorizeAccountsPendingPUT
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authorizeAccountsPendingPUTCall(UrlsRedirect body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/pending"
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authorizeAccountsPendingPUTValidateBeforeCall(UrlsRedirect body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authorizeAccountsPendingPUT(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling authorizeAccountsPendingPUT(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling authorizeAccountsPendingPUT(Async)");
        }
        
        com.squareup.okhttp.Call call = authorizeAccountsPendingPUTCall(body, authorization, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Recibe la solicitud para agrupar las cuentas SPEI/SPID de beneficiarios en estado pendiente que deben ser autorizadas
     * Solicta autorizar las cuentas de beneficiarios en estado pendiente agrupandolas en un set de cuentas que pueden incluir tanto cuentas de SPI como de SPID, debe indicar las urls de redireccion en caso de error y en caso de exito&lt;br/&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return AuthorizedBeneficiariesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthorizedBeneficiariesResponse authorizeAccountsPendingPUT(UrlsRedirect body, String authorization, String subscription) throws ApiException {
        ApiResponse<AuthorizedBeneficiariesResponse> resp = authorizeAccountsPendingPUTWithHttpInfo(body, authorization, subscription);
        return resp.getData();
    }

    /**
     * Recibe la solicitud para agrupar las cuentas SPEI/SPID de beneficiarios en estado pendiente que deben ser autorizadas
     * Solicta autorizar las cuentas de beneficiarios en estado pendiente agrupandolas en un set de cuentas que pueden incluir tanto cuentas de SPI como de SPID, debe indicar las urls de redireccion en caso de error y en caso de exito&lt;br/&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;AuthorizedBeneficiariesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthorizedBeneficiariesResponse> authorizeAccountsPendingPUTWithHttpInfo(UrlsRedirect body, String authorization, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = authorizeAccountsPendingPUTValidateBeforeCall(body, authorization, subscription, null, null);
        Type localVarReturnType = new TypeToken<AuthorizedBeneficiariesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recibe la solicitud para agrupar las cuentas SPEI/SPID de beneficiarios en estado pendiente que deben ser autorizadas (asynchronously)
     * Solicta autorizar las cuentas de beneficiarios en estado pendiente agrupandolas en un set de cuentas que pueden incluir tanto cuentas de SPI como de SPID, debe indicar las urls de redireccion en caso de error y en caso de exito&lt;br/&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authorizeAccountsPendingPUTAsync(UrlsRedirect body, String authorization, String subscription, final ApiCallback<AuthorizedBeneficiariesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = authorizeAccountsPendingPUTValidateBeforeCall(body, authorization, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthorizedBeneficiariesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteAccountUsingDELETE
     * @param authorization Header para token (required)
     * @param account La cuenta del beneciario que será eliminada (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAccountUsingDELETECall(String authorization, String account, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spei/{account}"
            .replaceAll("\\{" + "account" + "\\}", apiClient.escapeString(account.toString()))
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAccountUsingDELETEValidateBeforeCall(String authorization, String account, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteAccountUsingDELETE(Async)");
        }
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling deleteAccountUsingDELETE(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling deleteAccountUsingDELETE(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteAccountUsingDELETECall(authorization, account, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Elimina la cuenta del beneficiario
     * Borra la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción. La cuenta a borrar debe ser una cuenta que opere con SPEI.
     * @param authorization Header para token (required)
     * @param account La cuenta del beneciario que será eliminada (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAccountUsingDELETE(String authorization, String account, String subscription) throws ApiException {
        deleteAccountUsingDELETEWithHttpInfo(authorization, account, subscription);
    }

    /**
     * Elimina la cuenta del beneficiario
     * Borra la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción. La cuenta a borrar debe ser una cuenta que opere con SPEI.
     * @param authorization Header para token (required)
     * @param account La cuenta del beneciario que será eliminada (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAccountUsingDELETEWithHttpInfo(String authorization, String account, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountUsingDELETEValidateBeforeCall(authorization, account, subscription, null, null);
        return apiClient.execute(call);
    }

    /**
     * Elimina la cuenta del beneficiario (asynchronously)
     * Borra la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción. La cuenta a borrar debe ser una cuenta que opere con SPEI.
     * @param authorization Header para token (required)
     * @param account La cuenta del beneciario que será eliminada (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountUsingDELETEAsync(String authorization, String account, String subscription, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteAccountUsingDELETEValidateBeforeCall(authorization, account, subscription, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAvailableRelationshipsMonexUsingGET
     * @param authorization Header para token (required)
     * @param subscription Identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAvailableRelationshipsMonexUsingGETCall(String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/relationships"
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAvailableRelationshipsMonexUsingGETValidateBeforeCall(String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getAvailableRelationshipsMonexUsingGET(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling getAvailableRelationshipsMonexUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getAvailableRelationshipsMonexUsingGETCall(authorization, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta de relaciones
     * Obtiene las posibles relaciones existentes para registrar beneficiarios en Monex. Se debe invocar este recurso antes de pre-registrar una cuenta de beneficiario.
     * @param authorization Header para token (required)
     * @param subscription Identificador de la suscripción a esta API (required)
     * @return RelationshipsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RelationshipsResponse getAvailableRelationshipsMonexUsingGET(String authorization, String subscription) throws ApiException {
        ApiResponse<RelationshipsResponse> resp = getAvailableRelationshipsMonexUsingGETWithHttpInfo(authorization, subscription);
        return resp.getData();
    }

    /**
     * Consulta de relaciones
     * Obtiene las posibles relaciones existentes para registrar beneficiarios en Monex. Se debe invocar este recurso antes de pre-registrar una cuenta de beneficiario.
     * @param authorization Header para token (required)
     * @param subscription Identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;RelationshipsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RelationshipsResponse> getAvailableRelationshipsMonexUsingGETWithHttpInfo(String authorization, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = getAvailableRelationshipsMonexUsingGETValidateBeforeCall(authorization, subscription, null, null);
        Type localVarReturnType = new TypeToken<RelationshipsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta de relaciones (asynchronously)
     * Obtiene las posibles relaciones existentes para registrar beneficiarios en Monex. Se debe invocar este recurso antes de pre-registrar una cuenta de beneficiario.
     * @param authorization Header para token (required)
     * @param subscription Identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAvailableRelationshipsMonexUsingGETAsync(String authorization, String subscription, final ApiCallback<RelationshipsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAvailableRelationshipsMonexUsingGETValidateBeforeCall(authorization, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RelationshipsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBeneficiariesByRequestId
     * @param authorization Header para token (required)
     * @param requestId El identificador de la petición del registro de beneficiarios a esta API (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBeneficiariesByRequestIdCall(String authorization, String requestId, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spei/{requestId}"
            .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()))
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBeneficiariesByRequestIdValidateBeforeCall(String authorization, String requestId, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getBeneficiariesByRequestId(Async)");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling getBeneficiariesByRequestId(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling getBeneficiariesByRequestId(Async)");
        }
        
        com.squareup.okhttp.Call call = getBeneficiariesByRequestIdCall(authorization, requestId, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta los beneficiarios por el identificador de la petición de registro
     * Obtiene los beneficiarios enviados para registro en una petición al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex, que pertenezcan a la petición que se solicita.
     * @param authorization Header para token (required)
     * @param requestId El identificador de la petición del registro de beneficiarios a esta API (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return BeneficiariesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BeneficiariesResponse getBeneficiariesByRequestId(String authorization, String requestId, String subscription) throws ApiException {
        ApiResponse<BeneficiariesResponse> resp = getBeneficiariesByRequestIdWithHttpInfo(authorization, requestId, subscription);
        return resp.getData();
    }

    /**
     * Consulta los beneficiarios por el identificador de la petición de registro
     * Obtiene los beneficiarios enviados para registro en una petición al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex, que pertenezcan a la petición que se solicita.
     * @param authorization Header para token (required)
     * @param requestId El identificador de la petición del registro de beneficiarios a esta API (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;BeneficiariesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BeneficiariesResponse> getBeneficiariesByRequestIdWithHttpInfo(String authorization, String requestId, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = getBeneficiariesByRequestIdValidateBeforeCall(authorization, requestId, subscription, null, null);
        Type localVarReturnType = new TypeToken<BeneficiariesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta los beneficiarios por el identificador de la petición de registro (asynchronously)
     * Obtiene los beneficiarios enviados para registro en una petición al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex, que pertenezcan a la petición que se solicita.
     * @param authorization Header para token (required)
     * @param requestId El identificador de la petición del registro de beneficiarios a esta API (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBeneficiariesByRequestIdAsync(String authorization, String requestId, String subscription, final ApiCallback<BeneficiariesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBeneficiariesByRequestIdValidateBeforeCall(authorization, requestId, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BeneficiariesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBeneficiariesForAccountUsingGET
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param account Cuenta del beneficiario, puede ser Clabe, TDD o Celular (optional)
     * @param beneficiaryBank Clave del banco beneficiario (optional)
     * @param beneficiaryName Nombre del beneficiario (optional)
     * @param endDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param initDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param rfc RFC del beneficiario (optional)
     * @param status Estatus de la cuenta (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBeneficiariesForAccountUsingGETCall(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spei"
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (account != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("account", account));
        if (beneficiaryBank != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("beneficiary_bank", beneficiaryBank));
        if (beneficiaryName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("beneficiary_name", beneficiaryName));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (initDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("init_date", initDate));
        if (rfc != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("rfc", rfc));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBeneficiariesForAccountUsingGETValidateBeforeCall(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getBeneficiariesForAccountUsingGET(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling getBeneficiariesForAccountUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getBeneficiariesForAccountUsingGETCall(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta los beneficiarios registrados
     * Obtiene los beneficiarios registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param account Cuenta del beneficiario, puede ser Clabe, TDD o Celular (optional)
     * @param beneficiaryBank Clave del banco beneficiario (optional)
     * @param beneficiaryName Nombre del beneficiario (optional)
     * @param endDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param initDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param rfc RFC del beneficiario (optional)
     * @param status Estatus de la cuenta (optional)
     * @return BeneficiariesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BeneficiariesResponse getBeneficiariesForAccountUsingGET(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status) throws ApiException {
        ApiResponse<BeneficiariesResponse> resp = getBeneficiariesForAccountUsingGETWithHttpInfo(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status);
        return resp.getData();
    }

    /**
     * Consulta los beneficiarios registrados
     * Obtiene los beneficiarios registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param account Cuenta del beneficiario, puede ser Clabe, TDD o Celular (optional)
     * @param beneficiaryBank Clave del banco beneficiario (optional)
     * @param beneficiaryName Nombre del beneficiario (optional)
     * @param endDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param initDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param rfc RFC del beneficiario (optional)
     * @param status Estatus de la cuenta (optional)
     * @return ApiResponse&lt;BeneficiariesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BeneficiariesResponse> getBeneficiariesForAccountUsingGETWithHttpInfo(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status) throws ApiException {
        com.squareup.okhttp.Call call = getBeneficiariesForAccountUsingGETValidateBeforeCall(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status, null, null);
        Type localVarReturnType = new TypeToken<BeneficiariesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta los beneficiarios registrados (asynchronously)
     * Obtiene los beneficiarios registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param account Cuenta del beneficiario, puede ser Clabe, TDD o Celular (optional)
     * @param beneficiaryBank Clave del banco beneficiario (optional)
     * @param beneficiaryName Nombre del beneficiario (optional)
     * @param endDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param initDate Fecha de inicio del perido a filtrar en formato dd-mm-yyyy (optional)
     * @param rfc RFC del beneficiario (optional)
     * @param status Estatus de la cuenta (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBeneficiariesForAccountUsingGETAsync(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status, final ApiCallback<BeneficiariesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBeneficiariesForAccountUsingGETValidateBeforeCall(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BeneficiariesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for preRegisterAccountsUsingPOST
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call preRegisterAccountsUsingPOSTCall(AccountRequest body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spei"
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call preRegisterAccountsUsingPOSTValidateBeforeCall(AccountRequest body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling preRegisterAccountsUsingPOST(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling preRegisterAccountsUsingPOST(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling preRegisterAccountsUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = preRegisterAccountsUsingPOSTCall(body, authorization, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Pre-registro de cuentas de beneficiarios.
     * Pre-registra una o más cuentas de beneficiario en la plataforma, proporcionando una URL donde el cuentahabiente Monex debe ingresar un valor de su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt;Los posibles valores de &lt;i&gt;relationship&lt;/i&gt; y &lt;i&gt;kind_of_relationship&lt;/i&gt; se deben  obtener de /subscriptions/{subscription}/beneficiaries/relationships.&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realiza a través de una llamada a los webhooks registrados con el evento ACCOUNT.CREATED.
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return TokenRequiredResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TokenRequiredResponse preRegisterAccountsUsingPOST(AccountRequest body, String authorization, String subscription) throws ApiException {
        ApiResponse<TokenRequiredResponse> resp = preRegisterAccountsUsingPOSTWithHttpInfo(body, authorization, subscription);
        return resp.getData();
    }

    /**
     * Pre-registro de cuentas de beneficiarios.
     * Pre-registra una o más cuentas de beneficiario en la plataforma, proporcionando una URL donde el cuentahabiente Monex debe ingresar un valor de su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt;Los posibles valores de &lt;i&gt;relationship&lt;/i&gt; y &lt;i&gt;kind_of_relationship&lt;/i&gt; se deben  obtener de /subscriptions/{subscription}/beneficiaries/relationships.&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realiza a través de una llamada a los webhooks registrados con el evento ACCOUNT.CREATED.
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;TokenRequiredResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TokenRequiredResponse> preRegisterAccountsUsingPOSTWithHttpInfo(AccountRequest body, String authorization, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = preRegisterAccountsUsingPOSTValidateBeforeCall(body, authorization, subscription, null, null);
        Type localVarReturnType = new TypeToken<TokenRequiredResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Pre-registro de cuentas de beneficiarios. (asynchronously)
     * Pre-registra una o más cuentas de beneficiario en la plataforma, proporcionando una URL donde el cuentahabiente Monex debe ingresar un valor de su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt;Los posibles valores de &lt;i&gt;relationship&lt;/i&gt; y &lt;i&gt;kind_of_relationship&lt;/i&gt; se deben  obtener de /subscriptions/{subscription}/beneficiaries/relationships.&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realiza a través de una llamada a los webhooks registrados con el evento ACCOUNT.CREATED.
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call preRegisterAccountsUsingPOSTAsync(AccountRequest body, String authorization, String subscription, final ApiCallback<TokenRequiredResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = preRegisterAccountsUsingPOSTValidateBeforeCall(body, authorization, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TokenRequiredResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeBeneficiariesPendingUsingDELETE
     * @param authorization Header para token (required)
     * @param requestId Identificador de los beneficiarios a eliminar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeBeneficiariesPendingUsingDELETECall(String authorization, String requestId, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spei/request/{requestId}"
            .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()))
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeBeneficiariesPendingUsingDELETEValidateBeforeCall(String authorization, String requestId, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling removeBeneficiariesPendingUsingDELETE(Async)");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling removeBeneficiariesPendingUsingDELETE(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling removeBeneficiariesPendingUsingDELETE(Async)");
        }
        
        com.squareup.okhttp.Call call = removeBeneficiariesPendingUsingDELETECall(authorization, requestId, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Eliminación de beneficiarios SPEI® sin confirmar
     * Elimina un conjunto de beneficiarios a registrar en la cuenta del cliente Monex relacionada a la suscripción, los beneficiarios no deben haber sido confirmados por el cliente.
     * @param authorization Header para token (required)
     * @param requestId Identificador de los beneficiarios a eliminar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeBeneficiariesPendingUsingDELETE(String authorization, String requestId, String subscription) throws ApiException {
        removeBeneficiariesPendingUsingDELETEWithHttpInfo(authorization, requestId, subscription);
    }

    /**
     * Eliminación de beneficiarios SPEI® sin confirmar
     * Elimina un conjunto de beneficiarios a registrar en la cuenta del cliente Monex relacionada a la suscripción, los beneficiarios no deben haber sido confirmados por el cliente.
     * @param authorization Header para token (required)
     * @param requestId Identificador de los beneficiarios a eliminar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeBeneficiariesPendingUsingDELETEWithHttpInfo(String authorization, String requestId, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = removeBeneficiariesPendingUsingDELETEValidateBeforeCall(authorization, requestId, subscription, null, null);
        return apiClient.execute(call);
    }

    /**
     * Eliminación de beneficiarios SPEI® sin confirmar (asynchronously)
     * Elimina un conjunto de beneficiarios a registrar en la cuenta del cliente Monex relacionada a la suscripción, los beneficiarios no deben haber sido confirmados por el cliente.
     * @param authorization Header para token (required)
     * @param requestId Identificador de los beneficiarios a eliminar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeBeneficiariesPendingUsingDELETEAsync(String authorization, String requestId, String subscription, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = removeBeneficiariesPendingUsingDELETEValidateBeforeCall(authorization, requestId, subscription, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateAmountLimitAccountUsingPUT
     * @param body Información de la cuenta y el monto límite a actualizar (required)
     * @param authorization Header para token (required)
     * @param account Cuenta a actualizar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAmountLimitAccountUsingPUTCall(AmountRequest body, String authorization, String account, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spei/{account}"
            .replaceAll("\\{" + "account" + "\\}", apiClient.escapeString(account.toString()))
            .replaceAll("\\{" + "subscription" + "\\}", apiClient.escapeString(subscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateAmountLimitAccountUsingPUTValidateBeforeCall(AmountRequest body, String authorization, String account, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateAmountLimitAccountUsingPUT(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling updateAmountLimitAccountUsingPUT(Async)");
        }
        // verify the required parameter 'account' is set
        if (account == null) {
            throw new ApiException("Missing the required parameter 'account' when calling updateAmountLimitAccountUsingPUT(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling updateAmountLimitAccountUsingPUT(Async)");
        }
        
        com.squareup.okhttp.Call call = updateAmountLimitAccountUsingPUTCall(body, authorization, account, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Actualiza el monto límite
     * Actualiza el monto límite a la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción.
     * @param body Información de la cuenta y el monto límite a actualizar (required)
     * @param authorization Header para token (required)
     * @param account Cuenta a actualizar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateAmountLimitAccountUsingPUT(AmountRequest body, String authorization, String account, String subscription) throws ApiException {
        updateAmountLimitAccountUsingPUTWithHttpInfo(body, authorization, account, subscription);
    }

    /**
     * Actualiza el monto límite
     * Actualiza el monto límite a la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción.
     * @param body Información de la cuenta y el monto límite a actualizar (required)
     * @param authorization Header para token (required)
     * @param account Cuenta a actualizar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateAmountLimitAccountUsingPUTWithHttpInfo(AmountRequest body, String authorization, String account, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = updateAmountLimitAccountUsingPUTValidateBeforeCall(body, authorization, account, subscription, null, null);
        return apiClient.execute(call);
    }

    /**
     * Actualiza el monto límite (asynchronously)
     * Actualiza el monto límite a la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción.
     * @param body Información de la cuenta y el monto límite a actualizar (required)
     * @param authorization Header para token (required)
     * @param account Cuenta a actualizar (required)
     * @param subscription El identificador de la suscripción a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAmountLimitAccountUsingPUTAsync(AmountRequest body, String authorization, String account, String subscription, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateAmountLimitAccountUsingPUTValidateBeforeCall(body, authorization, account, subscription, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
