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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails;

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
 * Shipping details for the line item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderDetailResponseLinesInnerShipmentDetailsInner {
  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_ESTIMATED_SHIP_DATE = "estimatedShipDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SHIP_DATE)
  private LocalDate estimatedShipDate;

  public static final String SERIALIZED_NAME_SHIPPED_DATE = "shippedDate";
  @SerializedName(SERIALIZED_NAME_SHIPPED_DATE)
  private LocalDate shippedDate;

  public static final String SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE = "estimatedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE)
  private LocalDate estimatedDeliveryDate;

  public static final String SERIALIZED_NAME_DELIVERED_DATE = "deliveredDate";
  @SerializedName(SERIALIZED_NAME_DELIVERED_DATE)
  private LocalDate deliveredDate;

  public static final String SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID = "shipFromWarehouseId";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID)
  private String shipFromWarehouseId;

  public static final String SERIALIZED_NAME_SHIP_FROM_LOCATION = "shipFromLocation";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_LOCATION)
  private String shipFromLocation;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private LocalDate invoiceDate;

  public static final String SERIALIZED_NAME_CARRIER_DETAILS = "carrierDetails";
  @SerializedName(SERIALIZED_NAME_CARRIER_DETAILS)
  private OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails carrierDetails;

  public OrderDetailResponseLinesInnerShipmentDetailsInner() {
  }

  public OrderDetailResponseLinesInnerShipmentDetailsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity shipped of the line item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner estimatedShipDate(LocalDate estimatedShipDate) {
    this.estimatedShipDate = estimatedShipDate;
    return this;
  }

   /**
   * The estimated ship date for the line item.
   * @return estimatedShipDate
  **/
  @javax.annotation.Nullable
  public LocalDate getEstimatedShipDate() {
    return estimatedShipDate;
  }

  public void setEstimatedShipDate(LocalDate estimatedShipDate) {
    this.estimatedShipDate = estimatedShipDate;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner shippedDate(LocalDate shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

   /**
   * The date the line item was shipped.
   * @return shippedDate
  **/
  @javax.annotation.Nullable
  public LocalDate getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(LocalDate shippedDate) {
    this.shippedDate = shippedDate;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner estimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

   /**
   * The date the line item is expected to be delivered.
   * @return estimatedDeliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner deliveredDate(LocalDate deliveredDate) {
    this.deliveredDate = deliveredDate;
    return this;
  }

   /**
   * The actual date of delivery of the line item.
   * @return deliveredDate
  **/
  @javax.annotation.Nullable
  public LocalDate getDeliveredDate() {
    return deliveredDate;
  }

  public void setDeliveredDate(LocalDate deliveredDate) {
    this.deliveredDate = deliveredDate;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner shipFromWarehouseId(String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
    return this;
  }

   /**
   * The ID of the warehouse the product will ship from.
   * @return shipFromWarehouseId
  **/
  @javax.annotation.Nullable
  public String getShipFromWarehouseId() {
    return shipFromWarehouseId;
  }

  public void setShipFromWarehouseId(String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner shipFromLocation(String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
    return this;
  }

   /**
   * The city and state the line item ships from.
   * @return shipFromLocation
  **/
  @javax.annotation.Nullable
  public String getShipFromLocation() {
    return shipFromLocation;
  }

  public void setShipFromLocation(String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The Ingram Micro invoice number for the line item.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner invoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * The date the IngramMicro invoice was created for the line item.
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInner carrierDetails(OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails carrierDetails) {
    this.carrierDetails = carrierDetails;
    return this;
  }

   /**
   * Get carrierDetails
   * @return carrierDetails
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails getCarrierDetails() {
    return carrierDetails;
  }

  public void setCarrierDetails(OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails carrierDetails) {
    this.carrierDetails = carrierDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponseLinesInnerShipmentDetailsInner orderDetailResponseLinesInnerShipmentDetailsInner = (OrderDetailResponseLinesInnerShipmentDetailsInner) o;
    return Objects.equals(this.quantity, orderDetailResponseLinesInnerShipmentDetailsInner.quantity) &&
        Objects.equals(this.estimatedShipDate, orderDetailResponseLinesInnerShipmentDetailsInner.estimatedShipDate) &&
        Objects.equals(this.shippedDate, orderDetailResponseLinesInnerShipmentDetailsInner.shippedDate) &&
        Objects.equals(this.estimatedDeliveryDate, orderDetailResponseLinesInnerShipmentDetailsInner.estimatedDeliveryDate) &&
        Objects.equals(this.deliveredDate, orderDetailResponseLinesInnerShipmentDetailsInner.deliveredDate) &&
        Objects.equals(this.shipFromWarehouseId, orderDetailResponseLinesInnerShipmentDetailsInner.shipFromWarehouseId) &&
        Objects.equals(this.shipFromLocation, orderDetailResponseLinesInnerShipmentDetailsInner.shipFromLocation) &&
        Objects.equals(this.invoiceNumber, orderDetailResponseLinesInnerShipmentDetailsInner.invoiceNumber) &&
        Objects.equals(this.invoiceDate, orderDetailResponseLinesInnerShipmentDetailsInner.invoiceDate) &&
        Objects.equals(this.carrierDetails, orderDetailResponseLinesInnerShipmentDetailsInner.carrierDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, estimatedShipDate, shippedDate, estimatedDeliveryDate, deliveredDate, shipFromWarehouseId, shipFromLocation, invoiceNumber, invoiceDate, carrierDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponseLinesInnerShipmentDetailsInner {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    estimatedShipDate: ").append(toIndentedString(estimatedShipDate)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    shipFromWarehouseId: ").append(toIndentedString(shipFromWarehouseId)).append("\n");
    sb.append("    shipFromLocation: ").append(toIndentedString(shipFromLocation)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    carrierDetails: ").append(toIndentedString(carrierDetails)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("estimatedShipDate");
    openapiFields.add("shippedDate");
    openapiFields.add("estimatedDeliveryDate");
    openapiFields.add("deliveredDate");
    openapiFields.add("shipFromWarehouseId");
    openapiFields.add("shipFromLocation");
    openapiFields.add("invoiceNumber");
    openapiFields.add("invoiceDate");
    openapiFields.add("carrierDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponseLinesInnerShipmentDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponseLinesInnerShipmentDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponseLinesInnerShipmentDetailsInner is not found in the empty JSON string", OrderDetailResponseLinesInnerShipmentDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponseLinesInnerShipmentDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponseLinesInnerShipmentDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("shipFromWarehouseId") != null && !jsonObj.get("shipFromWarehouseId").isJsonNull()) && !jsonObj.get("shipFromWarehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromWarehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromWarehouseId").toString()));
      }
      if ((jsonObj.get("shipFromLocation") != null && !jsonObj.get("shipFromLocation").isJsonNull()) && !jsonObj.get("shipFromLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromLocation").toString()));
      }
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      // validate the optional field `carrierDetails`
      if (jsonObj.get("carrierDetails") != null && !jsonObj.get("carrierDetails").isJsonNull()) {
        OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.validateJsonElement(jsonObj.get("carrierDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponseLinesInnerShipmentDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponseLinesInnerShipmentDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponseLinesInnerShipmentDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponseLinesInnerShipmentDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponseLinesInnerShipmentDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponseLinesInnerShipmentDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponseLinesInnerShipmentDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponseLinesInnerShipmentDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponseLinesInnerShipmentDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponseLinesInnerShipmentDetailsInner
  */
  public static OrderDetailResponseLinesInnerShipmentDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponseLinesInnerShipmentDetailsInner.class);
  }

 /**
  * Convert an instance of OrderDetailResponseLinesInnerShipmentDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

