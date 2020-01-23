# ContactoApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendContactUsingPOST**](ContactoApi.md#sendContactUsingPOST) | **POST** /contact | Solicitud de contacto

<a name="sendContactUsingPOST"></a>
# **sendContactUsingPOST**
> sendContactUsingPOST(body, authorization)

Solicitud de contacto

Notifica a un asesor Monex para que se ponga en contacto con un posible cliente.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ContactoApi;


ContactoApi apiInstance = new ContactoApi();
ContactRequest body = new ContactRequest(); // ContactRequest | Información del contacto
String authorization = "authorization_example"; // String | Header para token
try {
    apiInstance.sendContactUsingPOST(body, authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactoApi#sendContactUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContactRequest**](ContactRequest.md)| Información del contacto |
 **authorization** | **String**| Header para token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

