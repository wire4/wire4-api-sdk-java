# ReporteDeSolicitudesDePagosApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentRequestIdReportByOrderIdUsingGET**](ReporteDeSolicitudesDePagosApi.md#paymentRequestIdReportByOrderIdUsingGET) | **GET** /payment-request | Consulta de solicitudes de pago por numero de orden.
[**paymentRequestIdReportUsingGET**](ReporteDeSolicitudesDePagosApi.md#paymentRequestIdReportUsingGET) | **GET** /payment-request/{requestId} | Consulta de solicitudes de pago por identificador de petición

<a name="paymentRequestIdReportByOrderIdUsingGET"></a>
# **paymentRequestIdReportByOrderIdUsingGET**
> PaymentRequestReportDTO paymentRequestIdReportByOrderIdUsingGET(authorization, orderId)

Consulta de solicitudes de pago por numero de orden.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ReporteDeSolicitudesDePagosApi;


ReporteDeSolicitudesDePagosApi apiInstance = new ReporteDeSolicitudesDePagosApi();
String authorization = "authorization_example"; // String | Header para token
String orderId = "orderId_example"; // String | Es el identificador de la orden a buscar.
try {
    PaymentRequestReportDTO result = apiInstance.paymentRequestIdReportByOrderIdUsingGET(authorization, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReporteDeSolicitudesDePagosApi#paymentRequestIdReportByOrderIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **orderId** | **String**| Es el identificador de la orden a buscar. | [optional]

### Return type

[**PaymentRequestReportDTO**](PaymentRequestReportDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentRequestIdReportUsingGET"></a>
# **paymentRequestIdReportUsingGET**
> PaymentRequestReportDTO paymentRequestIdReportUsingGET(authorization, requestId)

Consulta de solicitudes de pago por identificador de petición

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ReporteDeSolicitudesDePagosApi;


ReporteDeSolicitudesDePagosApi apiInstance = new ReporteDeSolicitudesDePagosApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | Identificador de la petición a buscar.
try {
    PaymentRequestReportDTO result = apiInstance.paymentRequestIdReportUsingGET(authorization, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReporteDeSolicitudesDePagosApi#paymentRequestIdReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **requestId** | **String**| Identificador de la petición a buscar. |

### Return type

[**PaymentRequestReportDTO**](PaymentRequestReportDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

