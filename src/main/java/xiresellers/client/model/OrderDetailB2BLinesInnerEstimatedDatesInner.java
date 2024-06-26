/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
import xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery;
import xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerShip;

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
 * OrderDetailB2BLinesInnerEstimatedDatesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderDetailB2BLinesInnerEstimatedDatesInner {
  public static final String SERIALIZED_NAME_SHIP = "ship";
  @SerializedName(SERIALIZED_NAME_SHIP)
  private OrderDetailB2BLinesInnerEstimatedDatesInnerShip ship;

  public static final String SERIALIZED_NAME_DELIVERY = "delivery";
  @SerializedName(SERIALIZED_NAME_DELIVERY)
  private OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery delivery;

  public OrderDetailB2BLinesInnerEstimatedDatesInner() {
  }

  public OrderDetailB2BLinesInnerEstimatedDatesInner ship(OrderDetailB2BLinesInnerEstimatedDatesInnerShip ship) {
    this.ship = ship;
    return this;
  }

   /**
   * Get ship
   * @return ship
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip getShip() {
    return ship;
  }

  public void setShip(OrderDetailB2BLinesInnerEstimatedDatesInnerShip ship) {
    this.ship = ship;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInner delivery(OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery delivery) {
    this.delivery = delivery;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerEstimatedDatesInner orderDetailB2BLinesInnerEstimatedDatesInner = (OrderDetailB2BLinesInnerEstimatedDatesInner) o;
    return Objects.equals(this.ship, orderDetailB2BLinesInnerEstimatedDatesInner.ship) &&
        Objects.equals(this.delivery, orderDetailB2BLinesInnerEstimatedDatesInner.delivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ship, delivery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerEstimatedDatesInner {\n");
    sb.append("    ship: ").append(toIndentedString(ship)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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
    openapiFields.add("ship");
    openapiFields.add("delivery");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerEstimatedDatesInner is not found in the empty JSON string", OrderDetailB2BLinesInnerEstimatedDatesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerEstimatedDatesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ship`
      if (jsonObj.get("ship") != null && !jsonObj.get("ship").isJsonNull()) {
        OrderDetailB2BLinesInnerEstimatedDatesInnerShip.validateJsonElement(jsonObj.get("ship"));
      }
      // validate the optional field `delivery`
      if (jsonObj.get("delivery") != null && !jsonObj.get("delivery").isJsonNull()) {
        OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.validateJsonElement(jsonObj.get("delivery"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerEstimatedDatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerEstimatedDatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerEstimatedDatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerEstimatedDatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerEstimatedDatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerEstimatedDatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerEstimatedDatesInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInner
  */
  public static OrderDetailB2BLinesInnerEstimatedDatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerEstimatedDatesInner.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerEstimatedDatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

