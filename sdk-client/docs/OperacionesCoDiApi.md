# OperacionesCoDiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consultCodiOperations**](OperacionesCoDiApi.md#consultCodiOperations) | **POST** /codi/charges | Obtiene las operaciones generadas a partir de peticiones de pago CoDi® de forma paginada, pudiendo aplicar filtros

<a name="consultCodiOperations"></a>
# **consultCodiOperations**
> PagerResponseDto consultCodiOperations(authorization, body, companyId, page, salesPointId, size)

Obtiene las operaciones generadas a partir de peticiones de pago CoDi® de forma paginada, pudiendo aplicar filtros

Obtiene las operaciones generadas a partir de peticiones de pago CoDi® de forma paginada, pudiendo aplicar filtros

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.OperacionesCoDiApi;


OperacionesCoDiApi apiInstance = new OperacionesCoDiApi();
String authorization = "authorization_example"; // String | Header para token
CodiOperationsFiltersRequestDTO body = new CodiOperationsFiltersRequestDTO(); // CodiOperationsFiltersRequestDTO | Filtros de busqueda
String companyId = "companyId_example"; // String | Identificador de empresa CoDi
String page = "page_example"; // String | Número de pago
String salesPointId = "salesPointId_example"; // String | Identificador del punto de venta
String size = "size_example"; // String | Tamaño de pagina
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
 **companyId** | **String**| Identificador de empresa CoDi | [optional]
 **page** | **String**| Número de pago | [optional]
 **salesPointId** | **String**| Identificador del punto de venta | [optional]
 **size** | **String**| Tamaño de pagina | [optional]

### Return type

[**PagerResponseDto**](PagerResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

