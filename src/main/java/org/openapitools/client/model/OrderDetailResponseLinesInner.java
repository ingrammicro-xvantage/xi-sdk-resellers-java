/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OrderDetailResponseLinesInnerAdditionalAttributesInner;
import org.openapitools.client.model.OrderDetailResponseLinesInnerLinksInner;
import org.openapitools.client.model.OrderDetailResponseLinesInnerShipmentDetailsInner;

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

import org.openapitools.client.JSON;

/**
 * OrderDetailResponseLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderDetailResponseLinesInner {
  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_LINE_NUMBER = "ingramOrderLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_LINE_NUMBER)
  private String ingramOrderLineNumber;

  public static final String SERIALIZED_NAME_VENDOR_SALES_ORDER_LINE_NUMBER = "vendorSalesOrderLineNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_SALES_ORDER_LINE_NUMBER)
  private String vendorSalesOrderLineNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_LINENUMBER = "customerLinenumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINENUMBER)
  private String customerLinenumber;

  public static final String SERIALIZED_NAME_LINE_STATUS = "lineStatus";
  @SerializedName(SERIALIZED_NAME_LINE_STATUS)
  private String lineStatus;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_PART_DESCRIPTION = "partDescription";
  @SerializedName(SERIALIZED_NAME_PART_DESCRIPTION)
  private String partDescription;

  public static final String SERIALIZED_NAME_UNIT_WEIGHT = "unitWeight";
  @SerializedName(SERIALIZED_NAME_UNIT_WEIGHT)
  private BigDecimal unitWeight;

  public static final String SERIALIZED_NAME_WEIGHT_UOM = "weightUom";
  @SerializedName(SERIALIZED_NAME_WEIGHT_UOM)
  private String weightUom;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Integer unitPrice;

  public static final String SERIALIZED_NAME_UPC_CODE = "upcCode";
  @SerializedName(SERIALIZED_NAME_UPC_CODE)
  private String upcCode;

  public static final String SERIALIZED_NAME_EXTENDED_PRICE = "extendedPrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PRICE)
  private BigDecimal extendedPrice;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "taxAmount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private BigDecimal taxAmount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_CONFIRMED = "quantityConfirmed";
  @SerializedName(SERIALIZED_NAME_QUANTITY_CONFIRMED)
  private Integer quantityConfirmed;

  public static final String SERIALIZED_NAME_QUANTITY_BACK_ORDERED = "quantityBackOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_BACK_ORDERED)
  private Integer quantityBackOrdered;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "requestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  private LocalDate requestedDeliveryDate;

  public static final String SERIALIZED_NAME_PROMISED_DELIVERY_DATE = "promisedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_PROMISED_DELIVERY_DATE)
  private LocalDate promisedDeliveryDate;

  public static final String SERIALIZED_NAME_LINE_NOTES = "lineNotes";
  @SerializedName(SERIALIZED_NAME_LINE_NOTES)
  private String lineNotes;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private List<OrderDetailResponseLinesInnerShipmentDetailsInner> shipmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderDetailResponseLinesInnerAdditionalAttributesInner> additionalAttributes;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<OrderDetailResponseLinesInnerLinksInner> links;

  public OrderDetailResponseLinesInner() {
  }

  public OrderDetailResponseLinesInner subOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
    return this;
  }

   /**
   * The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest the reseller. The middle number is the order number. The two-digit suffix is the sub order number.
   * @return subOrderNumber
  **/
  @javax.annotation.Nullable
  public String getSubOrderNumber() {
    return subOrderNumber;
  }

  public void setSubOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderDetailResponseLinesInner ingramOrderLineNumber(String ingramOrderLineNumber) {
    this.ingramOrderLineNumber = ingramOrderLineNumber;
    return this;
  }

   /**
   * Unique Ingram Micro line number. Starts with 001.
   * @return ingramOrderLineNumber
  **/
  @javax.annotation.Nullable
  public String getIngramOrderLineNumber() {
    return ingramOrderLineNumber;
  }

  public void setIngramOrderLineNumber(String ingramOrderLineNumber) {
    this.ingramOrderLineNumber = ingramOrderLineNumber;
  }


  public OrderDetailResponseLinesInner vendorSalesOrderLineNumber(String vendorSalesOrderLineNumber) {
    this.vendorSalesOrderLineNumber = vendorSalesOrderLineNumber;
    return this;
  }

   /**
   * The vendor&#39;s sales order line number.
   * @return vendorSalesOrderLineNumber
  **/
  @javax.annotation.Nullable
  public String getVendorSalesOrderLineNumber() {
    return vendorSalesOrderLineNumber;
  }

  public void setVendorSalesOrderLineNumber(String vendorSalesOrderLineNumber) {
    this.vendorSalesOrderLineNumber = vendorSalesOrderLineNumber;
  }


  public OrderDetailResponseLinesInner customerLinenumber(String customerLinenumber) {
    this.customerLinenumber = customerLinenumber;
    return this;
  }

   /**
   * The reseller&#39;s line item number for reference in their system.
   * @return customerLinenumber
  **/
  @javax.annotation.Nullable
  public String getCustomerLinenumber() {
    return customerLinenumber;
  }

  public void setCustomerLinenumber(String customerLinenumber) {
    this.customerLinenumber = customerLinenumber;
  }


  public OrderDetailResponseLinesInner lineStatus(String lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

   /**
   * The status for the line item in the order. One of- Backordered, In Progress, Shipped, Delivered, Canceled, On Hold
   * @return lineStatus
  **/
  @javax.annotation.Nullable
  public String getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(String lineStatus) {
    this.lineStatus = lineStatus;
  }


  public OrderDetailResponseLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * Unique IngramMicro part number.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderDetailResponseLinesInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendor&#39;s part number for the line item.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public OrderDetailResponseLinesInner vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * The vendor&#39;s name for the part in their system.
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public OrderDetailResponseLinesInner partDescription(String partDescription) {
    this.partDescription = partDescription;
    return this;
  }

   /**
   * The vendor&#39;s description of the part in their system.
   * @return partDescription
  **/
  @javax.annotation.Nullable
  public String getPartDescription() {
    return partDescription;
  }

  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
  }


  public OrderDetailResponseLinesInner unitWeight(BigDecimal unitWeight) {
    this.unitWeight = unitWeight;
    return this;
  }

   /**
   * The unit weight of the line item.
   * @return unitWeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnitWeight() {
    return unitWeight;
  }

  public void setUnitWeight(BigDecimal unitWeight) {
    this.unitWeight = unitWeight;
  }


  public OrderDetailResponseLinesInner weightUom(String weightUom) {
    this.weightUom = weightUom;
    return this;
  }

   /**
   * The unit of measure for the line item.
   * @return weightUom
  **/
  @javax.annotation.Nullable
  public String getWeightUom() {
    return weightUom;
  }

  public void setWeightUom(String weightUom) {
    this.weightUom = weightUom;
  }


  public OrderDetailResponseLinesInner unitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price of the line item.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public Integer getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderDetailResponseLinesInner upcCode(String upcCode) {
    this.upcCode = upcCode;
    return this;
  }

   /**
   * The UPC code of a product.
   * @return upcCode
  **/
  @javax.annotation.Nullable
  public String getUpcCode() {
    return upcCode;
  }

  public void setUpcCode(String upcCode) {
    this.upcCode = upcCode;
  }


  public OrderDetailResponseLinesInner extendedPrice(BigDecimal extendedPrice) {
    this.extendedPrice = extendedPrice;
    return this;
  }

   /**
   * Unit price X quantity for the line item.
   * @return extendedPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedPrice() {
    return extendedPrice;
  }

  public void setExtendedPrice(BigDecimal extendedPrice) {
    this.extendedPrice = extendedPrice;
  }


  public OrderDetailResponseLinesInner taxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The tax amount for the line item.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }


  public OrderDetailResponseLinesInner currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The country-specific three character ISO 4217 currency code for the line item.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public OrderDetailResponseLinesInner quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The quantity ordered of the line item.
   * @return quantityOrdered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderDetailResponseLinesInner quantityConfirmed(Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
    return this;
  }

   /**
   * The quantity confirmed for the line item.
   * @return quantityConfirmed
  **/
  @javax.annotation.Nullable
  public Integer getQuantityConfirmed() {
    return quantityConfirmed;
  }

  public void setQuantityConfirmed(Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
  }


  public OrderDetailResponseLinesInner quantityBackOrdered(Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
    return this;
  }

   /**
   * The quantity backordered for the line item.
   * @return quantityBackOrdered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityBackOrdered() {
    return quantityBackOrdered;
  }

  public void setQuantityBackOrdered(Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
  }


  public OrderDetailResponseLinesInner specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * The line-level bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number in the case of split orders or where different line items have different bid numbers. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderDetailResponseLinesInner requestedDeliveryDate(LocalDate requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

   /**
   * Reseller-requested delivery date. Delivery date is not guaranteed.
   * @return requestedDeliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(LocalDate requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }


  public OrderDetailResponseLinesInner promisedDeliveryDate(LocalDate promisedDeliveryDate) {
    this.promisedDeliveryDate = promisedDeliveryDate;
    return this;
  }

   /**
   * The delivery date promised by IngramMicro.
   * @return promisedDeliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getPromisedDeliveryDate() {
    return promisedDeliveryDate;
  }

  public void setPromisedDeliveryDate(LocalDate promisedDeliveryDate) {
    this.promisedDeliveryDate = promisedDeliveryDate;
  }


  public OrderDetailResponseLinesInner lineNotes(String lineNotes) {
    this.lineNotes = lineNotes;
    return this;
  }

   /**
   * Line-level notes for the order.
   * @return lineNotes
  **/
  @javax.annotation.Nullable
  public String getLineNotes() {
    return lineNotes;
  }

  public void setLineNotes(String lineNotes) {
    this.lineNotes = lineNotes;
  }


  public OrderDetailResponseLinesInner shipmentDetails(List<OrderDetailResponseLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  public OrderDetailResponseLinesInner addShipmentDetailsItem(OrderDetailResponseLinesInnerShipmentDetailsInner shipmentDetailsItem) {
    if (this.shipmentDetails == null) {
      this.shipmentDetails = new ArrayList<>();
    }
    this.shipmentDetails.add(shipmentDetailsItem);
    return this;
  }

   /**
   * Get shipmentDetails
   * @return shipmentDetails
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseLinesInnerShipmentDetailsInner> getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(List<OrderDetailResponseLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public OrderDetailResponseLinesInner additionalAttributes(List<OrderDetailResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderDetailResponseLinesInner addAdditionalAttributesItem(OrderDetailResponseLinesInnerAdditionalAttributesInner additionalAttributesItem) {
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
  public List<OrderDetailResponseLinesInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderDetailResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public OrderDetailResponseLinesInner links(List<OrderDetailResponseLinesInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public OrderDetailResponseLinesInner addLinksItem(OrderDetailResponseLinesInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseLinesInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<OrderDetailResponseLinesInnerLinksInner> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponseLinesInner orderDetailResponseLinesInner = (OrderDetailResponseLinesInner) o;
    return Objects.equals(this.subOrderNumber, orderDetailResponseLinesInner.subOrderNumber) &&
        Objects.equals(this.ingramOrderLineNumber, orderDetailResponseLinesInner.ingramOrderLineNumber) &&
        Objects.equals(this.vendorSalesOrderLineNumber, orderDetailResponseLinesInner.vendorSalesOrderLineNumber) &&
        Objects.equals(this.customerLinenumber, orderDetailResponseLinesInner.customerLinenumber) &&
        Objects.equals(this.lineStatus, orderDetailResponseLinesInner.lineStatus) &&
        Objects.equals(this.ingramPartNumber, orderDetailResponseLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, orderDetailResponseLinesInner.vendorPartNumber) &&
        Objects.equals(this.vendorName, orderDetailResponseLinesInner.vendorName) &&
        Objects.equals(this.partDescription, orderDetailResponseLinesInner.partDescription) &&
        Objects.equals(this.unitWeight, orderDetailResponseLinesInner.unitWeight) &&
        Objects.equals(this.weightUom, orderDetailResponseLinesInner.weightUom) &&
        Objects.equals(this.unitPrice, orderDetailResponseLinesInner.unitPrice) &&
        Objects.equals(this.upcCode, orderDetailResponseLinesInner.upcCode) &&
        Objects.equals(this.extendedPrice, orderDetailResponseLinesInner.extendedPrice) &&
        Objects.equals(this.taxAmount, orderDetailResponseLinesInner.taxAmount) &&
        Objects.equals(this.currencyCode, orderDetailResponseLinesInner.currencyCode) &&
        Objects.equals(this.quantityOrdered, orderDetailResponseLinesInner.quantityOrdered) &&
        Objects.equals(this.quantityConfirmed, orderDetailResponseLinesInner.quantityConfirmed) &&
        Objects.equals(this.quantityBackOrdered, orderDetailResponseLinesInner.quantityBackOrdered) &&
        Objects.equals(this.specialBidNumber, orderDetailResponseLinesInner.specialBidNumber) &&
        Objects.equals(this.requestedDeliveryDate, orderDetailResponseLinesInner.requestedDeliveryDate) &&
        Objects.equals(this.promisedDeliveryDate, orderDetailResponseLinesInner.promisedDeliveryDate) &&
        Objects.equals(this.lineNotes, orderDetailResponseLinesInner.lineNotes) &&
        Objects.equals(this.shipmentDetails, orderDetailResponseLinesInner.shipmentDetails) &&
        Objects.equals(this.additionalAttributes, orderDetailResponseLinesInner.additionalAttributes) &&
        Objects.equals(this.links, orderDetailResponseLinesInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderNumber, ingramOrderLineNumber, vendorSalesOrderLineNumber, customerLinenumber, lineStatus, ingramPartNumber, vendorPartNumber, vendorName, partDescription, unitWeight, weightUom, unitPrice, upcCode, extendedPrice, taxAmount, currencyCode, quantityOrdered, quantityConfirmed, quantityBackOrdered, specialBidNumber, requestedDeliveryDate, promisedDeliveryDate, lineNotes, shipmentDetails, additionalAttributes, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponseLinesInner {\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    ingramOrderLineNumber: ").append(toIndentedString(ingramOrderLineNumber)).append("\n");
    sb.append("    vendorSalesOrderLineNumber: ").append(toIndentedString(vendorSalesOrderLineNumber)).append("\n");
    sb.append("    customerLinenumber: ").append(toIndentedString(customerLinenumber)).append("\n");
    sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    partDescription: ").append(toIndentedString(partDescription)).append("\n");
    sb.append("    unitWeight: ").append(toIndentedString(unitWeight)).append("\n");
    sb.append("    weightUom: ").append(toIndentedString(weightUom)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    upcCode: ").append(toIndentedString(upcCode)).append("\n");
    sb.append("    extendedPrice: ").append(toIndentedString(extendedPrice)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityConfirmed: ").append(toIndentedString(quantityConfirmed)).append("\n");
    sb.append("    quantityBackOrdered: ").append(toIndentedString(quantityBackOrdered)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    promisedDeliveryDate: ").append(toIndentedString(promisedDeliveryDate)).append("\n");
    sb.append("    lineNotes: ").append(toIndentedString(lineNotes)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("subOrderNumber");
    openapiFields.add("ingramOrderLineNumber");
    openapiFields.add("vendorSalesOrderLineNumber");
    openapiFields.add("customerLinenumber");
    openapiFields.add("lineStatus");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("vendorName");
    openapiFields.add("partDescription");
    openapiFields.add("unitWeight");
    openapiFields.add("weightUom");
    openapiFields.add("unitPrice");
    openapiFields.add("upcCode");
    openapiFields.add("extendedPrice");
    openapiFields.add("taxAmount");
    openapiFields.add("currencyCode");
    openapiFields.add("quantityOrdered");
    openapiFields.add("quantityConfirmed");
    openapiFields.add("quantityBackOrdered");
    openapiFields.add("specialBidNumber");
    openapiFields.add("requestedDeliveryDate");
    openapiFields.add("promisedDeliveryDate");
    openapiFields.add("lineNotes");
    openapiFields.add("shipmentDetails");
    openapiFields.add("additionalAttributes");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponseLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponseLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponseLinesInner is not found in the empty JSON string", OrderDetailResponseLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponseLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponseLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subOrderNumber") != null && !jsonObj.get("subOrderNumber").isJsonNull()) && !jsonObj.get("subOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramOrderLineNumber") != null && !jsonObj.get("ingramOrderLineNumber").isJsonNull()) && !jsonObj.get("ingramOrderLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderLineNumber").toString()));
      }
      if ((jsonObj.get("vendorSalesOrderLineNumber") != null && !jsonObj.get("vendorSalesOrderLineNumber").isJsonNull()) && !jsonObj.get("vendorSalesOrderLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorSalesOrderLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorSalesOrderLineNumber").toString()));
      }
      if ((jsonObj.get("customerLinenumber") != null && !jsonObj.get("customerLinenumber").isJsonNull()) && !jsonObj.get("customerLinenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLinenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLinenumber").toString()));
      }
      if ((jsonObj.get("lineStatus") != null && !jsonObj.get("lineStatus").isJsonNull()) && !jsonObj.get("lineStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineStatus").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("partDescription") != null && !jsonObj.get("partDescription").isJsonNull()) && !jsonObj.get("partDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partDescription").toString()));
      }
      if ((jsonObj.get("weightUom") != null && !jsonObj.get("weightUom").isJsonNull()) && !jsonObj.get("weightUom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weightUom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weightUom").toString()));
      }
      if ((jsonObj.get("upcCode") != null && !jsonObj.get("upcCode").isJsonNull()) && !jsonObj.get("upcCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upcCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upcCode").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("lineNotes") != null && !jsonObj.get("lineNotes").isJsonNull()) && !jsonObj.get("lineNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineNotes").toString()));
      }
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipmentDetails");
        if (jsonArrayshipmentDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipmentDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipmentDetails` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentDetails").toString()));
          }

          // validate the optional field `shipmentDetails` (array)
          for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
            OrderDetailResponseLinesInnerShipmentDetailsInner.validateJsonElement(jsonArrayshipmentDetails.get(i));
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
            OrderDetailResponseLinesInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            OrderDetailResponseLinesInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponseLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponseLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponseLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponseLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponseLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponseLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponseLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponseLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponseLinesInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponseLinesInner
  */
  public static OrderDetailResponseLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponseLinesInner.class);
  }

 /**
  * Convert an instance of OrderDetailResponseLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

