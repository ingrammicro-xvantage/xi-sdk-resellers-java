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
import xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange;

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
 * OrderDetailB2BLinesInnerMultipleShipmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T12:42:01.934049Z[Etc/UTC]")
public class OrderDetailB2BLinesInnerMultipleShipmentsInner {
  public static final String SERIALIZED_NAME_LINE_NUMBER = "lineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private String lineNumber;

  public static final String SERIALIZED_NAME_REQUESTED_QUANTITY = "requestedQuantity";
  @SerializedName(SERIALIZED_NAME_REQUESTED_QUANTITY)
  private String requestedQuantity;

  public static final String SERIALIZED_NAME_CONFIRMED_QUANTITY = "confirmedQuantity";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_QUANTITY)
  private String confirmedQuantity;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_DATE_RANGE = "dateRange";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange dateRange;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_DELIVERY_DATE = "deliveryDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE)
  private String deliveryDate;

  public OrderDetailB2BLinesInnerMultipleShipmentsInner() {
  }

  public OrderDetailB2BLinesInnerMultipleShipmentsInner lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Line number.
   * @return lineNumber
  **/
  @javax.annotation.Nullable
  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner requestedQuantity(String requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
    return this;
  }

   /**
   * Requested quantity.
   * @return requestedQuantity
  **/
  @javax.annotation.Nullable
  public String getRequestedQuantity() {
    return requestedQuantity;
  }

  public void setRequestedQuantity(String requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner confirmedQuantity(String confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
    return this;
  }

   /**
   * Confirmed quantity.
   * @return confirmedQuantity
  **/
  @javax.annotation.Nullable
  public String getConfirmedQuantity() {
    return confirmedQuantity;
  }

  public void setConfirmedQuantity(String confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Date type. Example Single or multiple dates.
   * @return dataType
  **/
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner dateRange(OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange dateRange) {
    this.dateRange = dateRange;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source.
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date.
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public OrderDetailB2BLinesInnerMultipleShipmentsInner deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Delivery date.
   * @return deliveryDate
  **/
  @javax.annotation.Nullable
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerMultipleShipmentsInner orderDetailB2BLinesInnerMultipleShipmentsInner = (OrderDetailB2BLinesInnerMultipleShipmentsInner) o;
    return Objects.equals(this.lineNumber, orderDetailB2BLinesInnerMultipleShipmentsInner.lineNumber) &&
        Objects.equals(this.requestedQuantity, orderDetailB2BLinesInnerMultipleShipmentsInner.requestedQuantity) &&
        Objects.equals(this.confirmedQuantity, orderDetailB2BLinesInnerMultipleShipmentsInner.confirmedQuantity) &&
        Objects.equals(this.dataType, orderDetailB2BLinesInnerMultipleShipmentsInner.dataType) &&
        Objects.equals(this.dateRange, orderDetailB2BLinesInnerMultipleShipmentsInner.dateRange) &&
        Objects.equals(this.source, orderDetailB2BLinesInnerMultipleShipmentsInner.source) &&
        Objects.equals(this.description, orderDetailB2BLinesInnerMultipleShipmentsInner.description) &&
        Objects.equals(this.date, orderDetailB2BLinesInnerMultipleShipmentsInner.date) &&
        Objects.equals(this.deliveryDate, orderDetailB2BLinesInnerMultipleShipmentsInner.deliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, requestedQuantity, confirmedQuantity, dataType, dateRange, source, description, date, deliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerMultipleShipmentsInner {\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    requestedQuantity: ").append(toIndentedString(requestedQuantity)).append("\n");
    sb.append("    confirmedQuantity: ").append(toIndentedString(confirmedQuantity)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
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
    openapiFields.add("lineNumber");
    openapiFields.add("requestedQuantity");
    openapiFields.add("confirmedQuantity");
    openapiFields.add("dataType");
    openapiFields.add("dateRange");
    openapiFields.add("source");
    openapiFields.add("description");
    openapiFields.add("date");
    openapiFields.add("deliveryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerMultipleShipmentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerMultipleShipmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerMultipleShipmentsInner is not found in the empty JSON string", OrderDetailB2BLinesInnerMultipleShipmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerMultipleShipmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerMultipleShipmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lineNumber") != null && !jsonObj.get("lineNumber").isJsonNull()) && !jsonObj.get("lineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineNumber").toString()));
      }
      if ((jsonObj.get("requestedQuantity") != null && !jsonObj.get("requestedQuantity").isJsonNull()) && !jsonObj.get("requestedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedQuantity").toString()));
      }
      if ((jsonObj.get("confirmedQuantity") != null && !jsonObj.get("confirmedQuantity").isJsonNull()) && !jsonObj.get("confirmedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmedQuantity").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      // validate the optional field `dateRange`
      if (jsonObj.get("dateRange") != null && !jsonObj.get("dateRange").isJsonNull()) {
        OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange.validateJsonElement(jsonObj.get("dateRange"));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("deliveryDate") != null && !jsonObj.get("deliveryDate").isJsonNull()) && !jsonObj.get("deliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerMultipleShipmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerMultipleShipmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerMultipleShipmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerMultipleShipmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerMultipleShipmentsInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerMultipleShipmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerMultipleShipmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerMultipleShipmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerMultipleShipmentsInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerMultipleShipmentsInner
  */
  public static OrderDetailB2BLinesInnerMultipleShipmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerMultipleShipmentsInner.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerMultipleShipmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

