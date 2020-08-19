# SpidBeneficiaryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountLimit** | [**BigDecimal**](BigDecimal.md) | Monto límite permitido para la cuenta | 
**bank** | [**Institution**](Institution.md) |  |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario debe ser una cuenta CLABE | 
**email** | **List&lt;String&gt;** | Lista de email&#x27;s, este dato es opcional |  [optional]
**institution** | [**BeneficiaryInstitution**](BeneficiaryInstitution.md) |  | 
**kindOfRelationship** | **String** | Tipo de relación de la cuenta, este valor debe ser igual a uno de los obtenidos del recurso de consulta de relationships | 
**numericReferenceSpid** | **String** | Referencia numérica |  [optional]
**paymentConceptSpid** | **String** | Concepto de pago |  [optional]
**registerDate** | [**OffsetDateTime**](OffsetDateTime.md) | La fecha en la que se registro el beneficiario |  [optional]
**relationship** | **String** | Código de relación de la cuenta, este valor debe ser igual a uno de los obtenidos del recurso de consulta de  relationship | 
**rfc** | **String** | Registro federal de contribuyentes |  [optional]
**status** | **String** | El estado en el que se encuentra el registo del beneficiario |  [optional]
