# BillingTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transacción |  [optional]
**claveRastreo** | **String** | Clave de rastreo que se asignó a la transacción |  [optional]
**monexId** | **Integer** | Identificador de transaccion en banco monex |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha y hora de la transacción |  [optional]
**orderId** | **String** | Identificador de la orden |  [optional]
**paymentOrderId** | **String** | Identificador de la orden de pago |  [optional]
**transactionId** | **Integer** | Identificador de la transacción |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Tipo de transaccion IN | OUT |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
IN | &quot;IN&quot;
OUT | &quot;OUT&quot;
