# FacturasApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingsReportByIdUsingGET**](FacturasApi.md#billingsReportByIdUsingGET) | **GET** /billings/{id} | Consulta de facturas por identificador
[**billingsReportUsingGET**](FacturasApi.md#billingsReportUsingGET) | **GET** /billings | Consulta de facturas

<a name="billingsReportByIdUsingGET"></a>
# **billingsReportByIdUsingGET**
> Billing billingsReportByIdUsingGET(authorization, id)

Consulta de facturas por identificador

Consulta las facturas emitidas por conceptos de uso de la plataforma y operaciones realizadas tanto de entrada como de salida. Se debe especificar el identificador de la factura

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.FacturasApi;


FacturasApi apiInstance = new FacturasApi();
String authorization = "authorization_example"; // String | Header para token
String id = "id_example"; // String | Identificador de la factura
try {
    Billing result = apiInstance.billingsReportByIdUsingGET(authorization, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FacturasApi#billingsReportByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **id** | **String**| Identificador de la factura |

### Return type

[**Billing**](Billing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingsReportUsingGET"></a>
# **billingsReportUsingGET**
> List&lt;Billing&gt; billingsReportUsingGET(authorization, period)

Consulta de facturas

Consulta las facturas emitidas por conceptos de uso de la plataforma y operaciones realizadas tanto de entrada como de salida. Es posible filtrar por periodo de fecha yyyy-MM, por ejemplo 2019-11

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.FacturasApi;


FacturasApi apiInstance = new FacturasApi();
String authorization = "authorization_example"; // String | Header para token
String period = "period_example"; // String | Filtro de fecha yyyy-MM
try {
    List<Billing> result = apiInstance.billingsReportUsingGET(authorization, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FacturasApi#billingsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **period** | **String**| Filtro de fecha yyyy-MM | [optional]

### Return type

[**List&lt;Billing&gt;**](Billing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

