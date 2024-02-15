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
import xiresellers.client.model.OrderCancelResponseServiceresponse;

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
 * Response schema for order delete endpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class OrderCancelResponse {
  public static final String SERIALIZED_NAME_SERVICERESPONSE = "serviceresponse";
  @SerializedName(SERIALIZED_NAME_SERVICERESPONSE)
  private OrderCancelResponseServiceresponse serviceresponse;

  public OrderCancelResponse() {
  }

  public OrderCancelResponse serviceresponse(OrderCancelResponseServiceresponse serviceresponse) {
    this.serviceresponse = serviceresponse;
    return this;
  }

   /**
   * Get serviceresponse
   * @return serviceresponse
  **/
  @javax.annotation.Nullable
  public OrderCancelResponseServiceresponse getServiceresponse() {
    return serviceresponse;
  }

  public void setServiceresponse(OrderCancelResponseServiceresponse serviceresponse) {
    this.serviceresponse = serviceresponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCancelResponse orderCancelResponse = (OrderCancelResponse) o;
    return Objects.equals(this.serviceresponse, orderCancelResponse.serviceresponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceresponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCancelResponse {\n");
    sb.append("    serviceresponse: ").append(toIndentedString(serviceresponse)).append("\n");
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
    openapiFields.add("serviceresponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCancelResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCancelResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCancelResponse is not found in the empty JSON string", OrderCancelResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCancelResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCancelResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `serviceresponse`
      if (jsonObj.get("serviceresponse") != null && !jsonObj.get("serviceresponse").isJsonNull()) {
        OrderCancelResponseServiceresponse.validateJsonElement(jsonObj.get("serviceresponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCancelResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCancelResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCancelResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCancelResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCancelResponse>() {
           @Override
           public void write(JsonWriter out, OrderCancelResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCancelResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCancelResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCancelResponse
  * @throws IOException if the JSON string is invalid with respect to OrderCancelResponse
  */
  public static OrderCancelResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCancelResponse.class);
  }

 /**
  * Convert an instance of OrderCancelResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

