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


import mx.wire4.model.AccountSpid;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.SpidBeneficiariesResponse;
import mx.wire4.model.TokenRequiredResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuentasDeBeneficiariosSpidApi {
    private ApiClient apiClient;

    public CuentasDeBeneficiariosSpidApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CuentasDeBeneficiariosSpidApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getSpidBeneficiariesForAccount
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param account Cuenta del beneficiario, puede ser CLABE (18 dígitos), Tarjeta de débito  (TDD, 16 dígitos) o número de celular (10 dígitos). (optional)
     * @param beneficiaryBank Es la clave del banco beneficiario. Se puede obtener del catalogo de &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; (optional)
     * @param beneficiaryName Es el nombre del beneficiario. (optional)
     * @param endDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param initDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param rfc Es el Registro Federal de Contribuyentes (RFC) del beneficiario. (optional)
     * @param status Es el estado (estatus) de la cuenta, Los valores pueden ser &lt;b&gt;PENDING&lt;/b&gt; y &lt;b&gt;REGISTERED&lt;/b&gt;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSpidBeneficiariesForAccountCall(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spid"
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
    private com.squareup.okhttp.Call getSpidBeneficiariesForAccountValidateBeforeCall(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getSpidBeneficiariesForAccount(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling getSpidBeneficiariesForAccount(Async)");
        }
        
        com.squareup.okhttp.Call call = getSpidBeneficiariesForAccountCall(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta los beneficiarios SPID registrados
     * Obtiene los beneficiarios SPID registrados al contrato relacionado con la suscripción. Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param account Cuenta del beneficiario, puede ser CLABE (18 dígitos), Tarjeta de débito  (TDD, 16 dígitos) o número de celular (10 dígitos). (optional)
     * @param beneficiaryBank Es la clave del banco beneficiario. Se puede obtener del catalogo de &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; (optional)
     * @param beneficiaryName Es el nombre del beneficiario. (optional)
     * @param endDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param initDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param rfc Es el Registro Federal de Contribuyentes (RFC) del beneficiario. (optional)
     * @param status Es el estado (estatus) de la cuenta, Los valores pueden ser &lt;b&gt;PENDING&lt;/b&gt; y &lt;b&gt;REGISTERED&lt;/b&gt;. (optional)
     * @return SpidBeneficiariesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SpidBeneficiariesResponse getSpidBeneficiariesForAccount(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status) throws ApiException {
        ApiResponse<SpidBeneficiariesResponse> resp = getSpidBeneficiariesForAccountWithHttpInfo(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status);
        return resp.getData();
    }

    /**
     * Consulta los beneficiarios SPID registrados
     * Obtiene los beneficiarios SPID registrados al contrato relacionado con la suscripción. Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param account Cuenta del beneficiario, puede ser CLABE (18 dígitos), Tarjeta de débito  (TDD, 16 dígitos) o número de celular (10 dígitos). (optional)
     * @param beneficiaryBank Es la clave del banco beneficiario. Se puede obtener del catalogo de &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; (optional)
     * @param beneficiaryName Es el nombre del beneficiario. (optional)
     * @param endDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param initDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param rfc Es el Registro Federal de Contribuyentes (RFC) del beneficiario. (optional)
     * @param status Es el estado (estatus) de la cuenta, Los valores pueden ser &lt;b&gt;PENDING&lt;/b&gt; y &lt;b&gt;REGISTERED&lt;/b&gt;. (optional)
     * @return ApiResponse&lt;SpidBeneficiariesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SpidBeneficiariesResponse> getSpidBeneficiariesForAccountWithHttpInfo(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status) throws ApiException {
        com.squareup.okhttp.Call call = getSpidBeneficiariesForAccountValidateBeforeCall(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status, null, null);
        Type localVarReturnType = new TypeToken<SpidBeneficiariesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta los beneficiarios SPID registrados (asynchronously)
     * Obtiene los beneficiarios SPID registrados al contrato relacionado con la suscripción. Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param account Cuenta del beneficiario, puede ser CLABE (18 dígitos), Tarjeta de débito  (TDD, 16 dígitos) o número de celular (10 dígitos). (optional)
     * @param beneficiaryBank Es la clave del banco beneficiario. Se puede obtener del catalogo de &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; (optional)
     * @param beneficiaryName Es el nombre del beneficiario. (optional)
     * @param endDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param initDate Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. (optional)
     * @param rfc Es el Registro Federal de Contribuyentes (RFC) del beneficiario. (optional)
     * @param status Es el estado (estatus) de la cuenta, Los valores pueden ser &lt;b&gt;PENDING&lt;/b&gt; y &lt;b&gt;REGISTERED&lt;/b&gt;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSpidBeneficiariesForAccountAsync(String authorization, String subscription, String account, String beneficiaryBank, String beneficiaryName, String endDate, String initDate, String rfc, String status, final ApiCallback<SpidBeneficiariesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSpidBeneficiariesForAccountValidateBeforeCall(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SpidBeneficiariesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for preRegisterAccountsUsingPOST1
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call preRegisterAccountsUsingPOST1Call(AccountSpid body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/beneficiaries/spid"
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
    private com.squareup.okhttp.Call preRegisterAccountsUsingPOST1ValidateBeforeCall(AccountSpid body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling preRegisterAccountsUsingPOST1(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling preRegisterAccountsUsingPOST1(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling preRegisterAccountsUsingPOST1(Async)");
        }
        
        com.squareup.okhttp.Call call = preRegisterAccountsUsingPOST1Call(body, authorization, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Pre-registro de cuentas de beneficiarios SPID®
     * Pre-registra una o más cuentas de beneficiario SPID® en la plataforma de Wire4, ésta le proporcionaará una URL donde lo llevará al centro de autorización para que el cuentahabiente Monex ingrese su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt; Los posibles valores de &lt;em&gt;relationship&lt;/em&gt; y &lt;em&gt;kind_of_relationship&lt;/em&gt; se deben  obtener de &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;/subscriptions/{subscription}/beneficiaries/relationships.&lt;/a&gt;&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realizará a través de una notificación a los webhooks registrados con el evento de tipo &lt;a href&#x3D;\&quot;#section/Eventos/Tipos-de-Eventos\&quot;&gt;ACCOUNT.CREATED.&lt;/a&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @return TokenRequiredResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TokenRequiredResponse preRegisterAccountsUsingPOST1(AccountSpid body, String authorization, String subscription) throws ApiException {
        ApiResponse<TokenRequiredResponse> resp = preRegisterAccountsUsingPOST1WithHttpInfo(body, authorization, subscription);
        return resp.getData();
    }

    /**
     * Pre-registro de cuentas de beneficiarios SPID®
     * Pre-registra una o más cuentas de beneficiario SPID® en la plataforma de Wire4, ésta le proporcionaará una URL donde lo llevará al centro de autorización para que el cuentahabiente Monex ingrese su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt; Los posibles valores de &lt;em&gt;relationship&lt;/em&gt; y &lt;em&gt;kind_of_relationship&lt;/em&gt; se deben  obtener de &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;/subscriptions/{subscription}/beneficiaries/relationships.&lt;/a&gt;&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realizará a través de una notificación a los webhooks registrados con el evento de tipo &lt;a href&#x3D;\&quot;#section/Eventos/Tipos-de-Eventos\&quot;&gt;ACCOUNT.CREATED.&lt;/a&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @return ApiResponse&lt;TokenRequiredResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TokenRequiredResponse> preRegisterAccountsUsingPOST1WithHttpInfo(AccountSpid body, String authorization, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = preRegisterAccountsUsingPOST1ValidateBeforeCall(body, authorization, subscription, null, null);
        Type localVarReturnType = new TypeToken<TokenRequiredResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Pre-registro de cuentas de beneficiarios SPID® (asynchronously)
     * Pre-registra una o más cuentas de beneficiario SPID® en la plataforma de Wire4, ésta le proporcionaará una URL donde lo llevará al centro de autorización para que el cuentahabiente Monex ingrese su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt; Los posibles valores de &lt;em&gt;relationship&lt;/em&gt; y &lt;em&gt;kind_of_relationship&lt;/em&gt; se deben  obtener de &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;/subscriptions/{subscription}/beneficiaries/relationships.&lt;/a&gt;&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realizará a través de una notificación a los webhooks registrados con el evento de tipo &lt;a href&#x3D;\&quot;#section/Eventos/Tipos-de-Eventos\&quot;&gt;ACCOUNT.CREATED.&lt;/a&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call preRegisterAccountsUsingPOST1Async(AccountSpid body, String authorization, String subscription, final ApiCallback<TokenRequiredResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = preRegisterAccountsUsingPOST1ValidateBeforeCall(body, authorization, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TokenRequiredResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
