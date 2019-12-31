# ContactoApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendContactUsingPOST**](ContactoApi.md#sendContactUsingPOST) | **POST** /contact | Solicitud de contacto

<a name="sendContactUsingPOST"></a>
# **sendContactUsingPOST**
> sendContactUsingPOST(body)

Solicitud de contacto

Notifica a un asesor Monex para que se ponga en contacto con un posible cliente.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.ContactoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

ContactoApi apiInstance = new ContactoApi();
ContactRequest body = new ContactRequest(); // ContactRequest | Información del contacto
try {
    apiInstance.sendContactUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactoApi#sendContactUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactRequest**](ContactRequest.md)| Información del contacto |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

