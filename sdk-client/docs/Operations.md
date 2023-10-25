# Operations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la petición. |  [optional]
**company** | [**Compay**](Compay.md) |  |  [optional]
**description** | **String** | Es la descripción de la petición. |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de vencimiento de la petición |  [optional]
**orderId** | **String** | Es el order id de la petición. |  [optional]
**payment** | [**PaymentCODI**](PaymentCODI.md) |  |  [optional]
**phoneNumber** | **String** | Es el número de teléfono. |  [optional]
**salesPoint** | [**SalesPoint**](SalesPoint.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estatus de la petición |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Es el tipo de petición de cobro. |  [optional]

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

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PUSH_NOTIFICATION | &quot;PUSH_NOTIFICATION&quot;
QR_CODE | &quot;QR_CODE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
