# CodiOperationsFiltersRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountFrom** | [**BigDecimal**](BigDecimal.md) | Es el monto minimo. Se permiten dos decimales. Ejemplo 1000.00 |  [optional]
**amountTo** | [**BigDecimal**](BigDecimal.md) | Es el monto máximo. Se permiten dos decimales. Ejemplo 1000.00 |  [optional]
**operationDateFrom** | [**LocalDate**](LocalDate.md) | Es el filtro de fecha de operación \&quot;desde\&quot;. |  [optional]
**operationDateTo** | [**LocalDate**](LocalDate.md) | Es el filtro de fecha de operación \&quot;hasta\&quot;. |  [optional]
**orderId** | **String** | Es el order id de la petición. |  [optional]
**requestDateFrom** | [**LocalDate**](LocalDate.md) | Es el filtro de fecha de petición \&quot;desde\&quot;. |  [optional]
**requestDateTo** | [**LocalDate**](LocalDate.md) | Es el filtro de fecha de petición \&quot;hasta\&quot;. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Es el estado (estatus) de la petición. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RECEIVED | &quot;RECEIVED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
