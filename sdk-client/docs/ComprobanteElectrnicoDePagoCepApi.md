# ComprobanteElectrnicoDePagoCepApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**obtainTransactionCepUsingPOST**](ComprobanteElectrnicoDePagoCepApi.md#obtainTransactionCepUsingPOST) | **POST** /ceps | Consulta de CEP

<a name="obtainTransactionCepUsingPOST"></a>
# **obtainTransactionCepUsingPOST**
> CepResponse obtainTransactionCepUsingPOST(body, authorization)

Consulta de CEP

Consulta el CEP de un pago realizado a través del SPEI, si es que este se encuentra disponible en BANXICO.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ComprobanteElectrnicoDePagoCepApi;


ComprobanteElectrnicoDePagoCepApi apiInstance = new ComprobanteElectrnicoDePagoCepApi();
CepSearchBanxico body = new CepSearchBanxico(); // CepSearchBanxico | Información para buscar un CEP
String authorization = "authorization_example"; // String | Header para token
try {
    CepResponse result = apiInstance.obtainTransactionCepUsingPOST(body, authorization);
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
 **authorization** | **String**| Header para token |

### Return type

[**CepResponse**](CepResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

