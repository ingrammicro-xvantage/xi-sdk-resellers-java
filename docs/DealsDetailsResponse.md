

# DealsDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dealId** | **String** | Deal/Special bid number. |  [optional] |
|**version** | **String** | Most recent version number of the deal. |  [optional] |
|**endUser** | **String** | The end user/customer&#39;s name. |  [optional] |
|**extendedMsrp** | **BigDecimal** | Extended MSRP - Manufacturer Suggested Retail Price X Quantity. |  [optional] |
|**vendor** | **String** | The vendor&#39;s name. |  [optional] |
|**dealReceivedOn** | **LocalDate** | The date on which the deal starts. |  [optional] |
|**dealExpiryDate** | **LocalDate** | Expiration date of the deal/Special bid. |  [optional] |
|**priceProtectionEndDate** | **LocalDate** | The date on which the price protection will end. |  [optional] |
|**currencyCode** | **String** | Country specific currency code. |  [optional] |
|**endUserInfo** | [**List&lt;RenewalsDetailsResponseEndUserInfoInner&gt;**](RenewalsDetailsResponseEndUserInfoInner.md) |  |  [optional] |
|**products** | [**List&lt;DealsDetailsResponseProductsInner&gt;**](DealsDetailsResponseProductsInner.md) |  |  [optional] |


