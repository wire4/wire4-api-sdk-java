# CepResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBeneficiary** | **String** | Cuenta del beneficiario |  [optional]
**accountSender** | **String** | Cuenta del ordenante |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia |  [optional]
**available** | **Boolean** | Indica si o no el CEP se encuentra disponible |  [optional]
**beneficiaryBankKey** | **String** | Clave del banco beneficiario |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario |  [optional]
**beneficiaryRfc** | **String** | RFC del beneficiario |  [optional]
**cadenaOriginal** | **String** | Cadena original del CEP |  [optional]
**captureDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de captura de la transferencia |  [optional]
**certificateSerialNumber** | **String** | Número de serie del certificado |  [optional]
**claveRastreo** | **String** | Clave de rastreo |  [optional]
**description** | **String** | Descripción de la transferencia |  [optional]
**iva** | [**BigDecimal**](BigDecimal.md) | IVA de la transferencia |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de operación de la transferencia |  [optional]
**operationDateCep** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de abono registrada en el CEP |  [optional]
**reference** | **String** | Referencia numérica de la transferencia |  [optional]
**senderBankKey** | **String** | Clave del banco emisor |  [optional]
**senderName** | **String** | Nombre del emisor |  [optional]
**senderRfc** | **String** | RFC del emisor |  [optional]
**signature** | **String** | Firma del CEP |  [optional]
**urlZip** | **String** | La url al archivo zip del CEP, el cual contiene el xml y pdf |  [optional]
