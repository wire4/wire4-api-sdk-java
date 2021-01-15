# AutorizacinDeDepsitosApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDepositAuthConfigurations**](AutorizacinDeDepsitosApi.md#getDepositAuthConfigurations) | **GET** /subscriptions/{subscription}/configurations/deposit-authorization | Consulta autorización de depósitos
[**putDepositAuthConfigurations**](AutorizacinDeDepsitosApi.md#putDepositAuthConfigurations) | **PUT** /subscriptions/{subscription}/configurations/deposit-authorization | Habilita / Deshabilita la autorización de depósitos

<a name="getDepositAuthConfigurations"></a>
# **getDepositAuthConfigurations**
> DepositsAuthorizationResponse getDepositAuthConfigurations(authorization, subscription)

Consulta autorización de depósitos

Obtiene la información de la autorización de depósitos del contrato relacionado a la suscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.AutorizacinDeDepsitosApi;


AutorizacinDeDepsitosApi apiInstance = new AutorizacinDeDepsitosApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
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
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

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

Habilita / Deshabilita la autorización de depósitos

Habilita o deshabilita la autorización de depósitos. Devuelve la información final de la autorización de depósitos del contrato relacionado a la suscripción al terminar.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.AutorizacinDeDepsitosApi;


AutorizacinDeDepsitosApi apiInstance = new AutorizacinDeDepsitosApi();
DepositAuthorizationRequest body = new DepositAuthorizationRequest(); // DepositAuthorizationRequest | Información para habilitar / deshabilitar la autorización de depósito
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
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
 **body** | [**DepositAuthorizationRequest**](DepositAuthorizationRequest.md)| Información para habilitar / deshabilitar la autorización de depósito |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**DepositsAuthorizationResponse**](DepositsAuthorizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

