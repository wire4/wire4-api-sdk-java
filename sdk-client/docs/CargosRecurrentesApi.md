# CargosRecurrentesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRecurringChargeUsingDELETE**](CargosRecurrentesApi.md#deleteRecurringChargeUsingDELETE) | **DELETE** /recurring-charge/{orderId} | Cancelación/desubscripción de cargos recurrentes
[**registerRecurringChargeUsingPOST**](CargosRecurrentesApi.md#registerRecurringChargeUsingPOST) | **POST** /recurring-charge | Registro de cargos recurrentes

<a name="deleteRecurringChargeUsingDELETE"></a>
# **deleteRecurringChargeUsingDELETE**
> ConfirmRecurringCharge deleteRecurringChargeUsingDELETE(authorization, orderId)

Cancelación/desubscripción de cargos recurrentes

 Se solicita la desuscripción de un cargo recurrente activo. En el request llevará el orderId que identifica el cargo recurrente a eliminar/dar de baja se deshabilitará tanto de openpay como del sistem wire4.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CargosRecurrentesApi;


CargosRecurrentesApi apiInstance = new CargosRecurrentesApi();
String authorization = "authorization_example"; // String | Header para token
String orderId = "orderId_example"; // String | orderId
try {
    ConfirmRecurringCharge result = apiInstance.deleteRecurringChargeUsingDELETE(authorization, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CargosRecurrentesApi#deleteRecurringChargeUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **orderId** | **String**| orderId |

### Return type

[**ConfirmRecurringCharge**](ConfirmRecurringCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerRecurringChargeUsingPOST"></a>
# **registerRecurringChargeUsingPOST**
> ConfirmRecurringCharge registerRecurringChargeUsingPOST(body, authorization)

Registro de cargos recurrentes

 Se registra una solicitud para generar un plan de cargos recurrentes. En la respuesta se proporcionará una dirección URL que lo llevará al sitio donde se le solicitará ingresar los datos de tarjeta a la que se aplicarán los cargos de acuerdo al plan seleccionado.&lt;br&gt; Nota: Debe considerar que para hacer uso de esta funcionalidad debe contar con un scope  especial

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CargosRecurrentesApi;


CargosRecurrentesApi apiInstance = new CargosRecurrentesApi();
RecurringChargeRequest body = new RecurringChargeRequest(); // RecurringChargeRequest | Información de la solicitud para aplicar cargos recurrentes
String authorization = "authorization_example"; // String | Header para token
try {
    ConfirmRecurringCharge result = apiInstance.registerRecurringChargeUsingPOST(body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CargosRecurrentesApi#registerRecurringChargeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecurringChargeRequest**](RecurringChargeRequest.md)| Información de la solicitud para aplicar cargos recurrentes |
 **authorization** | **String**| Header para token |

### Return type

[**ConfirmRecurringCharge**](ConfirmRecurringCharge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

