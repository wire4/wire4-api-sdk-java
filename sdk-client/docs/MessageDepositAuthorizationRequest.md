# MessageDepositAuthorizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el monto de la transferencia. |  [optional]
**beneficiaryAccount** | **String** | Es la cuenta del beneficiario. |  [optional]
**beneficiaryName** | **String** | Es el nombre del beneficiario. |  [optional]
**beneficiaryRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del beneficiario. |  [optional]
**claveRastreo** | **String** | Es la clave de rastreo de la transferencia. |  [optional]
**confirmDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la Fecha de confirmación de la transferencia. |  [optional]
**currencyCode** | **String** | Es el código de divisa de la transferencia. Es en el formato estándar ISO 4217 y es de 3 dígitos. Puede ser \&quot;MXN\&quot; o \&quot;USD\&quot;. |  [optional]
**depositDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de recepción de la transferencia. |  [optional]
**depositant** | **String** | Es el nombre del depositante en caso de que la transferencia se reciba en una cuenta de depositante. |  [optional]
**depositantClabe** | **String** | Es la cuenta CLABE del depositante en caso que la transferencia se reciba en una cuenta de depositante |  [optional]
**depositantEmail** | **String** | Es el Correo electrónico (email) del depositante en caso que la transferencia se reciba en una cuenta de depositante |  [optional]
**depositantRfc** | **String** | Es el Registro Federal de Contribuyentes (RFC) del depositante, en caso que la transferencia se reciba en una cuenta de depositante. |  [optional]
**description** | **String** | Es el concepto de la transferencia. |  [optional]
**monexDescription** | **String** | Es la descripción de Monex para la transferencia. |  [optional]
**monexTransactionId** | **String** | Es el identificador asignado por Monex a la transferencia. |  [optional]
**reference** | **String** | Es la referecia de la transferencia. |  [optional]
**senderAccount** | **String** | Es la cuenta del ordenante que podría ser un número celular (10 dígitos), una tarjeta de débito (TDD, de 16 dígitos) o Cuenta CLABE interbancaria (18 dígitos). |  [optional]
**senderBank** | [**MessageInstitution**](MessageInstitution.md) |  |  [optional]
**senderName** | **String** | Es el nombre del ordenante. |  [optional]
**senderRfc** | **String** | Es el Registro Federal de Contribuyente (RFC) del ordenante. |  [optional]
