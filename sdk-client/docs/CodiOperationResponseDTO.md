# CodiOperationResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la operacion. Ejemplo: 1000.00 |  [optional]
**concept** | **String** | Es el concepto del pago. |  [optional]
**id** | **String** | Es el identificador de la operacion. |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de la operacion. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**paymentType** | **String** | Es el tipo de pago. |  [optional]
**status** | **String** | Es el estado (estatus) de la operación. Los valores pueden ser: &lt;b&gt;COMPLETED, CANCELLED Y POSTPONED&lt;/b&gt; |  [optional]
**transactionId** | **String** | Es el identificador de la transacción. |  [optional]
