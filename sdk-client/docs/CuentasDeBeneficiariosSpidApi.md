# CuentasDeBeneficiariosSpidApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preRegisterAccountsUsingPOST1**](CuentasDeBeneficiariosSpidApi.md#preRegisterAccountsUsingPOST1) | **POST** /subscriptions/{subscription}/beneficiaries/spid | Pre-registro de cuentas de beneficiarios SPID

<a name="preRegisterAccountsUsingPOST1"></a>
# **preRegisterAccountsUsingPOST1**
> TokenRequiredResponse preRegisterAccountsUsingPOST1(body, subscription)

Pre-registro de cuentas de beneficiarios SPID

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpidApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spid
OAuth wire4_aut_app_user_spid = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spid");
wire4_aut_app_user_spid.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpidApi apiInstance = new CuentasDeBeneficiariosSpidApi();
AccountSpid body = new AccountSpid(); // AccountSpid | Información de la cuenta del beneficiario
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    TokenRequiredResponse result = apiInstance.preRegisterAccountsUsingPOST1(body, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpidApi#preRegisterAccountsUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountSpid**](AccountSpid.md)| Información de la cuenta del beneficiario |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

[wire4_aut_app_user_spid](../README.md#wire4_aut_app_user_spid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

