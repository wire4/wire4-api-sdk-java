# TransferenciasSpeiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthorizationTransactionsGroup**](TransferenciasSpeiApi.md#createAuthorizationTransactionsGroup) | **POST** /subscriptions/{subscription}/transactions/group | Agrupa transacciones bajo un request_id 
[**dropTransactionsPendingUsingDELETE**](TransferenciasSpeiApi.md#dropTransactionsPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/transactions/outcoming/spei/request/{requestId} | Eliminación de transferencias SPEI® pendientes
[**incomingSpeiTransactionsReportUsingGET**](TransferenciasSpeiApi.md#incomingSpeiTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/incoming/spei | Consulta de transferencias recibidas
[**outCommingSpeiRequestIdTransactionsReportUsingGET**](TransferenciasSpeiApi.md#outCommingSpeiRequestIdTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/spei/{requestId} | Consulta de transferencias de salida por identificador de petición
[**outCommingSpeiSpidOrderIdTransactionReportUsingGET**](TransferenciasSpeiApi.md#outCommingSpeiSpidOrderIdTransactionReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming | Consulta de transferencias realizadas por order_id
[**outCommingSpeiSpidRequestIdTransactionsReportUsingGET**](TransferenciasSpeiApi.md#outCommingSpeiSpidRequestIdTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/{requestId} | Consulta de transferencias de salida por identificador de petición
[**outgoingSpeiTransactionsReportUsingGET**](TransferenciasSpeiApi.md#outgoingSpeiTransactionsReportUsingGET) | **GET** /subscriptions/{subscription}/transactions/outcoming/spei | Consulta de transferencias realizadas
[**registerOutgoingSpeiTransactionUsingPOST**](TransferenciasSpeiApi.md#registerOutgoingSpeiTransactionUsingPOST) | **POST** /subscriptions/{subscription}/transactions/outcoming/spei | Registro de transferencias
[**registerSpeiSpidOutgoingTransactionsUsingPOST**](TransferenciasSpeiApi.md#registerSpeiSpidOutgoingTransactionsUsingPOST) | **POST** /subscriptions/{subscription}/transactions/outcoming | Registro de transferencias SPEI y SPID

<a name="createAuthorizationTransactionsGroup"></a>
# **createAuthorizationTransactionsGroup**
> TokenRequiredResponse createAuthorizationTransactionsGroup(body, authorization, subscription)

Agrupa transacciones bajo un request_id 

Agrupa transacciones SPEI/SPID en un mismo transaction_id, posteriormente genera la dirección URL del centro de autorización para la confirmación de las transacciones. &lt;br&gt;&lt;br&gt;Las transacciones deben estar en estatus PENDING y pertenecer a un mismo contrato.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
AuthorizationTransactionGroup body = new AuthorizationTransactionGroup(); // AuthorizationTransactionGroup | Objeto con la información para agrupar transacciones existentes y autorizarlas de forma conjunta.
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el Identificador de la suscripción.
try {
    TokenRequiredResponse result = apiInstance.createAuthorizationTransactionsGroup(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#createAuthorizationTransactionsGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthorizationTransactionGroup**](AuthorizationTransactionGroup.md)| Objeto con la información para agrupar transacciones existentes y autorizarlas de forma conjunta. |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el Identificador de la suscripción. |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="dropTransactionsPendingUsingDELETE"></a>
# **dropTransactionsPendingUsingDELETE**
> dropTransactionsPendingUsingDELETE(authorization, requestId, subscription, orderId)

Eliminación de transferencias SPEI® pendientes

Elimina un conjunto de transferencias en estado pendiente de confirmar o autorizar, en la cuenta del cliente Monex relacionada a la suscripción.&lt;br&gt;&lt;br&gt;&lt;b&gt;Nota:&lt;/b&gt; Las transferencias no deben haber sido confirmadas o autorizadas por el cliente.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | Identificador de las transferencias a eliminar.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
String orderId = "orderId_example"; // String | Listado de identificadores dentro del request_id para eliminar.
try {
    apiInstance.dropTransactionsPendingUsingDELETE(authorization, requestId, subscription, orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#dropTransactionsPendingUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **requestId** | **String**| Identificador de las transferencias a eliminar. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |
 **orderId** | **String**| Listado de identificadores dentro del request_id para eliminar. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="incomingSpeiTransactionsReportUsingGET"></a>
# **incomingSpeiTransactionsReportUsingGET**
> List&lt;Deposit&gt; incomingSpeiTransactionsReportUsingGET(authorization, subscription, beginDate, endDate)

Consulta de transferencias recibidas

Realiza una consulta de las transferencias recibidas (depósitos) en la cuenta del cliente Monex relacionada a la suscripción, las transferencias que regresa este recuso son únicamente las transferencias  recibidas durante el día en el que se realiza la consulta. Para consultar transacciones que se encuentran en otras fechas se debe utilizar los parámetros de fecha inicial (beginDate) y fecha final (endDate), siempre deben de ir las dos ya que en caso de que falte una marcará error la consulta, si faltan las dos la consulta lanzará solo las del día, como se describe al inicio. El formato para las fechas es \&quot;yyyy-MM-dd\&quot;

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
String beginDate = "beginDate_example"; // String | Fecha inicial para filtrar los depósitos, se espera en formato 'yyyy-MM-dd'
String endDate = "endDate_example"; // String | Fecha final para filtrar los depósitos, se espera en formato 'yyyy-MM-dd'
try {
    List<Deposit> result = apiInstance.incomingSpeiTransactionsReportUsingGET(authorization, subscription, beginDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#incomingSpeiTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |
 **beginDate** | **String**| Fecha inicial para filtrar los depósitos, se espera en formato &#x27;yyyy-MM-dd&#x27; | [optional]
 **endDate** | **String**| Fecha final para filtrar los depósitos, se espera en formato &#x27;yyyy-MM-dd&#x27; | [optional]

### Return type

[**List&lt;Deposit&gt;**](Deposit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outCommingSpeiRequestIdTransactionsReportUsingGET"></a>
# **outCommingSpeiRequestIdTransactionsReportUsingGET**
> PaymentsRequestId outCommingSpeiRequestIdTransactionsReportUsingGET(authorization, requestId, subscription)

Consulta de transferencias de salida por identificador de petición

Consulta las transferencias de salida registradas en una petición, las transferencias que regresa este recuso son únicamente las transferencias de salida agrupadas al identificador de la petición que se generó al hacer el registro de las transacciones el cuál se debe especificar como parte del path de este endpoint.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | Identificador de la petición a buscar.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    PaymentsRequestId result = apiInstance.outCommingSpeiRequestIdTransactionsReportUsingGET(authorization, requestId, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#outCommingSpeiRequestIdTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **requestId** | **String**| Identificador de la petición a buscar. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**PaymentsRequestId**](PaymentsRequestId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outCommingSpeiSpidOrderIdTransactionReportUsingGET"></a>
# **outCommingSpeiSpidOrderIdTransactionReportUsingGET**
> PaymentsSpeiAndSpidOrderId outCommingSpeiSpidOrderIdTransactionReportUsingGET(authorization, subscription, orderId)

Consulta de transferencias realizadas por order_id

Consulta las transferencias que regresa este recuso son únicamente las transferencias recibidas en el día en el que se realiza la consulta o las transferencias identificadas con el &lt;strong&gt;order_id&lt;/strong&gt; proporcionado, para este tipo de consultas no importa el día en el que se realizó la transferencia. &lt;br&gt; Es importante que conozca que la respuesta puede dar como resultado un objeto con una lista spei o una lista spid con el/los elementos ya que un identificador order_id solo puede pertenecer a una transacción sea spei o spid.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
String orderId = "orderId_example"; // String | Es el identificador de la orden a buscar.
try {
    PaymentsSpeiAndSpidOrderId result = apiInstance.outCommingSpeiSpidOrderIdTransactionReportUsingGET(authorization, subscription, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#outCommingSpeiSpidOrderIdTransactionReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |
 **orderId** | **String**| Es el identificador de la orden a buscar. | [optional]

### Return type

[**PaymentsSpeiAndSpidOrderId**](PaymentsSpeiAndSpidOrderId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outCommingSpeiSpidRequestIdTransactionsReportUsingGET"></a>
# **outCommingSpeiSpidRequestIdTransactionsReportUsingGET**
> PaymentsSpeiAndSpidRequestId outCommingSpeiSpidRequestIdTransactionsReportUsingGET(authorization, requestId, subscription)

Consulta de transferencias de salida por identificador de petición

Consulta las transferencias de salida registradas en una petición, las transferencias que regresa este recuso son únicamente las transferencias de salida agrupadas al identificador de la petición que se generó al hacer el registro de las transacciones el cuál se debe especificar como parte del path de este endpoint.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | Identificador de la petición a buscar.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    PaymentsSpeiAndSpidRequestId result = apiInstance.outCommingSpeiSpidRequestIdTransactionsReportUsingGET(authorization, requestId, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#outCommingSpeiSpidRequestIdTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **requestId** | **String**| Identificador de la petición a buscar. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**PaymentsSpeiAndSpidRequestId**](PaymentsSpeiAndSpidRequestId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="outgoingSpeiTransactionsReportUsingGET"></a>
# **outgoingSpeiTransactionsReportUsingGET**
> List&lt;Payment&gt; outgoingSpeiTransactionsReportUsingGET(authorization, subscription, orderId)

Consulta de transferencias realizadas

Consulta las transferencias realizadas en la cuenta del cliente Monex relacionada a la suscripción, las transferencias que regresa este recuso son únicamente las transferencias recibidas en el día en el que se realiza la consulta.&lt;br&gt;Se pueden realizar consultas por &lt;strong&gt;order_id&lt;/strong&gt; al realizar este tipo de consultas no importa el día en el que se realizó la transferencia

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
String orderId = "orderId_example"; // String | Es el identificador de la orden a buscar.
try {
    List<Payment> result = apiInstance.outgoingSpeiTransactionsReportUsingGET(authorization, subscription, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#outgoingSpeiTransactionsReportUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |
 **orderId** | **String**| Es el identificador de la orden a buscar. | [optional]

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerOutgoingSpeiTransactionUsingPOST"></a>
# **registerOutgoingSpeiTransactionUsingPOST**
> TokenRequiredResponse registerOutgoingSpeiTransactionUsingPOST(body, authorization, subscription)

Registro de transferencias

Se registra un conjunto de transferencias (una o más) a realizar en la cuenta del cliente Monex relacionada a la suscripción. En la respuesta se proporcionará una dirección URL que lo llevará al centro de autorización para que las transferencias sean confirmadas (autorizadas) por el cliente para que se efectúen, para ello debe ingresar la llave electrónica (Token).&lt;br&gt;  Nota: Debe considerar que el concepto de cada una de las transacciones solo debe contener caracteres alfanuméricos por lo que en caso de que se reciban caracteres como ñ o acentos serán sustituidos por n o en su caso por la letra sin acento. Los caracteres no alfanuméricos como pueden ser caracteres especiales serán eliminados.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
TransactionsOutgoingRegister body = new TransactionsOutgoingRegister(); // TransactionsOutgoingRegister | Información de las transferencias SPEI de salida
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    TokenRequiredResponse result = apiInstance.registerOutgoingSpeiTransactionUsingPOST(body, authorization, subscription);
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
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerSpeiSpidOutgoingTransactionsUsingPOST"></a>
# **registerSpeiSpidOutgoingTransactionsUsingPOST**
> TokenRequiredResponse registerSpeiSpidOutgoingTransactionsUsingPOST(body, authorization, subscription)

Registro de transferencias SPEI y SPID

Se registra un conjunto de transferencias (una o más) tanto SPEI como SPID en una sola petición en la cuenta del cliente Monex relacionada a la suscripción. En la respuesta se proporcionará una dirección URL que lo llevará al centro de autorización para que las transferencias sean confirmadas (autorizadas) por el cliente para que se efectúen, para ello debe ingresar la llave electrónica (Token).&lt;br&gt;  Nota: Debe considerar que el concepto de cada una de las transacciones solo debe contener caracteres alfanuméricos por lo que en caso de que se reciban caracteres como ñ o acentos serán sustituidos por n o en su caso por la letra sin acento. Los caracteres no alfanuméricos como pueden ser caracteres especiales serán eliminados.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.TransferenciasSpeiApi;


TransferenciasSpeiApi apiInstance = new TransferenciasSpeiApi();
TransactionsRegister body = new TransactionsRegister(); // TransactionsRegister | Información de las transferencias SPEI y SPID de salida
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    TokenRequiredResponse result = apiInstance.registerSpeiSpidOutgoingTransactionsUsingPOST(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasSpeiApi#registerSpeiSpidOutgoingTransactionsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransactionsRegister**](TransactionsRegister.md)| Información de las transferencias SPEI y SPID de salida |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

