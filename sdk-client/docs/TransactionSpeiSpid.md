# TransactionSpeiSpid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. Se valida que sean máximo 20 dígitos y 2 decimales. Ejemplo 1000.00 | 
**beneficiaryAccount** | **String** | Cuenta del beneficiario, podría ser un número celular (10dígitos), tarjeta de débito (TDD) o Cuenta CLABE interbancaria (18 dígitos).  | 
**classificationId** | **String** | Es el identificador de la clasificación de la transferencia SPID. | 
**concept** | **String** | Es el concepto de la transferencia. | 
**currencyCode** | **String** | Código de moneda en la que opera la cuenta. |  [optional]
**email** | **List&lt;String&gt;** | Lista de correo electrónico (email) del beneficiario. Este campo es opcional. |  [optional]
**orderId** | **String** | Es la referencia de la transferencia asignada por el cliente. Ejemplo: dae9c6ae-8c7a-42e8-99f4-ebe90566efae | 
**reference** | **Integer** | Es la referencia numérica de la transferencia. | 
