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


import mx.wire4.model.ConfirmRecurringCharge;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.RecurringChargeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargosRecurrentesApi {
    private ApiClient apiClient;

    public CargosRecurrentesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CargosRecurrentesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteRecurringChargeUsingDELETE
     * @param authorization Header para token (required)
     * @param orderId orderId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRecurringChargeUsingDELETECall(String authorization, String orderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/recurring-charge/{orderId}"
            .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRecurringChargeUsingDELETEValidateBeforeCall(String authorization, String orderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteRecurringChargeUsingDELETE(Async)");
        }
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling deleteRecurringChargeUsingDELETE(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteRecurringChargeUsingDELETECall(authorization, orderId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancelación/desubscripción de cargos recurrentes
     *  Se solicita la desuscripción de un cargo recurrente activo. En el request llevará el orderId que identifica el cargo recurrente a eliminar/dar de baja se deshabilitará tanto de openpay como del sistem wire4.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial
     * @param authorization Header para token (required)
     * @param orderId orderId (required)
     * @return ConfirmRecurringCharge
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfirmRecurringCharge deleteRecurringChargeUsingDELETE(String authorization, String orderId) throws ApiException {
        ApiResponse<ConfirmRecurringCharge> resp = deleteRecurringChargeUsingDELETEWithHttpInfo(authorization, orderId);
        return resp.getData();
    }

    /**
     * Cancelación/desubscripción de cargos recurrentes
     *  Se solicita la desuscripción de un cargo recurrente activo. En el request llevará el orderId que identifica el cargo recurrente a eliminar/dar de baja se deshabilitará tanto de openpay como del sistem wire4.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial
     * @param authorization Header para token (required)
     * @param orderId orderId (required)
     * @return ApiResponse&lt;ConfirmRecurringCharge&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConfirmRecurringCharge> deleteRecurringChargeUsingDELETEWithHttpInfo(String authorization, String orderId) throws ApiException {
        com.squareup.okhttp.Call call = deleteRecurringChargeUsingDELETEValidateBeforeCall(authorization, orderId, null, null);
        Type localVarReturnType = new TypeToken<ConfirmRecurringCharge>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancelación/desubscripción de cargos recurrentes (asynchronously)
     *  Se solicita la desuscripción de un cargo recurrente activo. En el request llevará el orderId que identifica el cargo recurrente a eliminar/dar de baja se deshabilitará tanto de openpay como del sistem wire4.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial
     * @param authorization Header para token (required)
     * @param orderId orderId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRecurringChargeUsingDELETEAsync(String authorization, String orderId, final ApiCallback<ConfirmRecurringCharge> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRecurringChargeUsingDELETEValidateBeforeCall(authorization, orderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConfirmRecurringCharge>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerRecurringChargeUsingPOST
     * @param body Información de la solicitud para aplicar cargos recurrentes (required)
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerRecurringChargeUsingPOSTCall(RecurringChargeRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/recurring-charge";

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
    private com.squareup.okhttp.Call registerRecurringChargeUsingPOSTValidateBeforeCall(RecurringChargeRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling registerRecurringChargeUsingPOST(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling registerRecurringChargeUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = registerRecurringChargeUsingPOSTCall(body, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Registro de cargos recurrentes
     *  Se registra una solicitud para generar un plan de cargos recurrentes. En la respuesta se proporcionará una dirección URL que lo llevará al sitio donde se le solicitará ingresar los datos de tarjeta a la que se aplicarán los cargos de acuerdo al plan seleccionado.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial
     * @param body Información de la solicitud para aplicar cargos recurrentes (required)
     * @param authorization Header para token (required)
     * @return ConfirmRecurringCharge
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfirmRecurringCharge registerRecurringChargeUsingPOST(RecurringChargeRequest body, String authorization) throws ApiException {
        ApiResponse<ConfirmRecurringCharge> resp = registerRecurringChargeUsingPOSTWithHttpInfo(body, authorization);
        return resp.getData();
    }

    /**
     * Registro de cargos recurrentes
     *  Se registra una solicitud para generar un plan de cargos recurrentes. En la respuesta se proporcionará una dirección URL que lo llevará al sitio donde se le solicitará ingresar los datos de tarjeta a la que se aplicarán los cargos de acuerdo al plan seleccionado.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial
     * @param body Información de la solicitud para aplicar cargos recurrentes (required)
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;ConfirmRecurringCharge&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConfirmRecurringCharge> registerRecurringChargeUsingPOSTWithHttpInfo(RecurringChargeRequest body, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = registerRecurringChargeUsingPOSTValidateBeforeCall(body, authorization, null, null);
        Type localVarReturnType = new TypeToken<ConfirmRecurringCharge>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Registro de cargos recurrentes (asynchronously)
     *  Se registra una solicitud para generar un plan de cargos recurrentes. En la respuesta se proporcionará una dirección URL que lo llevará al sitio donde se le solicitará ingresar los datos de tarjeta a la que se aplicarán los cargos de acuerdo al plan seleccionado.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial
     * @param body Información de la solicitud para aplicar cargos recurrentes (required)
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerRecurringChargeUsingPOSTAsync(RecurringChargeRequest body, String authorization, final ApiCallback<ConfirmRecurringCharge> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = registerRecurringChargeUsingPOSTValidateBeforeCall(body, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConfirmRecurringCharge>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
