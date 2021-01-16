# CepSearchBanxico

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. Ejemplo 1000.00 | 
**beneficiaryAccount** | **String** | Es la cuenta de beneficiario. | 
**beneficiaryBankKey** | **String** | Clave del banco beneficiario. Éste valor no esta presente si obtiene de la cuenta del beneficiario, en caso de que sea un número celular éste campo es requerido. se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo de la transferencia. | 
**operationDate** | **String** | Es la fecha de operación de la transferencia, formato: dd-MM-yyyy. | 
**reference** | **String** | Es la referencia numérica de la transferencia. Se valida hasta 7 dígitos. |  [optional]
**senderAccount** | **String** | Es la cuenta ordenante, es requerida cuando se no se envía la clave del banco ordenante. |  [optional]
**senderBankKey** | **String** | Es la clave del banco ordenante, es requerida cuando no se envía la cuenta ordenante.  Se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; |  [optional]
