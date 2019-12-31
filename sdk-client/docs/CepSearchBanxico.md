# CepSearchBanxico

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia | 
**beneficiaryAccount** | **String** | Cuenta de beneficiario | 
**beneficiaryBankKey** | **String** | Clave del banco beneficiario, se puede obtener este valor del listado de institucines &#x27;/institutions&#x27;. Si este valor no esta presente se obtiene de la cuenta del beneficiario, si la cuenta de beneficiario es un número celular este campo es requerido |  [optional]
**claveRastreo** | **String** | Clave de rastreo de la transferencia | 
**operationDate** | **String** | Fecha de operación de la transferencia, formato: dd-MM-yyyy | 
**reference** | **String** | Referencia numérica de la transferencia |  [optional]
**senderAccount** | **String** | Cuenta ordenante, es requerida cuando se no se envía la clave del banco ordenante  |  [optional]
**senderBankKey** | **String** | Clave del banco ordenante, se puede obtener este valor del listado de institucines &#x27;/institutions&#x27;. Es requerida cuando no se envía la cuenta ordenante |  [optional]
