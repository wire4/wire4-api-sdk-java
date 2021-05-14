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


import mx.wire4.model.DepositantsRegister;
import mx.wire4.model.DepositantsResponse;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.GetDepositants;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepositantesApi {
    private ApiClient apiClient;

    public DepositantesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DepositantesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDepositantsUsingGET
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDepositantsUsingGETCall(String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/depositants"
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
    private com.squareup.okhttp.Call getDepositantsUsingGETValidateBeforeCall(String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getDepositantsUsingGET(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling getDepositantsUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getDepositantsUsingGETCall(authorization, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta de cuentas de depositantes
     * Obtiene una lista de depositantes asociados al contrato relacionado a la suscripción.
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @return GetDepositants
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDepositants getDepositantsUsingGET(String authorization, String subscription) throws ApiException {
        ApiResponse<GetDepositants> resp = getDepositantsUsingGETWithHttpInfo(authorization, subscription);
        return resp.getData();
    }

    /**
     * Consulta de cuentas de depositantes
     * Obtiene una lista de depositantes asociados al contrato relacionado a la suscripción.
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @return ApiResponse&lt;GetDepositants&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDepositants> getDepositantsUsingGETWithHttpInfo(String authorization, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = getDepositantsUsingGETValidateBeforeCall(authorization, subscription, null, null);
        Type localVarReturnType = new TypeToken<GetDepositants>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta de cuentas de depositantes (asynchronously)
     * Obtiene una lista de depositantes asociados al contrato relacionado a la suscripción.
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDepositantsUsingGETAsync(String authorization, String subscription, final ApiCallback<GetDepositants> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDepositantsUsingGETValidateBeforeCall(authorization, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDepositants>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerDepositantsUsingPOST
     * @param body Depositant info (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerDepositantsUsingPOSTCall(DepositantsRegister body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{subscription}/depositants"
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
    private com.squareup.okhttp.Call registerDepositantsUsingPOSTValidateBeforeCall(DepositantsRegister body, String authorization, String subscription, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling registerDepositantsUsingPOST(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling registerDepositantsUsingPOST(Async)");
        }
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new ApiException("Missing the required parameter 'subscription' when calling registerDepositantsUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = registerDepositantsUsingPOSTCall(body, authorization, subscription, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Registra un nuevo depositante
     * Registra un nuevo depositante en el contrato asociado a la suscripción.
     * @param body Depositant info (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @return DepositantsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DepositantsResponse registerDepositantsUsingPOST(DepositantsRegister body, String authorization, String subscription) throws ApiException {
        ApiResponse<DepositantsResponse> resp = registerDepositantsUsingPOSTWithHttpInfo(body, authorization, subscription);
        return resp.getData();
    }

    /**
     * Registra un nuevo depositante
     * Registra un nuevo depositante en el contrato asociado a la suscripción.
     * @param body Depositant info (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @return ApiResponse&lt;DepositantsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DepositantsResponse> registerDepositantsUsingPOSTWithHttpInfo(DepositantsRegister body, String authorization, String subscription) throws ApiException {
        com.squareup.okhttp.Call call = registerDepositantsUsingPOSTValidateBeforeCall(body, authorization, subscription, null, null);
        Type localVarReturnType = new TypeToken<DepositantsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Registra un nuevo depositante (asynchronously)
     * Registra un nuevo depositante en el contrato asociado a la suscripción.
     * @param body Depositant info (required)
     * @param authorization Header para token (required)
     * @param subscription Es el identificador de la suscripción a esta API. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerDepositantsUsingPOSTAsync(DepositantsRegister body, String authorization, String subscription, final ApiCallback<DepositantsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = registerDepositantsUsingPOSTValidateBeforeCall(body, authorization, subscription, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DepositantsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
