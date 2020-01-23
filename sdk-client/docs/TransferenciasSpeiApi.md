# TransferenciasSpeiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dropTransactionsPendingUsingDELETE**](TransferenciasSpeiApi.md#dropTransactionsPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/transactions/outcoming/spei/request/{requestId} | Eliminación de transferencias SPEI® pendientes
[**incomingSpeiTransactionsReportUsingGET**](TransferenciasSpeiApi.md#incomingSpeiTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/incoming/spei | Consulta de transferencias recibidas
[**outCommingSpeiRequestIdTransactionsReportUsingGET**](TransferenciasSpeiApi.md#outCommingSpeiRequestIdTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/spei/{requestId} | Consulta de transferencias de salida por identificador de petición
[**outgoingSpeiTransactionsReportUsingGET**](TransferenciasSpeiApi.md#outgoingSpeiTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/spei | Consulta de transferencias realizadas
[**registerOutgoingSpeiTransactionUsingPOST**](TransferenciasSpeiApi.md#registerOutgoingSpeiTransactionUsingPOST) | **POST** /subscriptions/{subscription}/transactions/outcoming/spei | Registro de transferencias

<a name="dropTransactionsPendingUsingDELETE"></a>
# **dropTransactionsPendingUsingDELETE**
> dropTransactionsPendingUsingDELETE(requestId, subscription)

Eliminación de transferencias SPEI® pendientes

Elimina un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción, las transferencias no deben haber sido confirmadas por el cliente.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.TransferenciasSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String requestId = "requestId_example"; // String | Identificador de las transferencias a eliminar
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.dropTransactionsPendingUsingDELETE(requestId, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#dropTransactionsPendingUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Identificador de las transferencias a eliminar |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="incomingSpeiTransactionsReportUsingGET"></a>
# **incomingSpeiTransactionsReportUsingGET**
> List&lt;Deposit&gt; incomingSpeiTransactionsReportUsingGET(subscription)

Consulta de transferencias recibidas

Realiza una consulta de las transferencias recibidas (depósitos) en la cuenta del cliente Monex relacionada a la suscripción, las transferencias que regresa este recuso son únicamente las transferencias  recibidas durante el día en el que se realiza la consulta.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.TransferenciasSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    List<Deposit> result = apiInstance.incomingSpeiTransactionsReportUsingGET(subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#incomingSpeiTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**List&lt;Deposit&gt;**](Deposit.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outCommingSpeiRequestIdTransactionsReportUsingGET"></a>
# **outCommingSpeiRequestIdTransactionsReportUsingGET**
> PaymentsRequestId outCommingSpeiRequestIdTransactionsReportUsingGET(requestId, subscription)

Consulta de transferencias de salida por identificador de petición

Consulta las transferencias de salida registradas en una petición, las transferencias que regresa este recuso son únicamente las transferencias  de salida agrupadas al identificador de la petición que se generó al hacer el registro de las transacciones el cual se debe especificar como parte del path de este endpoint.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.TransferenciasSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String requestId = "requestId_example"; // String | Identificador de la petición a buscar
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    PaymentsRequestId result = apiInstance.outCommingSpeiRequestIdTransactionsReportUsingGET(requestId, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#outCommingSpeiRequestIdTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Identificador de la petición a buscar |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**PaymentsRequestId**](PaymentsRequestId.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outgoingSpeiTransactionsReportUsingGET"></a>
# **outgoingSpeiTransactionsReportUsingGET**
> List&lt;Payment&gt; outgoingSpeiTransactionsReportUsingGET(subscription, orderId)

Consulta de transferencias realizadas

Consulta las transferencias realizadas en la cuenta del cliente Monex relacionada a la suscripción, las transferencias que regresa este recuso son únicamente las transferencias recibidas en el día en el que se realiza la consulta.&lt;br&gt;Se pueden realizar consultas por &lt;strong&gt;order_id&lt;/strong&gt; al realizar este tipo de consultas no importa el día en el que se realizó la transferencia

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.TransferenciasSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
String orderId = "orderId_example"; // String | Identificador de la orden a buscar
try {
    List<Payment> result = apiInstance.outgoingSpeiTransactionsReportUsingGET(subscription, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#outgoingSpeiTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |
 **orderId** | **String**| Identificador de la orden a buscar | [optional]

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerOutgoingSpeiTransactionUsingPOST"></a>
# **registerOutgoingSpeiTransactionUsingPOST**
> TokenRequiredResponse registerOutgoingSpeiTransactionUsingPOST(body, subscription)

Registro de transferencias

Registra un conjunto de transferencias a realizar en la cuenta del cliente Monex relacionada a la suscripción, las transferencias deben ser confirmadas por el cliente para que se efectuen.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.TransferenciasSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
TransactionsOutgoingRegister body = new TransactionsOutgoingRegister(); // TransactionsOutgoingRegister | Información de las transferencias SPEI de salida
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    TokenRequiredResponse result = apiInstance.registerOutgoingSpeiTransactionUsingPOST(body, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#registerOutgoingSpeiTransactionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionsOutgoingRegister**](TransactionsOutgoingRegister.md)| Información de las transferencias SPEI de salida |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

