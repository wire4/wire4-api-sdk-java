# ComprobanteElectrnicoDePagoCepApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**obtainTransactionCepUsingPOST**](ComprobanteElectrnicoDePagoCepApi.md#obtainTransactionCepUsingPOST) | **POST** /ceps | Consulta de CEP

<a name="obtainTransactionCepUsingPOST"></a>
# **obtainTransactionCepUsingPOST**
> CepResponse obtainTransactionCepUsingPOST(body)

Consulta de CEP

Consulta el CEP de un pago realizado a través del SPEI, si es que este se encuentra disponible en BANXICO.

### Example
```java
// Import classes:
//import mx.wire4.ApiClient;
//import mx.wire4.ApiException;
//import mx.wire4.Configuration;
//import mx.wire4.auth.*;
//import mx.wire4.api.ComprobanteElectrnicoDePagoCepApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: wire4_aut_app
OAuth wire4_aut_app = (OAuth) defaultClient.getAuthentication("wire4_aut_app");
wire4_aut_app.setAccessToken("YOUR ACCESS TOKEN");

ComprobanteElectrnicoDePagoCepApi apiInstance = new ComprobanteElectrnicoDePagoCepApi();
CepSearchBanxico body = new CepSearchBanxico(); // CepSearchBanxico | Información para buscar un CEP
try {
    CepResponse result = apiInstance.obtainTransactionCepUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComprobanteElectrnicoDePagoCepApi#obtainTransactionCepUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CepSearchBanxico**](CepSearchBanxico.md)| Información para buscar un CEP |

### Return type

[**CepResponse**](CepResponse.md)

### Authorization

[wire4_aut_app](../README.md#wire4_aut_app)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

