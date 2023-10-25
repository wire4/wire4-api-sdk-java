# PaymentRequestReportDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** |  |  [optional]
**cancelReturnUrl** | **String** |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**description** | **String** |  |  [optional]
**dueDate** | **String** |  |  [optional]
**failedCharges** | [**List&lt;FailedChargesDataDTO&gt;**](FailedChargesDataDTO.md) |  |  [optional]
**orderId** | **String** |  |  [optional]
**returnUrl** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**successCharge** | [**SuccessDataDTO**](SuccessDataDTO.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
REQUESTED | &quot;REQUESTED&quot;
PAID | &quot;PAID&quot;
CANCELLED | &quot;CANCELLED&quot;
