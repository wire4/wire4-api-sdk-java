# MessageCEP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBeneficiary** | **String** | Cuenta del beneficiario |  [optional]
**accountSender** | **String** | Cuenta que envia la operación |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la operación |  [optional]
**available** | **Boolean** | Bander para saber si el cep esta disponible |  [optional]
**bankBeneficiary** | **String** | Clave del banco beneficiario |  [optional]
**bankSender** | **String** | Clave del banco que envia la operación |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario |  [optional]
**beneficiaryRfc** | **String** | RFC del beneficiario |  [optional]
**cadenaOriginal** | **String** | Cadena original emita por el SAT |  [optional]
**captureDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de captura |  [optional]
**certificateSerialNumber** | **String** | Numero de serie emitido por el SAT |  [optional]
**claveRastreo** | **String** | Clave de rastreo de la operación |  [optional]
**description** | **String** | Descripción de la operación |  [optional]
**iva** | [**BigDecimal**](BigDecimal.md) | Iva de la operación |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que se realizó la operación |  [optional]
**operationDateCep** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que genera el cep |  [optional]
**reference** | **String** | Referencia de la operación |  [optional]
**senderName** | **String** | Nombre de quien envia la operación |  [optional]
**senderRfc** | **String** | RFC de quien envia la operación |  [optional]
**signature** | **String** | Firma del Cep |  [optional]
**urlZip** | **String** | Url que contiene el PDF y XML del CEP proporcionado por banxico |  [optional]
