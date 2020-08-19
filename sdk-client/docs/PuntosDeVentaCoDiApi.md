# PuntosDeVentaCoDiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSalesPoint**](PuntosDeVentaCoDiApi.md#createSalesPoint) | **POST** /codi/companies/{company_id}/salespoint | Registra un punto de venta asociado a una empresa
[**obtainSalePoints**](PuntosDeVentaCoDiApi.md#obtainSalePoints) | **GET** /codi/companies/{company_id}/salespoint | Obtiene los puntos de venta asociados a una empresa

<a name="createSalesPoint"></a>
# **createSalesPoint**
> SalesPointRespose createSalesPoint(body, authorization, companyId, name)

Registra un punto de venta asociado a una empresa

Registra un punto de venta desde donde se emitaran los cobros CODI®, el punto de venta se debe asociar a un cuenta cableregistrada previamente ante Banxico para realizar cobros con CODI®

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.PuntosDeVentaCoDiApi;


PuntosDeVentaCoDiApi apiInstance = new PuntosDeVentaCoDiApi();
SalesPointRequest body = new SalesPointRequest(); // SalesPointRequest | salesPointRequest
String authorization = "authorization_example"; // String | Header para token
String companyId = "companyId_example"; // String | company_id
String name = "name_example"; // String | 
try {
    SalesPointRespose result = apiInstance.createSalesPoint(body, authorization, companyId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PuntosDeVentaCoDiApi#createSalesPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SalesPointRequest**](SalesPointRequest.md)| salesPointRequest |
 **authorization** | **String**| Header para token |
 **companyId** | **String**| company_id |
 **name** | **String**|  | [optional]

### Return type

[**SalesPointRespose**](SalesPointRespose.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obtainSalePoints"></a>
# **obtainSalePoints**
> List&lt;SalesPointFound&gt; obtainSalePoints(authorization, companyId)

Obtiene los puntos de venta asociados a una empresa

Obtiene los puntos de venta asociados a una empresa en las cuales se hacen operaciones CODI®

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.PuntosDeVentaCoDiApi;


PuntosDeVentaCoDiApi apiInstance = new PuntosDeVentaCoDiApi();
String authorization = "authorization_example"; // String | Header para token
String companyId = "companyId_example"; // String | El identificador de la empresa
try {
    List<SalesPointFound> result = apiInstance.obtainSalePoints(authorization, companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PuntosDeVentaCoDiApi#obtainSalePoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **companyId** | **String**| El identificador de la empresa |

### Return type

[**List&lt;SalesPointFound&gt;**](SalesPointFound.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

