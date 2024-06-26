/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.OrderDetailB2BAdditionalAttributesInner;
import xiresellers.client.model.OrderDetailB2BBillToInfo;
import xiresellers.client.model.OrderDetailB2BEndUserInfo;
import xiresellers.client.model.OrderDetailB2BLinesInner;
import xiresellers.client.model.OrderDetailB2BMiscellaneousChargesInner;
import xiresellers.client.model.OrderDetailB2BShipToInfo;

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
 * OrderDetailB2B
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderDetailB2B {
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

  public static final String SERIALIZED_NAME_WEB_ORDER_ID = "webOrderId";
  @SerializedName(SERIALIZED_NAME_WEB_ORDER_ID)
  private String webOrderId;

  public static final String SERIALIZED_NAME_VENDOR_SALES_ORDER_NUMBER = "vendorSalesOrderNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_SALES_ORDER_NUMBER)
  private String vendorSalesOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_PURCHASE_ORDER_NUMBER = "ingramPurchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PURCHASE_ORDER_NUMBER)
  private String ingramPurchaseOrderNumber;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "orderTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private Double orderTotal;

  public static final String SERIALIZED_NAME_ORDER_SUB_TOTAL = "orderSubTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_SUB_TOTAL)
  private Double orderSubTotal;

  public static final String SERIALIZED_NAME_FREIGHT_CHARGES = "freightCharges";
  @SerializedName(SERIALIZED_NAME_FREIGHT_CHARGES)
  private Double freightCharges;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TOTAL_WEIGHT = "totalWeight";
  @SerializedName(SERIALIZED_NAME_TOTAL_WEIGHT)
  private Double totalWeight;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "totalTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private Double totalTax;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private Double totalFees;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS = "paymentTerms";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS)
  private String paymentTerms;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_BILL_TO_INFO = "billToInfo";
  @SerializedName(SERIALIZED_NAME_BILL_TO_INFO)
  private OrderDetailB2BBillToInfo billToInfo;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private OrderDetailB2BShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private OrderDetailB2BEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderDetailB2BLinesInner> lines;

  public static final String SERIALIZED_NAME_MISCELLANEOUS_CHARGES = "miscellaneousCharges";
  @SerializedName(SERIALIZED_NAME_MISCELLANEOUS_CHARGES)
  private List<OrderDetailB2BMiscellaneousChargesInner> miscellaneousCharges;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderDetailB2BAdditionalAttributesInner> additionalAttributes;

  public OrderDetailB2B() {
  }

  public OrderDetailB2B ingramOrderNumber(String ingramOrderNumber) {
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


  public OrderDetailB2B ingramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
    return this;
  }

   /**
   * The IngramMicro sales order date.
   * @return ingramOrderDate
  **/
  @javax.annotation.Nullable
  public String getIngramOrderDate() {
    return ingramOrderDate;
  }

  public void setIngramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
  }


  public OrderDetailB2B orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * The IngramMicro sales order type.
   * @return orderType
  **/
  @javax.annotation.Nullable
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public OrderDetailB2B customerOrderNumber(String customerOrderNumber) {
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


  public OrderDetailB2B endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

   /**
   * The end customer&#39;s order number for reference in their system.
   * @return endCustomerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public OrderDetailB2B webOrderId(String webOrderId) {
    this.webOrderId = webOrderId;
    return this;
  }

   /**
   * The web order id of the order.
   * @return webOrderId
  **/
  @javax.annotation.Nullable
  public String getWebOrderId() {
    return webOrderId;
  }

  public void setWebOrderId(String webOrderId) {
    this.webOrderId = webOrderId;
  }


  public OrderDetailB2B vendorSalesOrderNumber(String vendorSalesOrderNumber) {
    this.vendorSalesOrderNumber = vendorSalesOrderNumber;
    return this;
  }

   /**
   * The vendor&#39;s order number for reference in their system
   * @return vendorSalesOrderNumber
  **/
  @javax.annotation.Nullable
  public String getVendorSalesOrderNumber() {
    return vendorSalesOrderNumber;
  }

  public void setVendorSalesOrderNumber(String vendorSalesOrderNumber) {
    this.vendorSalesOrderNumber = vendorSalesOrderNumber;
  }


  public OrderDetailB2B ingramPurchaseOrderNumber(String ingramPurchaseOrderNumber) {
    this.ingramPurchaseOrderNumber = ingramPurchaseOrderNumber;
    return this;
  }

   /**
   * Ingram purchase order number.
   * @return ingramPurchaseOrderNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPurchaseOrderNumber() {
    return ingramPurchaseOrderNumber;
  }

  public void setIngramPurchaseOrderNumber(String ingramPurchaseOrderNumber) {
    this.ingramPurchaseOrderNumber = ingramPurchaseOrderNumber;
  }


  public OrderDetailB2B orderStatus(String orderStatus) {
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


  public OrderDetailB2B orderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * The total cost for the order, includes subtotal, freight charges, and tax.
   * @return orderTotal
  **/
  @javax.annotation.Nullable
  public Double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }


  public OrderDetailB2B orderSubTotal(Double orderSubTotal) {
    this.orderSubTotal = orderSubTotal;
    return this;
  }

   /**
   * The sub total cost for the order, not including tax and freight.
   * @return orderSubTotal
  **/
  @javax.annotation.Nullable
  public Double getOrderSubTotal() {
    return orderSubTotal;
  }

  public void setOrderSubTotal(Double orderSubTotal) {
    this.orderSubTotal = orderSubTotal;
  }


  public OrderDetailB2B freightCharges(Double freightCharges) {
    this.freightCharges = freightCharges;
    return this;
  }

   /**
   * The freight charges for the order.
   * @return freightCharges
  **/
  @javax.annotation.Nullable
  public Double getFreightCharges() {
    return freightCharges;
  }

  public void setFreightCharges(Double freightCharges) {
    this.freightCharges = freightCharges;
  }


  public OrderDetailB2B currencyCode(String currencyCode) {
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


  public OrderDetailB2B totalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * Total order weight. unit -- North america - Pounds , other countries will be KG.
   * @return totalWeight
  **/
  @javax.annotation.Nullable
  public Double getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
  }


  public OrderDetailB2B totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Total tax on the orders placed.
   * @return totalTax
  **/
  @javax.annotation.Nullable
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }


  public OrderDetailB2B totalFees(Double totalFees) {
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Total fees on the orders placed.
   * @return totalFees
  **/
  @javax.annotation.Nullable
  public Double getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Double totalFees) {
    this.totalFees = totalFees;
  }


  public OrderDetailB2B paymentTerms(String paymentTerms) {
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


  public OrderDetailB2B notes(String notes) {
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


  public OrderDetailB2B billToInfo(OrderDetailB2BBillToInfo billToInfo) {
    this.billToInfo = billToInfo;
    return this;
  }

   /**
   * Get billToInfo
   * @return billToInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BBillToInfo getBillToInfo() {
    return billToInfo;
  }

  public void setBillToInfo(OrderDetailB2BBillToInfo billToInfo) {
    this.billToInfo = billToInfo;
  }


  public OrderDetailB2B shipToInfo(OrderDetailB2BShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

   /**
   * Get shipToInfo
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderDetailB2BShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderDetailB2B endUserInfo(OrderDetailB2BEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(OrderDetailB2BEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public OrderDetailB2B lines(List<OrderDetailB2BLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderDetailB2B addLinesItem(OrderDetailB2BLinesInner linesItem) {
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
  public List<OrderDetailB2BLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderDetailB2BLinesInner> lines) {
    this.lines = lines;
  }


  public OrderDetailB2B miscellaneousCharges(List<OrderDetailB2BMiscellaneousChargesInner> miscellaneousCharges) {
    this.miscellaneousCharges = miscellaneousCharges;
    return this;
  }

  public OrderDetailB2B addMiscellaneousChargesItem(OrderDetailB2BMiscellaneousChargesInner miscellaneousChargesItem) {
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
  public List<OrderDetailB2BMiscellaneousChargesInner> getMiscellaneousCharges() {
    return miscellaneousCharges;
  }

  public void setMiscellaneousCharges(List<OrderDetailB2BMiscellaneousChargesInner> miscellaneousCharges) {
    this.miscellaneousCharges = miscellaneousCharges;
  }


  public OrderDetailB2B additionalAttributes(List<OrderDetailB2BAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderDetailB2B addAdditionalAttributesItem(OrderDetailB2BAdditionalAttributesInner additionalAttributesItem) {
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
  public List<OrderDetailB2BAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderDetailB2BAdditionalAttributesInner> additionalAttributes) {
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
    OrderDetailB2B orderDetailB2B = (OrderDetailB2B) o;
    return Objects.equals(this.ingramOrderNumber, orderDetailB2B.ingramOrderNumber) &&
        Objects.equals(this.ingramOrderDate, orderDetailB2B.ingramOrderDate) &&
        Objects.equals(this.orderType, orderDetailB2B.orderType) &&
        Objects.equals(this.customerOrderNumber, orderDetailB2B.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, orderDetailB2B.endCustomerOrderNumber) &&
        Objects.equals(this.webOrderId, orderDetailB2B.webOrderId) &&
        Objects.equals(this.vendorSalesOrderNumber, orderDetailB2B.vendorSalesOrderNumber) &&
        Objects.equals(this.ingramPurchaseOrderNumber, orderDetailB2B.ingramPurchaseOrderNumber) &&
        Objects.equals(this.orderStatus, orderDetailB2B.orderStatus) &&
        Objects.equals(this.orderTotal, orderDetailB2B.orderTotal) &&
        Objects.equals(this.orderSubTotal, orderDetailB2B.orderSubTotal) &&
        Objects.equals(this.freightCharges, orderDetailB2B.freightCharges) &&
        Objects.equals(this.currencyCode, orderDetailB2B.currencyCode) &&
        Objects.equals(this.totalWeight, orderDetailB2B.totalWeight) &&
        Objects.equals(this.totalTax, orderDetailB2B.totalTax) &&
        Objects.equals(this.totalFees, orderDetailB2B.totalFees) &&
        Objects.equals(this.paymentTerms, orderDetailB2B.paymentTerms) &&
        Objects.equals(this.notes, orderDetailB2B.notes) &&
        Objects.equals(this.billToInfo, orderDetailB2B.billToInfo) &&
        Objects.equals(this.shipToInfo, orderDetailB2B.shipToInfo) &&
        Objects.equals(this.endUserInfo, orderDetailB2B.endUserInfo) &&
        Objects.equals(this.lines, orderDetailB2B.lines) &&
        Objects.equals(this.miscellaneousCharges, orderDetailB2B.miscellaneousCharges) &&
        Objects.equals(this.additionalAttributes, orderDetailB2B.additionalAttributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramOrderNumber, ingramOrderDate, orderType, customerOrderNumber, endCustomerOrderNumber, webOrderId, vendorSalesOrderNumber, ingramPurchaseOrderNumber, orderStatus, orderTotal, orderSubTotal, freightCharges, currencyCode, totalWeight, totalTax, totalFees, paymentTerms, notes, billToInfo, shipToInfo, endUserInfo, lines, miscellaneousCharges, additionalAttributes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2B {\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    ingramOrderDate: ").append(toIndentedString(ingramOrderDate)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    webOrderId: ").append(toIndentedString(webOrderId)).append("\n");
    sb.append("    vendorSalesOrderNumber: ").append(toIndentedString(vendorSalesOrderNumber)).append("\n");
    sb.append("    ingramPurchaseOrderNumber: ").append(toIndentedString(ingramPurchaseOrderNumber)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    orderSubTotal: ").append(toIndentedString(orderSubTotal)).append("\n");
    sb.append("    freightCharges: ").append(toIndentedString(freightCharges)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
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
    openapiFields.add("webOrderId");
    openapiFields.add("vendorSalesOrderNumber");
    openapiFields.add("ingramPurchaseOrderNumber");
    openapiFields.add("orderStatus");
    openapiFields.add("orderTotal");
    openapiFields.add("orderSubTotal");
    openapiFields.add("freightCharges");
    openapiFields.add("currencyCode");
    openapiFields.add("totalWeight");
    openapiFields.add("totalTax");
    openapiFields.add("totalFees");
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
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2B
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2B.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2B is not found in the empty JSON string", OrderDetailB2B.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2B.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2B` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("webOrderId") != null && !jsonObj.get("webOrderId").isJsonNull()) && !jsonObj.get("webOrderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webOrderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webOrderId").toString()));
      }
      if ((jsonObj.get("vendorSalesOrderNumber") != null && !jsonObj.get("vendorSalesOrderNumber").isJsonNull()) && !jsonObj.get("vendorSalesOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorSalesOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorSalesOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramPurchaseOrderNumber") != null && !jsonObj.get("ingramPurchaseOrderNumber").isJsonNull()) && !jsonObj.get("ingramPurchaseOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPurchaseOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPurchaseOrderNumber").toString()));
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
        OrderDetailB2BBillToInfo.validateJsonElement(jsonObj.get("billToInfo"));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderDetailB2BShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        OrderDetailB2BEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
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
            OrderDetailB2BLinesInner.validateJsonElement(jsonArraylines.get(i));
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
            OrderDetailB2BMiscellaneousChargesInner.validateJsonElement(jsonArraymiscellaneousCharges.get(i));
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
            OrderDetailB2BAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2B.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2B' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2B> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2B.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2B>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2B value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2B read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2B given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2B
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2B
  */
  public static OrderDetailB2B fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2B.class);
  }

 /**
  * Convert an instance of OrderDetailB2B to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

