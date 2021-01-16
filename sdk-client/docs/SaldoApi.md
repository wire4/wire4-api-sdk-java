# SaldoApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalanceUsingGET**](SaldoApi.md#getBalanceUsingGET) | **GET** /subscriptions/{subscription}/balance | Consulta los saldo de una cuenta

<a name="getBalanceUsingGET"></a>
# **getBalanceUsingGET**
> BalanceListResponse getBalanceUsingGET(authorization, subscription)

Consulta los saldo de una cuenta

Obtiene el saldo de un contrato, según las divisas que se manejen en dicho contrato, ya sea peso mexicano (MXP) o dólar estadounidense (USD).

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SaldoApi;


SaldoApi apiInstance = new SaldoApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    BalanceListResponse result = apiInstance.getBalanceUsingGET(authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaldoApi#getBalanceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**BalanceListResponse**](BalanceListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

