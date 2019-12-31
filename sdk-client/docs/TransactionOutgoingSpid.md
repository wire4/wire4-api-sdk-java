# TransactionOutgoingSpid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia | 
**beneficiaryAccount** | **String** | Cuenta del beneficiario, podría ser un numero celular, TDD o Cuenta CLABE interbancaria  | 
**cancelReturnUrl** | **String** | Url a la que se redirigirá en caso de error | 
**classificationId** | **String** | El identificador de la clasificación de la transferencia SPID | 
**currencyCode** | **String** | Código de moneda en la que opera la cuenta | 
**email** | **List&lt;String&gt;** | Lista de email del beneficiario,es opcional |  [optional]
**numericReferenceSpid** | **Integer** | Referencia numérica de la transferencia | 
**orderId** | **String** | Referencia de la transferencia asignada por el cliente | 
**paymentConceptSpid** | **String** | Concepto de la transferencia | 
**returnUrl** | **String** | Url a la que se redirigirá en caso de exito | 
