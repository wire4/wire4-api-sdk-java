# PaymentRequestCodiResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Es el Monto del pago. Ejemplo 1000.00 |  [optional]
**barcodeBase64** | **String** | Es la imagen QR en formato Base64 para el CODI®. |  [optional]
**barcodeUrl** | **String** | Es la dirección URL de la imagen QR para el CODI®. |  [optional]
**concept** | **String** | Es el concepto de pago. |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de creación. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Es la fecha de vencimiento. Ésta fecha viene en formato ISO 8601 con zona horaria, ejemplo: &lt;strong&gt;2020-10-27T11:03:15.000-06:00&lt;/strong&gt;. |  [optional]
**operations** | [**List&lt;CodiOperationResponseDTO&gt;**](CodiOperationResponseDTO.md) | Es el listado de pagos realizados sobre la petición. |  [optional]
**orderId** | **String** | Es el orderId asignado a la solicitud. |  [optional]
**phoneNumber** | **String** | Es el número de teléfono. |  [optional]
**status** | **String** | Es el estado (estatus) de la orden de pago. Los valores pueden ser: &lt;b&gt;RECEIVED, COMPLETED Y CANCELLED&lt;/b&gt; |  [optional]
**type** | **String** | Es el tipo de petición. Los valores pueden ser: &lt;b&gt;QR_CODE o PUSH_NOTIFICATION&lt;/b&gt; |  [optional]
