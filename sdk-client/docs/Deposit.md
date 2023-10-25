# Deposit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. |  [optional]
**beneficiaryAccount** | **String** | Es la cuenta del beneficiario. |  [optional]
**beneficiaryName** | **String** | Es el nombre del beneficiario. |  [optional]
**beneficiaryRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del beneficiario. |  [optional]
**cep** | [**MessageCEP**](MessageCEP.md) |  |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo de la transferencia. |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de confirmación del deposito. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**currencyCode** | **String** | Es el código de divisa de la transferencia. Es en el formato estándar de 3 dígitos, por ejemplo para el peso mexicano: &lt;b&gt;MXP&lt;/b&gt;, para el dólar estadounidense: &lt;b&gt;USD&lt;/b&gt;. |  [optional]
**depositDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha del deposito.  Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**depositant** | **String** | Es el depositante. |  [optional]
**depositantAlias** | **String** | Es el alias asignado a la cuenta CABLE del depositante. |  [optional]
**depositantClabe** | **String** | Es la Cuenta CLABE interbancaria (de 18 dígitos) del depositante. |  [optional]
**depositantEmail** | **String** | Es el correo electrónico (email) del depositante. |  [optional]
**depositantRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del depositante. |  [optional]
**description** | **String** | Es la descripción del traspaso. |  [optional]
**monexDescription** | **String** | Es la descripción directa de Monex. |  [optional]
**monexTransactionId** | **String** | es el identificador de la transferencia en Monex. |  [optional]
**reference** | **String** | Es la referencia del depósito. |  [optional]
**senderAccount** | **String** | Es la cuenta del ordenante. |  [optional]
**senderBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**senderName** | **String** | Es el nombre del ordenante. |  [optional]
**senderRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) de la cuenta ordenante. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Es el estatus del depósito (COMPLETED/RETURNED). |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETED | &quot;COMPLETED&quot;
FAILED | &quot;FAILED&quot;
CANCELLED | &quot;CANCELLED&quot;
AUTHORIZING | &quot;AUTHORIZING&quot;
REJECTED | &quot;REJECTED&quot;
