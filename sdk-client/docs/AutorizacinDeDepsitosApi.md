# AutorizacinDeDepsitosApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDepositAuthConfigurations**](AutorizacinDeDepsitosApi.md#getDepositAuthConfigurations) | **GET** /subscriptions/{subscription}/configurations/deposit-authorization | Consulta autorización de depósitos
[**putDepositAuthConfigurations**](AutorizacinDeDepsitosApi.md#putDepositAuthConfigurations) | **PUT** /subscriptions/{subscription}/configurations/deposit-authorization | Des/Habilitar autorización de depósitos

<a name="getDepositAuthConfigurations"></a>
# **getDepositAuthConfigurations**
> DepositsAuthorizationResponse getDepositAuthConfigurations(authorization, subscription)

Consulta autorización de depósitos

Obtiene la información de la autorización de depósitos del contrato relacionado a la subscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.AutorizacinDeDepsitosApi;


AutorizacinDeDepsitosApi apiInstance = new AutorizacinDeDepsitosApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    DepositsAuthorizationResponse result = apiInstance.getDepositAuthConfigurations(authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutorizacinDeDepsitosApi#getDepositAuthConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**DepositsAuthorizationResponse**](DepositsAuthorizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putDepositAuthConfigurations"></a>
# **putDepositAuthConfigurations**
> DepositsAuthorizationResponse putDepositAuthConfigurations(body, authorization, subscription)

Des/Habilitar autorización de depósitos

Des/Habilitar autorización de depósitos, devuelve la información final de la autorización de depósitos del contrato relacionado a la subscripción al terminar.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.AutorizacinDeDepsitosApi;


AutorizacinDeDepsitosApi apiInstance = new AutorizacinDeDepsitosApi();
DepositAuthorizationRequest body = new DepositAuthorizationRequest(); // DepositAuthorizationRequest | Deposit Authorization info
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    DepositsAuthorizationResponse result = apiInstance.putDepositAuthConfigurations(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutorizacinDeDepsitosApi#putDepositAuthConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepositAuthorizationRequest**](DepositAuthorizationRequest.md)| Deposit Authorization info |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**DepositsAuthorizationResponse**](DepositsAuthorizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

