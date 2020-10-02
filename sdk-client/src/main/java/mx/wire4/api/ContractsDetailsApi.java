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


import mx.wire4.model.AuthorizedUsers;
import mx.wire4.model.ContractDetailRequest;
import mx.wire4.model.ContractDetailResponse;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.PreMonexAuthorization;
import mx.wire4.model.TokenRequiredResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractsDetailsApi {
    private ApiClient apiClient;

    public ContractsDetailsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractsDetailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAuthorization
     * @param body Información para la autorización (required)
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAuthorizationCall(PreMonexAuthorization body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/onboarding/accounts/authorize";

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
    private com.squareup.okhttp.Call createAuthorizationValidateBeforeCall(PreMonexAuthorization body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createAuthorization(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createAuthorization(Async)");
        }
        
        com.squareup.okhttp.Call call = createAuthorizationCall(body, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Devuelve la URL para autorización del usuario Monex
     * Se obtiene la URL para la autorización del usuario Monex.
     * @param body Información para la autorización (required)
     * @param authorization Header para token (required)
     * @return TokenRequiredResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TokenRequiredResponse createAuthorization(PreMonexAuthorization body, String authorization) throws ApiException {
        ApiResponse<TokenRequiredResponse> resp = createAuthorizationWithHttpInfo(body, authorization);
        return resp.getData();
    }

    /**
     * Devuelve la URL para autorización del usuario Monex
     * Se obtiene la URL para la autorización del usuario Monex.
     * @param body Información para la autorización (required)
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;TokenRequiredResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TokenRequiredResponse> createAuthorizationWithHttpInfo(PreMonexAuthorization body, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = createAuthorizationValidateBeforeCall(body, authorization, null, null);
        Type localVarReturnType = new TypeToken<TokenRequiredResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Devuelve la URL para autorización del usuario Monex (asynchronously)
     * Se obtiene la URL para la autorización del usuario Monex.
     * @param body Información para la autorización (required)
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAuthorizationAsync(PreMonexAuthorization body, String authorization, final ApiCallback<TokenRequiredResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAuthorizationValidateBeforeCall(body, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TokenRequiredResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for obtainAuthorizedUsers
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param requestId El identificador de la petición a esta API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obtainAuthorizedUsersCall(String authorization, String X_ACCESS_KEY, String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/onboarding/accounts/{requestId}/authorized-users"
            .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (X_ACCESS_KEY != null)
        localVarHeaderParams.put("X-ACCESS-KEY", apiClient.parameterToString(X_ACCESS_KEY));

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
    private com.squareup.okhttp.Call obtainAuthorizedUsersValidateBeforeCall(String authorization, String X_ACCESS_KEY, String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling obtainAuthorizedUsers(Async)");
        }
        // verify the required parameter 'X_ACCESS_KEY' is set
        if (X_ACCESS_KEY == null) {
            throw new ApiException("Missing the required parameter 'X_ACCESS_KEY' when calling obtainAuthorizedUsers(Async)");
        }
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling obtainAuthorizedUsers(Async)");
        }
        
        com.squareup.okhttp.Call call = obtainAuthorizedUsersCall(authorization, X_ACCESS_KEY, requestId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtiene los usuarios autorizados
     * Obtienen los detalles de los usuarios autorizados de Monex.
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param requestId El identificador de la petición a esta API (required)
     * @return List&lt;AuthorizedUsers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuthorizedUsers> obtainAuthorizedUsers(String authorization, String X_ACCESS_KEY, String requestId) throws ApiException {
        ApiResponse<List<AuthorizedUsers>> resp = obtainAuthorizedUsersWithHttpInfo(authorization, X_ACCESS_KEY, requestId);
        return resp.getData();
    }

    /**
     * Obtiene los usuarios autorizados
     * Obtienen los detalles de los usuarios autorizados de Monex.
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param requestId El identificador de la petición a esta API (required)
     * @return ApiResponse&lt;List&lt;AuthorizedUsers&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuthorizedUsers>> obtainAuthorizedUsersWithHttpInfo(String authorization, String X_ACCESS_KEY, String requestId) throws ApiException {
        com.squareup.okhttp.Call call = obtainAuthorizedUsersValidateBeforeCall(authorization, X_ACCESS_KEY, requestId, null, null);
        Type localVarReturnType = new TypeToken<List<AuthorizedUsers>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtiene los usuarios autorizados (asynchronously)
     * Obtienen los detalles de los usuarios autorizados de Monex.
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param requestId El identificador de la petición a esta API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obtainAuthorizedUsersAsync(String authorization, String X_ACCESS_KEY, String requestId, final ApiCallback<List<AuthorizedUsers>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obtainAuthorizedUsersValidateBeforeCall(authorization, X_ACCESS_KEY, requestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuthorizedUsers>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for obtainAuthorizedUsersByContract
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param contract El contrato Monex (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obtainAuthorizedUsersByContractCall(String authorization, String X_ACCESS_KEY, String contract, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/onboarding/accounts/authorized-users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (contract != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("contract", contract));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (X_ACCESS_KEY != null)
        localVarHeaderParams.put("X-ACCESS-KEY", apiClient.parameterToString(X_ACCESS_KEY));

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
    private com.squareup.okhttp.Call obtainAuthorizedUsersByContractValidateBeforeCall(String authorization, String X_ACCESS_KEY, String contract, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling obtainAuthorizedUsersByContract(Async)");
        }
        // verify the required parameter 'X_ACCESS_KEY' is set
        if (X_ACCESS_KEY == null) {
            throw new ApiException("Missing the required parameter 'X_ACCESS_KEY' when calling obtainAuthorizedUsersByContract(Async)");
        }
        
        com.squareup.okhttp.Call call = obtainAuthorizedUsersByContractCall(authorization, X_ACCESS_KEY, contract, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtiene los usuarios autorizados por contrato
     * Obtienen los detalles de los usuarios autorizados por contrato Monex.
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param contract El contrato Monex (optional)
     * @return List&lt;AuthorizedUsers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuthorizedUsers> obtainAuthorizedUsersByContract(String authorization, String X_ACCESS_KEY, String contract) throws ApiException {
        ApiResponse<List<AuthorizedUsers>> resp = obtainAuthorizedUsersByContractWithHttpInfo(authorization, X_ACCESS_KEY, contract);
        return resp.getData();
    }

    /**
     * Obtiene los usuarios autorizados por contrato
     * Obtienen los detalles de los usuarios autorizados por contrato Monex.
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param contract El contrato Monex (optional)
     * @return ApiResponse&lt;List&lt;AuthorizedUsers&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuthorizedUsers>> obtainAuthorizedUsersByContractWithHttpInfo(String authorization, String X_ACCESS_KEY, String contract) throws ApiException {
        com.squareup.okhttp.Call call = obtainAuthorizedUsersByContractValidateBeforeCall(authorization, X_ACCESS_KEY, contract, null, null);
        Type localVarReturnType = new TypeToken<List<AuthorizedUsers>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtiene los usuarios autorizados por contrato (asynchronously)
     * Obtienen los detalles de los usuarios autorizados por contrato Monex.
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param contract El contrato Monex (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obtainAuthorizedUsersByContractAsync(String authorization, String X_ACCESS_KEY, String contract, final ApiCallback<List<AuthorizedUsers>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obtainAuthorizedUsersByContractValidateBeforeCall(authorization, X_ACCESS_KEY, contract, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuthorizedUsers>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for obtainContractDetails
     * @param body Información para obtener los detalles de la companía (required)
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obtainContractDetailsCall(ContractDetailRequest body, String authorization, String X_ACCESS_KEY, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/onboarding/accounts/details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (X_ACCESS_KEY != null)
        localVarHeaderParams.put("X-ACCESS-KEY", apiClient.parameterToString(X_ACCESS_KEY));

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
    private com.squareup.okhttp.Call obtainContractDetailsValidateBeforeCall(ContractDetailRequest body, String authorization, String X_ACCESS_KEY, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling obtainContractDetails(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling obtainContractDetails(Async)");
        }
        // verify the required parameter 'X_ACCESS_KEY' is set
        if (X_ACCESS_KEY == null) {
            throw new ApiException("Missing the required parameter 'X_ACCESS_KEY' when calling obtainContractDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = obtainContractDetailsCall(body, authorization, X_ACCESS_KEY, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Obtiene los detalles de la empresa del contrato
     * Detalles de la compañía relacionada con el contrato de Monex.
     * @param body Información para obtener los detalles de la companía (required)
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @return ContractDetailResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContractDetailResponse obtainContractDetails(ContractDetailRequest body, String authorization, String X_ACCESS_KEY) throws ApiException {
        ApiResponse<ContractDetailResponse> resp = obtainContractDetailsWithHttpInfo(body, authorization, X_ACCESS_KEY);
        return resp.getData();
    }

    /**
     * Obtiene los detalles de la empresa del contrato
     * Detalles de la compañía relacionada con el contrato de Monex.
     * @param body Información para obtener los detalles de la companía (required)
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @return ApiResponse&lt;ContractDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContractDetailResponse> obtainContractDetailsWithHttpInfo(ContractDetailRequest body, String authorization, String X_ACCESS_KEY) throws ApiException {
        com.squareup.okhttp.Call call = obtainContractDetailsValidateBeforeCall(body, authorization, X_ACCESS_KEY, null, null);
        Type localVarReturnType = new TypeToken<ContractDetailResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obtiene los detalles de la empresa del contrato (asynchronously)
     * Detalles de la compañía relacionada con el contrato de Monex.
     * @param body Información para obtener los detalles de la companía (required)
     * @param authorization Header para token (required)
     * @param X_ACCESS_KEY La llave de acceso de la aplicación (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obtainContractDetailsAsync(ContractDetailRequest body, String authorization, String X_ACCESS_KEY, final ApiCallback<ContractDetailResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obtainContractDetailsValidateBeforeCall(body, authorization, X_ACCESS_KEY, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContractDetailResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
