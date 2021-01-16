# DepositantesApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDepositantsUsingGET**](DepositantesApi.md#getDepositantsUsingGET) | **GET** /subscriptions/{subscription}/depositants | Consulta de cuentas de depositantes
[**registerDepositantsUsingPOST**](DepositantesApi.md#registerDepositantsUsingPOST) | **POST** /subscriptions/{subscription}/depositants | Registra un nuevo depositante

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

Registra un nuevo depositante en el contrato asociado a la suscripción.

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

