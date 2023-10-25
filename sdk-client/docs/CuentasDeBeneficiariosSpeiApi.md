# CuentasDeBeneficiariosSpeiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeAccountsPendingPUT**](CuentasDeBeneficiariosSpeiApi.md#authorizeAccountsPendingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/pending | Solicitud para agrupar cuentas de beneficiarios SPEI/SPID en estado pendiente.
[**deleteAccountUsingDELETE**](CuentasDeBeneficiariosSpeiApi.md#deleteAccountUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/{account} | Elimina la cuenta del beneficiario
[**getAvailableRelationshipsMonexUsingGET**](CuentasDeBeneficiariosSpeiApi.md#getAvailableRelationshipsMonexUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/relationships | Consulta de relaciones
[**getBeneficiariesByRequestId**](CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesByRequestId) | **GET** /subscriptions/{subscription}/beneficiaries/spei/{requestId} | Consulta los beneficiarios por el identificador de la petición de registro
[**getBeneficiariesForAccountUsingGET**](CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesForAccountUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/spei | Consulta los beneficiarios registrados
[**preRegisterAccountsUsingPOST**](CuentasDeBeneficiariosSpeiApi.md#preRegisterAccountsUsingPOST) | **POST** /subscriptions/{subscription}/beneficiaries/spei | Pre-registro de cuentas de beneficiarios SPEI®.
[**removeBeneficiariesPendingUsingDELETE**](CuentasDeBeneficiariosSpeiApi.md#removeBeneficiariesPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/request/{requestId} | Eliminación de beneficiarios SPEI® sin confirmar
[**updateAmountLimitAccountUsingPUT**](CuentasDeBeneficiariosSpeiApi.md#updateAmountLimitAccountUsingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/spei/{account} | Solicitud para actualizar el monto límite de una cuenta

<a name="authorizeAccountsPendingPUT"></a>
# **authorizeAccountsPendingPUT**
> AuthorizedBeneficiariesResponse authorizeAccountsPendingPUT(body, authorization, subscription)

Solicitud para agrupar cuentas de beneficiarios SPEI/SPID en estado pendiente.

Solicta la agrupación de las cuentas de beneficiarios en estado pendiente para que sean autorizadas,  para ello se crea un conjunto de éstas que puede incluir tanto de SPEI como de SPID. Además se debe indicar las urls de redirección en caso de error y éxito

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
UrlsRedirect body = new UrlsRedirect(); // UrlsRedirect | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    AuthorizedBeneficiariesResponse result = apiInstance.authorizeAccountsPendingPUT(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#authorizeAccountsPendingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UrlsRedirect**](UrlsRedirect.md)| Información de la cuenta del beneficiario |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**AuthorizedBeneficiariesResponse**](AuthorizedBeneficiariesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountUsingDELETE"></a>
# **deleteAccountUsingDELETE**
> deleteAccountUsingDELETE(authorization, account, subscription)

Elimina la cuenta del beneficiario

Elimina la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la suscripción. La cuenta a borrar debe ser una que opere con SPEI.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String account = "account_example"; // String | Es la cuenta del beneficiario que será eliminada.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    apiInstance.deleteAccountUsingDELETE(authorization, account, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#deleteAccountUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **account** | **String**| Es la cuenta del beneficiario que será eliminada. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAvailableRelationshipsMonexUsingGET"></a>
# **getAvailableRelationshipsMonexUsingGET**
> RelationshipsResponse getAvailableRelationshipsMonexUsingGET(authorization, subscription)

Consulta de relaciones

Obtiene las posibles relaciones existentes para registrar beneficiarios en Monex. Se debe invocar este recurso antes de pre-registrar una cuenta de beneficiario.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    RelationshipsResponse result = apiInstance.getAvailableRelationshipsMonexUsingGET(authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#getAvailableRelationshipsMonexUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBeneficiariesByRequestId"></a>
# **getBeneficiariesByRequestId**
> BeneficiariesResponse getBeneficiariesByRequestId(authorization, requestId, subscription)

Consulta los beneficiarios por el identificador de la petición de registro

Obtiene los beneficiarios enviados para registro en una petición al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex, que pertenezcan a la petición que se solicita.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | El identificador de la petición del registro de beneficiarios a esta API.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    BeneficiariesResponse result = apiInstance.getBeneficiariesByRequestId(authorization, requestId, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#getBeneficiariesByRequestId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **requestId** | **String**| El identificador de la petición del registro de beneficiarios a esta API. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**BeneficiariesResponse**](BeneficiariesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBeneficiariesForAccountUsingGET"></a>
# **getBeneficiariesForAccountUsingGET**
> BeneficiariesResponse getBeneficiariesForAccountUsingGET(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, page, rfc, size, status)

Consulta los beneficiarios registrados

Obtiene los beneficiarios registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
String account = "account_example"; // String | Es la cuenta del beneficiario, podría ser teléfono celular (es de 10 dígitos), Tarjeta de débito (TDD, es de 16 dígitos) o cuenta CLABE (es de 18 dígitos). <br/><br/>Por ejemplo Teléfono celular: 5525072600, TDD: 4323 1234 5678 9123, CLABE: 032180000118359719.
String beneficiaryBank = "beneficiaryBank_example"; // String | Es la clave del banco beneficiario. Se puede obtener del recurso de las <a href=\"#operation/getAllInstitutionsUsingGET\">instituciones.</a>
String beneficiaryName = "beneficiaryName_example"; // String | Es el nombre del beneficiario.
String endDate = "endDate_example"; // String | Es la fecha de inicio del perido a filtrar en formato dd-mm-yyyy.
String initDate = "initDate_example"; // String | Es la fºecha de inicio del perido a filtrar en formato dd-mm-yyyy.
String page = "0"; // String | Es el número de página.
String rfc = "rfc_example"; // String | Es el Registro Federal de Controbuyentes (RFC) del beneficiario.
String size = "20"; // String | Es el tamaño de página.
String status = "status_example"; // String | Es el estado (estatus) de la cuenta. Los valores pueden ser <b>PENDING</b> y <b>REGISTERED</b>.
try {
    BeneficiariesResponse result = apiInstance.getBeneficiariesForAccountUsingGET(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, page, rfc, size, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#getBeneficiariesForAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |
 **account** | **String**| Es la cuenta del beneficiario, podría ser teléfono celular (es de 10 dígitos), Tarjeta de débito (TDD, es de 16 dígitos) o cuenta CLABE (es de 18 dígitos). &lt;br/&gt;&lt;br/&gt;Por ejemplo Teléfono celular: 5525072600, TDD: 4323 1234 5678 9123, CLABE: 032180000118359719. | [optional]
 **beneficiaryBank** | **String**| Es la clave del banco beneficiario. Se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; | [optional]
 **beneficiaryName** | **String**| Es el nombre del beneficiario. | [optional]
 **endDate** | **String**| Es la fecha de inicio del perido a filtrar en formato dd-mm-yyyy. | [optional]
 **initDate** | **String**| Es la fºecha de inicio del perido a filtrar en formato dd-mm-yyyy. | [optional]
 **page** | **String**| Es el número de página. | [optional] [default to 0]
 **rfc** | **String**| Es el Registro Federal de Controbuyentes (RFC) del beneficiario. | [optional]
 **size** | **String**| Es el tamaño de página. | [optional] [default to 20]
 **status** | **String**| Es el estado (estatus) de la cuenta. Los valores pueden ser &lt;b&gt;PENDING&lt;/b&gt; y &lt;b&gt;REGISTERED&lt;/b&gt;. | [optional]

### Return type

[**BeneficiariesResponse**](BeneficiariesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="preRegisterAccountsUsingPOST"></a>
# **preRegisterAccountsUsingPOST**
> TokenRequiredResponse preRegisterAccountsUsingPOST(body, authorization, subscription)

Pre-registro de cuentas de beneficiarios SPEI®.

Pre-registra una o más cuentas de beneficiario en la plataforma de Wire4, ésta le proporcionará una URL donde lo llevará al centro de autorización para que el cuentahabiente Monex ingrese su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt; Los posibles valores de &lt;em&gt;relationship&lt;/em&gt; y &lt;em&gt;kind_of_relationship&lt;/em&gt; se deben  obtener de &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;/subscriptions/{subscription}/beneficiaries/relationships.&lt;/a&gt;&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realizará a través de una notificación a los webhooks registrados con el evento de tipo &lt;a href&#x3D;\&quot;#section/Eventos/Tipos-de-Eventos\&quot;&gt;ACCOUNT.CREATED.&lt;/a&gt;

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
AccountRequest body = new AccountRequest(); // AccountRequest | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    TokenRequiredResponse result = apiInstance.preRegisterAccountsUsingPOST(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#preRegisterAccountsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountRequest**](AccountRequest.md)| Información de la cuenta del beneficiario |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeBeneficiariesPendingUsingDELETE"></a>
# **removeBeneficiariesPendingUsingDELETE**
> removeBeneficiariesPendingUsingDELETE(authorization, requestId, subscription)

Eliminación de beneficiarios SPEI® sin confirmar

Elimina uno o más beneficiarios que se encuentran en estado pendiente de confirmar (autorizar) de la cuenta del cliente Monex relacionada a la suscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | Es el identificador con el que se dió de alta a los beneficiarios (viene en el cuerpo de la respuesta del <a href=\"#operation/getAvailableRelationshipsMonexUsingGET\">pre-registro de beneficiarios</a>), los registros bajo éste campo van a ser eliminados.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    apiInstance.removeBeneficiariesPendingUsingDELETE(authorization, requestId, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#removeBeneficiariesPendingUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **requestId** | **String**| Es el identificador con el que se dió de alta a los beneficiarios (viene en el cuerpo de la respuesta del &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;pre-registro de beneficiarios&lt;/a&gt;), los registros bajo éste campo van a ser eliminados. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAmountLimitAccountUsingPUT"></a>
# **updateAmountLimitAccountUsingPUT**
> TokenRequiredResponse updateAmountLimitAccountUsingPUT(body, authorization, account, subscription)

Solicitud para actualizar el monto límite de una cuenta

Se crea una solicitud para actualizar el monto límite a la cuenta de beneficiario proporcionada y relacionada al contrato perteneciente a la subscripción. Una vez enviada la solicitud se retornará una URl que lo llevará al centro de autorización para que el cuentahabiente Monex ingrese su llave digital para confirmar la actualización del monto límite. 

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
AmountRequest body = new AmountRequest(); // AmountRequest | Información de la cuenta y el monto límite a actualizar.
String authorization = "authorization_example"; // String | Header para token
String account = "account_example"; // String | Es la cuenta que va a ser actualizada.
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    TokenRequiredResponse result = apiInstance.updateAmountLimitAccountUsingPUT(body, authorization, account, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#updateAmountLimitAccountUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AmountRequest**](AmountRequest.md)| Información de la cuenta y el monto límite a actualizar. |
 **authorization** | **String**| Header para token |
 **account** | **String**| Es la cuenta que va a ser actualizada. |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

