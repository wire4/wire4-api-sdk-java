# CodiOperationsFiltersRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountFrom** | [**BigDecimal**](BigDecimal.md) | Monto minimo, dos decimales |  [optional]
**amountTo** | [**BigDecimal**](BigDecimal.md) | Monto máximo,dos decimales |  [optional]
**operationDateFrom** | [**LocalDate**](LocalDate.md) | Fecha de operación desde |  [optional]
**operationDateTo** | [**LocalDate**](LocalDate.md) | Fecha de operación hasta |  [optional]
**orderId** | **String** | Order id de la petición |  [optional]
**requestDateFrom** | [**LocalDate**](LocalDate.md) | Fecha de petición desde |  [optional]
**requestDateTo** | [**LocalDate**](LocalDate.md) | Fecha de petición hasta |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estatus de petición |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RECEIVED | &quot;RECEIVED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
