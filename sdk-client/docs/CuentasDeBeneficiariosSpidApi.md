# CuentasDeBeneficiariosSpidApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preRegisterAccountsUsingPOST1**](CuentasDeBeneficiariosSpidApi.md#preRegisterAccountsUsingPOST1) | **POST** /subscriptions/{subscription}/beneficiaries/spid | Pre-registro de cuentas de beneficiarios SPID

<a name="preRegisterAccountsUsingPOST1"></a>
# **preRegisterAccountsUsingPOST1**
> TokenRequiredResponse preRegisterAccountsUsingPOST1(body, authorization, subscription)

Pre-registro de cuentas de beneficiarios SPID

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpidApi;


CuentasDeBeneficiariosSpidApi apiInstance = new CuentasDeBeneficiariosSpidApi();
AccountSpid body = new AccountSpid(); // AccountSpid | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    TokenRequiredResponse result = apiInstance.preRegisterAccountsUsingPOST1(body, authorization, subscription);
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
 **authorization** | **String**| Header para token |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

