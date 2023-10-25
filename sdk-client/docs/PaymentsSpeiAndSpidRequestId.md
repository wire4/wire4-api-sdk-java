# PaymentsSpeiAndSpidRequestId

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorizationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en que el usuario propietario del token emitió la autorización |  [optional]
**requestDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en que se realizó la petición de registro de transacciones |  [optional]
**requestId** | **String** | Identificador de la petición del registro de transacciones |  [optional]
**spei** | [**List&lt;Payment&gt;**](Payment.md) | Lista de las transacciones spei registradas |  [optional]
**spid** | [**List&lt;Payment&gt;**](Payment.md) | Lista de las transacciones spid registradas |  [optional]
