# WebhooksApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{id} | Consulta de Webhook
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Consulta de Webhooks
[**registerWebhook**](WebhooksApi.md#registerWebhook) | **POST** /webhooks | Alta de Webhook

<a name="getWebhook"></a>
# **getWebhook**
> WebhookResponse getWebhook(id)

Consulta de Webhook

Obtiene un webhook registrado en la plataforma mediante su identificador.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String id = "id_example"; // String | Identificador del webhook
try {
    WebhookResponse result = apiInstance.getWebhook(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador del webhook |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhooksList getWebhooks()

Consulta de Webhooks

Obtiene los webhooks registrados en la plataforma que tengan estatus &#x27;ACTIVE&#x27; e &#x27;INACTIVE&#x27;.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
try {
    WebhooksList result = apiInstance.getWebhooks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksList**](WebhooksList.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerWebhook"></a>
# **registerWebhook**
> WebhookResponse registerWebhook(body)

Alta de Webhook

Registra un webhook en la plataforma para su uso como notificador de eventos cuando estos ocurran.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
WebhookRequest body = new WebhookRequest(); // WebhookRequest | Información para registrar un Webhook
try {
    WebhookResponse result = apiInstance.registerWebhook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#registerWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhookRequest**](WebhookRequest.md)| Información para registrar un Webhook |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

