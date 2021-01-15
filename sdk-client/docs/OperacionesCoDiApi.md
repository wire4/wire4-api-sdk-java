# OperacionesCoDiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consultCodiOperations**](OperacionesCoDiApi.md#consultCodiOperations) | **POST** /codi/charges | Consulta de operaciones

<a name="consultCodiOperations"></a>
# **consultCodiOperations**
> PagerResponseDto consultCodiOperations(authorization, body, companyId, page, salesPointId, size)

Consulta de operaciones

Obtiene las operaciones generadas a partir de peticiones de pago CODI® de forma paginada, pudiendo aplicar filtros.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.OperacionesCoDiApi;


OperacionesCoDiApi apiInstance = new OperacionesCoDiApi();
String authorization = "authorization_example"; // String | Header para token
CodiOperationsFiltersRequestDTO body = new CodiOperationsFiltersRequestDTO(); // CodiOperationsFiltersRequestDTO | Filtros de busqueda
String companyId = "companyId_example"; // String | Es el identificador de empresa CODI®.
String page = "page_example"; // String | Es el número de pago.
String salesPointId = "salesPointId_example"; // String | Es el identificador del punto de venta.
String size = "size_example"; // String | Es el tamaño de página.
try {
    PagerResponseDto result = apiInstance.consultCodiOperations(authorization, body, companyId, page, salesPointId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperacionesCoDiApi#consultCodiOperations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **body** | [**CodiOperationsFiltersRequestDTO**](CodiOperationsFiltersRequestDTO.md)| Filtros de busqueda | [optional]
 **companyId** | **String**| Es el identificador de empresa CODI®. | [optional]
 **page** | **String**| Es el número de pago. | [optional]
 **salesPointId** | **String**| Es el identificador del punto de venta. | [optional]
 **size** | **String**| Es el tamaño de página. | [optional]

### Return type

[**PagerResponseDto**](PagerResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

