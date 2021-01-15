# SalesPointFound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessIp** | **String** | Es la dirección IP desde la que accede el punto de venta a wire4 y a la que se devuelven las notificaciones. |  [optional]
**account** | **String** | Es la cuenta registra para el punto de venta. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha en la que se creó el punto de venta. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**name** | **String** | Es el nombre del punto de venta. |  [optional]
**publicId** | **String** | Es el identificador del punto de venta. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Es el estado (estatus) del punto de venta. Puede ser \&quot;ACTIVE\&quot; o \&quot;INACTIVO\&quot;. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha en la que se actualizó el punto de venta. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
