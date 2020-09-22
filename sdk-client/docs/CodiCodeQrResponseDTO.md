# CodiCodeQrResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto del pago CODI® |  [optional]
**barcodeBase64** | **String** | El código QR en su represantación base 64 |  [optional]
**barcodeUrl** | **String** | La URL del código QR |  [optional]
**concept** | **String** | Descripción del pago CODI® |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de creación del código QR para pago CODI® |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de operación del pago CODI® |  [optional]
**orderId** | **String** | Referencia de la transferencia asignada por el cliente |  [optional]
**phoneNumber** | **String** | Número de teléfono móvil en caso de ser un pago CODI® usando &#x27;PUSH_NOTIFICATION&#x27; |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | El estado del código QR para pago CODI® |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | El tipo de código QR para pago con CODI® |  [optional]

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
