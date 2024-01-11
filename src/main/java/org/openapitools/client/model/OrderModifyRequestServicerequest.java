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
import java.util.Arrays;
import org.openapitools.client.model.OrderModifyRequestServicerequestOrdermodifyrequest;
import org.openapitools.client.model.OrderModifyRequestServicerequestRequestpreamble;

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
 * OrderModifyRequestServicerequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderModifyRequestServicerequest {
  public static final String SERIALIZED_NAME_REQUESTPREAMBLE = "requestpreamble";
  @SerializedName(SERIALIZED_NAME_REQUESTPREAMBLE)
  private OrderModifyRequestServicerequestRequestpreamble requestpreamble;

  public static final String SERIALIZED_NAME_ORDERMODIFYREQUEST = "ordermodifyrequest";
  @SerializedName(SERIALIZED_NAME_ORDERMODIFYREQUEST)
  private OrderModifyRequestServicerequestOrdermodifyrequest ordermodifyrequest;

  public OrderModifyRequestServicerequest() {
  }

  public OrderModifyRequestServicerequest requestpreamble(OrderModifyRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
    return this;
  }

   /**
   * Get requestpreamble
   * @return requestpreamble
  **/
  @javax.annotation.Nullable
  public OrderModifyRequestServicerequestRequestpreamble getRequestpreamble() {
    return requestpreamble;
  }

  public void setRequestpreamble(OrderModifyRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
  }


  public OrderModifyRequestServicerequest ordermodifyrequest(OrderModifyRequestServicerequestOrdermodifyrequest ordermodifyrequest) {
    this.ordermodifyrequest = ordermodifyrequest;
    return this;
  }

   /**
   * Get ordermodifyrequest
   * @return ordermodifyrequest
  **/
  @javax.annotation.Nullable
  public OrderModifyRequestServicerequestOrdermodifyrequest getOrdermodifyrequest() {
    return ordermodifyrequest;
  }

  public void setOrdermodifyrequest(OrderModifyRequestServicerequestOrdermodifyrequest ordermodifyrequest) {
    this.ordermodifyrequest = ordermodifyrequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyRequestServicerequest orderModifyRequestServicerequest = (OrderModifyRequestServicerequest) o;
    return Objects.equals(this.requestpreamble, orderModifyRequestServicerequest.requestpreamble) &&
        Objects.equals(this.ordermodifyrequest, orderModifyRequestServicerequest.ordermodifyrequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestpreamble, ordermodifyrequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequestServicerequest {\n");
    sb.append("    requestpreamble: ").append(toIndentedString(requestpreamble)).append("\n");
    sb.append("    ordermodifyrequest: ").append(toIndentedString(ordermodifyrequest)).append("\n");
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
    openapiFields.add("requestpreamble");
    openapiFields.add("ordermodifyrequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequestServicerequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequestServicerequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequestServicerequest is not found in the empty JSON string", OrderModifyRequestServicerequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequestServicerequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequestServicerequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `requestpreamble`
      if (jsonObj.get("requestpreamble") != null && !jsonObj.get("requestpreamble").isJsonNull()) {
        OrderModifyRequestServicerequestRequestpreamble.validateJsonElement(jsonObj.get("requestpreamble"));
      }
      // validate the optional field `ordermodifyrequest`
      if (jsonObj.get("ordermodifyrequest") != null && !jsonObj.get("ordermodifyrequest").isJsonNull()) {
        OrderModifyRequestServicerequestOrdermodifyrequest.validateJsonElement(jsonObj.get("ordermodifyrequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyRequestServicerequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequestServicerequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequestServicerequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequestServicerequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequestServicerequest>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequestServicerequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequestServicerequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyRequestServicerequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyRequestServicerequest
  * @throws IOException if the JSON string is invalid with respect to OrderModifyRequestServicerequest
  */
  public static OrderModifyRequestServicerequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequestServicerequest.class);
  }

 /**
  * Convert an instance of OrderModifyRequestServicerequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

