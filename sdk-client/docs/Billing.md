# Billing

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto total de la factura |  [optional]
**emissionAt** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha y hora en que se emitió de la factura |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en que finaliza el periodo que se factura |  [optional]
**id** | **String** | Identificador de la factura |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de inicio del periodo que se factura |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estatus de la factura |  [optional]
**transactions** | [**List&lt;BillingTransaction&gt;**](BillingTransaction.md) |  |  [optional]
**urlPdf** | **String** | Url de la representación impresa en pdf de la factura |  [optional]
**urlXml** | **String** | Url del archivo xml de la factura |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PAID | &quot;PAID&quot;
OMMITED | &quot;OMMITED&quot;
WAITING_PAYMENT | &quot;WAITING_PAYMENT&quot;
EMISSION_PENDING | &quot;EMISSION_PENDING&quot;
