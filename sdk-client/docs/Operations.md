# Operations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la petición |  [optional]
**company** | [**Compay**](Compay.md) |  |  [optional]
**description** | **String** | Descripción de la petición |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de vencimiento de la petición |  [optional]
**orderId** | **String** | Order id de la petición |  [optional]
**payment** | [**PaymentCODI**](PaymentCODI.md) |  |  [optional]
**phoneNumber** | **String** | Numero de telefono |  [optional]
**salesPoint** | [**SalesPoint**](SalesPoint.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estatus de la petición |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Tipo de petición de cobro |  [optional]

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
