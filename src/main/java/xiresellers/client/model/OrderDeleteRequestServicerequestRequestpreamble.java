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
 * OrderDeleteRequestServicerequestRequestpreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderDeleteRequestServicerequestRequestpreamble {
  public static final String SERIALIZED_NAME_ISOCOUNTRYCODE = "isocountrycode";
  @SerializedName(SERIALIZED_NAME_ISOCOUNTRYCODE)
  private String isocountrycode;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private String customerNumber;

  public OrderDeleteRequestServicerequestRequestpreamble() {
  }

  public OrderDeleteRequestServicerequestRequestpreamble isocountrycode(String isocountrycode) {
    this.isocountrycode = isocountrycode;
    return this;
  }

   /**
   * Country that Order is being place in.
   * @return isocountrycode
  **/
  @javax.annotation.Nonnull
  public String getIsocountrycode() {
    return isocountrycode;
  }

  public void setIsocountrycode(String isocountrycode) {
    this.isocountrycode = isocountrycode;
  }


  public OrderDeleteRequestServicerequestRequestpreamble customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Account number order will be billed to. INGRAM MICRO ACCOUNT NUMBER REQUIRED
   * @return customerNumber
  **/
  @javax.annotation.Nonnull
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeleteRequestServicerequestRequestpreamble orderDeleteRequestServicerequestRequestpreamble = (OrderDeleteRequestServicerequestRequestpreamble) o;
    return Objects.equals(this.isocountrycode, orderDeleteRequestServicerequestRequestpreamble.isocountrycode) &&
        Objects.equals(this.customerNumber, orderDeleteRequestServicerequestRequestpreamble.customerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isocountrycode, customerNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeleteRequestServicerequestRequestpreamble {\n");
    sb.append("    isocountrycode: ").append(toIndentedString(isocountrycode)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
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
    openapiFields.add("isocountrycode");
    openapiFields.add("customerNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isocountrycode");
    openapiRequiredFields.add("customerNumber");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDeleteRequestServicerequestRequestpreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDeleteRequestServicerequestRequestpreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDeleteRequestServicerequestRequestpreamble is not found in the empty JSON string", OrderDeleteRequestServicerequestRequestpreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDeleteRequestServicerequestRequestpreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDeleteRequestServicerequestRequestpreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDeleteRequestServicerequestRequestpreamble.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("isocountrycode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isocountrycode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isocountrycode").toString()));
      }
      if (!jsonObj.get("customerNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDeleteRequestServicerequestRequestpreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDeleteRequestServicerequestRequestpreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDeleteRequestServicerequestRequestpreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDeleteRequestServicerequestRequestpreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDeleteRequestServicerequestRequestpreamble>() {
           @Override
           public void write(JsonWriter out, OrderDeleteRequestServicerequestRequestpreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDeleteRequestServicerequestRequestpreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDeleteRequestServicerequestRequestpreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDeleteRequestServicerequestRequestpreamble
  * @throws IOException if the JSON string is invalid with respect to OrderDeleteRequestServicerequestRequestpreamble
  */
  public static OrderDeleteRequestServicerequestRequestpreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDeleteRequestServicerequestRequestpreamble.class);
  }

 /**
  * Convert an instance of OrderDeleteRequestServicerequestRequestpreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

