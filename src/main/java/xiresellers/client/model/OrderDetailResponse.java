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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderDetailResponseBillToInfo;
import xiresellers.client.model.OrderDetailResponseEndUserInfo;
import xiresellers.client.model.OrderDetailResponseLinesInner;
import xiresellers.client.model.OrderDetailResponseLinesInnerAdditionalAttributesInner;
import xiresellers.client.model.OrderDetailResponseMiscellaneousChargesInner;
import xiresellers.client.model.OrderDetailResponseShipToInfo;

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
 * OrderDetailResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T08:56:25.348026Z[Etc/UTC]")
public class OrderDetailResponse {
  public static final String SERIALIZED_NAME_INGRAM_ORDER_NUMBER = "ingramOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_NUMBER)
  private String ingramOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_DATE = "ingramOrderDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_DATE)
  private String ingramOrderDate;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "orderType";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private String orderType;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_VENDOR_SALES_ORDER_NUMBER = "vendorSalesOrderNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_SALES_ORDER_NUMBER)
  private String vendorSalesOrderNumber;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "orderTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private BigDecimal orderTotal;

  public static final String SERIALIZED_NAME_ORDER_SUB_TOTAL = "orderSubTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_SUB_TOTAL)
  private BigDecimal orderSubTotal;

  public static final String SERIALIZED_NAME_FREIGHT_CHARGES = "freightCharges";
  @SerializedName(SERIALIZED_NAME_FREIGHT_CHARGES)
  private BigDecimal freightCharges;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TOTAL_WEIGHT = "totalWeight";
  @SerializedName(SERIALIZED_NAME_TOTAL_WEIGHT)
  private BigDecimal totalWeight;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "totalTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private BigDecimal totalTax;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS = "paymentTerms";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS)
  private String paymentTerms;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_BILL_TO_INFO = "billToInfo";
  @SerializedName(SERIALIZED_NAME_BILL_TO_INFO)
  private OrderDetailResponseBillToInfo billToInfo;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private OrderDetailResponseShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private OrderDetailResponseEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderDetailResponseLinesInner> lines;

  public static final String SERIALIZED_NAME_MISCELLANEOUS_CHARGES = "miscellaneousCharges";
  @SerializedName(SERIALIZED_NAME_MISCELLANEOUS_CHARGES)
  private List<OrderDetailResponseMiscellaneousChargesInner> miscellaneousCharges;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderDetailResponseLinesInnerAdditionalAttributesInner> additionalAttributes;

  public OrderDetailResponse() {
  }

