# CuentasDeBeneficiariosSpeiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeAccountsPendingPUT**](CuentasDeBeneficiariosSpeiApi.md#authorizeAccountsPendingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/pending | Recibe la solicitud para agrupar las cuentas SPEI/SPID de beneficiarios en estado pendiente que deben ser autorizadas
[**deleteAccountUsingDELETE**](CuentasDeBeneficiariosSpeiApi.md#deleteAccountUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/{account} | Elimina la cuenta del beneficiario
[**getAvailableRelationshipsMonexUsingGET**](CuentasDeBeneficiariosSpeiApi.md#getAvailableRelationshipsMonexUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/relationships | Consulta de relaciones
[**getBeneficiariesByRequestId**](CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesByRequestId) | **GET** /subscriptions/{subscription}/beneficiaries/spei/{requestId} | Consulta los beneficiarios por el identificador de la petición de registro
[**getBeneficiariesForAccountUsingGET**](CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesForAccountUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/spei | Consulta los beneficiarios registrados
[**preRegisterAccountsUsingPOST**](CuentasDeBeneficiariosSpeiApi.md#preRegisterAccountsUsingPOST) | **POST** /subscriptions/{subscription}/beneficiaries/spei | Pre-registro de cuentas de beneficiarios.
[**removeBeneficiariesPendingUsingDELETE**](CuentasDeBeneficiariosSpeiApi.md#removeBeneficiariesPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/request/{requestId} | Eliminación de beneficiarios SPEI® sin confirmar
[**updateAmountLimitAccountUsingPUT**](CuentasDeBeneficiariosSpeiApi.md#updateAmountLimitAccountUsingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/spei/{account} | Actualiza el monto límite

<a name="authorizeAccountsPendingPUT"></a>
# **authorizeAccountsPendingPUT**
> AuthorizedBeneficiariesResponse authorizeAccountsPendingPUT(body, authorization, subscription)

Recibe la solicitud para agrupar las cuentas SPEI/SPID de beneficiarios en estado pendiente que deben ser autorizadas

Solicta autorizar las cuentas de beneficiarios en estado pendiente agrupandolas en un set de cuentas que pueden incluir tanto cuentas de SPI como de SPID, debe indicar las urls de redireccion en caso de error y en caso de exito&lt;br/&gt;

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
UrlsRedirect body = new UrlsRedirect(); // UrlsRedirect | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **subscription** | **String**| El identificador de la suscripción a esta API |

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

Borra la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción. La cuenta a borrar debe ser una cuenta que opere con SPEI.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String account = "account_example"; // String | La cuenta del beneciario que será eliminada
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **account** | **String**| La cuenta del beneciario que será eliminada |
 **subscription** | **String**| El identificador de la suscripción a esta API |

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
String subscription = "subscription_example"; // String | Identificador de la suscripción a esta API
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
 **subscription** | **String**| Identificador de la suscripción a esta API |

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
String requestId = "requestId_example"; // String | El identificador de la petición del registro de beneficiarios a esta API
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **requestId** | **String**| El identificador de la petición del registro de beneficiarios a esta API |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**BeneficiariesResponse**](BeneficiariesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBeneficiariesForAccountUsingGET"></a>
# **getBeneficiariesForAccountUsingGET**
> BeneficiariesResponse getBeneficiariesForAccountUsingGET(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status)

Consulta los beneficiarios registrados

Obtiene los beneficiarios registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
String account = "account_example"; // String | Cuenta del beneficiario, puede ser Clabe, TDD o Celular
String beneficiaryBank = "beneficiaryBank_example"; // String | Clave del banco beneficiario
String beneficiaryName = "beneficiaryName_example"; // String | Nombre del beneficiario
String endDate = "endDate_example"; // String | Fecha de inicio del perido a filtrar en formato dd-mm-yyyy
String initDate = "initDate_example"; // String | Fecha de inicio del perido a filtrar en formato dd-mm-yyyy
String rfc = "rfc_example"; // String | RFC del beneficiario
String status = "status_example"; // String | Estatus de la cuenta
try {
    BeneficiariesResponse result = apiInstance.getBeneficiariesForAccountUsingGET(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status);
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
 **subscription** | **String**| El identificador de la suscripción a esta API |
 **account** | **String**| Cuenta del beneficiario, puede ser Clabe, TDD o Celular | [optional]
 **beneficiaryBank** | **String**| Clave del banco beneficiario | [optional]
 **beneficiaryName** | **String**| Nombre del beneficiario | [optional]
 **endDate** | **String**| Fecha de inicio del perido a filtrar en formato dd-mm-yyyy | [optional]
 **initDate** | **String**| Fecha de inicio del perido a filtrar en formato dd-mm-yyyy | [optional]
 **rfc** | **String**| RFC del beneficiario | [optional]
 **status** | **String**| Estatus de la cuenta | [optional]

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

Pre-registro de cuentas de beneficiarios.

Pre-registra una o más cuentas de beneficiario en la plataforma, proporcionando una URL donde el cuentahabiente Monex debe ingresar un valor de su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt;Los posibles valores de &lt;i&gt;relationship&lt;/i&gt; y &lt;i&gt;kind_of_relationship&lt;/i&gt; se deben  obtener de /subscriptions/{subscription}/beneficiaries/relationships.&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realiza a través de una llamada a los webhooks registrados con el evento ACCOUNT.CREATED.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
AccountRequest body = new AccountRequest(); // AccountRequest | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **subscription** | **String**| El identificador de la suscripción a esta API |

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

Elimina un conjunto de beneficiarios a registrar en la cuenta del cliente Monex relacionada a la suscripción, los beneficiarios no deben haber sido confirmados por el cliente.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String authorization = "authorization_example"; // String | Header para token
String requestId = "requestId_example"; // String | Identificador de los beneficiarios a eliminar
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **requestId** | **String**| Identificador de los beneficiarios a eliminar |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAmountLimitAccountUsingPUT"></a>
# **updateAmountLimitAccountUsingPUT**
> updateAmountLimitAccountUsingPUT(body, authorization, account, subscription)

Actualiza el monto límite

Actualiza el monto límite a la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;


CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
AmountRequest body = new AmountRequest(); // AmountRequest | Información de la cuenta y el monto límite a actualizar
String authorization = "authorization_example"; // String | Header para token
String account = "account_example"; // String | Cuenta a actualizar
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.updateAmountLimitAccountUsingPUT(body, authorization, account, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#updateAmountLimitAccountUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AmountRequest**](AmountRequest.md)| Información de la cuenta y el monto límite a actualizar |
 **authorization** | **String**| Header para token |
 **account** | **String**| Cuenta a actualizar |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

