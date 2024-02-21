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
import xiresellers.client.model.OrderSearchResponseOrdersInnerLinks;
import xiresellers.client.model.OrderSearchResponseOrdersInnerSubOrdersInner;

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
 * OrderSearchResponseOrdersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T11:49:36.439472Z[Etc/UTC]")
public class OrderSearchResponseOrdersInner {
  public static final String SERIALIZED_NAME_INGRAM_ORDER_NUMBER = "ingramOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_NUMBER)
  private String ingramOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_DATE = "ingramOrderDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_DATE)
  private String ingramOrderDate;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_VENDOR_SALES_ORDER_NUMBER = "vendorSalesOrderNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_SALES_ORDER_NUMBER)
  private String vendorSalesOrderNumber;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_END_USER_COMPANY_NAME = "endUserCompanyName";
  @SerializedName(SERIALIZED_NAME_END_USER_COMPANY_NAME)
  private String endUserCompanyName;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "orderTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private BigDecimal orderTotal;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_SUB_ORDERS = "subOrders";
  @SerializedName(SERIALIZED_NAME_SUB_ORDERS)
  private List<OrderSearchResponseOrdersInnerSubOrdersInner> subOrders;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private OrderSearchResponseOrdersInnerLinks links;

  public OrderSearchResponseOrdersInner() {
  }

