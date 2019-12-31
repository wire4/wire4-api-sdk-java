# InstitucionesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllInstitutionsUsingGET**](InstitucionesApi.md#getAllInstitutionsUsingGET) | **GET** /institutions | Información de instituciones bancarias.

<a name="getAllInstitutionsUsingGET"></a>
# **getAllInstitutionsUsingGET**
> InstitutionsList getAllInstitutionsUsingGET()

Información de instituciones bancarias.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.InstitucionesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

InstitucionesApi apiInstance = new InstitucionesApi();
try {
    InstitutionsList result = apiInstance.getAllInstitutionsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitucionesApi#getAllInstitutionsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstitutionsList**](InstitutionsList.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

