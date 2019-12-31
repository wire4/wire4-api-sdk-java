# AccountSpid

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountLimit** | [**BigDecimal**](BigDecimal.md) | Monto límite permitido para la cuenta | 
**bankCodeBanxico** | **String** | Código banxico con una longitud de 5 dígitos, es requerido en caso de que la cuenta del beneficiario sea un número de celular |  [optional]
**beneficiaryAccount** | **String** | Cuenta del beneficiario debe ser una cuenta CLABE | 
**cancelReturnUrl** | **String** | Url a la que se redirigira en caso no exitoso |  [optional]
**email** | **List&lt;String&gt;** | Lista de email&#x27;s, este dato es opcional |  [optional]
**institution** | [**BeneficiaryInstitution**](BeneficiaryInstitution.md) |  | 
**kindOfRelationship** | **String** | Tipo de relación de la cuentaobtained of endpoint relationships | 
**numericReference** | **String** | Referencia numérica |  [optional]
**paymentConcept** | **String** | Concepto de pago |  [optional]
**relationship** | **String** | Código de relación de la cuenta, este valor debe ser igual a un valor obtenido del endpoint relationship | 
**returnUrl** | **String** | Url a la que se redireccionara en caso exitoso |  [optional]
**rfc** | **String** | Registro federal de contribuyentes |  [optional]
