# SolicitudDePagosApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerPaymentRequestUsingPOST**](SolicitudDePagosApi.md#registerPaymentRequestUsingPOST) | **POST** /payment-request | Registro de solicitud de pagos

<a name="registerPaymentRequestUsingPOST"></a>
# **registerPaymentRequestUsingPOST**
> PaymentRequestResponse registerPaymentRequestUsingPOST(body, authorization)

Registro de solicitud de pagos

 Se registra una solicitud de pagos. En la respuesta se proporcionará una dirección URL que lo llevará al sitio donde se le solicitará ingresar los datos de tarjeta a la que se aplicarán los cargos.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SolicitudDePagosApi;


SolicitudDePagosApi apiInstance = new SolicitudDePagosApi();
PaymentRequestReq body = new PaymentRequestReq(); // PaymentRequestReq | Información de la solicitud de pagos
String authorization = "authorization_example"; // String | Header para token
try {
    PaymentRequestResponse result = apiInstance.registerPaymentRequestUsingPOST(body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SolicitudDePagosApi#registerPaymentRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentRequestReq**](PaymentRequestReq.md)| Información de la solicitud de pagos |
 **authorization** | **String**| Header para token |

### Return type

[**PaymentRequestResponse**](PaymentRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

