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
 * OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber {
  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber() {
  }

  public OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * Get customerOrderNumber
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
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
    OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber orderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber = (OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber) o;
    return Objects.equals(this.customerOrderNumber, orderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.customerOrderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber {\n");
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
    openapiFields.add("customerOrderNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber is not found in the empty JSON string", OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber>() {
           @Override
           public void write(JsonWriter out, OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber
  * @throws IOException if the JSON string is invalid with respect to OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber
  */
  public static OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber.class);
  }

 /**
  * Convert an instance of OrderSearchRequestServicerequestOrderLookupRequestCustomerOrderNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

