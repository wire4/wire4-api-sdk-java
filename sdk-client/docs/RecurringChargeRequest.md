# RecurringChargeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelReturnUrl** | **String** | Es la dirección URL a la que se redirigirá en caso de que el usuario cancele. | 
**charges** | **Integer** | Número de cargos que se aplicarán a la tarjeta del cliente final a partir de la fecha del primer cargo | 
**customer** | [**Customer**](Customer.md) |  | 
**firstChargeDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que se aplicará el primer cargo a la tarjeta del cliente final  | 
**orderId** | **String** | Número de orden asignado por el cliente de Wire4 | 
**product** | [**Product**](Product.md) |  | 
**returnUrl** | **String** | Es la dirección URL a la que se redirigirá en caso de éxito. | 