  public OrderSearchResponseOrdersInner ingramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
    return this;
  }

   /**
   * The Ingram Micro order number.
   * @return ingramOrderNumber
  **/
  @javax.annotation.Nullable
  public String getIngramOrderNumber() {
    return ingramOrderNumber;
  }

  public void setIngramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
  }


  public OrderSearchResponseOrdersInner ingramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
    return this;
  }

   /**
   * The date the order was created(UTC).
   * @return ingramOrderDate
  **/
  @javax.annotation.Nullable
  public String getIngramOrderDate() {
    return ingramOrderDate;
  }

  public void setIngramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
  }


  public OrderSearchResponseOrdersInner customerOrderNumber(String customerOrderNumber) {
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


  public OrderSearchResponseOrdersInner vendorSalesOrderNumber(String vendorSalesOrderNumber) {
    this.vendorSalesOrderNumber = vendorSalesOrderNumber;
    return this;
  }

   /**
   * The vendor&#39;s order number.(only for D-Type Orders)
   * @return vendorSalesOrderNumber
  **/
  @javax.annotation.Nullable
  public String getVendorSalesOrderNumber() {
    return vendorSalesOrderNumber;
  }

  public void setVendorSalesOrderNumber(String vendorSalesOrderNumber) {
    this.vendorSalesOrderNumber = vendorSalesOrderNumber;
  }


  public OrderSearchResponseOrdersInner vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * The name of the vendor.
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public OrderSearchResponseOrdersInner endUserCompanyName(String endUserCompanyName) {
    this.endUserCompanyName = endUserCompanyName;
    return this;
  }

   /**
   * The company name of the end user/customer.
   * @return endUserCompanyName
  **/
  @javax.annotation.Nullable
  public String getEndUserCompanyName() {
    return endUserCompanyName;
  }

  public void setEndUserCompanyName(String endUserCompanyName) {
    this.endUserCompanyName = endUserCompanyName;
  }


  public OrderSearchResponseOrdersInner orderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * The total of the order.
   * @return orderTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
  }


  public OrderSearchResponseOrdersInner orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * The header-level status of the order.(OPEN/CLOSED/CANCELLED)
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public OrderSearchResponseOrdersInner subOrders(List<OrderSearchResponseOrdersInnerSubOrdersInner> subOrders) {
    this.subOrders = subOrders;
    return this;
  }

  public OrderSearchResponseOrdersInner addSubOrdersItem(OrderSearchResponseOrdersInnerSubOrdersInner subOrdersItem) {
    if (this.subOrders == null) {
      this.subOrders = new ArrayList<>();
    }
    this.subOrders.add(subOrdersItem);
    return this;
  }

   /**
   * Individual Ingram Micro order numbers associated with a single reseller PO.
   * @return subOrders
  **/
  @javax.annotation.Nullable
  public List<OrderSearchResponseOrdersInnerSubOrdersInner> getSubOrders() {
    return subOrders;
  }

  public void setSubOrders(List<OrderSearchResponseOrdersInnerSubOrdersInner> subOrders) {
    this.subOrders = subOrders;
  }


  public OrderSearchResponseOrdersInner links(OrderSearchResponseOrdersInnerLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public OrderSearchResponseOrdersInnerLinks getLinks() {
    return links;
  }

  public void setLinks(OrderSearchResponseOrdersInnerLinks links) {
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
    OrderSearchResponseOrdersInner orderSearchResponseOrdersInner = (OrderSearchResponseOrdersInner) o;
    return Objects.equals(this.ingramOrderNumber, orderSearchResponseOrdersInner.ingramOrderNumber) &&
        Objects.equals(this.ingramOrderDate, orderSearchResponseOrdersInner.ingramOrderDate) &&
        Objects.equals(this.customerOrderNumber, orderSearchResponseOrdersInner.customerOrderNumber) &&
        Objects.equals(this.vendorSalesOrderNumber, orderSearchResponseOrdersInner.vendorSalesOrderNumber) &&
        Objects.equals(this.vendorName, orderSearchResponseOrdersInner.vendorName) &&
        Objects.equals(this.endUserCompanyName, orderSearchResponseOrdersInner.endUserCompanyName) &&
        Objects.equals(this.orderTotal, orderSearchResponseOrdersInner.orderTotal) &&
        Objects.equals(this.orderStatus, orderSearchResponseOrdersInner.orderStatus) &&
        Objects.equals(this.subOrders, orderSearchResponseOrdersInner.subOrders) &&
        Objects.equals(this.links, orderSearchResponseOrdersInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramOrderNumber, ingramOrderDate, customerOrderNumber, vendorSalesOrderNumber, vendorName, endUserCompanyName, orderTotal, orderStatus, subOrders, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchResponseOrdersInner {\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    ingramOrderDate: ").append(toIndentedString(ingramOrderDate)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    vendorSalesOrderNumber: ").append(toIndentedString(vendorSalesOrderNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    endUserCompanyName: ").append(toIndentedString(endUserCompanyName)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    subOrders: ").append(toIndentedString(subOrders)).append("\n");
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
    openapiFields.add("ingramOrderNumber");
    openapiFields.add("ingramOrderDate");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("vendorSalesOrderNumber");
    openapiFields.add("vendorName");
    openapiFields.add("endUserCompanyName");
    openapiFields.add("orderTotal");
    openapiFields.add("orderStatus");
    openapiFields.add("subOrders");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchResponseOrdersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchResponseOrdersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchResponseOrdersInner is not found in the empty JSON string", OrderSearchResponseOrdersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchResponseOrdersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchResponseOrdersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramOrderNumber") != null && !jsonObj.get("ingramOrderNumber").isJsonNull()) && !jsonObj.get("ingramOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramOrderDate") != null && !jsonObj.get("ingramOrderDate").isJsonNull()) && !jsonObj.get("ingramOrderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderDate").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("vendorSalesOrderNumber") != null && !jsonObj.get("vendorSalesOrderNumber").isJsonNull()) && !jsonObj.get("vendorSalesOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorSalesOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorSalesOrderNumber").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("endUserCompanyName") != null && !jsonObj.get("endUserCompanyName").isJsonNull()) && !jsonObj.get("endUserCompanyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserCompanyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserCompanyName").toString()));
      }
      if ((jsonObj.get("orderStatus") != null && !jsonObj.get("orderStatus").isJsonNull()) && !jsonObj.get("orderStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderStatus").toString()));
      }
      if (jsonObj.get("subOrders") != null && !jsonObj.get("subOrders").isJsonNull()) {
        JsonArray jsonArraysubOrders = jsonObj.getAsJsonArray("subOrders");
        if (jsonArraysubOrders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subOrders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subOrders` to be an array in the JSON string but got `%s`", jsonObj.get("subOrders").toString()));
          }

          // validate the optional field `subOrders` (array)
          for (int i = 0; i < jsonArraysubOrders.size(); i++) {
            OrderSearchResponseOrdersInnerSubOrdersInner.validateJsonElement(jsonArraysubOrders.get(i));
          };
        }
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        OrderSearchResponseOrdersInnerLinks.validateJsonElement(jsonObj.get("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchResponseOrdersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchResponseOrdersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchResponseOrdersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchResponseOrdersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchResponseOrdersInner>() {
           @Override
           public void write(JsonWriter out, OrderSearchResponseOrdersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchResponseOrdersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchResponseOrdersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchResponseOrdersInner
  * @throws IOException if the JSON string is invalid with respect to OrderSearchResponseOrdersInner
  */
  public static OrderSearchResponseOrdersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchResponseOrdersInner.class);
  }

 /**
  * Convert an instance of OrderSearchResponseOrdersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

