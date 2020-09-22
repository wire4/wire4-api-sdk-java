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


import mx.wire4.model.ErrorResponse;
import mx.wire4.model.SalesPointFound;
import mx.wire4.model.SalesPointRequest;
import mx.wire4.model.SalesPointRespose;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PuntosDeVentaCoDiApi {
    private ApiClient apiClient;

    public PuntosDeVentaCoDiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PuntosDeVentaCoDiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createSalesPoint
     * @param body Información del punto de venta CODI® (required)
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSalesPointCall(SalesPointRequest body, String authorization, String companyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/codi/companies/salespoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (companyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("companyId", companyId));

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
    private com.squareup.okhttp.Call createSalesPointValidateBeforeCall(SalesPointRequest body, String authorization, String companyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSalesPoint(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createSalesPoint(Async)");
        }
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling createSalesPoint(Async)");
        }
        
        com.squareup.okhttp.Call call = createSalesPointCall(body, authorization, companyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Registra un punto de venta asociado a una empresa
     * Registra un punto de venta desde donde se emitaran los cobros CODI®, el punto de venta se debe asociar a un cuenta cableregistrada previamente ante Banxico para realizar cobros con CODI®
     * @param body Información del punto de venta CODI® (required)
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @return SalesPointRespose
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SalesPointRespose createSalesPoint(SalesPointRequest body, String authorization, String companyId) throws ApiException {
        ApiResponse<SalesPointRespose> resp = createSalesPointWithHttpInfo(body, authorization, companyId);
        return resp.getData();
    }

    /**
     * Registra un punto de venta asociado a una empresa
     * Registra un punto de venta desde donde se emitaran los cobros CODI®, el punto de venta se debe asociar a un cuenta cableregistrada previamente ante Banxico para realizar cobros con CODI®
     * @param body Información del punto de venta CODI® (required)
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @return ApiResponse&lt;SalesPointRespose&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SalesPointRespose> createSalesPointWithHttpInfo(SalesPointRequest body, String authorization, String companyId) throws ApiException {
        com.squareup.okhttp.Call call = createSalesPointValidateBeforeCall(body, authorization, companyId, null, null);
        Type localVarReturnType = new TypeToken<SalesPointRespose>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Registra un punto de venta asociado a una empresa (asynchronously)
     * Registra un punto de venta desde donde se emitaran los cobros CODI®, el punto de venta se debe asociar a un cuenta cableregistrada previamente ante Banxico para realizar cobros con CODI®
     * @param body Información del punto de venta CODI® (required)
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSalesPointAsync(SalesPointRequest body, String authorization, String companyId, final ApiCallback<SalesPointRespose> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createSalesPointValidateBeforeCall(body, authorization, companyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SalesPointRespose>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for obtainSalePoints
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obtainSalePointsCall(String authorization, String companyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/codi/companies/salespoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (companyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("companyId", companyId));

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
    private com.squareup.okhttp.Call obtainSalePointsValidateBeforeCall(String authorization, String companyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling obtainSalePoints(Async)");
        }
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling obtainSalePoints(Async)");
        }
        
        com.squareup.okhttp.Call call = obtainSalePointsCall(authorization, companyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtiene los puntos de venta asociados a una empresa
     * Obtiene los puntos de venta asociados a una empresa en las cuales se hacen operaciones CODI®
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @return List&lt;SalesPointFound&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SalesPointFound> obtainSalePoints(String authorization, String companyId) throws ApiException {
        ApiResponse<List<SalesPointFound>> resp = obtainSalePointsWithHttpInfo(authorization, companyId);
        return resp.getData();
    }

    /**
     * Obtiene los puntos de venta asociados a una empresa
     * Obtiene los puntos de venta asociados a una empresa en las cuales se hacen operaciones CODI®
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @return ApiResponse&lt;List&lt;SalesPointFound&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SalesPointFound>> obtainSalePointsWithHttpInfo(String authorization, String companyId) throws ApiException {
        com.squareup.okhttp.Call call = obtainSalePointsValidateBeforeCall(authorization, companyId, null, null);
        Type localVarReturnType = new TypeToken<List<SalesPointFound>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtiene los puntos de venta asociados a una empresa (asynchronously)
     * Obtiene los puntos de venta asociados a una empresa en las cuales se hacen operaciones CODI®
     * @param authorization Header para token (required)
     * @param companyId El identificador de la empresa (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obtainSalePointsAsync(String authorization, String companyId, final ApiCallback<List<SalesPointFound>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obtainSalePointsValidateBeforeCall(authorization, companyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SalesPointFound>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}