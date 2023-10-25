# DepositantesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDepositantsTotalsUsingGET**](DepositantesApi.md#getDepositantsTotalsUsingGET) | **GET** /subscriptions/{subscription}/depositants/count | Número de depositantes por suscripción
[**getDepositantsUsingGET**](DepositantesApi.md#getDepositantsUsingGET) | **GET** /subscriptions/{subscription}/depositants | Consulta de cuentas de depositantes
[**registerDepositantsUsingPOST**](DepositantesApi.md#registerDepositantsUsingPOST) | **POST** /subscriptions/{subscription}/depositants | Registra un nuevo depositante
[**updateStatusDepositantsNoSuscrptionUsingPATCH**](DepositantesApi.md#updateStatusDepositantsNoSuscrptionUsingPATCH) | **PATCH** /depositants/{account}/{action} | Solicitud para actualizar el estado de un depositante sin utilizar la suscripción
[**updateStatusDepositantsUsingPATCH**](DepositantesApi.md#updateStatusDepositantsUsingPATCH) | **PATCH** /subscriptions/{subscription}/depositants/{account}/{action} | Solicitud para actualizar el estado de un depossitante

<a name="getDepositantsTotalsUsingGET"></a>
# **getDepositantsTotalsUsingGET**
> DepositantCountResponse getDepositantsTotalsUsingGET(authorization, subscription)

Número de depositantes por suscripción

Obtiene la cantidad el total de depositantes asociados al contrato relacionado a la suscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.DepositantesApi;


DepositantesApi apiInstance = new DepositantesApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    DepositantCountResponse result = apiInstance.getDepositantsTotalsUsingGET(authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositantesApi#getDepositantsTotalsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**DepositantCountResponse**](DepositantCountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDepositantsUsingGET"></a>
# **getDepositantsUsingGET**
> GetDepositants getDepositantsUsingGET(authorization, subscription)

Consulta de cuentas de depositantes

Obtiene una lista de depositantes asociados al contrato relacionado a la suscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.DepositantesApi;


DepositantesApi apiInstance = new DepositantesApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    GetDepositants result = apiInstance.getDepositantsUsingGET(authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositantesApi#getDepositantsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**GetDepositants**](GetDepositants.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerDepositantsUsingPOST"></a>
# **registerDepositantsUsingPOST**
> DepositantsResponse registerDepositantsUsingPOST(body, authorization, subscription)

Registra un nuevo depositante

Registra un nuevo depositante en el contrato asociado a la suscripción. Si intenta registrar un depositante que previamente se había registrado, se devolverá la cuenta clabe asociada al Álias que está intentando registrar. Queda bajo responsabilidad del cliente verificar que los álias sean únicos en sus sistemas.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.DepositantesApi;


DepositantesApi apiInstance = new DepositantesApi();
DepositantsRegister body = new DepositantsRegister(); // DepositantsRegister | Depositant info
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    DepositantsResponse result = apiInstance.registerDepositantsUsingPOST(body, authorization, subscription);
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
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**DepositantsResponse**](DepositantsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStatusDepositantsNoSuscrptionUsingPATCH"></a>
# **updateStatusDepositantsNoSuscrptionUsingPATCH**
> Depositant updateStatusDepositantsNoSuscrptionUsingPATCH(authorization, account, action, body)

Solicitud para actualizar el estado de un depositante sin utilizar la suscripción

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.DepositantesApi;


DepositantesApi apiInstance = new DepositantesApi();
String authorization = "authorization_example"; // String | Header para token
String account = "account_example"; // String | Es la cuenta que va a ser actualizada.
String action = "action_example"; // String | Es la cuenta que va a ser actualizada.
String body = "body_example"; // String | Empty value
try {
    Depositant result = apiInstance.updateStatusDepositantsNoSuscrptionUsingPATCH(authorization, account, action, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositantesApi#updateStatusDepositantsNoSuscrptionUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **account** | **String**| Es la cuenta que va a ser actualizada. |
 **action** | **String**| Es la cuenta que va a ser actualizada. |
 **body** | [**String**](String.md)| Empty value | [optional]

### Return type

[**Depositant**](Depositant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStatusDepositantsUsingPATCH"></a>
# **updateStatusDepositantsUsingPATCH**
> Depositant updateStatusDepositantsUsingPATCH(authorization, account, action, body)

Solicitud para actualizar el estado de un depossitante

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.DepositantesApi;


DepositantesApi apiInstance = new DepositantesApi();
String authorization = "authorization_example"; // String | Header para token
String account = "account_example"; // String | Es la cuenta que va a ser actualizada.
String action = "action_example"; // String | Es la cuenta que va a ser actualizada.
String body = "body_example"; // String | Empty value
try {
    Depositant result = apiInstance.updateStatusDepositantsUsingPATCH(authorization, account, action, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositantesApi#updateStatusDepositantsUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **account** | **String**| Es la cuenta que va a ser actualizada. |
 **action** | **String**| Es la cuenta que va a ser actualizada. |
 **body** | [**String**](String.md)| Empty value | [optional]

### Return type

[**Depositant**](Depositant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

