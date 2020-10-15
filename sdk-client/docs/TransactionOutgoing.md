# TransactionOutgoing

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia | 
**beneficiary** | [**Account**](Account.md) |  |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario, podría ser un número celular, TDD o Cuenta CLABE interbancaria  | 
**beneficiaryBankKey** | **String** | La clave del banco beneficiario, proprocionada por BANXICO, este campo solo es obligatario cuando la cuenta beneficiaria es un número celular (*). |  [optional]
**concept** | **String** | Concepto de la transferencia | 
**currencyCode** | **String** | Código de moneda en la que opera la cuenta | 
**email** | **List&lt;String&gt;** | Lista de email del beneficiario,es opcional |  [optional]
**orderId** | **String** | Referencia de la transferencia asignada por el cliente | 
**reference** | **Integer** | Referencia numérica de la transferencia | 
