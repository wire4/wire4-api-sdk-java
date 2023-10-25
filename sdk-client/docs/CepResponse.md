# CepResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBeneficiary** | **String** | Es la cuenta del beneficiario. |  [optional]
**accountSender** | **String** | Es la cuenta del ordenante. |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. |  [optional]
**available** | **Boolean** | Indica si el CEP se encuentra disponible o no. |  [optional]
**beneficiaryBankKey** | **String** | Es la clave del banco beneficiario el cual se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario. |  [optional]
**beneficiaryRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del beneficiario. |  [optional]
**cadenaOriginal** | **String** | Cadena original del CEP. |  [optional]
**captureDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de captura de la transferencia. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**certificateSerialNumber** | **String** | Número de serie del certificado. |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo. |  [optional]
**description** | **String** | Es la descripción de la transferencia. |  [optional]
**iva** | [**BigDecimal**](BigDecimal.md) | IVA de la transferencia. |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de operación de la transferencia. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**operationDateCep** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de abono registrada en el CEP.  Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**reference** | **String** | Es la referencia numérica de la transferencia. |  [optional]
**senderBankKey** | **String** | Es la clave del banco emisor el cual se puede obtener del recurso de las &lt;a href&#x3D;\&quot;#operation/getAllInstitutionsUsingGET\&quot;&gt;instituciones.&lt;/a&gt; |  [optional]
**senderName** | **String** | Es el nombre del emisor. |  [optional]
**senderRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del emisor. |  [optional]
**signature** | **String** | Firma del CEP.. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Es el tiop de CEP, puede ser: &lt;strong&gt;SPEI&lt;/strong&gt; o &lt;strong&gt;SPID&lt;/strong&gt;. |  [optional]
**urlZip** | **String** | La url al archivo zip del CEP, el cual contiene el xml y pdf |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SPEI | &quot;SPEI&quot;
SPID | &quot;SPID&quot;
