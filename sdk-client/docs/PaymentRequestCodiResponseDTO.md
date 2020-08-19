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
**id** | **String** | Identificador de la operacion. |  [optional]
**operationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Fecha de la operacion. |  [optional]
**operations** | [**List&lt;PaymentRequestCodiResponseDTO&gt;**](PaymentRequestCodiResponseDTO.md) | Listado de pagos realizados sobre la petición. |  [optional]
**orderId** | **String** | OrderId asignada a la solicitud. |  [optional]
**paymentType** | **String** | Tipo de pago. |  [optional]
**phoneNumber** | **String** | Numero de teléfono. |  [optional]
**status** | **String** | Estatus de la orden de pago. |  [optional]
**transactionId** | **String** | Identificador de la transacción. |  [optional]
**type** | **String** | Tipo de petición. |  [optional]
