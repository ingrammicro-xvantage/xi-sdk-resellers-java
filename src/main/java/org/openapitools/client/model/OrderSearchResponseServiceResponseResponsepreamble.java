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
 * OrderSearchResponseServiceResponseResponsepreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderSearchResponseServiceResponseResponsepreamble {
  public static final String SERIALIZED_NAME_REQUESTSTATUS = "requeststatus";
  @SerializedName(SERIALIZED_NAME_REQUESTSTATUS)
  private String requeststatus;

  public static final String SERIALIZED_NAME_RETURNMESSAGE = "returnmessage";
  @SerializedName(SERIALIZED_NAME_RETURNMESSAGE)
  private String returnmessage;

  public OrderSearchResponseServiceResponseResponsepreamble() {
  }

  public OrderSearchResponseServiceResponseResponsepreamble requeststatus(String requeststatus) {
    this.requeststatus = requeststatus;
    return this;
  }

   /**
   * Get requeststatus
   * @return requeststatus
  **/
  @javax.annotation.Nonnull
  public String getRequeststatus() {
    return requeststatus;
  }

  public void setRequeststatus(String requeststatus) {
    this.requeststatus = requeststatus;
  }


  public OrderSearchResponseServiceResponseResponsepreamble returnmessage(String returnmessage) {
    this.returnmessage = returnmessage;
    return this;
  }

   /**
   * Get returnmessage
   * @return returnmessage
  **/
  @javax.annotation.Nonnull
  public String getReturnmessage() {
    return returnmessage;
  }

  public void setReturnmessage(String returnmessage) {
    this.returnmessage = returnmessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSearchResponseServiceResponseResponsepreamble orderSearchResponseServiceResponseResponsepreamble = (OrderSearchResponseServiceResponseResponsepreamble) o;
    return Objects.equals(this.requeststatus, orderSearchResponseServiceResponseResponsepreamble.requeststatus) &&
        Objects.equals(this.returnmessage, orderSearchResponseServiceResponseResponsepreamble.returnmessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requeststatus, returnmessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchResponseServiceResponseResponsepreamble {\n");
    sb.append("    requeststatus: ").append(toIndentedString(requeststatus)).append("\n");
    sb.append("    returnmessage: ").append(toIndentedString(returnmessage)).append("\n");
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
    openapiFields.add("requeststatus");
    openapiFields.add("returnmessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requeststatus");
    openapiRequiredFields.add("returnmessage");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchResponseServiceResponseResponsepreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchResponseServiceResponseResponsepreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchResponseServiceResponseResponsepreamble is not found in the empty JSON string", OrderSearchResponseServiceResponseResponsepreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchResponseServiceResponseResponsepreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchResponseServiceResponseResponsepreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderSearchResponseServiceResponseResponsepreamble.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("requeststatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requeststatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requeststatus").toString()));
      }
      if (!jsonObj.get("returnmessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnmessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnmessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchResponseServiceResponseResponsepreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchResponseServiceResponseResponsepreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchResponseServiceResponseResponsepreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchResponseServiceResponseResponsepreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchResponseServiceResponseResponsepreamble>() {
           @Override
           public void write(JsonWriter out, OrderSearchResponseServiceResponseResponsepreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchResponseServiceResponseResponsepreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchResponseServiceResponseResponsepreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchResponseServiceResponseResponsepreamble
  * @throws IOException if the JSON string is invalid with respect to OrderSearchResponseServiceResponseResponsepreamble
  */
  public static OrderSearchResponseServiceResponseResponsepreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchResponseServiceResponseResponsepreamble.class);
  }

 /**
  * Convert an instance of OrderSearchResponseServiceResponseResponsepreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

