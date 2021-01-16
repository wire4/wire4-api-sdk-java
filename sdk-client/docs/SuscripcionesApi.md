# SuscripcionesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeSubscriptionStatusUsingPUT**](SuscripcionesApi.md#changeSubscriptionStatusUsingPUT) | **PUT** /subscriptions/{subscription}/status | Cambia el estatus de la suscripción
[**changeSubscriptionUseUsingPATCH**](SuscripcionesApi.md#changeSubscriptionUseUsingPATCH) | **PATCH** /subscriptions/{subscription} | Cambia el uso de la suscripción
[**preEnrollmentMonexUserUsingPOST**](SuscripcionesApi.md#preEnrollmentMonexUserUsingPOST) | **POST** /subscriptions/pre-subscription | Pre-registro de una suscripción
[**removeEnrollmentUserUsingDELETE**](SuscripcionesApi.md#removeEnrollmentUserUsingDELETE) | **DELETE** /subscriptions/{subscription} | Elimina suscripción por su identificador.
[**removeSubscriptionPendingStatusUsingDELETE**](SuscripcionesApi.md#removeSubscriptionPendingStatusUsingDELETE) | **DELETE** /subscriptions/pre-subscription/{subscription} | Elimina pre-registro de suscripción

<a name="changeSubscriptionStatusUsingPUT"></a>
# **changeSubscriptionStatusUsingPUT**
> changeSubscriptionStatusUsingPUT(body, authorization, subscription)

Cambia el estatus de la suscripción

Se cambia el estado o estatus de la suscripción a los posibles valores que son: ACTIVE o INACTIVE

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
SubscriptionChangeStatusRequest body = new SubscriptionChangeStatusRequest(); // SubscriptionChangeStatusRequest | request
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | subscription
try {
    apiInstance.changeSubscriptionStatusUsingPUT(body, authorization, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#changeSubscriptionStatusUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionChangeStatusRequest**](SubscriptionChangeStatusRequest.md)| request |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| subscription |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="changeSubscriptionUseUsingPATCH"></a>
# **changeSubscriptionUseUsingPATCH**
> ServiceBanking changeSubscriptionUseUsingPATCH(body, authorization, subscription)

Cambia el uso de la suscripción

Se asigna o cambia el uso y el estatus que se le dará a la subscripción para los servicios SPEI y SPID en el manejo de Cobros y Pagos El status puede tener los posibles valores: ACTIVE o INACTIVE. El uso puede tener los posibles valores: WITHDRAWAL_DEPOSIT o WITHDRAWAL o DEPOSIT

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
ServiceBanking body = new ServiceBanking(); // ServiceBanking | request
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | subscription
try {
    ServiceBanking result = apiInstance.changeSubscriptionUseUsingPATCH(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#changeSubscriptionUseUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceBanking**](ServiceBanking.md)| request |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| subscription |

### Return type

[**ServiceBanking**](ServiceBanking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="preEnrollmentMonexUserUsingPOST"></a>
# **preEnrollmentMonexUserUsingPOST**
> PreEnrollmentResponse preEnrollmentMonexUserUsingPOST(body, authorization)

Pre-registro de una suscripción

Pre-registra una suscripción para operar un contrato a través de un aplicación socio de la plataforma. Se retorna una dirección URL hacia el centro de autorización donde el cliente  Monex debe autorizar el acceso a los datos de su cuenta a el socio.&lt;br/&gt;&lt;br/&gt;Una vez que el cuentahabiente autorice el acceso, se envía una notificación (webhook configurado) con el evento &#x27;ENROLLMENT.CREATED&#x27;, el cuál contiene los datos de acceso a esta API.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
PreEnrollmentData body = new PreEnrollmentData(); // PreEnrollmentData | Información para la pre-suscripción
String authorization = "authorization_example"; // String | Header para token
try {
    PreEnrollmentResponse result = apiInstance.preEnrollmentMonexUserUsingPOST(body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#preEnrollmentMonexUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreEnrollmentData**](PreEnrollmentData.md)| Información para la pre-suscripción |
 **authorization** | **String**| Header para token |

### Return type

[**PreEnrollmentResponse**](PreEnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeEnrollmentUserUsingDELETE"></a>
# **removeEnrollmentUserUsingDELETE**
> removeEnrollmentUserUsingDELETE(authorization, subscription)

Elimina suscripción por su identificador.

Elimina una suscripción mediante su identificador. Una vez eliminada dicha suscripción, ya no se podrán realizar operaciones en el API utilizando sus credenciales

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a ésta API
try {
    apiInstance.removeEnrollmentUserUsingDELETE(authorization, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#removeEnrollmentUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| El identificador de la suscripción a ésta API |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeSubscriptionPendingStatusUsingDELETE"></a>
# **removeSubscriptionPendingStatusUsingDELETE**
> removeSubscriptionPendingStatusUsingDELETE(authorization, subscription)

Elimina pre-registro de suscripción

Se elimina el pre-registro de suscripción. Sólo se elimina en caso de que el cliente Monex no haya concedido su autorización de acceso (token), es decir que la suscripcion esté pendiente.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    apiInstance.removeSubscriptionPendingStatusUsingDELETE(authorization, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#removeSubscriptionPendingStatusUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

