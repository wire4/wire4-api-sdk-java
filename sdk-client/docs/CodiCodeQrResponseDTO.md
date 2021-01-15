# CodiCodeQrResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto del pago CODI®. |  [optional]
**barcodeBase64** | **String** | El código QR en su represantación base 64. |  [optional]
**barcodeUrl** | **String** | Es la dirección URL del código QR. |  [optional]
**concept** | **String** | Es la descripción del pago CODI®. |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de creación del código QR para pago CODI®. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de operación del pago CODI®. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**orderId** | **String** | Es la referencia de la transferencia asignada por el cliente. |  [optional]
**phoneNumber** | **String** | Es el Número de teléfono móvil en caso de ser un pago CODI® usando \&quot;PUSH_NOTIFICATION\&quot;. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | El estado del código QR para pago CODI®. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Es el tipo de código QR para pago con CODI®. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RECEIVED | &quot;RECEIVED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PUSH_NOTIFICATION | &quot;PUSH_NOTIFICATION&quot;
QR_CODE | &quot;QR_CODE&quot;
