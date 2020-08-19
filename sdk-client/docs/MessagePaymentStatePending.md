# MessagePaymentStatePending

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Cuenta del ordenante |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario |  [optional]
**beneficiaryBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario |  [optional]
**concept** | **String** | Concepto de la transferencia de salida |  [optional]
**currencyCode** | **String** | Código de la moneda de la transferencia de salida |  [optional]
**detentionMessage** | **String** | Mensaje de detención de Monex, indica la causa por la cuál esta detenida la operación en Monex |  [optional]
**errorMessage** | **String** | Mensaje de error |  [optional]
**orderId** | **String** | El identificador de la transferencia de salida |  [optional]
**paymentOrderId** | **Integer** | El identificador de la orden de pago de Monex de la transferencia de salida |  [optional]
**pendingReason** | **String** | Estatus que identifica la causa por la que la transferencia esta en pendiente, los posibles estatus son: FI&#x3D;Fondos Insuficientes | FM&#x3D;Firma mancomunada, en espera de ingreso de segundo token de autorización | DP&#x3D;Se detecto una transferencia duplicada que esta en espera de confirmación o de eliminación |  [optional]
**reference** | **Integer** | Referecia de la transferencia |  [optional]
**requestId** | **String** | El identificador, en esta API, de la petición de envío de la transferencia de salida |  [optional]
**statusCode** | **String** | El estado de la transferencia de salida, deberá ser PENDING |  [optional]
**transactionId** | **Integer** | El identificador de Monex de la transferencia de salida, podría no estar presente por lo que Usted debería hacer referencias mediate el paymentOrderID |  [optional]
