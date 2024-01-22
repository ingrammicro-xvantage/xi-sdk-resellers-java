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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.InvoiceDetailResponseServiceresponseResponsepreamble;
import xiresellers.client.model.OrderCreateResponseServiceresponseOrdercreateresponseInner;
import xiresellers.client.model.OrderCreateResponseServiceresponseOrdersummary;

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
 * OrderCreateResponseServiceresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderCreateResponseServiceresponse {
  public static final String SERIALIZED_NAME_RESPONSEPREAMBLE = "responsepreamble";
  @SerializedName(SERIALIZED_NAME_RESPONSEPREAMBLE)
  private InvoiceDetailResponseServiceresponseResponsepreamble responsepreamble;

  public static final String SERIALIZED_NAME_ORDERSUMMARY = "ordersummary";
  @SerializedName(SERIALIZED_NAME_ORDERSUMMARY)
  private OrderCreateResponseServiceresponseOrdersummary ordersummary;

  public static final String SERIALIZED_NAME_ORDERCREATERESPONSE = "ordercreateresponse";
  @SerializedName(SERIALIZED_NAME_ORDERCREATERESPONSE)
  private List<OrderCreateResponseServiceresponseOrdercreateresponseInner> ordercreateresponse;

  public OrderCreateResponseServiceresponse() {
  }

  public OrderCreateResponseServiceresponse responsepreamble(InvoiceDetailResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
    return this;
  }

   /**
   * Get responsepreamble
   * @return responsepreamble
  **/
  @javax.annotation.Nullable
  public InvoiceDetailResponseServiceresponseResponsepreamble getResponsepreamble() {
    return responsepreamble;
  }

  public void setResponsepreamble(InvoiceDetailResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
  }


  public OrderCreateResponseServiceresponse ordersummary(OrderCreateResponseServiceresponseOrdersummary ordersummary) {
    this.ordersummary = ordersummary;
    return this;
  }

   /**
   * Get ordersummary
   * @return ordersummary
  **/
  @javax.annotation.Nullable
  public OrderCreateResponseServiceresponseOrdersummary getOrdersummary() {
    return ordersummary;
  }

  public void setOrdersummary(OrderCreateResponseServiceresponseOrdersummary ordersummary) {
    this.ordersummary = ordersummary;
  }


  public OrderCreateResponseServiceresponse ordercreateresponse(List<OrderCreateResponseServiceresponseOrdercreateresponseInner> ordercreateresponse) {
    this.ordercreateresponse = ordercreateresponse;
    return this;
  }

  public OrderCreateResponseServiceresponse addOrdercreateresponseItem(OrderCreateResponseServiceresponseOrdercreateresponseInner ordercreateresponseItem) {
    if (this.ordercreateresponse == null) {
      this.ordercreateresponse = new ArrayList<>();
    }
    this.ordercreateresponse.add(ordercreateresponseItem);
    return this;
  }

   /**
   * Collection of orders
   * @return ordercreateresponse
  **/
  @javax.annotation.Nullable
  public List<OrderCreateResponseServiceresponseOrdercreateresponseInner> getOrdercreateresponse() {
    return ordercreateresponse;
  }

  public void setOrdercreateresponse(List<OrderCreateResponseServiceresponseOrdercreateresponseInner> ordercreateresponse) {
    this.ordercreateresponse = ordercreateresponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseServiceresponse orderCreateResponseServiceresponse = (OrderCreateResponseServiceresponse) o;
    return Objects.equals(this.responsepreamble, orderCreateResponseServiceresponse.responsepreamble) &&
        Objects.equals(this.ordersummary, orderCreateResponseServiceresponse.ordersummary) &&
        Objects.equals(this.ordercreateresponse, orderCreateResponseServiceresponse.ordercreateresponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsepreamble, ordersummary, ordercreateresponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseServiceresponse {\n");
    sb.append("    responsepreamble: ").append(toIndentedString(responsepreamble)).append("\n");
    sb.append("    ordersummary: ").append(toIndentedString(ordersummary)).append("\n");
    sb.append("    ordercreateresponse: ").append(toIndentedString(ordercreateresponse)).append("\n");
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
    openapiFields.add("responsepreamble");
    openapiFields.add("ordersummary");
    openapiFields.add("ordercreateresponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseServiceresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseServiceresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseServiceresponse is not found in the empty JSON string", OrderCreateResponseServiceresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseServiceresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseServiceresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `responsepreamble`
      if (jsonObj.get("responsepreamble") != null && !jsonObj.get("responsepreamble").isJsonNull()) {
        InvoiceDetailResponseServiceresponseResponsepreamble.validateJsonElement(jsonObj.get("responsepreamble"));
      }
      // validate the optional field `ordersummary`
      if (jsonObj.get("ordersummary") != null && !jsonObj.get("ordersummary").isJsonNull()) {
        OrderCreateResponseServiceresponseOrdersummary.validateJsonElement(jsonObj.get("ordersummary"));
      }
      if (jsonObj.get("ordercreateresponse") != null && !jsonObj.get("ordercreateresponse").isJsonNull()) {
        JsonArray jsonArrayordercreateresponse = jsonObj.getAsJsonArray("ordercreateresponse");
        if (jsonArrayordercreateresponse != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ordercreateresponse").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ordercreateresponse` to be an array in the JSON string but got `%s`", jsonObj.get("ordercreateresponse").toString()));
          }

          // validate the optional field `ordercreateresponse` (array)
          for (int i = 0; i < jsonArrayordercreateresponse.size(); i++) {
            OrderCreateResponseServiceresponseOrdercreateresponseInner.validateJsonElement(jsonArrayordercreateresponse.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseServiceresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseServiceresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseServiceresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseServiceresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseServiceresponse>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseServiceresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseServiceresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponseServiceresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponseServiceresponse
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseServiceresponse
  */
  public static OrderCreateResponseServiceresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseServiceresponse.class);
  }

 /**
  * Convert an instance of OrderCreateResponseServiceresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

