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
import java.time.LocalDate;
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
 * OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner {
  public static final String SERIALIZED_NAME_DATEOF_PURCHASE = "dateofPurchase";
  @SerializedName(SERIALIZED_NAME_DATEOF_PURCHASE)
  private LocalDate dateofPurchase;

  public static final String SERIALIZED_NAME_SHIP_DATE = "shipDate";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE)
  private LocalDate shipDate;

  public static final String SERIALIZED_NAME_PRIMARY_SERIAL_NUMBER = "primarySerialNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_SERIAL_NUMBER)
  private String primarySerialNumber;

  public static final String SERIALIZED_NAME_SECONDARY_SERIAL_NUMBER = "secondarySerialNumber";
  @SerializedName(SERIALIZED_NAME_SECONDARY_SERIAL_NUMBER)
  private String secondarySerialNumber;

  public OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner() {
  }

  public OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner dateofPurchase(LocalDate dateofPurchase) {
    this.dateofPurchase = dateofPurchase;
    return this;
  }

   /**
   * Date of purchase of the hardware.
   * @return dateofPurchase
  **/
  @javax.annotation.Nullable
  public LocalDate getDateofPurchase() {
    return dateofPurchase;
  }

  public void setDateofPurchase(LocalDate dateofPurchase) {
    this.dateofPurchase = dateofPurchase;
  }


  public OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner shipDate(LocalDate shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * Vendor specific mandatory field, date of hardware/product shipment from vendor.
   * @return shipDate
  **/
  @javax.annotation.Nullable
  public LocalDate getShipDate() {
    return shipDate;
  }

  public void setShipDate(LocalDate shipDate) {
    this.shipDate = shipDate;
  }


  public OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner primarySerialNumber(String primarySerialNumber) {
    this.primarySerialNumber = primarySerialNumber;
    return this;
  }

   /**
   * Serial number of the hardware/product.
   * @return primarySerialNumber
  **/
  @javax.annotation.Nullable
  public String getPrimarySerialNumber() {
    return primarySerialNumber;
  }

  public void setPrimarySerialNumber(String primarySerialNumber) {
    this.primarySerialNumber = primarySerialNumber;
  }


  public OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner secondarySerialNumber(String secondarySerialNumber) {
    this.secondarySerialNumber = secondarySerialNumber;
    return this;
  }

   /**
   * Serial number of accessory associated with the above hardware/product.
   * @return secondarySerialNumber
  **/
  @javax.annotation.Nullable
  public String getSecondarySerialNumber() {
    return secondarySerialNumber;
  }

  public void setSecondarySerialNumber(String secondarySerialNumber) {
    this.secondarySerialNumber = secondarySerialNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner orderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner = (OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner) o;
    return Objects.equals(this.dateofPurchase, orderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.dateofPurchase) &&
        Objects.equals(this.shipDate, orderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.shipDate) &&
        Objects.equals(this.primarySerialNumber, orderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.primarySerialNumber) &&
        Objects.equals(this.secondarySerialNumber, orderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.secondarySerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateofPurchase, shipDate, primarySerialNumber, secondarySerialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner {\n");
    sb.append("    dateofPurchase: ").append(toIndentedString(dateofPurchase)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    primarySerialNumber: ").append(toIndentedString(primarySerialNumber)).append("\n");
    sb.append("    secondarySerialNumber: ").append(toIndentedString(secondarySerialNumber)).append("\n");
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
    openapiFields.add("dateofPurchase");
    openapiFields.add("shipDate");
    openapiFields.add("primarySerialNumber");
    openapiFields.add("secondarySerialNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner is not found in the empty JSON string", OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("primarySerialNumber") != null && !jsonObj.get("primarySerialNumber").isJsonNull()) && !jsonObj.get("primarySerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primarySerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primarySerialNumber").toString()));
      }
      if ((jsonObj.get("secondarySerialNumber") != null && !jsonObj.get("secondarySerialNumber").isJsonNull()) && !jsonObj.get("secondarySerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondarySerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondarySerialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner
  * @throws IOException if the JSON string is invalid with respect to OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner
  */
  public static OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.class);
  }

 /**
  * Convert an instance of OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
