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
 * OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T11:49:36.439472Z[Etc/UTC]")
public class OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner {
  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner() {
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serial number for the line item.                  
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner orderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner = (OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner) o;
    return Objects.equals(this.serialNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner {\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
    openapiFields.add("serialNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner is not found in the empty JSON string", OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner
  */
  public static OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.class);
  }

 /**
  * Convert an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

