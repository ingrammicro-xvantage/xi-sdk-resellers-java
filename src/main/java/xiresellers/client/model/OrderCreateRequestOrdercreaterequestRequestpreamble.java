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
 * OrderCreateRequestOrdercreaterequestRequestpreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderCreateRequestOrdercreaterequestRequestpreamble {
  public static final String SERIALIZED_NAME_ISOCOUNTRYCODE = "isocountrycode";
  @SerializedName(SERIALIZED_NAME_ISOCOUNTRYCODE)
  private String isocountrycode;

  public static final String SERIALIZED_NAME_CUSTOMERNUMBER = "customernumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERNUMBER)
  private String customernumber;

  public OrderCreateRequestOrdercreaterequestRequestpreamble() {
  }

  public OrderCreateRequestOrdercreaterequestRequestpreamble isocountrycode(String isocountrycode) {
    this.isocountrycode = isocountrycode;
    return this;
  }

   /**
   * 2 digit ISO country code
   * @return isocountrycode
  **/
  @javax.annotation.Nonnull
  public String getIsocountrycode() {
    return isocountrycode;
  }

  public void setIsocountrycode(String isocountrycode) {
    this.isocountrycode = isocountrycode;
  }


  public OrderCreateRequestOrdercreaterequestRequestpreamble customernumber(String customernumber) {
    this.customernumber = customernumber;
    return this;
  }

   /**
   * Your unique Ingram Micro customer number
   * @return customernumber
  **/
  @javax.annotation.Nonnull
  public String getCustomernumber() {
    return customernumber;
  }

  public void setCustomernumber(String customernumber) {
    this.customernumber = customernumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateRequestOrdercreaterequestRequestpreamble orderCreateRequestOrdercreaterequestRequestpreamble = (OrderCreateRequestOrdercreaterequestRequestpreamble) o;
    return Objects.equals(this.isocountrycode, orderCreateRequestOrdercreaterequestRequestpreamble.isocountrycode) &&
        Objects.equals(this.customernumber, orderCreateRequestOrdercreaterequestRequestpreamble.customernumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isocountrycode, customernumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequestOrdercreaterequestRequestpreamble {\n");
    sb.append("    isocountrycode: ").append(toIndentedString(isocountrycode)).append("\n");
    sb.append("    customernumber: ").append(toIndentedString(customernumber)).append("\n");
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
    openapiFields.add("customernumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isocountrycode");
    openapiRequiredFields.add("customernumber");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequestOrdercreaterequestRequestpreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequestOrdercreaterequestRequestpreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequestOrdercreaterequestRequestpreamble is not found in the empty JSON string", OrderCreateRequestOrdercreaterequestRequestpreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequestOrdercreaterequestRequestpreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequestOrdercreaterequestRequestpreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreateRequestOrdercreaterequestRequestpreamble.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("isocountrycode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isocountrycode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isocountrycode").toString()));
      }
      if (!jsonObj.get("customernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customernumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequestOrdercreaterequestRequestpreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequestOrdercreaterequestRequestpreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequestOrdercreaterequestRequestpreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequestOrdercreaterequestRequestpreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequestOrdercreaterequestRequestpreamble>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequestOrdercreaterequestRequestpreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequestOrdercreaterequestRequestpreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateRequestOrdercreaterequestRequestpreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateRequestOrdercreaterequestRequestpreamble
  * @throws IOException if the JSON string is invalid with respect to OrderCreateRequestOrdercreaterequestRequestpreamble
  */
  public static OrderCreateRequestOrdercreaterequestRequestpreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequestOrdercreaterequestRequestpreamble.class);
  }

 /**
  * Convert an instance of OrderCreateRequestOrdercreaterequestRequestpreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

