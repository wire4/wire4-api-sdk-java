# PaymentCODI

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto del pago |  [optional]
**description** | **String** | Descripción del pago |  [optional]
**errorMessage** | **String** | Mensaje de error |  [optional]
**id** | **String** | Identificador del pago |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en que se efectuo el pago |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estatus del pago |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACCEPTED | &quot;ACCEPTED&quot;
RECEIVED | &quot;RECEIVED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
POSTPONED | &quot;POSTPONED&quot;
REJECTED | &quot;REJECTED&quot;
REVERSED | &quot;REVERSED&quot;
PENDING | &quot;PENDING&quot;
