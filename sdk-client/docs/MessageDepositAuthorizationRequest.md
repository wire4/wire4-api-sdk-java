# MessageDepositAuthorizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario |  [optional]
**beneficiaryName** | **String** | Nombre del beneficiario |  [optional]
**beneficiaryRfc** | **String** | RFC del beneficiario |  [optional]
**claveRastreo** | **String** | Clave de rastreo de la transferencia |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de confirmación de la transferencia |  [optional]
**currencyCode** | **String** | Código de moneda de la transferencia, puede ser MXP, USD |  [optional]
**depositDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de recepción de la transferencia |  [optional]
**depositant** | **String** | Nombre del depositante, en caso que la transferencia se reciba en una cuenta de depositante |  [optional]
**depositantClabe** | **String** | CLABE del depositante, en caso que la transferencia se reciba en una cuenta de depositante |  [optional]
**depositantEmail** | **String** | Correo electrónico del depositante, en caso que la transferencia se reciba en una cuenta de depositante |  [optional]
**depositantRfc** | **String** | RFC del depositante, en caso que la transferencia se reciba en una cuenta de depositante |  [optional]
**description** | **String** | Concepto de la transferencia |  [optional]
**monexDescription** | **String** | Descripción de Monex para la transferencia |  [optional]
**monexTransactionId** | **String** | Identificador asignado por Monex a la transferencia |  [optional]
**reference** | **String** | Referecia de la transferencia |  [optional]
**senderAccount** | **String** | Cuenta del ordenante, podría ser un número celular, TDD o Cuenta CLABE interbancaria |  [optional]
**senderBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**senderName** | **String** | Nombre del ordenante |  [optional]
**senderRfc** | **String** | RFC del ordenante |  [optional]
