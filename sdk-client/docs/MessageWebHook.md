# MessageWebHook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | Es la versión de esta API. |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de creación del mensaje. |  [optional]
**data** | **Object** | Es el objeto que contiene la información del evento. |  [optional]
**id** | **String** | Es el identificador del mensaje. |  [optional]
**livemode** | **Boolean** | Indica si proviene de un entorno productivo. |  [optional]
**object** | **String** | Tipo de objeto  que contiene el mensaje en el atributo &#x27;data&#x27;. Los posibles valores son:  &lt;ul&gt;&lt;li&gt;subscription&lt;/li&gt;, &lt;li&gt;beneficiary&lt;/li&gt;, &lt;li&gt;spei_outgoing&lt;/li&gt;, &lt;li&gt;spei_incoming&lt;/li&gt;, &lt;li&gt;spid_outgoing&lt;/li&gt;, &lt;li&gt;request_outgoing&lt;/li&gt;&lt;ul&gt;  |  [optional]
**pendingWebhooks** | **Integer** | Es el número de mensajes pendientes de enviar. |  [optional]
**request** | **String** | Es el identificador del recurso relacionado. |  [optional]
**type** | **String** | El tipo evento que se está enviando en la notificación. |  [optional]
