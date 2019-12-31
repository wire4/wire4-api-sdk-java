# MessagePayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Cuenta del ordenante |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario |  [optional]
**beneficiaryBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario |  [optional]
**cep** | [**MessageCEP**](MessageCEP.md) |  |  [optional]
**claveRastreo** | **String** | Clave de rastreo de la transferencia |  [optional]
**concept** | **String** | Concepto de la transferencia de salida |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de confirmación de la transferencia de salida |  [optional]
**currencyCode** | **String** | Código de la moneda de la transferencia de salida |  [optional]
**detentionMessage** | **String** | Mensaje de detención de Monex de la transferencia de salida |  [optional]
**monexDescription** | **String** | La descripción de Monex de la transferencia de salida |  [optional]
**orderId** | **String** | El identificador de la transferencia de salida |  [optional]
**paymentOrderId** | **Integer** | El identificador de la orden de pago de Monex de la transferencia de salida |  [optional]
**reference** | **Integer** | Referecia de la transferencia |  [optional]
**requestId** | **String** | El identificador, en esta API, de la petición de envío de la transferencia de salida |  [optional]
**statusCode** | **String** | El estado de la transferencia de salida |  [optional]
**transactionId** | **Integer** | El identificador de Monex de la transferencia de salida |  [optional]
