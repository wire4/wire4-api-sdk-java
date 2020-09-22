# CuentasDeBeneficiariosSpidApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSpidBeneficiariesForAccount**](CuentasDeBeneficiariosSpidApi.md#getSpidBeneficiariesForAccount) | **GET** /subscriptions/{subscription}/beneficiaries/spid | Consulta los beneficiarios SPID registrados
[**preRegisterAccountsUsingPOST1**](CuentasDeBeneficiariosSpidApi.md#preRegisterAccountsUsingPOST1) | **POST** /subscriptions/{subscription}/beneficiaries/spid | Pre-registro de cuentas de beneficiarios SPID

<a name="getSpidBeneficiariesForAccount"></a>
# **getSpidBeneficiariesForAccount**
> SpidBeneficiariesResponse getSpidBeneficiariesForAccount(authorization, subscription, account, beneficiaryBank, beneficiaryName, endDate, initDate, rfc, status)

Consulta los beneficiarios SPID registrados

Obtiene los beneficiarios SPID registrados al contrato relacionado con la suscripción, Los beneficiarios son los que actualmente se encuentran registrados en banca Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpidApi;


CuentasDeBeneficiariosSpidApi apiInstance = new CuentasDeBeneficiariosSpidApi();
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
 **subscription** | **String**| El identificador de la suscripción a esta API |
 **account** | **String**| Cuenta del beneficiario, puede ser Clabe, TDD o Celular | [optional]
 **beneficiaryBank** | **String**| Clave del banco beneficiario | [optional]
 **beneficiaryName** | **String**| Nombre del beneficiario | [optional]
 **endDate** | **String**| Fecha de inicio del perido a filtrar en formato dd-mm-yyyy | [optional]
 **initDate** | **String**| Fecha de inicio del perido a filtrar en formato dd-mm-yyyy | [optional]
 **rfc** | **String**| RFC del beneficiario | [optional]
 **status** | **String**| Estatus de la cuenta | [optional]

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

Pre-registro de cuentas de beneficiarios SPID

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.CuentasDeBeneficiariosSpidApi;


CuentasDeBeneficiariosSpidApi apiInstance = new CuentasDeBeneficiariosSpidApi();
AccountSpid body = new AccountSpid(); // AccountSpid | Información de la cuenta del beneficiario
String authorization = "authorization_example"; // String | Header para token
String subscription = "subscription_example"; // String | El identificador de la suscripción a esta API
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
 **subscription** | **String**| El identificador de la suscripción a esta API |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

