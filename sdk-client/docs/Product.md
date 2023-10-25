# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto del calgo que se aplicará de forma periodica | 
**billingPeriod** | [**BillingPeriodEnum**](#BillingPeriodEnum) | Periodo en el cual se aplicará el cargo, si no se especifica la propiedad frequency por defecto sera la unidad | 
**frequency** | **Integer** | La frecuencia en la que se aplicará el cargo, trabaja en conjunto con la propiedad billingPeriod | 
**name** | **String** | Nombre del producto sobre el cual se aplicará el cobro recurrente | 

<a name="BillingPeriodEnum"></a>
## Enum: BillingPeriodEnum
Name | Value
---- | -----
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;
YEARLY | &quot;YEARLY&quot;
