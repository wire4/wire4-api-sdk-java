# MessageCEP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountBeneficiary** | **String** | Es la cuenta del beneficiario. |  [optional]
**accountSender** | **String** | Es la cuenta que envía la operación. |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la operación. |  [optional]
**available** | **Boolean** | Indica sí el CEP está disponible. |  [optional]
**bankBeneficiary** | **String** | Es la clave del banco beneficiario. |  [optional]
**bankSender** | **String** | Es la clave del banco que envía la operación. |  [optional]
**beneficiaryName** | **String** | Es el nombre del beneficiario. |  [optional]
**beneficiaryRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del beneficiario. |  [optional]
**cadenaOriginal** | **String** | Es la cadena original emitida por el Servicio de Administración Tributaria (SAT). |  [optional]
**captureDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de captura. |  [optional]
**certificateSerialNumber** | **String** | Es el número de serie emitido por el SAT |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo de la operación. |  [optional]
**description** | **String** | Es la descripción de la operación. |  [optional]
**iva** | [**BigDecimal**](BigDecimal.md) | Es el Impuesto al Valor Agregado (IVA) de la operación. |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha en la que se realizó la operación. |  [optional]
**operationDateCep** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha en la que se genera el CEP. |  [optional]
**reference** | **String** | Es la Referencia de la operación |  [optional]
**senderName** | **String** | Es el nombre de quién envía la operación. |  [optional]
**senderRfc** | **String** | Es el Registro Federal de Contrinuyentes (RFC) de quién envía la operación. |  [optional]
**signature** | **String** | Firma del CEP |  [optional]
**urlZip** | **String** | Dirección URL de descarga del archivo ZIP que contiene el PDF y XML del CEP proporcionado por BANXICO |  [optional]
