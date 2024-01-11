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
 * OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner {
  public static final String SERIALIZED_NAME_SERIALNUMBER = "serialnumber";
  @SerializedName(SERIALIZED_NAME_SERIALNUMBER)
  private String serialnumber;

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner() {
  }

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner serialnumber(String serialnumber) {
    this.serialnumber = serialnumber;
    return this;
  }

   /**
   * serial number of the ordered SKU
   * @return serialnumber
  **/
  @javax.annotation.Nullable
  public String getSerialnumber() {
    return serialnumber;
  }

  public void setSerialnumber(String serialnumber) {
    this.serialnumber = serialnumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner orderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner = (OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner) o;
    return Objects.equals(this.serialnumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.serialnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner {\n");
    sb.append("    serialnumber: ").append(toIndentedString(serialnumber)).append("\n");
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
    openapiFields.add("serialnumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner is not found in the empty JSON string", OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("serialnumber") != null && !jsonObj.get("serialnumber").isJsonNull()) && !jsonObj.get("serialnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialnumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner
  */
  public static OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.class);
  }

 /**
  * Convert an instance of OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

