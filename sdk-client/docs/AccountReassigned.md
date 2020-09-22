# AccountReassigned

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountLimit** | [**BigDecimal**](BigDecimal.md) | Monto límite permitido registrado para la cuenta | 
**bank** | [**Institution**](Institution.md) |  |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario, podría ser teléfono celular, TDD o cuenta CLABE | 
**currencyCode** | **String** | Código de moneda, este dato es opcional, al registrar una cuenta si no se cuenta con este valor se asignara MXP |  [optional]
**email** | **List&lt;String&gt;** | Lista de email&#x27;s, este dato es opcional |  [optional]
**institution** | [**BeneficiaryInstitution**](BeneficiaryInstitution.md) |  |  [optional]
**kindOfRelationship** | **String** | Tipo de relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships. &lt;br&gt; Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta. | 
**numericReferenceSpei** | **String** | Referencia numérica a utilizar cuando se realice una transferencia y no se especifique una referencia |  [optional]
**paymentConceptSpei** | **String** | Concepto de pago a utilizar cuando se realice una transferencia y no se especifique un concepto |  [optional]
**person** | [**Person**](Person.md) |  |  [optional]
**registerDate** | [**OffsetDateTime**](OffsetDateTime.md) | La fecha en la que se registro el beneficiario |  [optional]
**relationship** | **String** | Relación con el propietario de la cuenta, para registrar una cuenta este valor se debe obtener  del recurso relationships. &lt;br&gt; Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta. | 
**rfc** | **String** | Registro federal de contribuyentes de la persona o institución propietaria de la cuenta. &lt;br&gt; Nota: Si en la respuesta de Monex esta propiedad es nula, tampoco estará presente en esta respuesta. | 
**status** | **String** | El estado (status) en el que se encuentra el registro del beneficiario |  [optional]
