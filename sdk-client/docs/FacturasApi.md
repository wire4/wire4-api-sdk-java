# FacturasApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingsReportByIdUsingGET**](FacturasApi.md#billingsReportByIdUsingGET) | **GET** /billings/{id} | Consulta de facturas por identificador
[**billingsReportUsingGET**](FacturasApi.md#billingsReportUsingGET) | **GET** /billings | Consulta de facturas

<a name="billingsReportByIdUsingGET"></a>
# **billingsReportByIdUsingGET**
> Billing billingsReportByIdUsingGET(id)

Consulta de facturas por identificador

Consulta las facturas emitidas por conceptos de uso de la plataforma y operaciones realizadas tanto de entrada como de salida. Se debe especificar el identificador de la factura

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.FacturasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

FacturasApi apiInstance = new FacturasApi();
String id = "id_example"; // String | Identificador de la factura
try {
    Billing result = apiInstance.billingsReportByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FacturasApi#billingsReportByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador de la factura |

### Return type

[**Billing**](Billing.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingsReportUsingGET"></a>
# **billingsReportUsingGET**
> List&lt;Billing&gt; billingsReportUsingGET(period)

Consulta de facturas

Consulta las facturas emitidas por conceptos de uso de la plataforma y operaciones realizadas tanto de entrada como de salida. Es posible filtrar por periodo de fecha yyyy-MM, por ejemplo 2019-11

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.FacturasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

FacturasApi apiInstance = new FacturasApi();
String period = "period_example"; // String | Filtro de fecha yyyy-MM
try {
    List<Billing> result = apiInstance.billingsReportUsingGET(period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FacturasApi#billingsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **period** | **String**| Filtro de fecha yyyy-MM | [optional]

### Return type

[**List&lt;Billing&gt;**](Billing.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

