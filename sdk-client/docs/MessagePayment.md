# MessagePayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Es la cuenta del ordenante. |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. |  [optional]
**beneficiaryAccount** | **String** | Es la cuenta del beneficiario. |  [optional]
**beneficiaryBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**beneficiaryName** | **String** | Es el nombre del beneficiario. |  [optional]
**cep** | [**MessageCEP**](MessageCEP.md) |  |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo de la transferencia. |  [optional]
**concept** | **String** | Es el concepto de la transferencia de salida. |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de confirmación de la transferencia de salida. |  [optional]
**currencyCode** | **String** | Código de divisa de la transferencia de salida. Es en el formato estándar ISO 4217 y es de 3 dígitos. Ejemplo: \&quot;MXN\&quot;. |  [optional]
**detentionMessage** | **String** | Es el mensaje de detención de Monex de la transferencia de salida. |  [optional]
**errorMessage** | **String** | Mensaje de error. |  [optional]
**monexDescription** | **String** | La descripción de Monex de la transferencia de salida. |  [optional]
**orderId** | **String** | Es el identificador de la transferencia de salida. |  [optional]
**paymentOrderId** | **Integer** | Es el identificador de la orden de pago de Monex de la transferencia de salida. |  [optional]
**pendingReason** | **String** | Es la razón de porque está pendiente aún cuando se autorizó la transferencia. |  [optional]
**reference** | **Integer** | Es la referecia de la transferencia. |  [optional]
**requestId** | **String** | El identificador en esta API de la petición de envío de la transferencia de salida. |  [optional]
**statusCode** | **String** | Es el estado de la transferencia de salida. |  [optional]
**transactionId** | **Integer** | Es el identificador de Monex de la transferencia de salida. |  [optional]
