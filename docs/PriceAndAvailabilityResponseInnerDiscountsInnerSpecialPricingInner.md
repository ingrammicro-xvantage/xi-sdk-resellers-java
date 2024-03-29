

# PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**discountType** | **String** | The type of discount being given to the customer. |  [optional] |
|**specialBidNumer** | **String** | Pre-approved special pricing/bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number where different line items have different bid numbers. Line-level bid numbers take precedence over header-level bid numbers. |  [optional] |
|**specialPricingDiscount** | **BigDecimal** | Special pricing discount amount given to the customer. |  [optional] |
|**specialPricingEffectiveDate** | **LocalDate** | The effective date of the special pricing available to the customer. |  [optional] |
|**specialPricingExpirationDate** | **LocalDate** | The expiration date of the special pricing available to the customer. |  [optional] |
|**specialPricingAvailableQuantity** | **Integer** | The available quantity of products with discounts. |  [optional] |
|**specialPricingMinQuantity** | **Integer** | The minimum quantity of products that have to be purchased to ensure the discount is applied. |  [optional] |
|**governmentDiscountType** | **String** | Type of Government Discount. *Currently, this discount is only available in the USA. |  [optional] |
|**governmentDiscountedCustomerPrice** | **BigDecimal** | Government Discounted Customer Price. *Currently, this discount is only available in the USA. |  [optional] |



