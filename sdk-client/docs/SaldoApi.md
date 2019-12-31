# SaldoApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalanceUsingGET**](SaldoApi.md#getBalanceUsingGET) | **GET** /subscriptions/{subscription}/balance | Consulta los saldo de una cuenta

<a name="getBalanceUsingGET"></a>
# **getBalanceUsingGET**
> BalanceListResponse getBalanceUsingGET(subscription)

Consulta los saldo de una cuenta

Obtiene el de las divisas que se manejen en el contrato.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.SaldoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

SaldoApi apiInstance = new SaldoApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    BalanceListResponse result = apiInstance.getBalanceUsingGET(subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaldoApi#getBalanceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**BalanceListResponse**](BalanceListResponse.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

