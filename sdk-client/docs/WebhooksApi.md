# WebhooksApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{id} | Consulta de Webhook
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Consulta de Webhooks
[**registerWebhook**](WebhooksApi.md#registerWebhook) | **POST** /webhooks | Alta de Webhook

<a name="getWebhook"></a>
# **getWebhook**
> WebhookResponse getWebhook(authorization, id)

Consulta de Webhook

Obtiene un webhook registrado en la plataforma mediante su identificador.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | Header para token
String id = "id_example"; // String | Identificador del webhook
try {
    WebhookResponse result = apiInstance.getWebhook(authorization, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **id** | **String**| Identificador del webhook |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhooksList getWebhooks(authorization)

Consulta de Webhooks

Obtiene los webhooks registrados en la plataforma que tengan estatus &#x27;ACTIVE&#x27; e &#x27;INACTIVE&#x27;.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String authorization = "authorization_example"; // String | Header para token
try {
    WebhooksList result = apiInstance.getWebhooks(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |

### Return type

[**WebhooksList**](WebhooksList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerWebhook"></a>
# **registerWebhook**
> WebhookResponse registerWebhook(body, authorization)

Alta de Webhook

Registra un webhook en la plataforma para su uso como notificador de eventos cuando estos ocurran.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
WebhookRequest body = new WebhookRequest(); // WebhookRequest | Información para registrar un Webhook
String authorization = "authorization_example"; // String | Header para token
try {
    WebhookResponse result = apiInstance.registerWebhook(body, authorization);
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
 **authorization** | **String**| Header para token |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

