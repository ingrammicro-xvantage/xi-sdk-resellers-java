/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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
import java.util.Arrays;
import xiresellers.client.model.OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber;
import xiresellers.client.model.OrderSearchRequestServicerequestOrderLookupRequestOrderNumber;

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
 * OrderSearchRequestServicerequestOrderLookupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderSearchRequestServicerequestOrderLookupRequest {
  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private OrderSearchRequestServicerequestOrderLookupRequestOrderNumber orderNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber customerOrderNumber;

  public OrderSearchRequestServicerequestOrderLookupRequest() {
  }

  public OrderSearchRequestServicerequestOrderLookupRequest orderNumber(OrderSearchRequestServicerequestOrderLookupRequestOrderNumber orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  public OrderSearchRequestServicerequestOrderLookupRequestOrderNumber getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(OrderSearchRequestServicerequestOrderLookupRequestOrderNumber orderNumber) {
    this.orderNumber = orderNumber;
  }


  public OrderSearchRequestServicerequestOrderLookupRequest customerOrderNumber(OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * Get customerOrderNumber
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSearchRequestServicerequestOrderLookupRequest orderSearchRequestServicerequestOrderLookupRequest = (OrderSearchRequestServicerequestOrderLookupRequest) o;
    return Objects.equals(this.orderNumber, orderSearchRequestServicerequestOrderLookupRequest.orderNumber) &&
        Objects.equals(this.customerOrderNumber, orderSearchRequestServicerequestOrderLookupRequest.customerOrderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, customerOrderNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchRequestServicerequestOrderLookupRequest {\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
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
    openapiFields.add("orderNumber");
    openapiFields.add("customerOrderNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchRequestServicerequestOrderLookupRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchRequestServicerequestOrderLookupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchRequestServicerequestOrderLookupRequest is not found in the empty JSON string", OrderSearchRequestServicerequestOrderLookupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchRequestServicerequestOrderLookupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchRequestServicerequestOrderLookupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `orderNumber`
      if (jsonObj.get("orderNumber") != null && !jsonObj.get("orderNumber").isJsonNull()) {
        OrderSearchRequestServicerequestOrderLookupRequestOrderNumber.validateJsonElement(jsonObj.get("orderNumber"));
      }
      // validate the optional field `customerOrderNumber`
      if (jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) {
        OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.validateJsonElement(jsonObj.get("customerOrderNumber"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchRequestServicerequestOrderLookupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchRequestServicerequestOrderLookupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchRequestServicerequestOrderLookupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchRequestServicerequestOrderLookupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchRequestServicerequestOrderLookupRequest>() {
           @Override
           public void write(JsonWriter out, OrderSearchRequestServicerequestOrderLookupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchRequestServicerequestOrderLookupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchRequestServicerequestOrderLookupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchRequestServicerequestOrderLookupRequest
  * @throws IOException if the JSON string is invalid with respect to OrderSearchRequestServicerequestOrderLookupRequest
  */
  public static OrderSearchRequestServicerequestOrderLookupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchRequestServicerequestOrderLookupRequest.class);
  }

 /**
  * Convert an instance of OrderSearchRequestServicerequestOrderLookupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
