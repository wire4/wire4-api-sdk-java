# SalesPointFound

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessIp** | **String** | Ip desde la que accede el punto de venta a wire4 y a la que se devuelven las notificaciones |  [optional]
**account** | **String** | Cuenta registra para el punto de venta |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que se creó el punto de venta |  [optional]
**name** | **String** | Nombre del punto de venta |  [optional]
**publicId** | **String** | Identificador del punto de venta |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Estatus ACTIVO/INACTIVO el punto de venta |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha en la que se actualizó el punto de venta |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
