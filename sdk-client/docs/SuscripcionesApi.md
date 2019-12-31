# SuscripcionesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preEnrollmentMonexUserUsingPOST**](SuscripcionesApi.md#preEnrollmentMonexUserUsingPOST) | **POST** /subscriptions/pre-subscription | registra una pre-suscripción
[**removeEnrollmentUserUsingDELETE**](SuscripcionesApi.md#removeEnrollmentUserUsingDELETE) | **DELETE** /subscriptions/{subscription} | Elimna una suscripción por id
[**removeSubscriptionPendingStatusUsingDELETE**](SuscripcionesApi.md#removeSubscriptionPendingStatusUsingDELETE) | **DELETE** /subscriptions/pre-subscription/{subscription} | Elimna una pre-suscripción

<a name="preEnrollmentMonexUserUsingPOST"></a>
# **preEnrollmentMonexUserUsingPOST**
> PreEnrollmentResponse preEnrollmentMonexUserUsingPOST(body)

registra una pre-suscripción

Pre-registra una suscripción para operar un contrato a través de un aplicación socio de la plataforma, proporcionando una URL donde el cliente Monex debe autorizar el acceso a los datos de su cuenta a el socio.&lt;br/&gt;Una vez que el cuentahabiente autorice el acceso, se envia un webhook con el evento ENROLLMENT.CREATED, el cual contiene los datos de acceso.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.SuscripcionesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

SuscripcionesApi apiInstance = new SuscripcionesApi();
PreEnrollmentData body = new PreEnrollmentData(); // PreEnrollmentData | Información para el enrolamiento
try {
    PreEnrollmentResponse result = apiInstance.preEnrollmentMonexUserUsingPOST(body);
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

### Return type

[**PreEnrollmentResponse**](PreEnrollmentResponse.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeEnrollmentUserUsingDELETE"></a>
# **removeEnrollmentUserUsingDELETE**
> removeEnrollmentUserUsingDELETE(subscription)

Elimna una suscripción por id

Elimina una suscripción, una ves eliminada la suscripcion ya no se podran realizar operacions en el API uilizando esta suscripción

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.SuscripcionesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

SuscripcionesApi apiInstance = new SuscripcionesApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.removeEnrollmentUserUsingDELETE(subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#removeEnrollmentUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeSubscriptionPendingStatusUsingDELETE"></a>
# **removeSubscriptionPendingStatusUsingDELETE**
> removeSubscriptionPendingStatusUsingDELETE(subscription)

Elimna una pre-suscripción

Se elimina una pre-suscripción, sólo se elimina en caso de que cliente monex no haya concedio su autorización de acceso, es decir que la pre-suscripcion este pendiente.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.SuscripcionesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

SuscripcionesApi apiInstance = new SuscripcionesApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.removeSubscriptionPendingStatusUsingDELETE(subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling SuscripcionesApi#removeSubscriptionPendingStatusUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

