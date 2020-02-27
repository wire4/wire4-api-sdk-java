# BeneficiariesQueryRegisterStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorizationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en que el usuario propietario del token autorizo el registro de beneficiarios |  [optional]
**beneficiaries** | [**List&lt;AccountResponse&gt;**](AccountResponse.md) | Lista de beneficiarios obtenidos |  [optional]
**requestDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en que se realizó la petición de registro de beneficiarios |  [optional]
**requestId** | **String** | Identificador de la petición del registro de beneficiarios |  [optional]
**statusRequest** | [**StatusRequestEnum**](#StatusRequestEnum) | Indica sí la petición ya fue autorizada usando el token del usuario |  [optional]
**totalBeneficiaries** | **Integer** | Total de beneficiarios enviados en la petición |  [optional]

<a name="StatusRequestEnum"></a>
## Enum: StatusRequestEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
AUTHORIZED | &quot;AUTHORIZED&quot;
