

# OrderDetailB2B


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ingramOrderNumber** | **String** | The IngramMicro sales order number. |  [optional] |
|**ingramOrderDate** | **String** | The IngramMicro sales order date. |  [optional] |
|**orderType** | **String** | The IngramMicro sales order type. |  [optional] |
|**customerOrderNumber** | **String** | The reseller&#39;s order number for reference in their system. |  [optional] |
|**endCustomerOrderNumber** | **String** | The end customer&#39;s order number for reference in their system. |  [optional] |
|**webOrderId** | **String** | The web order id of the order. |  [optional] |
|**vendorSalesOrderNumber** | **String** | The vendor&#39;s order number for reference in their system |  [optional] |
|**ingramPurchaseOrderNumber** | **String** | Ingram purchase order number. |  [optional] |
|**orderStatus** | **String** | The header-level status of the order. One of- Shipped, Canceled, Backordered, Processing, On Hold, Delivered. |  [optional] |
|**orderTotal** | **Double** | The total cost for the order, includes subtotal, freight charges, and tax. |  [optional] |
|**orderSubTotal** | **Double** | The sub total cost for the order, not including tax and freight. |  [optional] |
|**freightCharges** | **Double** | The freight charges for the order. |  [optional] |
|**currencyCode** | **String** | The country-specific three digit ISO 4217 currency code for the order. |  [optional] |
|**totalWeight** | **Double** | Total order weight. unit -- North america - Pounds , other countries will be KG. |  [optional] |
|**totalTax** | **Double** | Total tax on the orders placed. |  [optional] |
|**totalFees** | **Double** | Total fees on the orders placed. |  [optional] |
|**paymentTerms** | **String** | The payment terms of the order. (Ex- Net 30 days). |  [optional] |
|**notes** | **String** | The header-level notes for the order. |  [optional] |
|**billToInfo** | [**OrderDetailB2BBillToInfo**](OrderDetailB2BBillToInfo.md) |  |  [optional] |
|**shipToInfo** | [**OrderDetailB2BShipToInfo**](OrderDetailB2BShipToInfo.md) |  |  [optional] |
|**endUserInfo** | [**OrderDetailB2BEndUserInfo**](OrderDetailB2BEndUserInfo.md) |  |  [optional] |
|**lines** | [**List&lt;OrderDetailB2BLinesInner&gt;**](OrderDetailB2BLinesInner.md) |  |  [optional] |
|**miscellaneousCharges** | [**List&lt;OrderDetailB2BMiscellaneousChargesInner&gt;**](OrderDetailB2BMiscellaneousChargesInner.md) |  |  [optional] |
|**additionalAttributes** | [**List&lt;OrderDetailB2BAdditionalAttributesInner&gt;**](OrderDetailB2BAdditionalAttributesInner.md) |  |  [optional] |



