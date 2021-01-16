# MessagePaymentStatePending

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Es la cuenta del ordenante. |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. |  [optional]
**beneficiaryAccount** | **String** | Es la cuenta del beneficiario. |  [optional]
**beneficiaryBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**beneficiaryName** | **String** | Es el nombre del beneficiario. |  [optional]
**concept** | **String** | Es el concepto de la transferencia de salida. |  [optional]
**currencyCode** | **String** | Código de divisa de la transferencia de salida. Es en el formato estándar ISO 4217 y es de 3 dígitos. Ejemplo: \&quot;MXN\&quot;. |  [optional]
**detentionMessage** | **String** | Es el Mensaje de detención de Monex, indica la causa por la cuál esta detenida la operación en Monex. |  [optional]
**errorMessage** | **String** | Es el mensaje de error. |  [optional]
**orderId** | **String** | El identificador de la transferencia de salida. |  [optional]
**paymentOrderId** | **Integer** | Es el identificador de la orden de pago de Monex de la transferencia de salida. |  [optional]
**pendingReason** | **String** | Es el esaado que identifica la causa por la que la transferencia se ecuentra detenida o  pendiente de procesarse. Los posibles estados son: &lt;ul&gt;&lt;li&gt;FI&#x3D;Fondos Insuficientes&lt;/li&gt;&lt;li&gt;FM&#x3D;Firma mancomunada, en espera de ingreso de segundo token de autorización&lt;/li&gt;&lt;li&gt;DP&#x3D;Se detecto una transferencia duplicada que esta en wspera de confirmación o de eliminación&lt;/li&gt;&lt;/ul&gt; |  [optional]
**reference** | **Integer** | Es la referecia de la transferencia. |  [optional]
**requestId** | **String** | Es el identificador, en esta API, de la petición de envío de la transferencia de salida. |  [optional]
**statusCode** | **String** | Es el estado (estatus) de la transferencia de salida. Deberá ser \&quot;PENDING\&quot;. |  [optional]
**transactionId** | **Integer** | Es el identificador de Monex de la transferencia de salida, podría no estar presente por lo que Usted debería hacer referencias mediate el paymentOrderID. |  [optional]
