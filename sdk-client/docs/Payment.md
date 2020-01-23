# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Cuenta emisora |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario |  [optional]
**beneficiaryBank** | [**Institution**](Institution.md) |  |  [optional]
**beneficiaryName** | **String** | Nombre del Beneficiario |  [optional]
**cep** | [**MessageCEP**](MessageCEP.md) |  |  [optional]
**claveRastreo** | **String** | Clave de rastreo de la transferencia |  [optional]
**concept** | **String** | Concepto de pago |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de aplicación de la transferencia |  [optional]
**currencyCode** | **String** | Código de moneda de la transferencia |  [optional]
**detentionMessage** | **String** | Mensaje proporcionado por Monex para la transferencia |  [optional]
**monexDescription** | **String** | Descripción |  [optional]
**orderId** | **String** | Identificador asignado por la aplciación a la transferencia |  [optional]
**paymentOrderId** | **Integer** | Identificador de la orden de pago en Monex |  [optional]
**reference** | **Integer** | Referencia numérica |  [optional]
**statusCode** | **String** | Estado de la transferencia de la transferencia, los posibles valores son: PENDING, COMPLETED, FAILED, CANCELLED |  [optional]
**transactionId** | **Integer** | Identificador de la transferencia asignado por Monex |  [optional]
