# CodiCodeRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto del pago CODI® |  [optional]
**concept** | **String** | Descripción del pago CODI® | 
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de operación pago CODI®, formato: yyyy-MM-dd&#x27;T&#x27;HH:mm:ss | 
**orderId** | **String** | Referencia de la transferencia asignada por el cliente | 
**phoneNumber** | **String** | Número de teléfono móvil en caso de ser un pago CODI® usando &#x27;PUSH_NOTIFICATION&#x27; estecampo sería obligatorio |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | El tipo de código QR para pago con CODI® | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PUSH_NOTIFICATION | &quot;PUSH_NOTIFICATION&quot;
QR_CODE | &quot;QR_CODE&quot;
