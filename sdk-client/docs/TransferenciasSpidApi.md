# TransferenciasSpidApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSpidClassificationsUsingGET**](TransferenciasSpidApi.md#getSpidClassificationsUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/spid/classifications | Consulta las clasificaciones para operaciones con SPID
[**registerOutgoingSpidTransactionUsingPOST**](TransferenciasSpidApi.md#registerOutgoingSpidTransactionUsingPOST) | **POST** /subscriptions/{subscription}/transactions/outcoming/spid | Registro de transferencias SPID

<a name="getSpidClassificationsUsingGET"></a>
# **getSpidClassificationsUsingGET**
> SpidClassificationsResponseDTO getSpidClassificationsUsingGET(authorization, subscription)

Consulta las clasificaciones para operaciones con SPID

Obtiene las clasificaciones para operaciones con dólares (SPID) de Monex.&lt;br/&gt;Este recurso se debe invocar previo al realizar una operación SPID.&lt;br/&gt;Se requiere que el token de autenticación se genere con scope spid_admin.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpidApi;


TransferenciasSpidApi apiInstance = new TransferenciasSpidApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    SpidClassificationsResponseDTO result = apiInstance.getSpidClassificationsUsingGET(authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpidApi#getSpidClassificationsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**SpidClassificationsResponseDTO**](SpidClassificationsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerOutgoingSpidTransactionUsingPOST"></a>
# **registerOutgoingSpidTransactionUsingPOST**
> TokenRequiredResponse registerOutgoingSpidTransactionUsingPOST(body, authorization, subscription)

Registro de transferencias SPID

Registra un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción, las transferencias deben ser confirmadas por el cliente para que se efectuen.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpidApi;


TransferenciasSpidApi apiInstance = new TransferenciasSpidApi();
TransactionOutgoingSpid body = new TransactionOutgoingSpid(); // TransactionOutgoingSpid | Información de las transferencias SPID de salida
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    TokenRequiredResponse result = apiInstance.registerOutgoingSpidTransactionUsingPOST(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpidApi#registerOutgoingSpidTransactionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionOutgoingSpid**](TransactionOutgoingSpid.md)| Información de las transferencias SPID de salida |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

