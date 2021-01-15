# CuentasDeBeneficiariosSpidApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSpidBeneficiariesForAccount**](CuentasDeBeneficiariosSpidApi.md#getSpidBeneficiariesForAccount) | **GET** /subscriptions/{subscription}/beneficiaries/spid | Consulta los beneficiarios SPID registrados
[**preRegisterAccountsUsingPOST1**](CuentasDeBeneficiariosSpidApi.md#preRegisterAccountsUsingPOST1) | **POST** /subscriptions/{subscription}/beneficiaries/spid | Pre-registro de cuentas de beneficiarios SPID®

<a name="getSpidBeneficiariesForAccount"></a>
# **getSpidBeneficiariesForAccount**
> SpidBeneficiariesResponse getSpidBeneficiariesForAccount(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status)

Consulta los beneficiarios SPID registrados

Obtiene los beneficiarios SPID registrados al contrato relacionado con la suscripción. Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpidApi;


CuentasDeBeneficiariosSpidApi apiInstance = new CuentasDeBeneficiariosSpidApi();
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
String account = "account_example"; // String | Cuenta del beneficiario, puede ser CLABE (18 dígitos), Tarjeta de débito  (TDD, 16 dígitos) o número de celular (10 dígitos).
String beneficiaryBank = "beneficiaryBank_example"; // String | Es la clave del banco beneficiario. Se puede obtener del catalogo de <a href=\"#operation/getAllInstitutionsUsingGET\">instituciones.</a>
String beneficiaryName = "beneficiaryName_example"; // String | Es el nombre del beneficiario.
String endDate = "endDate_example"; // String | Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy.
String initDate = "initDate_example"; // String | Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy.
String rfc = "rfc_example"; // String | Es el Registro Federal de Contribuyentes (RFC) del beneficiario.
String status = "status_example"; // String | Es el estado (estatus) de la cuenta, Los valores pueden ser <b>PENDING</b> y <b>REGISTERED</b>.
try {
    SpidBeneficiariesResponse result = apiInstance.getSpidBeneficiariesForAccount(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpidApi#getSpidBeneficiariesForAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |
 **account** | **String**| Cuenta del beneficiario, puede ser CLABE (18 dígitos), Tarjeta de débito  (TDD, 16 dígitos) o número de celular (10 dígitos). | [optional]
 **beneficiaryBank** | **String**| Es la clave del banco beneficiario. Se puede obtener del catalogo de &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; | [optional]
 **beneficiaryName** | **String**| Es el nombre del beneficiario. | [optional]
 **endDate** | **String**| Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. | [optional]
 **initDate** | **String**| Es la fecha de inicio del periodo a filtrar en formato dd-mm-yyyy. | [optional]
 **rfc** | **String**| Es el Registro Federal de Contribuyentes (RFC) del beneficiario. | [optional]
 **status** | **String**| Es el estado (estatus) de la cuenta, Los valores pueden ser &lt;b&gt;PENDING&lt;/b&gt; y &lt;b&gt;REGISTERED&lt;/b&gt;. | [optional]

### Return type

[**SpidBeneficiariesResponse**](SpidBeneficiariesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="preRegisterAccountsUsingPOST1"></a>
# **preRegisterAccountsUsingPOST1**
> TokenRequiredResponse preRegisterAccountsUsingPOST1(body, authorization, subscription)

Pre-registro de cuentas de beneficiarios SPID®

Pre-registra una o más cuentas de beneficiario SPID® en la plataforma de Wire4, ésta le proporcionaará una URL donde lo llevará al centro de autorización para que el cuentahabiente Monex ingrese su llave digital para confirmar el alta de las cuentas de beneficiarios.&lt;br/&gt; Los posibles valores de &lt;em&gt;relationship&lt;/em&gt; y &lt;em&gt;kind_of_relationship&lt;/em&gt; se deben  obtener de &lt;a href&#x3D;\&quot;#operation/getAvailableRelationshipsMonexUsingGET\&quot;&gt;/subscriptions/{subscription}/beneficiaries/relationships.&lt;/a&gt;&lt;br/&gt;&lt;br/&gt;La confirmación de registro en Monex se realizará a través de una notificación a los webhooks registrados con el evento de tipo &lt;a href&#x3D;\&quot;#section/Eventos/Tipos-de-Eventos\&quot;&gt;ACCOUNT.CREATED.&lt;/a&gt;

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpidApi;


CuentasDeBeneficiariosSpidApi apiInstance = new CuentasDeBeneficiariosSpidApi();
AccountSpid body = new AccountSpid(); // AccountSpid | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | Es el identificador de la suscripción a esta API.
try {
    TokenRequiredResponse result = apiInstance.preRegisterAccountsUsingPOST1(body, authorization, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CuentasDeBeneficiariosSpidApi#preRegisterAccountsUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountSpid**](AccountSpid.md)| Información de la cuenta del beneficiario |
 **authorization** | **String**| Header para token |
 **subscription** | **String**| Es el identificador de la suscripción a esta API. |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

