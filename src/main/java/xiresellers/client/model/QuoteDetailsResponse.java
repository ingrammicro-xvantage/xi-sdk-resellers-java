/*
 * XI Sdk Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xiresellers.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.QuoteDetailsResponseAdditionalAttributesInner;
import xiresellers.client.model.QuoteDetailsResponseEndUserInfo;
import xiresellers.client.model.QuoteDetailsResponseProductsInner;
import xiresellers.client.model.QuoteDetailsResponseResellerInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * QuoteDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T05:40:29.622284Z[Etc/UTC]")
public class QuoteDetailsResponse {
  public static final String SERIALIZED_NAME_QUOTE_NAME = "quoteName";
  @SerializedName(SERIALIZED_NAME_QUOTE_NAME)
  private String quoteName;

  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_INGRAM_QUOTE_DATE = "ingramQuoteDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_QUOTE_DATE)
  private String ingramQuoteDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_INGRAM_QUOTE_EXPIRY_DATE = "ingramQuoteExpiryDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_QUOTE_EXPIRY_DATE)
  private String ingramQuoteExpiryDate;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CLOSING_REASON = "closingReason";
  @SerializedName(SERIALIZED_NAME_CLOSING_REASON)
  private String closingReason;

  public static final String SERIALIZED_NAME_SPECIAL_BID_ID = "specialBidId";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_ID)
  private String specialBidId;

  public static final String SERIALIZED_NAME_SPECIAL_BID_EFFECTIVE_DATE = "specialBidEffectiveDate";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_EFFECTIVE_DATE)
  private String specialBidEffectiveDate;

  public static final String SERIALIZED_NAME_SPECIAL_BID_EXPIRATION_DATE = "specialBidExpirationDate";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_EXPIRATION_DATE)
  private String specialBidExpirationDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CUSTOMER_NEED = "customerNeed";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NEED)
  private String customerNeed;

  public static final String SERIALIZED_NAME_PROPOSED_SOLUTION = "proposedSolution";
  @SerializedName(SERIALIZED_NAME_PROPOSED_SOLUTION)
  private String proposedSolution;

  public static final String SERIALIZED_NAME_INTRO_PREAMBLE = "introPreamble";
  @SerializedName(SERIALIZED_NAME_INTRO_PREAMBLE)
  private String introPreamble;

  public static final String SERIALIZED_NAME_PURCHASE_INSTRUCTIONS = "purchaseInstructions";
  @SerializedName(SERIALIZED_NAME_PURCHASE_INSTRUCTIONS)
  private String purchaseInstructions;

  public static final String SERIALIZED_NAME_LEGAL_TERMS = "legalTerms";
  @SerializedName(SERIALIZED_NAME_LEGAL_TERMS)
  private String legalTerms;

  public static final String SERIALIZED_NAME_LEASE_INFO = "leaseInfo";
  @SerializedName(SERIALIZED_NAME_LEASE_INFO)
  private String leaseInfo;

  public static final String SERIALIZED_NAME_LEASING_INSTRUCTIONS = "leasingInstructions";
  @SerializedName(SERIALIZED_NAME_LEASING_INSTRUCTIONS)
  private String leasingInstructions;

  public static final String SERIALIZED_NAME_RESELLER_INFO = "resellerInfo";
  @SerializedName(SERIALIZED_NAME_RESELLER_INFO)
  private QuoteDetailsResponseResellerInfo resellerInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private QuoteDetailsResponseEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<QuoteDetailsResponseProductsInner> products;

  public static final String SERIALIZED_NAME_PRODUCTS_COUNT = "productsCount";
  @SerializedName(SERIALIZED_NAME_PRODUCTS_COUNT)
  private Integer productsCount;

  public static final String SERIALIZED_NAME_EXTENDED_MSRP_TOTAL = "extendedMsrpTotal";
  @SerializedName(SERIALIZED_NAME_EXTENDED_MSRP_TOTAL)
  private Integer extendedMsrpTotal;

  public static final String SERIALIZED_NAME_QUANTITY_TOTAL = "quantityTotal";
  @SerializedName(SERIALIZED_NAME_QUANTITY_TOTAL)
  private Integer quantityTotal;

  public static final String SERIALIZED_NAME_EXTENDED_QUOTE_PRICE_TOTAL = "extendedQuotePriceTotal";
  @SerializedName(SERIALIZED_NAME_EXTENDED_QUOTE_PRICE_TOTAL)
  private Integer extendedQuotePriceTotal;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<QuoteDetailsResponseAdditionalAttributesInner> additionalAttributes;

  public QuoteDetailsResponse() {
  }

  public QuoteDetailsResponse quoteName(String quoteName) {
    this.quoteName = quoteName;
    return this;
  }

   /**
   * Quote Name given to quote by sales team or system generated.  Generally used as a reference to identify the quote.
   * @return quoteName
  **/
  @javax.annotation.Nullable
  public String getQuoteName() {
    return quoteName;
  }

  public void setQuoteName(String quoteName) {
    this.quoteName = quoteName;
  }


  public QuoteDetailsResponse quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

   /**
   * Unique identifier generated by Ingram Micro&#39;s CRM specific to each quote.  When applying a filter to the quoteNumber and including a partial quote number in the filter, all quotes containing any information included in the filter can be retrieved as a subset of all available customer quotes.
   * @return quoteNumber
  **/
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public QuoteDetailsResponse revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * When a quote has been revised and updated, the quote number remains the same throughout the lifecycle of the quote, however, a Revision number is updated for each revision of the quote.  The revision numbers is associated with the Unique Quote Number.
   * @return revision
  **/
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }


  public QuoteDetailsResponse ingramQuoteDate(String ingramQuoteDate) {
    this.ingramQuoteDate = ingramQuoteDate;
    return this;
  }

   /**
   * Date the Quote was initially Created.
   * @return ingramQuoteDate
  **/
  @javax.annotation.Nullable
  public String getIngramQuoteDate() {
    return ingramQuoteDate;
  }

  public void setIngramQuoteDate(String ingramQuoteDate) {
    this.ingramQuoteDate = ingramQuoteDate;
  }


  public QuoteDetailsResponse lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date the Quote was last updated or modified.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public QuoteDetailsResponse ingramQuoteExpiryDate(String ingramQuoteExpiryDate) {
    this.ingramQuoteExpiryDate = ingramQuoteExpiryDate;
    return this;
  }

   /**
   * Quote expiration date.
   * @return ingramQuoteExpiryDate
  **/
  @javax.annotation.Nullable
  public String getIngramQuoteExpiryDate() {
    return ingramQuoteExpiryDate;
  }

  public void setIngramQuoteExpiryDate(String ingramQuoteExpiryDate) {
    this.ingramQuoteExpiryDate = ingramQuoteExpiryDate;
  }


  public QuoteDetailsResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Three letter currency code.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public QuoteDetailsResponse closingReason(String closingReason) {
    this.closingReason = closingReason;
    return this;
  }

   /**
   * Closing Reason for quote.
   * @return closingReason
  **/
  @javax.annotation.Nullable
  public String getClosingReason() {
    return closingReason;
  }

  public void setClosingReason(String closingReason) {
    this.closingReason = closingReason;
  }


  public QuoteDetailsResponse specialBidId(String specialBidId) {
    this.specialBidId = specialBidId;
    return this;
  }

   /**
   * Price discount identifyer to specify  a pricing discount that has been applied to the quote. If present - the priceDeviationStartDate and priceDeviationExpiryDate must be presented. Cisco refers to this as a Dart
   * @return specialBidId
  **/
  @javax.annotation.Nullable
  public String getSpecialBidId() {
    return specialBidId;
  }

  public void setSpecialBidId(String specialBidId) {
    this.specialBidId = specialBidId;
  }


  public QuoteDetailsResponse specialBidEffectiveDate(String specialBidEffectiveDate) {
    this.specialBidEffectiveDate = specialBidEffectiveDate;
    return this;
  }

   /**
   * If price discount has been applied to the quote - the starting date the discount begins.
   * @return specialBidEffectiveDate
  **/
  @javax.annotation.Nullable
  public String getSpecialBidEffectiveDate() {
    return specialBidEffectiveDate;
  }

  public void setSpecialBidEffectiveDate(String specialBidEffectiveDate) {
    this.specialBidEffectiveDate = specialBidEffectiveDate;
  }


  public QuoteDetailsResponse specialBidExpirationDate(String specialBidExpirationDate) {
    this.specialBidExpirationDate = specialBidExpirationDate;
    return this;
  }

   /**
   * If a price discount has been applied to the quote - The date the discount expires and will no longer be applicable.
   * @return specialBidExpirationDate
  **/
  @javax.annotation.Nullable
  public String getSpecialBidExpirationDate() {
    return specialBidExpirationDate;
  }

  public void setSpecialBidExpirationDate(String specialBidExpirationDate) {
    this.specialBidExpirationDate = specialBidExpirationDate;
  }


  public QuoteDetailsResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * This refers to the primary status of the quote.  API responses will return
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public QuoteDetailsResponse customerNeed(String customerNeed) {
    this.customerNeed = customerNeed;
    return this;
  }

   /**
   * Details related to the customer&#39;s request for the quote entered by the sales representative or system generated.
   * @return customerNeed
  **/
  @javax.annotation.Nullable
  public String getCustomerNeed() {
    return customerNeed;
  }

  public void setCustomerNeed(String customerNeed) {
    this.customerNeed = customerNeed;
  }


  public QuoteDetailsResponse proposedSolution(String proposedSolution) {
    this.proposedSolution = proposedSolution;
    return this;
  }

   /**
   * Ingram Micro proposed solution and summary of quote.
   * @return proposedSolution
  **/
  @javax.annotation.Nullable
  public String getProposedSolution() {
    return proposedSolution;
  }

  public void setProposedSolution(String proposedSolution) {
    this.proposedSolution = proposedSolution;
  }


  public QuoteDetailsResponse introPreamble(String introPreamble) {
    this.introPreamble = introPreamble;
    return this;
  }

   /**
   * Introductory paragraph included in each quote.  Legally required - must be included when presenting the quote details.
   * @return introPreamble
  **/
  @javax.annotation.Nullable
  public String getIntroPreamble() {
    return introPreamble;
  }

  public void setIntroPreamble(String introPreamble) {
    this.introPreamble = introPreamble;
  }


  public QuoteDetailsResponse purchaseInstructions(String purchaseInstructions) {
    this.purchaseInstructions = purchaseInstructions;
    return this;
  }

   /**
   * Purchase instructions.  Legally required - must be included when presenting the quote details.
   * @return purchaseInstructions
  **/
  @javax.annotation.Nullable
  public String getPurchaseInstructions() {
    return purchaseInstructions;
  }

  public void setPurchaseInstructions(String purchaseInstructions) {
    this.purchaseInstructions = purchaseInstructions;
  }


  public QuoteDetailsResponse legalTerms(String legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

   /**
   * Legal terms -  Legally required - must be included when presenting the quote details.
   * @return legalTerms
  **/
  @javax.annotation.Nullable
  public String getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(String legalTerms) {
    this.legalTerms = legalTerms;
  }


  public QuoteDetailsResponse leaseInfo(String leaseInfo) {
    this.leaseInfo = leaseInfo;
    return this;
  }

   /**
   * Lease information.
   * @return leaseInfo
  **/
  @javax.annotation.Nullable
  public String getLeaseInfo() {
    return leaseInfo;
  }

  public void setLeaseInfo(String leaseInfo) {
    this.leaseInfo = leaseInfo;
  }


  public QuoteDetailsResponse leasingInstructions(String leasingInstructions) {
    this.leasingInstructions = leasingInstructions;
    return this;
  }

   /**
   * Leasing information
   * @return leasingInstructions
  **/
  @javax.annotation.Nullable
  public String getLeasingInstructions() {
    return leasingInstructions;
  }

  public void setLeasingInstructions(String leasingInstructions) {
    this.leasingInstructions = leasingInstructions;
  }


  public QuoteDetailsResponse resellerInfo(QuoteDetailsResponseResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
    return this;
  }

   /**
   * Get resellerInfo
   * @return resellerInfo
  **/
  @javax.annotation.Nullable
  public QuoteDetailsResponseResellerInfo getResellerInfo() {
    return resellerInfo;
  }

  public void setResellerInfo(QuoteDetailsResponseResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
  }


  public QuoteDetailsResponse endUserInfo(QuoteDetailsResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public QuoteDetailsResponseEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(QuoteDetailsResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public QuoteDetailsResponse products(List<QuoteDetailsResponseProductsInner> products) {
    this.products = products;
    return this;
  }

  public QuoteDetailsResponse addProductsItem(QuoteDetailsResponseProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  public List<QuoteDetailsResponseProductsInner> getProducts() {
    return products;
  }

  public void setProducts(List<QuoteDetailsResponseProductsInner> products) {
    this.products = products;
  }


  public QuoteDetailsResponse productsCount(Integer productsCount) {
    this.productsCount = productsCount;
    return this;
  }

   /**
   * Total number of products included in the quote
   * @return productsCount
  **/
  @javax.annotation.Nullable
  public Integer getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Integer productsCount) {
    this.productsCount = productsCount;
  }


  public QuoteDetailsResponse extendedMsrpTotal(Integer extendedMsrpTotal) {
    this.extendedMsrpTotal = extendedMsrpTotal;
    return this;
  }

   /**
   * Total extended MSRP for all products included in the quote
   * @return extendedMsrpTotal
  **/
  @javax.annotation.Nullable
  public Integer getExtendedMsrpTotal() {
    return extendedMsrpTotal;
  }

  public void setExtendedMsrpTotal(Integer extendedMsrpTotal) {
    this.extendedMsrpTotal = extendedMsrpTotal;
  }


  public QuoteDetailsResponse quantityTotal(Integer quantityTotal) {
    this.quantityTotal = quantityTotal;
    return this;
  }

   /**
   * Total quantity of all items in the quote.
   * @return quantityTotal
  **/
  @javax.annotation.Nullable
  public Integer getQuantityTotal() {
    return quantityTotal;
  }

  public void setQuantityTotal(Integer quantityTotal) {
    this.quantityTotal = quantityTotal;
  }


  public QuoteDetailsResponse extendedQuotePriceTotal(Integer extendedQuotePriceTotal) {
    this.extendedQuotePriceTotal = extendedQuotePriceTotal;
    return this;
  }

   /**
   * Total amount of quoted price for all products in the quote including both solution products and suggested products.
   * @return extendedQuotePriceTotal
  **/
  @javax.annotation.Nullable
  public Integer getExtendedQuotePriceTotal() {
    return extendedQuotePriceTotal;
  }

  public void setExtendedQuotePriceTotal(Integer extendedQuotePriceTotal) {
    this.extendedQuotePriceTotal = extendedQuotePriceTotal;
  }


  public QuoteDetailsResponse additionalAttributes(List<QuoteDetailsResponseAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public QuoteDetailsResponse addAdditionalAttributesItem(QuoteDetailsResponseAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Get additionalAttributes
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<QuoteDetailsResponseAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<QuoteDetailsResponseAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponse quoteDetailsResponse = (QuoteDetailsResponse) o;
    return Objects.equals(this.quoteName, quoteDetailsResponse.quoteName) &&
        Objects.equals(this.quoteNumber, quoteDetailsResponse.quoteNumber) &&
        Objects.equals(this.revision, quoteDetailsResponse.revision) &&
        Objects.equals(this.ingramQuoteDate, quoteDetailsResponse.ingramQuoteDate) &&
        Objects.equals(this.lastModifiedDate, quoteDetailsResponse.lastModifiedDate) &&
        Objects.equals(this.ingramQuoteExpiryDate, quoteDetailsResponse.ingramQuoteExpiryDate) &&
        Objects.equals(this.currencyCode, quoteDetailsResponse.currencyCode) &&
        Objects.equals(this.closingReason, quoteDetailsResponse.closingReason) &&
        Objects.equals(this.specialBidId, quoteDetailsResponse.specialBidId) &&
        Objects.equals(this.specialBidEffectiveDate, quoteDetailsResponse.specialBidEffectiveDate) &&
        Objects.equals(this.specialBidExpirationDate, quoteDetailsResponse.specialBidExpirationDate) &&
        Objects.equals(this.status, quoteDetailsResponse.status) &&
        Objects.equals(this.customerNeed, quoteDetailsResponse.customerNeed) &&
        Objects.equals(this.proposedSolution, quoteDetailsResponse.proposedSolution) &&
        Objects.equals(this.introPreamble, quoteDetailsResponse.introPreamble) &&
        Objects.equals(this.purchaseInstructions, quoteDetailsResponse.purchaseInstructions) &&
        Objects.equals(this.legalTerms, quoteDetailsResponse.legalTerms) &&
        Objects.equals(this.leaseInfo, quoteDetailsResponse.leaseInfo) &&
        Objects.equals(this.leasingInstructions, quoteDetailsResponse.leasingInstructions) &&
        Objects.equals(this.resellerInfo, quoteDetailsResponse.resellerInfo) &&
        Objects.equals(this.endUserInfo, quoteDetailsResponse.endUserInfo) &&
        Objects.equals(this.products, quoteDetailsResponse.products) &&
        Objects.equals(this.productsCount, quoteDetailsResponse.productsCount) &&
        Objects.equals(this.extendedMsrpTotal, quoteDetailsResponse.extendedMsrpTotal) &&
        Objects.equals(this.quantityTotal, quoteDetailsResponse.quantityTotal) &&
        Objects.equals(this.extendedQuotePriceTotal, quoteDetailsResponse.extendedQuotePriceTotal) &&
        Objects.equals(this.additionalAttributes, quoteDetailsResponse.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteName, quoteNumber, revision, ingramQuoteDate, lastModifiedDate, ingramQuoteExpiryDate, currencyCode, closingReason, specialBidId, specialBidEffectiveDate, specialBidExpirationDate, status, customerNeed, proposedSolution, introPreamble, purchaseInstructions, legalTerms, leaseInfo, leasingInstructions, resellerInfo, endUserInfo, products, productsCount, extendedMsrpTotal, quantityTotal, extendedQuotePriceTotal, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsResponse {\n");
    sb.append("    quoteName: ").append(toIndentedString(quoteName)).append("\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    ingramQuoteDate: ").append(toIndentedString(ingramQuoteDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    ingramQuoteExpiryDate: ").append(toIndentedString(ingramQuoteExpiryDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    closingReason: ").append(toIndentedString(closingReason)).append("\n");
    sb.append("    specialBidId: ").append(toIndentedString(specialBidId)).append("\n");
    sb.append("    specialBidEffectiveDate: ").append(toIndentedString(specialBidEffectiveDate)).append("\n");
    sb.append("    specialBidExpirationDate: ").append(toIndentedString(specialBidExpirationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerNeed: ").append(toIndentedString(customerNeed)).append("\n");
    sb.append("    proposedSolution: ").append(toIndentedString(proposedSolution)).append("\n");
    sb.append("    introPreamble: ").append(toIndentedString(introPreamble)).append("\n");
    sb.append("    purchaseInstructions: ").append(toIndentedString(purchaseInstructions)).append("\n");
    sb.append("    legalTerms: ").append(toIndentedString(legalTerms)).append("\n");
    sb.append("    leaseInfo: ").append(toIndentedString(leaseInfo)).append("\n");
    sb.append("    leasingInstructions: ").append(toIndentedString(leasingInstructions)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    productsCount: ").append(toIndentedString(productsCount)).append("\n");
    sb.append("    extendedMsrpTotal: ").append(toIndentedString(extendedMsrpTotal)).append("\n");
    sb.append("    quantityTotal: ").append(toIndentedString(quantityTotal)).append("\n");
    sb.append("    extendedQuotePriceTotal: ").append(toIndentedString(extendedQuotePriceTotal)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("quoteName");
    openapiFields.add("quoteNumber");
    openapiFields.add("revision");
    openapiFields.add("ingramQuoteDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("ingramQuoteExpiryDate");
    openapiFields.add("currencyCode");
    openapiFields.add("closingReason");
    openapiFields.add("specialBidId");
    openapiFields.add("specialBidEffectiveDate");
    openapiFields.add("specialBidExpirationDate");
    openapiFields.add("status");
    openapiFields.add("customerNeed");
    openapiFields.add("proposedSolution");
    openapiFields.add("introPreamble");
    openapiFields.add("purchaseInstructions");
    openapiFields.add("legalTerms");
    openapiFields.add("leaseInfo");
    openapiFields.add("leasingInstructions");
    openapiFields.add("resellerInfo");
    openapiFields.add("endUserInfo");
    openapiFields.add("products");
    openapiFields.add("productsCount");
    openapiFields.add("extendedMsrpTotal");
    openapiFields.add("quantityTotal");
    openapiFields.add("extendedQuotePriceTotal");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponse is not found in the empty JSON string", QuoteDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteName") != null && !jsonObj.get("quoteName").isJsonNull()) && !jsonObj.get("quoteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteName").toString()));
      }
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
      if ((jsonObj.get("ingramQuoteDate") != null && !jsonObj.get("ingramQuoteDate").isJsonNull()) && !jsonObj.get("ingramQuoteDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramQuoteDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramQuoteDate").toString()));
      }
      if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull()) && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedDate").toString()));
      }
      if ((jsonObj.get("ingramQuoteExpiryDate") != null && !jsonObj.get("ingramQuoteExpiryDate").isJsonNull()) && !jsonObj.get("ingramQuoteExpiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramQuoteExpiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramQuoteExpiryDate").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("closingReason") != null && !jsonObj.get("closingReason").isJsonNull()) && !jsonObj.get("closingReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closingReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closingReason").toString()));
      }
      if ((jsonObj.get("specialBidId") != null && !jsonObj.get("specialBidId").isJsonNull()) && !jsonObj.get("specialBidId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidId").toString()));
      }
      if ((jsonObj.get("specialBidEffectiveDate") != null && !jsonObj.get("specialBidEffectiveDate").isJsonNull()) && !jsonObj.get("specialBidEffectiveDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidEffectiveDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidEffectiveDate").toString()));
      }
      if ((jsonObj.get("specialBidExpirationDate") != null && !jsonObj.get("specialBidExpirationDate").isJsonNull()) && !jsonObj.get("specialBidExpirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidExpirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidExpirationDate").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("customerNeed") != null && !jsonObj.get("customerNeed").isJsonNull()) && !jsonObj.get("customerNeed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerNeed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerNeed").toString()));
      }
      if ((jsonObj.get("proposedSolution") != null && !jsonObj.get("proposedSolution").isJsonNull()) && !jsonObj.get("proposedSolution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proposedSolution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proposedSolution").toString()));
      }
      if ((jsonObj.get("introPreamble") != null && !jsonObj.get("introPreamble").isJsonNull()) && !jsonObj.get("introPreamble").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `introPreamble` to be a primitive type in the JSON string but got `%s`", jsonObj.get("introPreamble").toString()));
      }
      if ((jsonObj.get("purchaseInstructions") != null && !jsonObj.get("purchaseInstructions").isJsonNull()) && !jsonObj.get("purchaseInstructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchaseInstructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchaseInstructions").toString()));
      }
      if ((jsonObj.get("legalTerms") != null && !jsonObj.get("legalTerms").isJsonNull()) && !jsonObj.get("legalTerms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalTerms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalTerms").toString()));
      }
      if ((jsonObj.get("leaseInfo") != null && !jsonObj.get("leaseInfo").isJsonNull()) && !jsonObj.get("leaseInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leaseInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leaseInfo").toString()));
      }
      if ((jsonObj.get("leasingInstructions") != null && !jsonObj.get("leasingInstructions").isJsonNull()) && !jsonObj.get("leasingInstructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leasingInstructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leasingInstructions").toString()));
      }
      // validate the optional field `resellerInfo`
      if (jsonObj.get("resellerInfo") != null && !jsonObj.get("resellerInfo").isJsonNull()) {
        QuoteDetailsResponseResellerInfo.validateJsonElement(jsonObj.get("resellerInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        QuoteDetailsResponseEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            QuoteDetailsResponseProductsInner.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            QuoteDetailsResponseAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponse>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponse
  */
  public static QuoteDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponse.class);
  }

 /**
  * Convert an instance of QuoteDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

