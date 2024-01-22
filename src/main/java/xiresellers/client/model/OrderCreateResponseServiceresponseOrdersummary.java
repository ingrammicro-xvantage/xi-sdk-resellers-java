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
import xiresellers.client.model.OrderCreateResponseServiceresponseOrdersummaryShiptoaddress;

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
 * OrderCreateResponseServiceresponseOrdersummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderCreateResponseServiceresponseOrdersummary {
  public static final String SERIALIZED_NAME_CUSTOMERPONUMBER = "customerponumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERPONUMBER)
  private String customerponumber;

  public static final String SERIALIZED_NAME_TOTALORDERAMOUNT = "totalorderamount";
  @SerializedName(SERIALIZED_NAME_TOTALORDERAMOUNT)
  private String totalorderamount;

  public static final String SERIALIZED_NAME_TOTALORDERCREATED = "totalordercreated";
  @SerializedName(SERIALIZED_NAME_TOTALORDERCREATED)
  private String totalordercreated;

  public static final String SERIALIZED_NAME_SHIPTOADDRESS = "shiptoaddress";
  @SerializedName(SERIALIZED_NAME_SHIPTOADDRESS)
  private OrderCreateResponseServiceresponseOrdersummaryShiptoaddress shiptoaddress;

  public OrderCreateResponseServiceresponseOrdersummary() {
  }

  public OrderCreateResponseServiceresponseOrdersummary customerponumber(String customerponumber) {
    this.customerponumber = customerponumber;
    return this;
  }

   /**
   * Get customerponumber
   * @return customerponumber
  **/
  @javax.annotation.Nullable
  public String getCustomerponumber() {
    return customerponumber;
  }

  public void setCustomerponumber(String customerponumber) {
    this.customerponumber = customerponumber;
  }


  public OrderCreateResponseServiceresponseOrdersummary totalorderamount(String totalorderamount) {
    this.totalorderamount = totalorderamount;
    return this;
  }

   /**
   * Total of all the orders including taxes and fees
   * @return totalorderamount
  **/
  @javax.annotation.Nullable
  public String getTotalorderamount() {
    return totalorderamount;
  }

  public void setTotalorderamount(String totalorderamount) {
    this.totalorderamount = totalorderamount;
  }


  public OrderCreateResponseServiceresponseOrdersummary totalordercreated(String totalordercreated) {
    this.totalordercreated = totalordercreated;
    return this;
  }

   /**
   * Number of orders created, in some cases we may create more than one order.
   * @return totalordercreated
  **/
  @javax.annotation.Nullable
  public String getTotalordercreated() {
    return totalordercreated;
  }

  public void setTotalordercreated(String totalordercreated) {
    this.totalordercreated = totalordercreated;
  }


  public OrderCreateResponseServiceresponseOrdersummary shiptoaddress(OrderCreateResponseServiceresponseOrdersummaryShiptoaddress shiptoaddress) {
    this.shiptoaddress = shiptoaddress;
    return this;
  }

   /**
   * Get shiptoaddress
   * @return shiptoaddress
  **/
  @javax.annotation.Nullable
  public OrderCreateResponseServiceresponseOrdersummaryShiptoaddress getShiptoaddress() {
    return shiptoaddress;
  }

  public void setShiptoaddress(OrderCreateResponseServiceresponseOrdersummaryShiptoaddress shiptoaddress) {
    this.shiptoaddress = shiptoaddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseServiceresponseOrdersummary orderCreateResponseServiceresponseOrdersummary = (OrderCreateResponseServiceresponseOrdersummary) o;
    return Objects.equals(this.customerponumber, orderCreateResponseServiceresponseOrdersummary.customerponumber) &&
        Objects.equals(this.totalorderamount, orderCreateResponseServiceresponseOrdersummary.totalorderamount) &&
        Objects.equals(this.totalordercreated, orderCreateResponseServiceresponseOrdersummary.totalordercreated) &&
        Objects.equals(this.shiptoaddress, orderCreateResponseServiceresponseOrdersummary.shiptoaddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerponumber, totalorderamount, totalordercreated, shiptoaddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseServiceresponseOrdersummary {\n");
    sb.append("    customerponumber: ").append(toIndentedString(customerponumber)).append("\n");
    sb.append("    totalorderamount: ").append(toIndentedString(totalorderamount)).append("\n");
    sb.append("    totalordercreated: ").append(toIndentedString(totalordercreated)).append("\n");
    sb.append("    shiptoaddress: ").append(toIndentedString(shiptoaddress)).append("\n");
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
    openapiFields.add("customerponumber");
    openapiFields.add("totalorderamount");
    openapiFields.add("totalordercreated");
    openapiFields.add("shiptoaddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseServiceresponseOrdersummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseServiceresponseOrdersummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseServiceresponseOrdersummary is not found in the empty JSON string", OrderCreateResponseServiceresponseOrdersummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseServiceresponseOrdersummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseServiceresponseOrdersummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerponumber") != null && !jsonObj.get("customerponumber").isJsonNull()) && !jsonObj.get("customerponumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerponumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerponumber").toString()));
      }
      if ((jsonObj.get("totalorderamount") != null && !jsonObj.get("totalorderamount").isJsonNull()) && !jsonObj.get("totalorderamount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalorderamount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalorderamount").toString()));
      }
      if ((jsonObj.get("totalordercreated") != null && !jsonObj.get("totalordercreated").isJsonNull()) && !jsonObj.get("totalordercreated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalordercreated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalordercreated").toString()));
      }
      // validate the optional field `shiptoaddress`
      if (jsonObj.get("shiptoaddress") != null && !jsonObj.get("shiptoaddress").isJsonNull()) {
        OrderCreateResponseServiceresponseOrdersummaryShiptoaddress.validateJsonElement(jsonObj.get("shiptoaddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseServiceresponseOrdersummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseServiceresponseOrdersummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseServiceresponseOrdersummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseServiceresponseOrdersummary.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseServiceresponseOrdersummary>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseServiceresponseOrdersummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseServiceresponseOrdersummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponseServiceresponseOrdersummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponseServiceresponseOrdersummary
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseServiceresponseOrdersummary
  */
  public static OrderCreateResponseServiceresponseOrdersummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseServiceresponseOrdersummary.class);
  }

 /**
  * Convert an instance of OrderCreateResponseServiceresponseOrdersummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

