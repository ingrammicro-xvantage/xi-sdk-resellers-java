
# xi.sdk.resellers


For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of APIs and webhooks to craft a seamless journey for your customers.



## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository:
In settings.xml in your machine add :
```xml

<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/ingrammicro-xvantage/xi-sdk-resellers-java</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>youruserid</username> ///Replace with your user id 
      <password>accesstoken</password> /// Get access token from developer settings in your profile. 
    </server>
  </servers>
</settings>
```

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>xi.sdk.resellers</groupId>
  <artifactId>xi.sdk.resellers</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### 
If you want to compile it yourself, here's how:


```shell
git clone https://github.com/ingrammicro-xvantage/xi-sdk-resellers-java.git
cd xi-sdk-resellers-java
mvn install       # Requires maven, download from https://maven.apache.org/download.html

```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/xi.sdk.resellers-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Quickstart on creating an application can be found [here](getting-started.md)

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.models.*;
import xiresellers.client.api.AccesstokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");

    AccesstokenApi apiInstance = new AccesstokenApi(defaultClient);
    String grantType = "client_credentials"; // String | Keep grant_type as client_credentials only.
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    try {
      AccesstokenResponse result = apiInstance.getAccesstoken(grantType, clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccesstokenApi#getAccesstoken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.ingrammicro.com:443*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccesstokenApi* | [**getAccesstoken**](docs/AccesstokenApi.md#getAccesstoken) | **GET** /oauth/oauth20/token | Accesstoken
*DealsApi* | [**getResellersV6Dealsdetails**](docs/DealsApi.md#getResellersV6Dealsdetails) | **GET** /resellers/v6/deals/{dealId} | Deals Details
*DealsApi* | [**getResellersV6Dealssearch**](docs/DealsApi.md#getResellersV6Dealssearch) | **GET** /resellers/v6/deals/search | Deals Search
*FreightEstimateApi* | [**postFreightestimate**](docs/FreightEstimateApi.md#postFreightestimate) | **POST** /resellers/v6/freightestimate | Freight Estimate
*InvoicesApi* | [**getInvoicedetailsV61**](docs/InvoicesApi.md#getInvoicedetailsV61) | **GET** /resellers/v6.1/invoices/{invoiceNumber} | Get Invoice Details v6.1
*InvoicesApi* | [**getResellersV6Invoicesearch**](docs/InvoicesApi.md#getResellersV6Invoicesearch) | **GET** /resellers/v6/invoices | Search your invoice
*OrderStatusApi* | [**resellersV1WebhooksOrderstatuseventPost**](docs/OrderStatusApi.md#resellersV1WebhooksOrderstatuseventPost) | **POST** /resellers/v1/webhooks/orderstatusevent | Order Status
*OrdersApi* | [**deleteOrdercancel**](docs/OrdersApi.md#deleteOrdercancel) | **DELETE** /resellers/v6/orders/{OrderNumber} | Cancel your Order
*OrdersApi* | [**getOrderdetailsV61**](docs/OrdersApi.md#getOrderdetailsV61) | **GET** /resellers/v6.1/orders/{ordernumber} | Get Order Details v6.1
*OrdersApi* | [**getResellersV6Ordersearch**](docs/OrdersApi.md#getResellersV6Ordersearch) | **GET** /resellers/v6/orders/search | Search your Orders
*OrdersApi* | [**postCreateorderV6**](docs/OrdersApi.md#postCreateorderV6) | **POST** /resellers/v6/orders | Create your Order
*OrdersApi* | [**postCreateorderV7**](docs/OrdersApi.md#postCreateorderV7) | **POST** /resellers/v7/orders | Create your Order v7
*OrdersApi* | [**putOrdermodify**](docs/OrdersApi.md#putOrdermodify) | **PUT** /resellers/v6/orders/{orderNumber} | Modify your Order
*ProductCatalogApi* | [**getResellerV6Productdetail**](docs/ProductCatalogApi.md#getResellerV6Productdetail) | **GET** /resellers/v6/catalog/details/{ingramPartNumber} | Product Details
*ProductCatalogApi* | [**getResellerV6Productsearch**](docs/ProductCatalogApi.md#getResellerV6Productsearch) | **GET** /resellers/v6/catalog | Search Products
*ProductCatalogApi* | [**postPriceandavailability**](docs/ProductCatalogApi.md#postPriceandavailability) | **POST** /resellers/v6/catalog/priceandavailability | Price and Availability
*QuotesApi* | [**getQuotessearchV6**](docs/QuotesApi.md#getQuotessearchV6) | **GET** /resellers/v6/quotes/search | Quote Search
*QuotesApi* | [**getResellerV6ValidateQuote**](docs/QuotesApi.md#getResellerV6ValidateQuote) | **GET** /resellers/v6/q2o/validatequote | Validate Quote
*QuotesApi* | [**getResellersV6Quotes**](docs/QuotesApi.md#getResellersV6Quotes) | **GET** /resellers/v6/quotes/{quoteNumber} | Get Quote Details
*RenewalsApi* | [**getResellersV6Renewalsdetails**](docs/RenewalsApi.md#getResellersV6Renewalsdetails) | **GET** /resellers/v6/renewals/{renewalId} | Renewals Details
*RenewalsApi* | [**postRenewalssearch**](docs/RenewalsApi.md#postRenewalssearch) | **POST** /resellers/v6/renewals/search | Renewals Search
*ReturnsApi* | [**getResellersV6Returnsdetails**](docs/ReturnsApi.md#getResellersV6Returnsdetails) | **GET** /resellers/v6/returns/{caseRequestNumber} | Returns Details
*ReturnsApi* | [**getResellersV6Returnssearch**](docs/ReturnsApi.md#getResellersV6Returnssearch) | **GET** /resellers/v6/returns/search | Returns Search
*ReturnsApi* | [**postReturnscreate**](docs/ReturnsApi.md#postReturnscreate) | **POST** /resellers/v6/returns/create | Returns Create
*StockUpdateApi* | [**resellersV1WebhooksAvailabilityupdatePost**](docs/StockUpdateApi.md#resellersV1WebhooksAvailabilityupdatePost) | **POST** /resellers/v1/webhooks/availabilityupdate | Stock Update


## Documentation for Models

 - [AccesstokenResponse](docs/AccesstokenResponse.md)
 - [AsyncOrderCreateDTO](docs/AsyncOrderCreateDTO.md)
 - [AsyncOrderCreateDTOAdditionalAttributesInner](docs/AsyncOrderCreateDTOAdditionalAttributesInner.md)
 - [AsyncOrderCreateDTOEndUserInfo](docs/AsyncOrderCreateDTOEndUserInfo.md)
 - [AsyncOrderCreateDTOLinesInner](docs/AsyncOrderCreateDTOLinesInner.md)
 - [AsyncOrderCreateDTOLinesInnerEndUserInfoInner](docs/AsyncOrderCreateDTOLinesInnerEndUserInfoInner.md)
 - [AsyncOrderCreateDTOResellerInfo](docs/AsyncOrderCreateDTOResellerInfo.md)
 - [AsyncOrderCreateDTOShipToInfo](docs/AsyncOrderCreateDTOShipToInfo.md)
 - [AsyncOrderCreateDTOShipmentDetails](docs/AsyncOrderCreateDTOShipmentDetails.md)
 - [AsyncOrderCreateDTOVmfadditionalAttributesInner](docs/AsyncOrderCreateDTOVmfadditionalAttributesInner.md)
 - [AsyncOrderCreateDTOWarrantyInfoInner](docs/AsyncOrderCreateDTOWarrantyInfoInner.md)
 - [AsyncOrderCreateDTOWarrantyInfoInnerSerialInfoInner](docs/AsyncOrderCreateDTOWarrantyInfoInnerSerialInfoInner.md)
 - [AsyncOrderCreateDTOWarrantyInfoInnerVmfAdditionalAttributesLinesInner](docs/AsyncOrderCreateDTOWarrantyInfoInnerVmfAdditionalAttributesLinesInner.md)
 - [AsyncOrderCreateResponse](docs/AsyncOrderCreateResponse.md)
 - [AvailabilityAsyncNotificationRequest](docs/AvailabilityAsyncNotificationRequest.md)
 - [AvailabilityAsyncNotificationRequestResourceInner](docs/AvailabilityAsyncNotificationRequestResourceInner.md)
 - [AvailabilityAsyncNotificationRequestResourceInnerLinksInner](docs/AvailabilityAsyncNotificationRequestResourceInnerLinksInner.md)
 - [DealsDetailsResponse](docs/DealsDetailsResponse.md)
 - [DealsDetailsResponseProductsInner](docs/DealsDetailsResponseProductsInner.md)
 - [DealsSearchResponse](docs/DealsSearchResponse.md)
 - [DealsSearchResponseDealsInner](docs/DealsSearchResponseDealsInner.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseDTO](docs/ErrorResponseDTO.md)
 - [ErrorResponseErrorsInner](docs/ErrorResponseErrorsInner.md)
 - [ErrorResponseErrorsInnerFieldsInner](docs/ErrorResponseErrorsInnerFieldsInner.md)
 - [Fields](docs/Fields.md)
 - [FreightRequest](docs/FreightRequest.md)
 - [FreightRequestLinesInner](docs/FreightRequestLinesInner.md)
 - [FreightRequestShipToAddressInner](docs/FreightRequestShipToAddressInner.md)
 - [FreightResponse](docs/FreightResponse.md)
 - [FreightResponseFreightEstimateResponse](docs/FreightResponseFreightEstimateResponse.md)
 - [FreightResponseFreightEstimateResponseDistributionInner](docs/FreightResponseFreightEstimateResponseDistributionInner.md)
 - [FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner](docs/FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.md)
 - [FreightResponseFreightEstimateResponseLinesInner](docs/FreightResponseFreightEstimateResponseLinesInner.md)
 - [GetAccesstoken400Response](docs/GetAccesstoken400Response.md)
 - [GetAccesstoken500Response](docs/GetAccesstoken500Response.md)
 - [GetAccesstoken500ResponseFault](docs/GetAccesstoken500ResponseFault.md)
 - [GetAccesstoken500ResponseFaultDetail](docs/GetAccesstoken500ResponseFaultDetail.md)
 - [GetResellerV6ValidateQuote400Response](docs/GetResellerV6ValidateQuote400Response.md)
 - [GetResellerV6ValidateQuote400ResponseFieldsInner](docs/GetResellerV6ValidateQuote400ResponseFieldsInner.md)
 - [InvoiceDetailsv61Response](docs/InvoiceDetailsv61Response.md)
 - [InvoiceDetailsv61ResponseBillToInfo](docs/InvoiceDetailsv61ResponseBillToInfo.md)
 - [InvoiceDetailsv61ResponseFxRateInfo](docs/InvoiceDetailsv61ResponseFxRateInfo.md)
 - [InvoiceDetailsv61ResponseLinesInner](docs/InvoiceDetailsv61ResponseLinesInner.md)
 - [InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner](docs/InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner.md)
 - [InvoiceDetailsv61ResponsePaymentTermsInfo](docs/InvoiceDetailsv61ResponsePaymentTermsInfo.md)
 - [InvoiceDetailsv61ResponseShipToInfo](docs/InvoiceDetailsv61ResponseShipToInfo.md)
 - [InvoiceDetailsv61ResponseSummary](docs/InvoiceDetailsv61ResponseSummary.md)
 - [InvoiceDetailsv61ResponseSummaryForeignFxTotals](docs/InvoiceDetailsv61ResponseSummaryForeignFxTotals.md)
 - [InvoiceDetailsv61ResponseSummaryLines](docs/InvoiceDetailsv61ResponseSummaryLines.md)
 - [InvoiceDetailsv61ResponseSummaryMiscChargesInner](docs/InvoiceDetailsv61ResponseSummaryMiscChargesInner.md)
 - [InvoiceDetailsv61ResponseSummaryTotals](docs/InvoiceDetailsv61ResponseSummaryTotals.md)
 - [InvoiceSearchResponse](docs/InvoiceSearchResponse.md)
 - [InvoiceSearchResponseInvoicesInner](docs/InvoiceSearchResponseInvoicesInner.md)
 - [OrderCreateRequest](docs/OrderCreateRequest.md)
 - [OrderCreateRequestAdditionalAttributesInner](docs/OrderCreateRequestAdditionalAttributesInner.md)
 - [OrderCreateRequestEndUserInfo](docs/OrderCreateRequestEndUserInfo.md)
 - [OrderCreateRequestLinesInner](docs/OrderCreateRequestLinesInner.md)
 - [OrderCreateRequestLinesInnerAdditionalAttributesInner](docs/OrderCreateRequestLinesInnerAdditionalAttributesInner.md)
 - [OrderCreateRequestLinesInnerEndUserInfoInner](docs/OrderCreateRequestLinesInnerEndUserInfoInner.md)
 - [OrderCreateRequestLinesInnerWarrantyInfoInner](docs/OrderCreateRequestLinesInnerWarrantyInfoInner.md)
 - [OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner](docs/OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.md)
 - [OrderCreateRequestResellerInfo](docs/OrderCreateRequestResellerInfo.md)
 - [OrderCreateRequestShipToInfo](docs/OrderCreateRequestShipToInfo.md)
 - [OrderCreateRequestShipmentDetails](docs/OrderCreateRequestShipmentDetails.md)
 - [OrderCreateRequestVmf](docs/OrderCreateRequestVmf.md)
 - [OrderCreateResponse](docs/OrderCreateResponse.md)
 - [OrderCreateResponseEndUserInfo](docs/OrderCreateResponseEndUserInfo.md)
 - [OrderCreateResponseOrdersInner](docs/OrderCreateResponseOrdersInner.md)
 - [OrderCreateResponseOrdersInnerAdditionalAttributesInner](docs/OrderCreateResponseOrdersInnerAdditionalAttributesInner.md)
 - [OrderCreateResponseOrdersInnerLinesInner](docs/OrderCreateResponseOrdersInnerLinesInner.md)
 - [OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner](docs/OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner.md)
 - [OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner](docs/OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.md)
 - [OrderCreateResponseOrdersInnerLinksInner](docs/OrderCreateResponseOrdersInnerLinksInner.md)
 - [OrderCreateResponseOrdersInnerMiscellaneousChargesInner](docs/OrderCreateResponseOrdersInnerMiscellaneousChargesInner.md)
 - [OrderCreateResponseOrdersInnerRejectedLineItemsInner](docs/OrderCreateResponseOrdersInnerRejectedLineItemsInner.md)
 - [OrderCreateResponseShipToInfo](docs/OrderCreateResponseShipToInfo.md)
 - [OrderDetailB2B](docs/OrderDetailB2B.md)
 - [OrderDetailB2BAdditionalAttributesInner](docs/OrderDetailB2BAdditionalAttributesInner.md)
 - [OrderDetailB2BBillToInfo](docs/OrderDetailB2BBillToInfo.md)
 - [OrderDetailB2BEndUserInfo](docs/OrderDetailB2BEndUserInfo.md)
 - [OrderDetailB2BLinesInner](docs/OrderDetailB2BLinesInner.md)
 - [OrderDetailB2BLinesInnerAdditionalAttributesInner](docs/OrderDetailB2BLinesInnerAdditionalAttributesInner.md)
 - [OrderDetailB2BLinesInnerEstimatedDatesInner](docs/OrderDetailB2BLinesInnerEstimatedDatesInner.md)
 - [OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery](docs/OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.md)
 - [OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange](docs/OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.md)
 - [OrderDetailB2BLinesInnerEstimatedDatesInnerShip](docs/OrderDetailB2BLinesInnerEstimatedDatesInnerShip.md)
 - [OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange](docs/OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange.md)
 - [OrderDetailB2BLinesInnerLinksInner](docs/OrderDetailB2BLinesInnerLinksInner.md)
 - [OrderDetailB2BLinesInnerMultipleShipmentsInner](docs/OrderDetailB2BLinesInnerMultipleShipmentsInner.md)
 - [OrderDetailB2BLinesInnerScheduleLinesInner](docs/OrderDetailB2BLinesInnerScheduleLinesInner.md)
 - [OrderDetailB2BLinesInnerServiceContractInfo](docs/OrderDetailB2BLinesInnerServiceContractInfo.md)
 - [OrderDetailB2BLinesInnerServiceContractInfoContractInfo](docs/OrderDetailB2BLinesInnerServiceContractInfoContractInfo.md)
 - [OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo](docs/OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.md)
 - [OrderDetailB2BLinesInnerServiceContractInfoSubscriptions](docs/OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.md)
 - [OrderDetailB2BLinesInnerShipmentDetailsInner](docs/OrderDetailB2BLinesInnerShipmentDetailsInner.md)
 - [OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner](docs/OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.md)
 - [OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner](docs/OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.md)
 - [OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner](docs/OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner.md)
 - [OrderDetailB2BMiscellaneousChargesInner](docs/OrderDetailB2BMiscellaneousChargesInner.md)
 - [OrderDetailB2BShipToInfo](docs/OrderDetailB2BShipToInfo.md)
 - [OrderModifyRequest](docs/OrderModifyRequest.md)
 - [OrderModifyRequestAdditionalAttributesInner](docs/OrderModifyRequestAdditionalAttributesInner.md)
 - [OrderModifyRequestLinesInner](docs/OrderModifyRequestLinesInner.md)
 - [OrderModifyRequestShipToInfo](docs/OrderModifyRequestShipToInfo.md)
 - [OrderModifyResponse](docs/OrderModifyResponse.md)
 - [OrderModifyResponseLinesInner](docs/OrderModifyResponseLinesInner.md)
 - [OrderModifyResponseLinesInnerAdditionalAttributesInner](docs/OrderModifyResponseLinesInnerAdditionalAttributesInner.md)
 - [OrderModifyResponseLinesInnerShipmentDetails](docs/OrderModifyResponseLinesInnerShipmentDetails.md)
 - [OrderModifyResponseRejectedLineItemsInner](docs/OrderModifyResponseRejectedLineItemsInner.md)
 - [OrderModifyResponseShipToInfo](docs/OrderModifyResponseShipToInfo.md)
 - [OrderSearchResponse](docs/OrderSearchResponse.md)
 - [OrderSearchResponseOrdersInner](docs/OrderSearchResponseOrdersInner.md)
 - [OrderSearchResponseOrdersInnerLinks](docs/OrderSearchResponseOrdersInnerLinks.md)
 - [OrderSearchResponseOrdersInnerSubOrdersInner](docs/OrderSearchResponseOrdersInnerSubOrdersInner.md)
 - [OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner](docs/OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.md)
 - [OrderStatusAsyncNotificationRequest](docs/OrderStatusAsyncNotificationRequest.md)
 - [OrderStatusAsyncNotificationRequestResourceInner](docs/OrderStatusAsyncNotificationRequestResourceInner.md)
 - [OrderStatusAsyncNotificationRequestResourceInnerLinesInner](docs/OrderStatusAsyncNotificationRequestResourceInnerLinesInner.md)
 - [OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner](docs/OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.md)
 - [OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner](docs/OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.md)
 - [OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner](docs/OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.md)
 - [OrderStatusAsyncNotificationRequestResourceInnerLinksInner](docs/OrderStatusAsyncNotificationRequestResourceInnerLinksInner.md)
 - [PostCreateorderV7400Response](docs/PostCreateorderV7400Response.md)
 - [PostCreateorderV7400ResponseFieldsInner](docs/PostCreateorderV7400ResponseFieldsInner.md)
 - [PostCreateorderV7500Response](docs/PostCreateorderV7500Response.md)
 - [PostRenewalssearch400Response](docs/PostRenewalssearch400Response.md)
 - [PriceAndAvailabilityRequest](docs/PriceAndAvailabilityRequest.md)
 - [PriceAndAvailabilityRequestAdditionalAttributesInner](docs/PriceAndAvailabilityRequestAdditionalAttributesInner.md)
 - [PriceAndAvailabilityRequestAvailabilityByWarehouseInner](docs/PriceAndAvailabilityRequestAvailabilityByWarehouseInner.md)
 - [PriceAndAvailabilityRequestProductsInner](docs/PriceAndAvailabilityRequestProductsInner.md)
 - [PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner](docs/PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner.md)
 - [PriceAndAvailabilityResponseInner](docs/PriceAndAvailabilityResponseInner.md)
 - [PriceAndAvailabilityResponseInnerAvailability](docs/PriceAndAvailabilityResponseInnerAvailability.md)
 - [PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner](docs/PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.md)
 - [PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner](docs/PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner.md)
 - [PriceAndAvailabilityResponseInnerDiscountsInner](docs/PriceAndAvailabilityResponseInnerDiscountsInner.md)
 - [PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner](docs/PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.md)
 - [PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner](docs/PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.md)
 - [PriceAndAvailabilityResponseInnerPricing](docs/PriceAndAvailabilityResponseInnerPricing.md)
 - [PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner](docs/PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.md)
 - [PriceAndAvailabilityResponseInnerServiceFeesInner](docs/PriceAndAvailabilityResponseInnerServiceFeesInner.md)
 - [ProductDetailResponse](docs/ProductDetailResponse.md)
 - [ProductDetailResponseAdditionalInformation](docs/ProductDetailResponseAdditionalInformation.md)
 - [ProductDetailResponseAdditionalInformationProductWeightInner](docs/ProductDetailResponseAdditionalInformationProductWeightInner.md)
 - [ProductDetailResponseCiscoFields](docs/ProductDetailResponseCiscoFields.md)
 - [ProductDetailResponseIndicators](docs/ProductDetailResponseIndicators.md)
 - [ProductDetailResponseTechnicalSpecificationsInner](docs/ProductDetailResponseTechnicalSpecificationsInner.md)
 - [ProductSearchResponse](docs/ProductSearchResponse.md)
 - [ProductSearchResponseCatalogInner](docs/ProductSearchResponseCatalogInner.md)
 - [ProductSearchResponseCatalogInnerLinksInner](docs/ProductSearchResponseCatalogInnerLinksInner.md)
 - [QuoteDetailsResponse](docs/QuoteDetailsResponse.md)
 - [QuoteDetailsResponseAdditionalAttributesInner](docs/QuoteDetailsResponseAdditionalAttributesInner.md)
 - [QuoteDetailsResponseEndUserInfo](docs/QuoteDetailsResponseEndUserInfo.md)
 - [QuoteDetailsResponseProductsInner](docs/QuoteDetailsResponseProductsInner.md)
 - [QuoteDetailsResponseProductsInnerBillDetailsInner](docs/QuoteDetailsResponseProductsInnerBillDetailsInner.md)
 - [QuoteDetailsResponseProductsInnerPrice](docs/QuoteDetailsResponseProductsInnerPrice.md)
 - [QuoteDetailsResponseProductsInnerPriceDiscountsInner](docs/QuoteDetailsResponseProductsInnerPriceDiscountsInner.md)
 - [QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner](docs/QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.md)
 - [QuoteDetailsResponseResellerInfo](docs/QuoteDetailsResponseResellerInfo.md)
 - [QuoteDetailsResponseShippingInfo](docs/QuoteDetailsResponseShippingInfo.md)
 - [QuoteSearchResponse](docs/QuoteSearchResponse.md)
 - [QuoteSearchResponseQuotesInner](docs/QuoteSearchResponseQuotesInner.md)
 - [QuoteSearchResponseQuotesInnerLinks](docs/QuoteSearchResponseQuotesInnerLinks.md)
 - [RenewalsDetailsResponse](docs/RenewalsDetailsResponse.md)
 - [RenewalsDetailsResponseAdditionalAttributesInner](docs/RenewalsDetailsResponseAdditionalAttributesInner.md)
 - [RenewalsDetailsResponseEndUserInfo](docs/RenewalsDetailsResponseEndUserInfo.md)
 - [RenewalsDetailsResponseProductsInner](docs/RenewalsDetailsResponseProductsInner.md)
 - [RenewalsDetailsResponseReferenceNumber](docs/RenewalsDetailsResponseReferenceNumber.md)
 - [RenewalsSearchRequest](docs/RenewalsSearchRequest.md)
 - [RenewalsSearchRequestDateType](docs/RenewalsSearchRequestDateType.md)
 - [RenewalsSearchRequestDateTypeEndDate](docs/RenewalsSearchRequestDateTypeEndDate.md)
 - [RenewalsSearchRequestDateTypeExpirationDate](docs/RenewalsSearchRequestDateTypeExpirationDate.md)
 - [RenewalsSearchRequestDateTypeInvoiceDate](docs/RenewalsSearchRequestDateTypeInvoiceDate.md)
 - [RenewalsSearchRequestDateTypeStartDate](docs/RenewalsSearchRequestDateTypeStartDate.md)
 - [RenewalsSearchRequestStatus](docs/RenewalsSearchRequestStatus.md)
 - [RenewalsSearchRequestStatusOpporutinyStatus](docs/RenewalsSearchRequestStatusOpporutinyStatus.md)
 - [RenewalsSearchResponse](docs/RenewalsSearchResponse.md)
 - [RenewalsSearchResponseRenewalsInner](docs/RenewalsSearchResponseRenewalsInner.md)
 - [RenewalsSearchResponseRenewalsInnerLinksInner](docs/RenewalsSearchResponseRenewalsInnerLinksInner.md)
 - [ReturnsCreateRequest](docs/ReturnsCreateRequest.md)
 - [ReturnsCreateRequestListInner](docs/ReturnsCreateRequestListInner.md)
 - [ReturnsCreateRequestListInnerShipFromInfoInner](docs/ReturnsCreateRequestListInnerShipFromInfoInner.md)
 - [ReturnsCreateResponse](docs/ReturnsCreateResponse.md)
 - [ReturnsCreateResponseReturnsClaimsInner](docs/ReturnsCreateResponseReturnsClaimsInner.md)
 - [ReturnsDetailsResponse](docs/ReturnsDetailsResponse.md)
 - [ReturnsDetailsResponseProductsInner](docs/ReturnsDetailsResponseProductsInner.md)
 - [ReturnsSearchResponse](docs/ReturnsSearchResponse.md)
 - [ReturnsSearchResponseReturnsClaimsInner](docs/ReturnsSearchResponseReturnsClaimsInner.md)
 - [ReturnsSearchResponseReturnsClaimsInnerLinksInner](docs/ReturnsSearchResponseReturnsClaimsInnerLinksInner.md)
 - [ValidateQuoteResponse](docs/ValidateQuoteResponse.md)
 - [ValidateQuoteResponseLinesInner](docs/ValidateQuoteResponseLinesInner.md)
 - [ValidateQuoteResponseLinesInnerVmfAdditionalAttributesLinesInner](docs/ValidateQuoteResponseLinesInnerVmfAdditionalAttributesLinesInner.md)
 - [ValidateQuoteResponseVmfAdditionalAttributesInner](docs/ValidateQuoteResponseVmfAdditionalAttributesInner.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
### application

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: https://api.ingrammicro.com:443/oauth/oauth20/token?grant_type=client_credentials&client_id={ClientId}&client_secret={clientSecret}
- **Method**: Get
- **Scopes**: 
  - write: allows modifying resources
  - read: allows reading resources
 

## Author
-[Ingram Micro Xvantage](https://github.com/ingrammicro-xvantage)

## Contact

For any inquiries or support, please feel free to contact us at:

- Email: xi_support@ingrammicro.com