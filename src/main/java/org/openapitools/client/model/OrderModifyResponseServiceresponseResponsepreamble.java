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
 * OrderModifyResponseServiceresponseResponsepreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderModifyResponseServiceresponseResponsepreamble {
  public static final String SERIALIZED_NAME_RESPONSESTATUS = "responsestatus";
  @SerializedName(SERIALIZED_NAME_RESPONSESTATUS)
  private String responsestatus;

  public static final String SERIALIZED_NAME_RESPONSEMESSAGE = "responsemessage";
  @SerializedName(SERIALIZED_NAME_RESPONSEMESSAGE)
  private String responsemessage;

  public OrderModifyResponseServiceresponseResponsepreamble() {
  }

  public OrderModifyResponseServiceresponseResponsepreamble responsestatus(String responsestatus) {
    this.responsestatus = responsestatus;
    return this;
  }

   /**
   * Get responsestatus
   * @return responsestatus
  **/
  @javax.annotation.Nullable
  public String getResponsestatus() {
    return responsestatus;
  }

  public void setResponsestatus(String responsestatus) {
    this.responsestatus = responsestatus;
  }


  public OrderModifyResponseServiceresponseResponsepreamble responsemessage(String responsemessage) {
    this.responsemessage = responsemessage;
    return this;
  }

   /**
   * Get responsemessage
   * @return responsemessage
  **/
  @javax.annotation.Nullable
  public String getResponsemessage() {
    return responsemessage;
  }

  public void setResponsemessage(String responsemessage) {
    this.responsemessage = responsemessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyResponseServiceresponseResponsepreamble orderModifyResponseServiceresponseResponsepreamble = (OrderModifyResponseServiceresponseResponsepreamble) o;
    return Objects.equals(this.responsestatus, orderModifyResponseServiceresponseResponsepreamble.responsestatus) &&
        Objects.equals(this.responsemessage, orderModifyResponseServiceresponseResponsepreamble.responsemessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsestatus, responsemessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyResponseServiceresponseResponsepreamble {\n");
    sb.append("    responsestatus: ").append(toIndentedString(responsestatus)).append("\n");
    sb.append("    responsemessage: ").append(toIndentedString(responsemessage)).append("\n");
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
    openapiFields.add("responsestatus");
    openapiFields.add("responsemessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyResponseServiceresponseResponsepreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyResponseServiceresponseResponsepreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyResponseServiceresponseResponsepreamble is not found in the empty JSON string", OrderModifyResponseServiceresponseResponsepreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyResponseServiceresponseResponsepreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyResponseServiceresponseResponsepreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("responsestatus") != null && !jsonObj.get("responsestatus").isJsonNull()) && !jsonObj.get("responsestatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responsestatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responsestatus").toString()));
      }
      if ((jsonObj.get("responsemessage") != null && !jsonObj.get("responsemessage").isJsonNull()) && !jsonObj.get("responsemessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responsemessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responsemessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyResponseServiceresponseResponsepreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyResponseServiceresponseResponsepreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyResponseServiceresponseResponsepreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyResponseServiceresponseResponsepreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyResponseServiceresponseResponsepreamble>() {
           @Override
           public void write(JsonWriter out, OrderModifyResponseServiceresponseResponsepreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyResponseServiceresponseResponsepreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyResponseServiceresponseResponsepreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyResponseServiceresponseResponsepreamble
  * @throws IOException if the JSON string is invalid with respect to OrderModifyResponseServiceresponseResponsepreamble
  */
  public static OrderModifyResponseServiceresponseResponsepreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyResponseServiceresponseResponsepreamble.class);
  }

 /**
  * Convert an instance of OrderModifyResponseServiceresponseResponsepreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

