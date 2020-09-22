# PaymentRequestCodiResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Monto del pago. |  [optional]
**barcodeBase64** | **String** | Imagen QR en formato Base64 para el CODI®. |  [optional]
**barcodeUrl** | **String** | URL de la imagen QR para el CODI®. |  [optional]
**concept** | **String** | Concepto de pago. |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de creación. |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de vencimiento. |  [optional]
**operations** | [**List&lt;CodiOperationResponseDTO&gt;**](CodiOperationResponseDTO.md) | Listado de pagos realizados sobre la petición. |  [optional]
**orderId** | **String** | OrderId asignada a la solicitud. |  [optional]
**phoneNumber** | **String** | Numero de teléfono. |  [optional]
**status** | **String** | Estatus de la orden de pago. |  [optional]
**type** | **String** | Tipo de petición. |  [optional]
