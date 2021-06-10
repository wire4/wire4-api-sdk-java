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
import mx.wire4.model.WebhookRequest;
import mx.wire4.model.WebhookResponse;
import mx.wire4.model.WebhooksList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getWebhook
     * @param authorization Header para token (required)
     * @param webhookId Es el identificador del webhook. Ejemplo: wh_54a932866f784b439bc625c0f4e04e12 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhookCall(String authorization, String webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks/{webhook_id}"
            .replaceAll("\\{" + "webhook_id" + "\\}", apiClient.escapeString(webhookId.toString()));

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
    private com.squareup.okhttp.Call getWebhookValidateBeforeCall(String authorization, String webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getWebhook(Async)");
        }
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling getWebhook(Async)");
        }
        
        com.squareup.okhttp.Call call = getWebhookCall(authorization, webhookId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta de Webhook
     * Obtiene un webhook registrado en la plataforma mediante su identificador.
     * @param authorization Header para token (required)
     * @param webhookId Es el identificador del webhook. Ejemplo: wh_54a932866f784b439bc625c0f4e04e12 (required)
     * @return WebhookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookResponse getWebhook(String authorization, String webhookId) throws ApiException {
        ApiResponse<WebhookResponse> resp = getWebhookWithHttpInfo(authorization, webhookId);
        return resp.getData();
    }

    /**
     * Consulta de Webhook
     * Obtiene un webhook registrado en la plataforma mediante su identificador.
     * @param authorization Header para token (required)
     * @param webhookId Es el identificador del webhook. Ejemplo: wh_54a932866f784b439bc625c0f4e04e12 (required)
     * @return ApiResponse&lt;WebhookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookResponse> getWebhookWithHttpInfo(String authorization, String webhookId) throws ApiException {
        com.squareup.okhttp.Call call = getWebhookValidateBeforeCall(authorization, webhookId, null, null);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta de Webhook (asynchronously)
     * Obtiene un webhook registrado en la plataforma mediante su identificador.
     * @param authorization Header para token (required)
     * @param webhookId Es el identificador del webhook. Ejemplo: wh_54a932866f784b439bc625c0f4e04e12 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhookAsync(String authorization, String webhookId, final ApiCallback<WebhookResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getWebhookValidateBeforeCall(authorization, webhookId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWebhooks
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhooksCall(String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks";

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
    private com.squareup.okhttp.Call getWebhooksValidateBeforeCall(String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getWebhooks(Async)");
        }
        
        com.squareup.okhttp.Call call = getWebhooksCall(authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Consulta la lista de Webhooks
     * Obtiene una lista de los webhooks registrados en la plataforma que tengan el estado (estatus)  Activo (ACTIVE) e Inactivo (INACTIVE).
     * @param authorization Header para token (required)
     * @return WebhooksList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhooksList getWebhooks(String authorization) throws ApiException {
        ApiResponse<WebhooksList> resp = getWebhooksWithHttpInfo(authorization);
        return resp.getData();
    }

    /**
     * Consulta la lista de Webhooks
     * Obtiene una lista de los webhooks registrados en la plataforma que tengan el estado (estatus)  Activo (ACTIVE) e Inactivo (INACTIVE).
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;WebhooksList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhooksList> getWebhooksWithHttpInfo(String authorization) throws ApiException {
        com.squareup.okhttp.Call call = getWebhooksValidateBeforeCall(authorization, null, null);
        Type localVarReturnType = new TypeToken<WebhooksList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Consulta la lista de Webhooks (asynchronously)
     * Obtiene una lista de los webhooks registrados en la plataforma que tengan el estado (estatus)  Activo (ACTIVE) e Inactivo (INACTIVE).
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhooksAsync(String authorization, final ApiCallback<WebhooksList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getWebhooksValidateBeforeCall(authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebhooksList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerWebhook
     * @param body Información para registrar un Webhook (required)
     * @param authorization Header para token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerWebhookCall(WebhookRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/webhooks";

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
    private com.squareup.okhttp.Call registerWebhookValidateBeforeCall(WebhookRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling registerWebhook(Async)");
        }
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling registerWebhook(Async)");
        }
        
        com.squareup.okhttp.Call call = registerWebhookCall(body, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Alta de Webhook
     * Registra un webhook en la plataforma para su uso como notificador de eventos, cuándo estos ocurran.
     * @param body Información para registrar un Webhook (required)
     * @param authorization Header para token (required)
     * @return WebhookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookResponse registerWebhook(WebhookRequest body, String authorization) throws ApiException {
        ApiResponse<WebhookResponse> resp = registerWebhookWithHttpInfo(body, authorization);
        return resp.getData();
    }

    /**
     * Alta de Webhook
     * Registra un webhook en la plataforma para su uso como notificador de eventos, cuándo estos ocurran.
     * @param body Información para registrar un Webhook (required)
     * @param authorization Header para token (required)
     * @return ApiResponse&lt;WebhookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookResponse> registerWebhookWithHttpInfo(WebhookRequest body, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = registerWebhookValidateBeforeCall(body, authorization, null, null);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Alta de Webhook (asynchronously)
     * Registra un webhook en la plataforma para su uso como notificador de eventos, cuándo estos ocurran.
     * @param body Información para registrar un Webhook (required)
     * @param authorization Header para token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerWebhookAsync(WebhookRequest body, String authorization, final ApiCallback<WebhookResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = registerWebhookValidateBeforeCall(body, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
