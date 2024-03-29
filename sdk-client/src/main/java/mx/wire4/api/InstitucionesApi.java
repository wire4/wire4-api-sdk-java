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
import mx.wire4.model.InstitutionsList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstitucionesApi {
    private ApiClient apiClient;

    public InstitucionesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstitucionesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllInstitutionsUsingGET
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllInstitutionsUsingGETCall(String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/institutions";

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
    private com.squareup.okhttp.Call getAllInstitutionsUsingGETValidateBeforeCall(String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getAllInstitutionsUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getAllInstitutionsUsingGETCall(authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta de instituciones bancarias
     * Se obtiene un listado de las instituciones bancarias y la información de cada una de estas.
     * @param authorization Header para token (required)
     * @return InstitutionsList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InstitutionsList getAllInstitutionsUsingGET(String authorization) throws ApiException {
        ApiResponse<InstitutionsList> resp = getAllInstitutionsUsingGETWithHttpInfo(authorization);
        return resp.getData();
    }

    /**
     * Consulta de instituciones bancarias
     * Se obtiene un listado de las instituciones bancarias y la información de cada una de estas.
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;InstitutionsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InstitutionsList> getAllInstitutionsUsingGETWithHttpInfo(String authorization) throws ApiException {
        com.squareup.okhttp.Call call = getAllInstitutionsUsingGETValidateBeforeCall(authorization, null, null);
        Type localVarReturnType = new TypeToken<InstitutionsList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta de instituciones bancarias (asynchronously)
     * Se obtiene un listado de las instituciones bancarias y la información de cada una de estas.
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllInstitutionsUsingGETAsync(String authorization, final ApiCallback<InstitutionsList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllInstitutionsUsingGETValidateBeforeCall(authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InstitutionsList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
