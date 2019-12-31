# DepositantesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDepositantsUsingGET**](DepositantesApi.md#getDepositantsUsingGET) | **GET** /subscriptions/{subscription}/depositants | Consulta de cuentas de depositantes
[**registerDepositantsUsingPOST**](DepositantesApi.md#registerDepositantsUsingPOST) | **POST** /subscriptions/{subscription}/depositants | Registra un nuevo depositante

<a name="getDepositantsUsingGET"></a>
# **getDepositantsUsingGET**
> GetDepositants getDepositantsUsingGET(subscription)

Consulta de cuentas de depositantes

Obtiene una lista de depositantes asociados al contrato relacionado a la subscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.DepositantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

DepositantesApi apiInstance = new DepositantesApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    GetDepositants result = apiInstance.getDepositantsUsingGET(subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositantesApi#getDepositantsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**GetDepositants**](GetDepositants.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerDepositantsUsingPOST"></a>
# **registerDepositantsUsingPOST**
> DepositantsResponse registerDepositantsUsingPOST(body, subscription)

Registra un nuevo depositante

Registra un nuevo depositante en el contrato asociado a la subscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.DepositantesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

DepositantesApi apiInstance = new DepositantesApi();
DepositantsRegister body = new DepositantsRegister(); // DepositantsRegister | Depositant info
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    DepositantsResponse result = apiInstance.registerDepositantsUsingPOST(body, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositantesApi#registerDepositantsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepositantsRegister**](DepositantsRegister.md)| Depositant info |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**DepositantsResponse**](DepositantsResponse.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

