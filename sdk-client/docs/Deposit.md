# Deposit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto de la transferencia |  [optional]
**beneficiaryAccount** | **String** | La cuenta del beneficiario |  [optional]
**beneficiaryName** | **String** | El nombre del beneficiario |  [optional]
**beneficiaryRfc** | **String** | El RFC del beneficiario |  [optional]
**cep** | [**MessageCEP**](MessageCEP.md) |  |  [optional]
**claveRastreo** | **String** | La clave de rastreo de la transferencia |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de confirmación del deposito |  [optional]
**currencyCode** | **String** | Código de moneda de la transferencia |  [optional]
**depositDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha del deposito |  [optional]
**depositant** | **String** | Depositante |  [optional]
**depositantClabe** | **String** | Cuenta CLABE interbancaria del depositante |  [optional]
**depositantEmail** | **String** | Email del depositante |  [optional]
**depositantRfc** | **String** | RFC del depositante |  [optional]
**description** | **String** | Descripción del traspaso |  [optional]
**monexDescription** | **String** | Descripción directa de Monex |  [optional]
**monexTransactionId** | **String** | Identificador de la transferencia en Monex |  [optional]
**reference** | **String** | La referencia del depósito |  [optional]
**senderAccount** | **String** | La cuenta del ordenante |  [optional]
**senderBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**senderName** | **String** | El nombre del ordenante |  [optional]
**senderRfc** | **String** | El RFC del ordenante |  [optional]
