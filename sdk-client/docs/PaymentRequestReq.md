# PaymentRequestReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la solicitud de pago | 
**cancelReturnUrl** | **String** | Es la dirección URL a la que se redirigirá en caso de que el usuario cancele. |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**depositantAccount** | **String** | Es el número de cuenta CLABE donde se realizará el deposito. |  [optional]
**description** | **String** | Es la descripción de la solicitud de pago. |  [optional]
**dueDate** | [**LocalDate**](LocalDate.md) | Es la fecha de operación de la solicitud de pago. |  [optional]
**fromDate** | [**LocalDate**](LocalDate.md) | Es la fecha de inicio de la solicitud de pago.  |  [optional]
**method** | [**MethodEnum**](#MethodEnum) |  | 
**orderId** | **String** | Número de orden asignado por el cliente de Wire4 | 
**returnUrl** | **String** | Es la dirección URL a la que se redirigirá en caso de éxito. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Tipo de pago por paycash |  [optional]

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
CARD | &quot;CARD&quot;
CASH | &quot;CASH&quot;
SPEI | &quot;SPEI&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
RECURRENT | &quot;RECURRENT&quot;
ONE_OCCASION | &quot;ONE_OCCASION&quot;
