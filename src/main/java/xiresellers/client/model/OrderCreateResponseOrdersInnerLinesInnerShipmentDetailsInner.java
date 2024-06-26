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
 * OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID = "shipFromWarehouseId";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID)
  private String shipFromWarehouseId;

  public static final String SERIALIZED_NAME_SHIP_FROM_LOCATION = "shipFromLocation";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_LOCATION)
  private String shipFromLocation;

  public static final String SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER = "freightAccountNumber";
  @SerializedName(SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER)
  private String freightAccountNumber;

  public static final String SERIALIZED_NAME_SIGNATURE_REQUIRED = "signatureRequired";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_REQUIRED)
  private String signatureRequired;

  public static final String SERIALIZED_NAME_SHIPPING_INSTRUCTIONS = "shippingInstructions";
  @SerializedName(SERIALIZED_NAME_SHIPPING_INSTRUCTIONS)
  private String shippingInstructions;

  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner() {
  }

  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * The code for the shipping carrier for the line item.
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name of the shipping carrier for the line item.
   * @return carrierName
  **/
  @javax.annotation.Nullable
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner shipFromWarehouseId(String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
    return this;
  }

   /**
   * The ID of the warehouse the line item will ship from.
   * @return shipFromWarehouseId
  **/
  @javax.annotation.Nullable
  public String getShipFromWarehouseId() {
    return shipFromWarehouseId;
  }

  public void setShipFromWarehouseId(String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
  }


  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner shipFromLocation(String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
    return this;
  }

   /**
   * Location from which order is shipped.
   * @return shipFromLocation
  **/
  @javax.annotation.Nullable
  public String getShipFromLocation() {
    return shipFromLocation;
  }

  public void setShipFromLocation(String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
  }


  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner freightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
    return this;
  }

   /**
   * The reseller&#39;s shipping account number with carrier. Used to bill the shipping carrier directly from the reseller&#39;s account with the carrier.
   * @return freightAccountNumber
  **/
  @javax.annotation.Nullable
  public String getFreightAccountNumber() {
    return freightAccountNumber;
  }

  public void setFreightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner signatureRequired(String signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

   /**
   * Specifies whether a signature is required for delivery. Default is False.
   * @return signatureRequired
  **/
  @javax.annotation.Nullable
  public String getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(String signatureRequired) {
    this.signatureRequired = signatureRequired;
  }


  public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner shippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
    return this;
  }

   /**
   * The shipping instructions for the order.
   * @return shippingInstructions
  **/
  @javax.annotation.Nullable
  public String getShippingInstructions() {
    return shippingInstructions;
  }

  public void setShippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner = (OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner) o;
    return Objects.equals(this.carrierCode, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.carrierCode) &&
        Objects.equals(this.carrierName, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.carrierName) &&
        Objects.equals(this.shipFromWarehouseId, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.shipFromWarehouseId) &&
        Objects.equals(this.shipFromLocation, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.shipFromLocation) &&
        Objects.equals(this.freightAccountNumber, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.freightAccountNumber) &&
        Objects.equals(this.signatureRequired, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.signatureRequired) &&
        Objects.equals(this.shippingInstructions, orderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.shippingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, carrierName, shipFromWarehouseId, shipFromLocation, freightAccountNumber, signatureRequired, shippingInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    shipFromWarehouseId: ").append(toIndentedString(shipFromWarehouseId)).append("\n");
    sb.append("    shipFromLocation: ").append(toIndentedString(shipFromLocation)).append("\n");
    sb.append("    freightAccountNumber: ").append(toIndentedString(freightAccountNumber)).append("\n");
    sb.append("    signatureRequired: ").append(toIndentedString(signatureRequired)).append("\n");
    sb.append("    shippingInstructions: ").append(toIndentedString(shippingInstructions)).append("\n");
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
    openapiFields.add("carrierCode");
    openapiFields.add("carrierName");
    openapiFields.add("shipFromWarehouseId");
    openapiFields.add("shipFromLocation");
    openapiFields.add("freightAccountNumber");
    openapiFields.add("signatureRequired");
    openapiFields.add("shippingInstructions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner is not found in the empty JSON string", OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if ((jsonObj.get("shipFromWarehouseId") != null && !jsonObj.get("shipFromWarehouseId").isJsonNull()) && !jsonObj.get("shipFromWarehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromWarehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromWarehouseId").toString()));
      }
      if ((jsonObj.get("shipFromLocation") != null && !jsonObj.get("shipFromLocation").isJsonNull()) && !jsonObj.get("shipFromLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromLocation").toString()));
      }
      if ((jsonObj.get("freightAccountNumber") != null && !jsonObj.get("freightAccountNumber").isJsonNull()) && !jsonObj.get("freightAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freightAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freightAccountNumber").toString()));
      }
      if ((jsonObj.get("signatureRequired") != null && !jsonObj.get("signatureRequired").isJsonNull()) && !jsonObj.get("signatureRequired").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatureRequired` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signatureRequired").toString()));
      }
      if ((jsonObj.get("shippingInstructions") != null && !jsonObj.get("shippingInstructions").isJsonNull()) && !jsonObj.get("shippingInstructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingInstructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingInstructions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner
  */
  public static OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.class);
  }

 /**
  * Convert an instance of OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

