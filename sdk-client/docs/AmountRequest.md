# AmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountLimit** | [**BigDecimal**](BigDecimal.md) | Es el nuevo monto límite que reemplazará al actual, un monto de 0.0 implica que no hay límite. | 
**cancelReturnUrl** | **String** | Es la dirección URL a la que se redirigirá en caso de que el cliente cancele el registro. Se valida hasta 512 caracteres. | 
**currencyCode** | **String** | Es el código de divisa de la cuenta. Es en el formato estándar de 3 dígitos, por ejemplo para el peso mexicano: &lt;b&gt;MXP&lt;/b&gt;, para el dólar estadounidense: &lt;b&gt;USD&lt;/b&gt;. | 
**previousAmountLimit** | [**BigDecimal**](BigDecimal.md) | Es el monto límite registrado actualmente, un monto de 0.0 implica que no hay límite. | 
**returnUrl** | **String** | Es la dirección URL a la que se redirigirá en caso de éxito. Se valida hasta 512 caracteres. | 
