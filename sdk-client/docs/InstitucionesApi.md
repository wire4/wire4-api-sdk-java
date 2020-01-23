# InstitucionesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllInstitutionsUsingGET**](InstitucionesApi.md#getAllInstitutionsUsingGET) | **GET** /institutions | Información de instituciones bancarias.

<a name="getAllInstitutionsUsingGET"></a>
# **getAllInstitutionsUsingGET**
> InstitutionsList getAllInstitutionsUsingGET(authorization)

Información de instituciones bancarias.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.InstitucionesApi;


InstitucionesApi apiInstance = new InstitucionesApi();
String authorization = "authorization_example"; // String | Header para token
try {
    InstitutionsList result = apiInstance.getAllInstitutionsUsingGET(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitucionesApi#getAllInstitutionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |

### Return type

[**InstitutionsList**](InstitutionsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