  public OrderDetailResponse ingramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
    return this;
  }

   /**
   * The IngramMicro sales order number.
   * @return ingramOrderNumber
  **/
  @javax.annotation.Nullable
  public String getIngramOrderNumber() {
    return ingramOrderNumber;
  }

  public void setIngramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
  }


  public OrderDetailResponse ingramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
    return this;
  }

   /**
   * The date and time in UTC format that the order was created.
   * @return ingramOrderDate
  **/
  @javax.annotation.Nullable
  public String getIngramOrderDate() {
    return ingramOrderDate;
  }

  public void setIngramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
  }


  public OrderDetailResponse orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * The order type. One of B &#x3D; Branch Transfer, C &#x3D; COD, D &#x3D; Direct Ship, F &#x3D; Future Order, P &#x3D; Special Order, M &#x3D; Memo, Q &#x3D; Quote, S &#x3D; Sales Order.
   * @return orderType
  **/
  @javax.annotation.Nullable
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public OrderDetailResponse customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public OrderDetailResponse endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

   /**
   * The end user/customer&#39;s order number for reference in their system.
   * @return endCustomerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public OrderDetailResponse vendorSalesOrderNumber(String vendorSalesOrderNumber) {
    this.vendorSalesOrderNumber = vendorSalesOrderNumber;
    return this;
  }

   /**
   * The vendor&#39;s order number for reference in their system.
   * @return vendorSalesOrderNumber
  **/
  @javax.annotation.Nullable
  public String getVendorSalesOrderNumber() {
    return vendorSalesOrderNumber;
  }

  public void setVendorSalesOrderNumber(String vendorSalesOrderNumber) {
    this.vendorSalesOrderNumber = vendorSalesOrderNumber;
  }


  public OrderDetailResponse orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * The header-level status of the order. One of- Shipped, Canceled, Backordered, Processing, On Hold, Delivered.
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public OrderDetailResponse orderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * The total cost for the order, includes subtotal, freight charges, and tax.
   * @return orderTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
  }


  public OrderDetailResponse orderSubTotal(BigDecimal orderSubTotal) {
    this.orderSubTotal = orderSubTotal;
    return this;
  }

   /**
   * The sub total cost for the order, not including tax and freight.
   * @return orderSubTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrderSubTotal() {
    return orderSubTotal;
  }

  public void setOrderSubTotal(BigDecimal orderSubTotal) {
    this.orderSubTotal = orderSubTotal;
  }


  public OrderDetailResponse freightCharges(BigDecimal freightCharges) {
    this.freightCharges = freightCharges;
    return this;
  }

   /**
   * The freight charges for the order.
   * @return freightCharges
  **/
  @javax.annotation.Nullable
  public BigDecimal getFreightCharges() {
    return freightCharges;
  }

  public void setFreightCharges(BigDecimal freightCharges) {
    this.freightCharges = freightCharges;
  }


  public OrderDetailResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The country-specific three digit ISO 4217 currency code for the order.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public OrderDetailResponse totalWeight(BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * The total weight of the order. Pounds in North America, KG in all other countries.
   * @return totalWeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
  }


  public OrderDetailResponse totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * The total tax for the order.
   * @return totalTax
  **/
  @javax.annotation.Nullable
  public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }


  public OrderDetailResponse paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * The payment terms of the order. (Ex- Net 30 days).
   * @return paymentTerms
  **/
  @javax.annotation.Nullable
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }


  public OrderDetailResponse notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * The header-level notes for the order.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderDetailResponse billToInfo(OrderDetailResponseBillToInfo billToInfo) {
    this.billToInfo = billToInfo;
    return this;
  }

   /**
   * Get billToInfo
   * @return billToInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseBillToInfo getBillToInfo() {
    return billToInfo;
  }

  public void setBillToInfo(OrderDetailResponseBillToInfo billToInfo) {
    this.billToInfo = billToInfo;
  }


  public OrderDetailResponse shipToInfo(OrderDetailResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

   /**
   * Get shipToInfo
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderDetailResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderDetailResponse endUserInfo(OrderDetailResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(OrderDetailResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public OrderDetailResponse lines(List<OrderDetailResponseLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderDetailResponse addLinesItem(OrderDetailResponseLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderDetailResponseLinesInner> lines) {
    this.lines = lines;
  }


  public OrderDetailResponse miscellaneousCharges(List<OrderDetailResponseMiscellaneousChargesInner> miscellaneousCharges) {
    this.miscellaneousCharges = miscellaneousCharges;
    return this;
  }

  public OrderDetailResponse addMiscellaneousChargesItem(OrderDetailResponseMiscellaneousChargesInner miscellaneousChargesItem) {
    if (this.miscellaneousCharges == null) {
      this.miscellaneousCharges = new ArrayList<>();
    }
    this.miscellaneousCharges.add(miscellaneousChargesItem);
    return this;
  }

   /**
   * Get miscellaneousCharges
   * @return miscellaneousCharges
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseMiscellaneousChargesInner> getMiscellaneousCharges() {
    return miscellaneousCharges;
  }

  public void setMiscellaneousCharges(List<OrderDetailResponseMiscellaneousChargesInner> miscellaneousCharges) {
    this.miscellaneousCharges = miscellaneousCharges;
  }


  public OrderDetailResponse additionalAttributes(List<OrderDetailResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderDetailResponse addAdditionalAttributesItem(OrderDetailResponseLinesInnerAdditionalAttributesInner additionalAttributesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponse orderDetailResponse = (OrderDetailResponse) o;
    return Objects.equals(this.ingramOrderNumber, orderDetailResponse.ingramOrderNumber) &&
        Objects.equals(this.ingramOrderDate, orderDetailResponse.ingramOrderDate) &&
        Objects.equals(this.orderType, orderDetailResponse.orderType) &&
        Objects.equals(this.customerOrderNumber, orderDetailResponse.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, orderDetailResponse.endCustomerOrderNumber) &&
        Objects.equals(this.vendorSalesOrderNumber, orderDetailResponse.vendorSalesOrderNumber) &&
        Objects.equals(this.orderStatus, orderDetailResponse.orderStatus) &&
        Objects.equals(this.orderTotal, orderDetailResponse.orderTotal) &&
        Objects.equals(this.orderSubTotal, orderDetailResponse.orderSubTotal) &&
        Objects.equals(this.freightCharges, orderDetailResponse.freightCharges) &&
        Objects.equals(this.currencyCode, orderDetailResponse.currencyCode) &&
        Objects.equals(this.totalWeight, orderDetailResponse.totalWeight) &&
        Objects.equals(this.totalTax, orderDetailResponse.totalTax) &&
        Objects.equals(this.paymentTerms, orderDetailResponse.paymentTerms) &&
        Objects.equals(this.notes, orderDetailResponse.notes) &&
        Objects.equals(this.billToInfo, orderDetailResponse.billToInfo) &&
        Objects.equals(this.shipToInfo, orderDetailResponse.shipToInfo) &&
        Objects.equals(this.endUserInfo, orderDetailResponse.endUserInfo) &&
        Objects.equals(this.lines, orderDetailResponse.lines) &&
        Objects.equals(this.miscellaneousCharges, orderDetailResponse.miscellaneousCharges) &&
        Objects.equals(this.additionalAttributes, orderDetailResponse.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramOrderNumber, ingramOrderDate, orderType, customerOrderNumber, endCustomerOrderNumber, vendorSalesOrderNumber, orderStatus, orderTotal, orderSubTotal, freightCharges, currencyCode, totalWeight, totalTax, paymentTerms, notes, billToInfo, shipToInfo, endUserInfo, lines, miscellaneousCharges, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponse {\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    ingramOrderDate: ").append(toIndentedString(ingramOrderDate)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    vendorSalesOrderNumber: ").append(toIndentedString(vendorSalesOrderNumber)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    orderSubTotal: ").append(toIndentedString(orderSubTotal)).append("\n");
    sb.append("    freightCharges: ").append(toIndentedString(freightCharges)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    billToInfo: ").append(toIndentedString(billToInfo)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    miscellaneousCharges: ").append(toIndentedString(miscellaneousCharges)).append("\n");
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
    openapiFields.add("ingramOrderNumber");
    openapiFields.add("ingramOrderDate");
    openapiFields.add("orderType");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("vendorSalesOrderNumber");
    openapiFields.add("orderStatus");
    openapiFields.add("orderTotal");
    openapiFields.add("orderSubTotal");
    openapiFields.add("freightCharges");
    openapiFields.add("currencyCode");
    openapiFields.add("totalWeight");
    openapiFields.add("totalTax");
    openapiFields.add("paymentTerms");
    openapiFields.add("notes");
    openapiFields.add("billToInfo");
    openapiFields.add("shipToInfo");
    openapiFields.add("endUserInfo");
    openapiFields.add("lines");
    openapiFields.add("miscellaneousCharges");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponse is not found in the empty JSON string", OrderDetailResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramOrderNumber") != null && !jsonObj.get("ingramOrderNumber").isJsonNull()) && !jsonObj.get("ingramOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramOrderDate") != null && !jsonObj.get("ingramOrderDate").isJsonNull()) && !jsonObj.get("ingramOrderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderDate").toString()));
      }
      if ((jsonObj.get("orderType") != null && !jsonObj.get("orderType").isJsonNull()) && !jsonObj.get("orderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderType").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("vendorSalesOrderNumber") != null && !jsonObj.get("vendorSalesOrderNumber").isJsonNull()) && !jsonObj.get("vendorSalesOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorSalesOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorSalesOrderNumber").toString()));
      }
      if ((jsonObj.get("orderStatus") != null && !jsonObj.get("orderStatus").isJsonNull()) && !jsonObj.get("orderStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderStatus").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("paymentTerms") != null && !jsonObj.get("paymentTerms").isJsonNull()) && !jsonObj.get("paymentTerms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTerms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTerms").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      // validate the optional field `billToInfo`
      if (jsonObj.get("billToInfo") != null && !jsonObj.get("billToInfo").isJsonNull()) {
        OrderDetailResponseBillToInfo.validateJsonElement(jsonObj.get("billToInfo"));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderDetailResponseShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        OrderDetailResponseEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            OrderDetailResponseLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if (jsonObj.get("miscellaneousCharges") != null && !jsonObj.get("miscellaneousCharges").isJsonNull()) {
        JsonArray jsonArraymiscellaneousCharges = jsonObj.getAsJsonArray("miscellaneousCharges");
        if (jsonArraymiscellaneousCharges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("miscellaneousCharges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `miscellaneousCharges` to be an array in the JSON string but got `%s`", jsonObj.get("miscellaneousCharges").toString()));
          }

          // validate the optional field `miscellaneousCharges` (array)
          for (int i = 0; i < jsonArraymiscellaneousCharges.size(); i++) {
            OrderDetailResponseMiscellaneousChargesInner.validateJsonElement(jsonArraymiscellaneousCharges.get(i));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponse>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponse
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponse
  */
  public static OrderDetailResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponse.class);
  }

 /**
  * Convert an instance of OrderDetailResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

