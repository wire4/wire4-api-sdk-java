# SuscripcionesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preEnrollmentMonexUserUsingPOST**](SuscripcionesApi.md#preEnrollmentMonexUserUsingPOST) | **POST** /subscriptions/pre-subscription | Registra una pre-suscripción
[**removeEnrollmentUserUsingDELETE**](SuscripcionesApi.md#removeEnrollmentUserUsingDELETE) | **DELETE** /subscriptions/{subscription} | Elimina una suscripción por el identificador de la suscripción
[**removeSubscriptionPendingStatusUsingDELETE**](SuscripcionesApi.md#removeSubscriptionPendingStatusUsingDELETE) | **DELETE** /subscriptions/pre-subscription/{subscription} | Elimina una pre-suscripción

<a name="preEnrollmentMonexUserUsingPOST"></a>
# **preEnrollmentMonexUserUsingPOST**
> PreEnrollmentResponse preEnrollmentMonexUserUsingPOST(body, authorization)

Registra una pre-suscripción

Registra una pre-suscripción para operar un contrato a través de un aplicación socio de la plataforma, proporcionando una URL donde el cliente Monex debe autorizar el acceso a los datos de su cuenta a el socio.&lt;br/&gt;Una vez que el cuentahabiente autorice el acceso, se envía un mensaje webhook con el evento &#x27;ENROLLMENT.CREATED&#x27;, el cuál contiene los datos de acceso a esta API.

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

Elimina una suscripción por el identificador de la suscripción

Elimina una suscripción, una vez eliminada ya no se podrán realizar operacions en el API utilizando esta suscripción

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **subscription** | **String**| El identificador de la suscripción a esta API |

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

Elimina una pre-suscripción

Se elimina una pre-suscripción, sólo se elimina en caso de que el cliente Monex no haya concedido su autorización de acceso (token), es decir que la pre-suscripcion este pendiente.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

