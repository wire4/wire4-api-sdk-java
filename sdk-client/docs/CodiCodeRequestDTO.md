# CodiCodeRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto del pago CODI® |  [optional]
**beneficiary2** | [**BeneficiaryDTO**](BeneficiaryDTO.md) |  |  [optional]
**concept** | **String** | Descripción del pago CODI®, no debe contener letras con acentos ni caracteres especiales | 
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de operación pago CODI®, formato: yyyy-MM-dd&#x27;T&#x27;HH:mm:ss |  [optional]
**metadata** | **String** | Campo de metada CODI®, longitud máxima determinada por configuracion de la empresa, por defecto 100 caracteres |  [optional]
**orderId** | **String** | Referencia de la transferencia asignada por el cliente | 
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | El tipo de pago ya sea en una ocasión (ONE_OCCASION) o recurrente (RECURRENT) | 
**phoneNumber** | **String** | Número de teléfono móvil en caso de ser un pago CODI® usando &#x27;PUSH_NOTIFICATION&#x27; estecampo sería obligatorio |  [optional]
**reference** | **Integer** | Referencia numérica del pago CODI®. Debe ser de 7 dígitos | 
**type** | [**TypeEnum**](#TypeEnum) | El tipo de solicitud QR o PUSH para pago con CODI® | 

<a name="PaymentTypeEnum"></a>
## Enum: PaymentTypeEnum
Name | Value
---- | -----
ONE_OCCASION | &quot;ONE_OCCASION&quot;
RECURRENT | &quot;RECURRENT&quot;
RECURRENT_NO_RECURRENT | &quot;RECURRENT_NO_RECURRENT&quot;
UNKNOWN | &quot;UNKNOWN&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PUSH_NOTIFICATION | &quot;PUSH_NOTIFICATION&quot;
QR_CODE | &quot;QR_CODE&quot;
UNKNOWN | &quot;UNKNOWN&quot;
