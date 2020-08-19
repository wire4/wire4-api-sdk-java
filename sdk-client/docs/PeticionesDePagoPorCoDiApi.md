# PeticionesDePagoPorCoDiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consultCodiRequestByOrderId**](PeticionesDePagoPorCoDiApi.md#consultCodiRequestByOrderId) | **GET** /codi/sales-point/charges | Obtiene la información de una petición de pago CODI® por orderId para un punto de venta
[**generateCodiCodeQR**](PeticionesDePagoPorCoDiApi.md#generateCodiCodeQR) | **POST** /codi/sales-point/charges | Genera un código QR para un pago mediante CODI®

<a name="consultCodiRequestByOrderId"></a>
# **consultCodiRequestByOrderId**
> PaymentRequestCodiResponseDTO consultCodiRequestByOrderId(authorization, orderId, salesPointId)

Obtiene la información de una petición de pago CODI® por orderId para un punto de venta

Obtiene la información de una petición de pago CODI® por orderId para un punto de venta

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.PeticionesDePagoPorCoDiApi;


PeticionesDePagoPorCoDiApi apiInstance = new PeticionesDePagoPorCoDiApi();
String authorization = "authorization_example"; // String | Header para token
String orderId = "orderId_example"; // String | Identificador del pago CODI®
String salesPointId = "salesPointId_example"; // String | Identificador del punto de venta
try {
    PaymentRequestCodiResponseDTO result = apiInstance.consultCodiRequestByOrderId(authorization, orderId, salesPointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeticionesDePagoPorCoDiApi#consultCodiRequestByOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **orderId** | **String**| Identificador del pago CODI® |
 **salesPointId** | **String**| Identificador del punto de venta |

### Return type

[**PaymentRequestCodiResponseDTO**](PaymentRequestCodiResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generateCodiCodeQR"></a>
# **generateCodiCodeQR**
> CodiCodeQrResponseDTO generateCodiCodeQR(body, authorization, salesPointId)

Genera un código QR para un pago mediante CODI®

Genera un código QR solicitado por un punto de venta para un pago mediante CODI®

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.PeticionesDePagoPorCoDiApi;


PeticionesDePagoPorCoDiApi apiInstance = new PeticionesDePagoPorCoDiApi();
CodiCodeRequestDTO body = new CodiCodeRequestDTO(); // CodiCodeRequestDTO | Información del pago CODI®
String authorization = "authorization_example"; // String | Header para token
String salesPointId = "salesPointId_example"; // String | Identificador del punto de venta
try {
    CodiCodeQrResponseDTO result = apiInstance.generateCodiCodeQR(body, authorization, salesPointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeticionesDePagoPorCoDiApi#generateCodiCodeQR");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CodiCodeRequestDTO**](CodiCodeRequestDTO.md)| Información del pago CODI® |
 **authorization** | **String**| Header para token |
 **salesPointId** | **String**| Identificador del punto de venta |

### Return type

[**CodiCodeQrResponseDTO**](CodiCodeQrResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

