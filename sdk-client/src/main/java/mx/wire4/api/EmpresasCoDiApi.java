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


import mx.wire4.model.CompanyRegistered;
import mx.wire4.model.CompanyRequested;
import mx.wire4.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpresasCoDiApi {
    private ApiClient apiClient;

    public EmpresasCoDiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmpresasCoDiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for obtainCompanies
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obtainCompaniesCall(String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/codi/companies";

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
    private com.squareup.okhttp.Call obtainCompaniesValidateBeforeCall(String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling obtainCompanies(Async)");
        }
        
        com.squareup.okhttp.Call call = obtainCompaniesCall(authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta de empresas CODI®
     * Consulta de empresas CODI® registradas para la aplicación.
     * @param authorization Header para token (required)
     * @return List&lt;CompanyRegistered&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CompanyRegistered> obtainCompanies(String authorization) throws ApiException {
        ApiResponse<List<CompanyRegistered>> resp = obtainCompaniesWithHttpInfo(authorization);
        return resp.getData();
    }

    /**
     * Consulta de empresas CODI®
     * Consulta de empresas CODI® registradas para la aplicación.
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;List&lt;CompanyRegistered&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CompanyRegistered>> obtainCompaniesWithHttpInfo(String authorization) throws ApiException {
        com.squareup.okhttp.Call call = obtainCompaniesValidateBeforeCall(authorization, null, null);
        Type localVarReturnType = new TypeToken<List<CompanyRegistered>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta de empresas CODI® (asynchronously)
     * Consulta de empresas CODI® registradas para la aplicación.
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obtainCompaniesAsync(String authorization, final ApiCallback<List<CompanyRegistered>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obtainCompaniesValidateBeforeCall(authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CompanyRegistered>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerCompanyUsingPOST
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerCompanyUsingPOSTCall(CompanyRequested body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/codi/companies";

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
    private com.squareup.okhttp.Call registerCompanyUsingPOSTValidateBeforeCall(CompanyRequested body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling registerCompanyUsingPOST(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling registerCompanyUsingPOST(Async)");
        }
        
        com.squareup.okhttp.Call call = registerCompanyUsingPOSTCall(body, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Registro de empresas CODI®
     * Registra una empresa para hacer uso de operaciones CODI®.&lt;br&gt;&lt;br&gt; &lt;b&gt;Nota:&lt;b&gt; Es requerido tener el certificado emitido por BANXICO® asi como el Nombre de la empresa, Nombre comercial y el Registro Federal de Contribuyentes (RFC) de la empresa.&lt;br/&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @return CompanyRegistered
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CompanyRegistered registerCompanyUsingPOST(CompanyRequested body, String authorization) throws ApiException {
        ApiResponse<CompanyRegistered> resp = registerCompanyUsingPOSTWithHttpInfo(body, authorization);
        return resp.getData();
    }

    /**
     * Registro de empresas CODI®
     * Registra una empresa para hacer uso de operaciones CODI®.&lt;br&gt;&lt;br&gt; &lt;b&gt;Nota:&lt;b&gt; Es requerido tener el certificado emitido por BANXICO® asi como el Nombre de la empresa, Nombre comercial y el Registro Federal de Contribuyentes (RFC) de la empresa.&lt;br/&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;CompanyRegistered&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CompanyRegistered> registerCompanyUsingPOSTWithHttpInfo(CompanyRequested body, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = registerCompanyUsingPOSTValidateBeforeCall(body, authorization, null, null);
        Type localVarReturnType = new TypeToken<CompanyRegistered>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Registro de empresas CODI® (asynchronously)
     * Registra una empresa para hacer uso de operaciones CODI®.&lt;br&gt;&lt;br&gt; &lt;b&gt;Nota:&lt;b&gt; Es requerido tener el certificado emitido por BANXICO® asi como el Nombre de la empresa, Nombre comercial y el Registro Federal de Contribuyentes (RFC) de la empresa.&lt;br/&gt;
     * @param body Información de la cuenta del beneficiario (required)
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerCompanyUsingPOSTAsync(CompanyRequested body, String authorization, final ApiCallback<CompanyRegistered> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = registerCompanyUsingPOSTValidateBeforeCall(body, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CompanyRegistered>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
