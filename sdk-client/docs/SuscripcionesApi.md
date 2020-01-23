# SuscripcionesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preEnrollmentMonexUserUsingPOST**](SuscripcionesApi.md#preEnrollmentMonexUserUsingPOST) | **POST** /subscriptions/pre-subscription | registra una pre-suscripción
[**removeEnrollmentUserUsingDELETE**](SuscripcionesApi.md#removeEnrollmentUserUsingDELETE) | **DELETE** /subscriptions/{subscription} | Elimna una suscripción por id
[**removeSubscriptionPendingStatusUsingDELETE**](SuscripcionesApi.md#removeSubscriptionPendingStatusUsingDELETE) | **DELETE** /subscriptions/pre-subscription/{subscription} | Elimna una pre-suscripción

<a name="preEnrollmentMonexUserUsingPOST"></a>
# **preEnrollmentMonexUserUsingPOST**
> PreEnrollmentResponse preEnrollmentMonexUserUsingPOST(body, authorization)

registra una pre-suscripción

Pre-registra una suscripción para operar un contrato a través de un aplicación socio de la plataforma, proporcionando una URL donde el cliente Monex debe autorizar el acceso a los datos de su cuenta a el socio.&lt;br/&gt;Una vez que el cuentahabiente autorice el acceso, se envia un webhook con el evento ENROLLMENT.CREATED, el cual contiene los datos de acceso.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.SuscripcionesApi;


SuscripcionesApi apiInstance = new SuscripcionesApi();
PreEnrollmentData body = new PreEnrollmentData(); // PreEnrollmentData | Información para el enrolamiento
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
 **body** | [**PreEnrollmentData**](PreEnrollmentData.md)| Información para el enrolamiento |
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

Elimna una suscripción por id

Elimina una suscripción, una ves eliminada la suscripcion ya no se podran realizar operacions en el API uilizando esta suscripción

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

Elimna una pre-suscripción

Se elimina una pre-suscripción, sólo se elimina en caso de que cliente monex no haya concedio su autorización de acceso, es decir que la pre-suscripcion este pendiente.

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

