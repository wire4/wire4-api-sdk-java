# ContractsDetailsApi

All URIs are relative to *https://sandbox-api.wire4.mx/wire4/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthorization**](ContractsDetailsApi.md#createAuthorization) | **POST** /onboarding/accounts/authorize | Devuelve la URL para autorización del usuario Monex
[**obtainAuthorizedUsers**](ContractsDetailsApi.md#obtainAuthorizedUsers) | **GET** /onboarding/accounts/{requestId}/authorized-users | Obtiene los usuarios autorizados
[**obtainContractDetails**](ContractsDetailsApi.md#obtainContractDetails) | **POST** /onboarding/accounts/details | Obtiene los detalles de la empresa del contrato

<a name="createAuthorization"></a>
# **createAuthorization**
> TokenRequiredResponse createAuthorization(body, authorization)

Devuelve la URL para autorización del usuario Monex

Se obtiene la URL para la autorización del usuario Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ContractsDetailsApi;


ContractsDetailsApi apiInstance = new ContractsDetailsApi();
PreMonexAuthorization body = new PreMonexAuthorization(); // PreMonexAuthorization | Información para la autorización
String authorization = "authorization_example"; // String | Header para token
try {
    TokenRequiredResponse result = apiInstance.createAuthorization(body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsDetailsApi#createAuthorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreMonexAuthorization**](PreMonexAuthorization.md)| Información para la autorización |
 **authorization** | **String**| Header para token |

### Return type

[**TokenRequiredResponse**](TokenRequiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obtainAuthorizedUsers"></a>
# **obtainAuthorizedUsers**
> List&lt;AuthorizedUsers&gt; obtainAuthorizedUsers(authorization, X_ACCESS_KEY, requestId)

Obtiene los usuarios autorizados

Obtienen los detalles de los usuarios autorizados de Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ContractsDetailsApi;


ContractsDetailsApi apiInstance = new ContractsDetailsApi();
String authorization = "authorization_example"; // String | Header para token
String X_ACCESS_KEY = "X_ACCESS_KEY_example"; // String | La llave de acceso de la aplicación
String requestId = "requestId_example"; // String | El identificador de la petición a esta API
try {
    List<AuthorizedUsers> result = apiInstance.obtainAuthorizedUsers(authorization, X_ACCESS_KEY, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsDetailsApi#obtainAuthorizedUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Header para token |
 **X_ACCESS_KEY** | **String**| La llave de acceso de la aplicación |
 **requestId** | **String**| El identificador de la petición a esta API |

### Return type

[**List&lt;AuthorizedUsers&gt;**](AuthorizedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="obtainContractDetails"></a>
# **obtainContractDetails**
> ContractDetailResponse obtainContractDetails(body, authorization, X_ACCESS_KEY)

Obtiene los detalles de la empresa del contrato

Detalles de la compañía relacionada con el contrato de Monex.

### Example
```java
// Import classes:
//import mx.wire4.ApiException;
//import mx.wire4.api.ContractsDetailsApi;


ContractsDetailsApi apiInstance = new ContractsDetailsApi();
ContractDetailRequest body = new ContractDetailRequest(); // ContractDetailRequest | Información para obtener los detalles de la companía
String authorization = "authorization_example"; // String | Header para token
String X_ACCESS_KEY = "X_ACCESS_KEY_example"; // String | La llave de acceso de la aplicación
try {
    ContractDetailResponse result = apiInstance.obtainContractDetails(body, authorization, X_ACCESS_KEY);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsDetailsApi#obtainContractDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContractDetailRequest**](ContractDetailRequest.md)| Información para obtener los detalles de la companía |
 **authorization** | **String**| Header para token |
 **X_ACCESS_KEY** | **String**| La llave de acceso de la aplicación |

### Return type

[**ContractDetailResponse**](ContractDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

