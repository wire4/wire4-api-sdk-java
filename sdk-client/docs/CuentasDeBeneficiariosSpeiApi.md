# CuentasDeBeneficiariosSpeiApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountUsingDELETE**](CuentasDeBeneficiariosSpeiApi.md#deleteAccountUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/{account} | Elimina la cuenta del beneficiario
[**getAvailableRelationshipsMonexUsingGET**](CuentasDeBeneficiariosSpeiApi.md#getAvailableRelationshipsMonexUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/relationships | Consulta de relaciones
[**getBeneficiariesForAccountUsingGET**](CuentasDeBeneficiariosSpeiApi.md#getBeneficiariesForAccountUsingGET) | **GET** /subscriptions/{subscription}/beneficiaries/spei | Consulta los beneficiarios registrados
[**preRegisterAccountsUsingPOST**](CuentasDeBeneficiariosSpeiApi.md#preRegisterAccountsUsingPOST) | **POST** /subscriptions/{subscription}/beneficiaries/spei | Pre-registro de cuentas de beneficiarios.
[**removeBeneficiariesPendingUsingDELETE**](CuentasDeBeneficiariosSpeiApi.md#removeBeneficiariesPendingUsingDELETE) | **DELETE** /subscriptions/{subscription}/beneficiaries/spei/request/{requestId} | Eliminación de beneficiarios SPEI® sin confirmar
[**updateAmountLimitAccountUsingPUT**](CuentasDeBeneficiariosSpeiApi.md#updateAmountLimitAccountUsingPUT) | **PUT** /subscriptions/{subscription}/beneficiaries/spei/{account} | Actualiza el monto límite

<a name="deleteAccountUsingDELETE"></a>
# **deleteAccountUsingDELETE**
> deleteAccountUsingDELETE(account, subscription)

Elimina la cuenta del beneficiario

Borra la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción. La cuenta a borrar debe ser una cuenta que opere con SPEI.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String account = "account_example"; // String | La cuenta del beneciario que será eliminada
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.deleteAccountUsingDELETE(account, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#deleteAccountUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| La cuenta del beneciario que será eliminada |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAvailableRelationshipsMonexUsingGET"></a>
# **getAvailableRelationshipsMonexUsingGET**
> RelationshipsResponse getAvailableRelationshipsMonexUsingGET(subscription)

Consulta de relaciones

Obtiene las posibles relaciones existentes para registrar beneficiarios en Monex. Se debe invocar este recurso antes de pre-registrar una cuenta de beneficiario.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String subscription = "subscription_example"; // String | Identificador de la suscripción a esta API
try {
    RelationshipsResponse result = apiInstance.getAvailableRelationshipsMonexUsingGET(subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#getAvailableRelationshipsMonexUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| Identificador de la suscripción a esta API |

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBeneficiariesForAccountUsingGET"></a>
# **getBeneficiariesForAccountUsingGET**
> BeneficiariesResponse getBeneficiariesForAccountUsingGET(subscription, rfc)

Consulta los beneficiarios registrados

Obtiene los beneficiarios registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
String rfc = "rfc_example"; // String | RFC del beneficiario
try {
    BeneficiariesResponse result = apiInstance.getBeneficiariesForAccountUsingGET(subscription, rfc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#getBeneficiariesForAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | **String**| El identificador de la suscripción a esta API |
 **rfc** | **String**| RFC del beneficiario | [optional]

### Return type

[**BeneficiariesResponse**](BeneficiariesResponse.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="preRegisterAccountsUsingPOST"></a>
# **preRegisterAccountsUsingPOST**
> TokenRequiredResponse preRegisterAccountsUsingPOST(body, subscription)

Pre-registro de cuentas de beneficiarios.

Pre-registra una o más cuentas de beneficiario en la plataforma, proporcionando una URL donde el cuentahabiente Monex debe ingresar un valor de su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt;Los posibles valores de &lt;i&gt;relationship&lt;/i&gt; y &lt;i&gt;kind_of_relationship&lt;/i&gt; se deben  obtener de /subscriptions/{subscription}/beneficiaries/relationships.&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realiza a través de una llamada a los webhooks registrados con el evento ACCOUNT.CREATED.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
AccountRequest body = new AccountRequest(); // AccountRequest | Información de la cuenta del beneficiario
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    TokenRequiredResponse result = apiInstance.preRegisterAccountsUsingPOST(body, subscription);
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
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeBeneficiariesPendingUsingDELETE"></a>
# **removeBeneficiariesPendingUsingDELETE**
> removeBeneficiariesPendingUsingDELETE(requestId, subscription)

Eliminación de beneficiarios SPEI® sin confirmar

Elimina un conjunto de beneficiarios a registrar en la cuenta del cliente Monex relacionada a la suscripción, los beneficiarios no deben haber sido confirmados por el cliente.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
String requestId = "requestId_example"; // String | Identificador de los beneficiarios a eliminar
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.removeBeneficiariesPendingUsingDELETE(requestId, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#removeBeneficiariesPendingUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Identificador de los beneficiarios a eliminar |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAmountLimitAccountUsingPUT"></a>
# **updateAmountLimitAccountUsingPUT**
> updateAmountLimitAccountUsingPUT(body, account, subscription)

Actualiza el monto límite

Actualiza el monto límite a la cuenta de beneficiario proporcionada relacionada al contrato perteneciente a la subscripción.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.CuentasDeBeneficiariosSpeiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app_user_spei
OAuth wire4_aut_app_user_spei = (OAuth) defaultClient.getAuthentication("wire4_aut_app_user_spei");
wire4_aut_app_user_spei.setAccessToken("YOUR ACCESS TOKEN");

CuentasDeBeneficiariosSpeiApi apiInstance = new CuentasDeBeneficiariosSpeiApi();
AmountRequest body = new AmountRequest(); // AmountRequest | Información de la cuenta y el monto límite a actualizar
String account = "account_example"; // String | Cuenta a actualizar
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
try {
    apiInstance.updateAmountLimitAccountUsingPUT(body, account, subscription);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpeiApi#updateAmountLimitAccountUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AmountRequest**](AmountRequest.md)| Información de la cuenta y el monto límite a actualizar |
 **account** | **String**| Cuenta a actualizar |
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

null (empty response body)

### Authorization

[wire4_aut_app_user_spei](../README.md#wire4_aut_app_user_spei)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

