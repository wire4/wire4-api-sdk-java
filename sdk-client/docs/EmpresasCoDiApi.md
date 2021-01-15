# EmpresasCoDiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**obtainCompanies**](EmpresasCoDiApi.md#obtainCompanies) | **GET** /codi/companies | Consulta de empresas CODI®
[**registerCompanyUsingPOST**](EmpresasCoDiApi.md#registerCompanyUsingPOST) | **POST** /codi/companies | Registro de empresas CODI®

<a name="obtainCompanies"></a>
# **obtainCompanies**
> List&lt;CompanyRegistered&gt; obtainCompanies(authorization)

Consulta de empresas CODI®

Consulta de empresas CODI® registradas para la aplicación.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.EmpresasCoDiApi;


EmpresasCoDiApi apiInstance = new EmpresasCoDiApi();
String authorization = "authorization_example"; // String | Header para token
try {
    List<CompanyRegistered> result = apiInstance.obtainCompanies(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmpresasCoDiApi#obtainCompanies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |

### Return type

[**List&lt;CompanyRegistered&gt;**](CompanyRegistered.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerCompanyUsingPOST"></a>
# **registerCompanyUsingPOST**
> CompanyRegistered registerCompanyUsingPOST(body, authorization)

Registro de empresas CODI®

Registra una empresa para hacer uso de operaciones CODI®.&lt;br&gt;&lt;br&gt; &lt;b&gt;Nota:&lt;b&gt; Es requerido tener el certificado emitido por BANXICO® asi como el Nombre de la empresa, Nombre comercial y el Registro Federal de Contribuyentes (RFC) de la empresa.&lt;br/&gt;

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.EmpresasCoDiApi;


EmpresasCoDiApi apiInstance = new EmpresasCoDiApi();
CompanyRequested body = new CompanyRequested(); // CompanyRequested | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
try {
    CompanyRegistered result = apiInstance.registerCompanyUsingPOST(body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmpresasCoDiApi#registerCompanyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CompanyRequested**](CompanyRequested.md)| Información de la cuenta del beneficiario |
 **authorization** | **String**| Header para token |

### Return type

[**CompanyRegistered**](CompanyRegistered.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

