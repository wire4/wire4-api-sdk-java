# MessageCEP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBeneficiary** | **String** | Cuenta del beneficiario |  [optional]
**accountSender** | **String** | Cuenta que envia la operación |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la operación |  [optional]
**available** | **Boolean** | Indica sí el CEP está disponible |  [optional]
**bankBeneficiary** | **String** | Clave del banco beneficiario |  [optional]
**bankSender** | **String** | Clave del banco que envía la operación |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario |  [optional]
**beneficiaryRfc** | **String** | RFC del beneficiario |  [optional]
**cadenaOriginal** | **String** | Cadena original emita por el SAT |  [optional]
**captureDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de captura |  [optional]
**certificateSerialNumber** | **String** | Número de serie emitido por el SAT |  [optional]
**claveRastreo** | **String** | Clave de rastreo de la operación |  [optional]
**description** | **String** | Descripción de la operación |  [optional]
**iva** | [**BigDecimal**](BigDecimal.md) | IVA de la operación |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que se realizó la operación |  [optional]
**operationDateCep** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que genera el CEP |  [optional]
**reference** | **String** | Referencia de la operación |  [optional]
**senderName** | **String** | Nombre de quién envía la operación |  [optional]
**senderRfc** | **String** | RFC de quién envía la operación |  [optional]
**signature** | **String** | Firma del CEP |  [optional]
**urlZip** | **String** | Dirección URL de descarga del archivo ZIP que contiene el PDF y XML del CEP proporcionado por BANXICO |  [optional]
