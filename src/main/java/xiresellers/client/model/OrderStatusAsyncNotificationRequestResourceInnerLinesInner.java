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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner;
import xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner;

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
 * OrderStatusAsyncNotificationRequestResourceInnerLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderStatusAsyncNotificationRequestResourceInnerLinesInner {
  public static final String SERIALIZED_NAME_LINE_NUMBER = "LineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private String lineNumber;

  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_LINE_STATUS = "lineStatus";
  @SerializedName(SERIALIZED_NAME_LINE_STATUS)
  private String lineStatus;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_REQUESTED_QUANTITY = "requestedQuantity";
  @SerializedName(SERIALIZED_NAME_REQUESTED_QUANTITY)
  private String requestedQuantity;

  public static final String SERIALIZED_NAME_SHIPPED_QUANTITY = "shippedQuantity";
  @SerializedName(SERIALIZED_NAME_SHIPPED_QUANTITY)
  private String shippedQuantity;

  public static final String SERIALIZED_NAME_BACKORDERED_QUANTITY = "backorderedQuantity";
  @SerializedName(SERIALIZED_NAME_BACKORDERED_QUANTITY)
  private String backorderedQuantity;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner> shipmentDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERIAL_NUMBER_DETAILS = "serialNumberDetails";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER_DETAILS)
  private List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner> serialNumberDetails = new ArrayList<>();

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner() {
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * The Ingram Micro line number for the product
   * @return lineNumber
  **/
  @javax.annotation.Nullable
  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner subOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
    return this;
  }

   /**
   * The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest the reseller. The middle number is the order number. The two-digit suffix is the sub order number.
   * @return subOrderNumber
  **/
  @javax.annotation.Nullable
  public String getSubOrderNumber() {
    return subOrderNumber;
  }

  public void setSubOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner lineStatus(String lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

   /**
   * The status for the line item in the order. One of: Backordered, Open, Shipped
   * @return lineStatus
  **/
  @javax.annotation.Nullable
  public String getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(String lineStatus) {
    this.lineStatus = lineStatus;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * The Ingram Micro part number for the line item.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendor part number for the line item.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner requestedQuantity(String requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
    return this;
  }

   /**
   * The quantity of the line item requested.
   * @return requestedQuantity
  **/
  @javax.annotation.Nullable
  public String getRequestedQuantity() {
    return requestedQuantity;
  }

  public void setRequestedQuantity(String requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner shippedQuantity(String shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
    return this;
  }

   /**
   * The quantity of the line item that has been shipped.
   * @return shippedQuantity
  **/
  @javax.annotation.Nullable
  public String getShippedQuantity() {
    return shippedQuantity;
  }

  public void setShippedQuantity(String shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner backorderedQuantity(String backorderedQuantity) {
    this.backorderedQuantity = backorderedQuantity;
    return this;
  }

   /**
   * The quantity of the line item that is backordered.
   * @return backorderedQuantity
  **/
  @javax.annotation.Nullable
  public String getBackorderedQuantity() {
    return backorderedQuantity;
  }

  public void setBackorderedQuantity(String backorderedQuantity) {
    this.backorderedQuantity = backorderedQuantity;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner shipmentDetails(List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner addShipmentDetailsItem(OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner shipmentDetailsItem) {
    if (this.shipmentDetails == null) {
      this.shipmentDetails = new ArrayList<>();
    }
    this.shipmentDetails.add(shipmentDetailsItem);
    return this;
  }

   /**
   * Get shipmentDetails
   * @return shipmentDetails
  **/
  @javax.annotation.Nullable
  public List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner> getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner serialNumberDetails(List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner> serialNumberDetails) {
    this.serialNumberDetails = serialNumberDetails;
    return this;
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInner addSerialNumberDetailsItem(OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner serialNumberDetailsItem) {
    if (this.serialNumberDetails == null) {
      this.serialNumberDetails = new ArrayList<>();
    }
    this.serialNumberDetails.add(serialNumberDetailsItem);
    return this;
  }

   /**
   * Get serialNumberDetails
   * @return serialNumberDetails
  **/
  @javax.annotation.Nullable
  public List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner> getSerialNumberDetails() {
    return serialNumberDetails;
  }

  public void setSerialNumberDetails(List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner> serialNumberDetails) {
    this.serialNumberDetails = serialNumberDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusAsyncNotificationRequestResourceInnerLinesInner orderStatusAsyncNotificationRequestResourceInnerLinesInner = (OrderStatusAsyncNotificationRequestResourceInnerLinesInner) o;
    return Objects.equals(this.lineNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInner.lineNumber) &&
        Objects.equals(this.subOrderNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInner.subOrderNumber) &&
        Objects.equals(this.lineStatus, orderStatusAsyncNotificationRequestResourceInnerLinesInner.lineStatus) &&
        Objects.equals(this.ingramPartNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInner.vendorPartNumber) &&
        Objects.equals(this.requestedQuantity, orderStatusAsyncNotificationRequestResourceInnerLinesInner.requestedQuantity) &&
        Objects.equals(this.shippedQuantity, orderStatusAsyncNotificationRequestResourceInnerLinesInner.shippedQuantity) &&
        Objects.equals(this.backorderedQuantity, orderStatusAsyncNotificationRequestResourceInnerLinesInner.backorderedQuantity) &&
        Objects.equals(this.shipmentDetails, orderStatusAsyncNotificationRequestResourceInnerLinesInner.shipmentDetails) &&
        Objects.equals(this.serialNumberDetails, orderStatusAsyncNotificationRequestResourceInnerLinesInner.serialNumberDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, subOrderNumber, lineStatus, ingramPartNumber, vendorPartNumber, requestedQuantity, shippedQuantity, backorderedQuantity, shipmentDetails, serialNumberDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusAsyncNotificationRequestResourceInnerLinesInner {\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    requestedQuantity: ").append(toIndentedString(requestedQuantity)).append("\n");
    sb.append("    shippedQuantity: ").append(toIndentedString(shippedQuantity)).append("\n");
    sb.append("    backorderedQuantity: ").append(toIndentedString(backorderedQuantity)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    serialNumberDetails: ").append(toIndentedString(serialNumberDetails)).append("\n");
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
    openapiFields.add("LineNumber");
    openapiFields.add("subOrderNumber");
    openapiFields.add("lineStatus");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("requestedQuantity");
    openapiFields.add("shippedQuantity");
    openapiFields.add("backorderedQuantity");
    openapiFields.add("shipmentDetails");
    openapiFields.add("serialNumberDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderStatusAsyncNotificationRequestResourceInnerLinesInner is not found in the empty JSON string", OrderStatusAsyncNotificationRequestResourceInnerLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderStatusAsyncNotificationRequestResourceInnerLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LineNumber") != null && !jsonObj.get("LineNumber").isJsonNull()) && !jsonObj.get("LineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LineNumber").toString()));
      }
      if ((jsonObj.get("subOrderNumber") != null && !jsonObj.get("subOrderNumber").isJsonNull()) && !jsonObj.get("subOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subOrderNumber").toString()));
      }
      if ((jsonObj.get("lineStatus") != null && !jsonObj.get("lineStatus").isJsonNull()) && !jsonObj.get("lineStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineStatus").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("requestedQuantity") != null && !jsonObj.get("requestedQuantity").isJsonNull()) && !jsonObj.get("requestedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedQuantity").toString()));
      }
      if ((jsonObj.get("shippedQuantity") != null && !jsonObj.get("shippedQuantity").isJsonNull()) && !jsonObj.get("shippedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippedQuantity").toString()));
      }
      if ((jsonObj.get("backorderedQuantity") != null && !jsonObj.get("backorderedQuantity").isJsonNull()) && !jsonObj.get("backorderedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backorderedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backorderedQuantity").toString()));
      }
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipmentDetails");
        if (jsonArrayshipmentDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipmentDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipmentDetails` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentDetails").toString()));
          }

          // validate the optional field `shipmentDetails` (array)
          for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
            OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.validateJsonElement(jsonArrayshipmentDetails.get(i));
          };
        }
      }
      if (jsonObj.get("serialNumberDetails") != null && !jsonObj.get("serialNumberDetails").isJsonNull()) {
        JsonArray jsonArrayserialNumberDetails = jsonObj.getAsJsonArray("serialNumberDetails");
        if (jsonArrayserialNumberDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serialNumberDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serialNumberDetails` to be an array in the JSON string but got `%s`", jsonObj.get("serialNumberDetails").toString()));
          }

          // validate the optional field `serialNumberDetails` (array)
          for (int i = 0; i < jsonArrayserialNumberDetails.size(); i++) {
            OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.validateJsonElement(jsonArrayserialNumberDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderStatusAsyncNotificationRequestResourceInnerLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderStatusAsyncNotificationRequestResourceInnerLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderStatusAsyncNotificationRequestResourceInnerLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderStatusAsyncNotificationRequestResourceInnerLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInner
  * @throws IOException if the JSON string is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInner
  */
  public static OrderStatusAsyncNotificationRequestResourceInnerLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderStatusAsyncNotificationRequestResourceInnerLinesInner.class);
  }

 /**
  * Convert an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

