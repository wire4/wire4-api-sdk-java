# LmitesDeMontosApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**obtainConfigurationsLimits**](LmitesDeMontosApi.md#obtainConfigurationsLimits) | **GET** /subscriptions/{suscription}/configurations | Consulta de configuraciones
[**updateConfigurations**](LmitesDeMontosApi.md#updateConfigurations) | **PUT** /subscriptions/{suscription}/configurations | Actualiza configuraciones por suscripción

<a name="obtainConfigurationsLimits"></a>
# **obtainConfigurationsLimits**
> MessageConfigurationsLimits obtainConfigurationsLimits(authorization, suscription)

Consulta de configuraciones

Consulta las configuraciones para el contrato asocaido al enrolamiento en la aplicación.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.LmitesDeMontosApi;


LmitesDeMontosApi apiInstance = new LmitesDeMontosApi();
String authorization = "authorization_example"; // String | Header para token
String suscription = "suscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    MessageConfigurationsLimits result = apiInstance.obtainConfigurationsLimits(authorization, suscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LmitesDeMontosApi#obtainConfigurationsLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **suscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**MessageConfigurationsLimits**](MessageConfigurationsLimits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConfigurations"></a>
# **updateConfigurations**
> updateConfigurations(body, authorization, suscription)

Actualiza configuraciones por suscripción

Actualiza las configuraciones de un contrato asociado a una suscripción

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.LmitesDeMontosApi;


LmitesDeMontosApi apiInstance = new LmitesDeMontosApi();
UpdateConfigurationsRequestDTO body = new UpdateConfigurationsRequestDTO(); // UpdateConfigurationsRequestDTO | updateConfigurationsResquestDTO
String authorization = "authorization_example"; // String | Header para token
String suscription = "suscription_example"; // String | suscription
try {
    apiInstance.updateConfigurations(body, authorization, suscription);
} catch (ApiException e) {
    System.err.println("Exception when calling LmitesDeMontosApi#updateConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateConfigurationsRequestDTO**](UpdateConfigurationsRequestDTO.md)| updateConfigurationsResquestDTO |
 **authorization** | **String**| Header para token |
 **suscription** | **String**| suscription |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

