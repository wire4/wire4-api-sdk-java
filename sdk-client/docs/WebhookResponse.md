# WebhookResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | **List&lt;String&gt;** | Tipos de eventos de los cuales Wire4 te enviará información. |  [optional]
**name** | **String** | Es el nombre del webhook. |  [optional]
**secret** | **String** | Llave con la cual se debe de identificar que el webhook fue enviado por Wire4, para mayor información revisar la guía de notificaciones (https://wire4.mx/#/guides/notificaciones),  en la sección de  &lt;a href&#x3D;\&quot;https://wire4.mx/#/guides/notificaciones\&quot;&gt;\&quot;Comprobación de firmas de Webhook\&quot;.&lt;/a&gt; |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Es el estado (estatus) en el que se encuentra el webhook. |  [optional]
**url** | **String** | Es la dirección URL a la que Wire4 enviará las notificaciones cuando un evento ocurra. |  [optional]
**whUuid** | **String** | Es el identificador del webhook. Ejemplo: wh_54a832866f784b439bc625c0f4e04e12. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
DELETED | &quot;DELETED&quot;
