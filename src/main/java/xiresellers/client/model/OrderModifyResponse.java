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
import xiresellers.client.model.OrderModifyResponseLinesInner;
import xiresellers.client.model.OrderModifyResponseLinesInnerAdditionalAttributesInner;
import xiresellers.client.model.OrderModifyResponseRejectedLineItemsInner;
import xiresellers.client.model.OrderModifyResponseShipToInfo;

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
 * OrderModifyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T08:56:25.348026Z[Etc/UTC]")
public class OrderModifyResponse {
  public static final String SERIALIZED_NAME_INGRAM_ORDER_NUMBER = "ingramOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_NUMBER)
  private String ingramOrderNumber;

  public static final String SERIALIZED_NAME_CHANGE_DESCRIPTION = "changeDescription";
  @SerializedName(SERIALIZED_NAME_CHANGE_DESCRIPTION)
  private String changeDescription;

  public static final String SERIALIZED_NAME_ORDER_MODIFIED_DATE = "orderModifiedDate";
  @SerializedName(SERIALIZED_NAME_ORDER_MODIFIED_DATE)
  private String orderModifiedDate;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "orderTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private BigDecimal orderTotal;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_ORDER_SUB_TOTAL = "orderSubTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_SUB_TOTAL)
  private BigDecimal orderSubTotal;

  public static final String SERIALIZED_NAME_FREIGHT_CHARGES = "freightCharges";
  @SerializedName(SERIALIZED_NAME_FREIGHT_CHARGES)
  private BigDecimal freightCharges;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "totalTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private BigDecimal totalTax;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private OrderModifyResponseShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderModifyResponseLinesInner> lines;

  public static final String SERIALIZED_NAME_REJECTED_LINE_ITEMS = "rejectedLineItems";
  @SerializedName(SERIALIZED_NAME_REJECTED_LINE_ITEMS)
  private List<OrderModifyResponseRejectedLineItemsInner> rejectedLineItems;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderModifyResponseLinesInnerAdditionalAttributesInner> additionalAttributes;

  public OrderModifyResponse() {
  }

  public OrderModifyResponse ingramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
    return this;
  }

   /**
   * The IngramMicro order number.
   * @return ingramOrderNumber
  **/
  @javax.annotation.Nullable
  public String getIngramOrderNumber() {
    return ingramOrderNumber;
  }

  public void setIngramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
  }


  public OrderModifyResponse changeDescription(String changeDescription) {
    this.changeDescription = changeDescription;
    return this;
  }

   /**
   * The description of the change.
   * @return changeDescription
  **/
  @javax.annotation.Nullable
  public String getChangeDescription() {
    return changeDescription;
  }

  public void setChangeDescription(String changeDescription) {
    this.changeDescription = changeDescription;
  }


  public OrderModifyResponse orderModifiedDate(String orderModifiedDate) {
    this.orderModifiedDate = orderModifiedDate;
    return this;
  }

   /**
   * The date the order was modified.
   * @return orderModifiedDate
  **/
  @javax.annotation.Nullable
  public String getOrderModifiedDate() {
    return orderModifiedDate;
  }

  public void setOrderModifiedDate(String orderModifiedDate) {
    this.orderModifiedDate = orderModifiedDate;
  }


  public OrderModifyResponse customerOrderNumber(String customerOrderNumber) {
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


  public OrderModifyResponse endCustomerOrderNumber(String endCustomerOrderNumber) {
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


  public OrderModifyResponse orderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * The total for the order.
   * @return orderTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
  }


  public OrderModifyResponse notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Order-level notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderModifyResponse orderSubTotal(BigDecimal orderSubTotal) {
    this.orderSubTotal = orderSubTotal;
    return this;
  }

   /**
   * The sub total for the order.
   * @return orderSubTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrderSubTotal() {
    return orderSubTotal;
  }

  public void setOrderSubTotal(BigDecimal orderSubTotal) {
    this.orderSubTotal = orderSubTotal;
  }


  public OrderModifyResponse freightCharges(BigDecimal freightCharges) {
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


  public OrderModifyResponse totalTax(BigDecimal totalTax) {
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


  public OrderModifyResponse orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * The status of the order. One of the following. Backordered, In Progress, Shipped, Delivered, Canceled, On Hold
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public OrderModifyResponse billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

   /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit.
   * @return billToAddressId
  **/
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public OrderModifyResponse shipToInfo(OrderModifyResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

   /**
   * Get shipToInfo
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public OrderModifyResponseShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderModifyResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderModifyResponse lines(List<OrderModifyResponseLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderModifyResponse addLinesItem(OrderModifyResponseLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * The line-level details for the order.
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<OrderModifyResponseLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderModifyResponseLinesInner> lines) {
    this.lines = lines;
  }


  public OrderModifyResponse rejectedLineItems(List<OrderModifyResponseRejectedLineItemsInner> rejectedLineItems) {
    this.rejectedLineItems = rejectedLineItems;
    return this;
  }

  public OrderModifyResponse addRejectedLineItemsItem(OrderModifyResponseRejectedLineItemsInner rejectedLineItemsItem) {
    if (this.rejectedLineItems == null) {
      this.rejectedLineItems = new ArrayList<>();
    }
    this.rejectedLineItems.add(rejectedLineItemsItem);
    return this;
  }

   /**
   * Details for failed lines in the order.
   * @return rejectedLineItems
  **/
  @javax.annotation.Nullable
  public List<OrderModifyResponseRejectedLineItemsInner> getRejectedLineItems() {
    return rejectedLineItems;
  }

  public void setRejectedLineItems(List<OrderModifyResponseRejectedLineItemsInner> rejectedLineItems) {
    this.rejectedLineItems = rejectedLineItems;
  }


  public OrderModifyResponse additionalAttributes(List<OrderModifyResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderModifyResponse addAdditionalAttributesItem(OrderModifyResponseLinesInnerAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Header-level additional attributes.
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<OrderModifyResponseLinesInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderModifyResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
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
    OrderModifyResponse orderModifyResponse = (OrderModifyResponse) o;
    return Objects.equals(this.ingramOrderNumber, orderModifyResponse.ingramOrderNumber) &&
        Objects.equals(this.changeDescription, orderModifyResponse.changeDescription) &&
        Objects.equals(this.orderModifiedDate, orderModifyResponse.orderModifiedDate) &&
        Objects.equals(this.customerOrderNumber, orderModifyResponse.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, orderModifyResponse.endCustomerOrderNumber) &&
        Objects.equals(this.orderTotal, orderModifyResponse.orderTotal) &&
        Objects.equals(this.notes, orderModifyResponse.notes) &&
        Objects.equals(this.orderSubTotal, orderModifyResponse.orderSubTotal) &&
        Objects.equals(this.freightCharges, orderModifyResponse.freightCharges) &&
        Objects.equals(this.totalTax, orderModifyResponse.totalTax) &&
        Objects.equals(this.orderStatus, orderModifyResponse.orderStatus) &&
        Objects.equals(this.billToAddressId, orderModifyResponse.billToAddressId) &&
        Objects.equals(this.shipToInfo, orderModifyResponse.shipToInfo) &&
        Objects.equals(this.lines, orderModifyResponse.lines) &&
        Objects.equals(this.rejectedLineItems, orderModifyResponse.rejectedLineItems) &&
        Objects.equals(this.additionalAttributes, orderModifyResponse.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramOrderNumber, changeDescription, orderModifiedDate, customerOrderNumber, endCustomerOrderNumber, orderTotal, notes, orderSubTotal, freightCharges, totalTax, orderStatus, billToAddressId, shipToInfo, lines, rejectedLineItems, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyResponse {\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    changeDescription: ").append(toIndentedString(changeDescription)).append("\n");
    sb.append("    orderModifiedDate: ").append(toIndentedString(orderModifiedDate)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    orderSubTotal: ").append(toIndentedString(orderSubTotal)).append("\n");
    sb.append("    freightCharges: ").append(toIndentedString(freightCharges)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    rejectedLineItems: ").append(toIndentedString(rejectedLineItems)).append("\n");
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
    openapiFields.add("changeDescription");
    openapiFields.add("orderModifiedDate");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("orderTotal");
    openapiFields.add("notes");
    openapiFields.add("orderSubTotal");
    openapiFields.add("freightCharges");
    openapiFields.add("totalTax");
    openapiFields.add("orderStatus");
    openapiFields.add("billToAddressId");
    openapiFields.add("shipToInfo");
    openapiFields.add("lines");
    openapiFields.add("rejectedLineItems");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyResponse is not found in the empty JSON string", OrderModifyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramOrderNumber") != null && !jsonObj.get("ingramOrderNumber").isJsonNull()) && !jsonObj.get("ingramOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderNumber").toString()));
      }
      if ((jsonObj.get("changeDescription") != null && !jsonObj.get("changeDescription").isJsonNull()) && !jsonObj.get("changeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeDescription").toString()));
      }
      if ((jsonObj.get("orderModifiedDate") != null && !jsonObj.get("orderModifiedDate").isJsonNull()) && !jsonObj.get("orderModifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderModifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderModifiedDate").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("orderStatus") != null && !jsonObj.get("orderStatus").isJsonNull()) && !jsonObj.get("orderStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderStatus").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderModifyResponseShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
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
            OrderModifyResponseLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if (jsonObj.get("rejectedLineItems") != null && !jsonObj.get("rejectedLineItems").isJsonNull()) {
        JsonArray jsonArrayrejectedLineItems = jsonObj.getAsJsonArray("rejectedLineItems");
        if (jsonArrayrejectedLineItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rejectedLineItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rejectedLineItems` to be an array in the JSON string but got `%s`", jsonObj.get("rejectedLineItems").toString()));
          }

          // validate the optional field `rejectedLineItems` (array)
          for (int i = 0; i < jsonArrayrejectedLineItems.size(); i++) {
            OrderModifyResponseRejectedLineItemsInner.validateJsonElement(jsonArrayrejectedLineItems.get(i));
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
            OrderModifyResponseLinesInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyResponse>() {
           @Override
           public void write(JsonWriter out, OrderModifyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyResponse
  * @throws IOException if the JSON string is invalid with respect to OrderModifyResponse
  */
  public static OrderModifyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyResponse.class);
  }

 /**
  * Convert an instance of OrderModifyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

