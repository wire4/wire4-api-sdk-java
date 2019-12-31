# AccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountLimit** | [**BigDecimal**](BigDecimal.md) | Monto límite permitido registrado para la cuenta | 
**bank** | [**Institution**](Institution.md) |  |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario, podría ser teléfono celular, TDD o cuenta CLABE | 
**email** | **List&lt;String&gt;** | Lista de email&#x27;s, este dato es opcional |  [optional]
**institution** | [**BeneficiaryInstitution**](BeneficiaryInstitution.md) |  |  [optional]
**kindOfRelationship** | **String** | Tipo de relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships | 
**numericReferenceSpei** | **String** | Referencia numérica a utilizar cuando se realice una transferencia y no se especifique una referencia |  [optional]
**paymentConceptSpei** | **String** | Concepto de pago a utilizar cuando se realice una transferencia y no se especifique un concepto |  [optional]
**person** | [**Person**](Person.md) |  |  [optional]
**relationship** | **String** | Relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships | 
**rfc** | **String** | Registro federal de contribuyentes de la persona o institución propietaria de la cuenta | 
