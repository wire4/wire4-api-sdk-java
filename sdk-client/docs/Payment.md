# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Es la cuenta emisora. |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. |  [optional]
**beneficiaryAccount** | **String** | Es la cuenta del beneficiario. |  [optional]
**beneficiaryBank** | [**Institution**](Institution.md) |  |  [optional]
**beneficiaryName** | **String** | Es el nombre del Beneficiario. |  [optional]
**cep** | [**MessageCEP**](MessageCEP.md) |  |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo de la transferencia. |  [optional]
**concept** | **String** | Es el concepto de pago. |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de aplicación de la transferencia. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**currencyCode** | **String** | Es el código de divisa de la transferencia. Es en el formato estándar de 3 dígitos. Ejemplo del peso mexicano: &lt;b&gt;MXP&lt;/b&gt;, ejemplo del dólar estadounidense: &lt;b&gt;USD&lt;/b&gt;. |  [optional]
**detentionMessage** | **String** | Es el mensaje proporcionado por Monex para la transferencia. |  [optional]
**errorMessage** | **String** | Es el mensaje de error, en caso de algún error se informará aquí. |  [optional]
**monexDescription** | **String** | Es la descripción de Monex. |  [optional]
**orderId** | **String** | Es el identificador asignado por la aplciación a la transferencia. |  [optional]
**paymentOrderId** | **Integer** | Es el identificador de la orden de pago en Monex. |  [optional]
**pendingReason** | **String** | Es la razón de porque esta pendiente aún cuando se autorizó la transferencia. |  [optional]
**reference** | **Integer** | Es la referencia numérica. |  [optional]
**statusCode** | **String** | Es el estado de la transferencia de la transferencia, los posibles valores son: &lt;b&gt;PENDING, COMPLETED, FAILED, CANCELLED&lt;/b&gt; |  [optional]
**transactionId** | **Integer** | Es el identificador de la transferencia asignado por Monex. |  [optional]
