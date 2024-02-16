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
 * Shipping details for the order provided by the customer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T07:02:17.403456Z[Etc/UTC]")
public class OrderCreateRequestShipmentDetails {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER = "freightAccountNumber";
  @SerializedName(SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER)
  private String freightAccountNumber;

  public static final String SERIALIZED_NAME_SHIP_COMPLETE = "shipComplete";
  @SerializedName(SERIALIZED_NAME_SHIP_COMPLETE)
  private String shipComplete;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "requestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  private LocalDate requestedDeliveryDate;

  public static final String SERIALIZED_NAME_SIGNATURE_REQUIRED = "signatureRequired";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_REQUIRED)
  private Boolean signatureRequired;

  public static final String SERIALIZED_NAME_SHIPPING_INSTRUCTIONS = "shippingInstructions";
  @SerializedName(SERIALIZED_NAME_SHIPPING_INSTRUCTIONS)
  private String shippingInstructions;

  public OrderCreateRequestShipmentDetails() {
  }

  public OrderCreateRequestShipmentDetails carrierCode(String carrierCode) {
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


  public OrderCreateRequestShipmentDetails freightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
    return this;
  }

   /**
   * The reseller &#39;s shipping account number with carrier. Used to bill the shipping carrier directly from the reseller&#39;s account with the carrier.
   * @return freightAccountNumber
  **/
  @javax.annotation.Nullable
  public String getFreightAccountNumber() {
    return freightAccountNumber;
  }

  public void setFreightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
  }


  public OrderCreateRequestShipmentDetails shipComplete(String shipComplete) {
    this.shipComplete = shipComplete;
    return this;
  }

   /**
   * Specifies whether the shipment will be shipped only when all products are fulfilled. The value of this field along with acceptBackOrder field decides the value of backorderflag. If this field is set, acceptBackOrder field is ignored. Possible values for this field are true, C, P, E.    With value as true or C, backorderflag will be set as C.    With value as P, or E, backorderflag will be set as P or E respectively.    C &#x3D; Ship complete at distribution level.    P &#x3D; ship complete at line level.    E &#x3D; ship complete across all distributions. 
   * @return shipComplete
  **/
  @javax.annotation.Nullable
  public String getShipComplete() {
    return shipComplete;
  }

  public void setShipComplete(String shipComplete) {
    this.shipComplete = shipComplete;
  }


  public OrderCreateRequestShipmentDetails requestedDeliveryDate(LocalDate requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

   /**
   * The reseller-requested delivery date in UTC format. Delivery date is not guaranteed.
   * @return requestedDeliveryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(LocalDate requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }


  public OrderCreateRequestShipmentDetails signatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

   /**
   * Specifies whether a signature is required for delivery. Default is False.
   * @return signatureRequired
  **/
  @javax.annotation.Nullable
  public Boolean getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }


  public OrderCreateRequestShipmentDetails shippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
    return this;
  }

   /**
   * Get shippingInstructions
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
    OrderCreateRequestShipmentDetails orderCreateRequestShipmentDetails = (OrderCreateRequestShipmentDetails) o;
    return Objects.equals(this.carrierCode, orderCreateRequestShipmentDetails.carrierCode) &&
        Objects.equals(this.freightAccountNumber, orderCreateRequestShipmentDetails.freightAccountNumber) &&
        Objects.equals(this.shipComplete, orderCreateRequestShipmentDetails.shipComplete) &&
        Objects.equals(this.requestedDeliveryDate, orderCreateRequestShipmentDetails.requestedDeliveryDate) &&
        Objects.equals(this.signatureRequired, orderCreateRequestShipmentDetails.signatureRequired) &&
        Objects.equals(this.shippingInstructions, orderCreateRequestShipmentDetails.shippingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, freightAccountNumber, shipComplete, requestedDeliveryDate, signatureRequired, shippingInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequestShipmentDetails {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    freightAccountNumber: ").append(toIndentedString(freightAccountNumber)).append("\n");
    sb.append("    shipComplete: ").append(toIndentedString(shipComplete)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
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
    openapiFields.add("freightAccountNumber");
    openapiFields.add("shipComplete");
    openapiFields.add("requestedDeliveryDate");
    openapiFields.add("signatureRequired");
    openapiFields.add("shippingInstructions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequestShipmentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequestShipmentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequestShipmentDetails is not found in the empty JSON string", OrderCreateRequestShipmentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequestShipmentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequestShipmentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("freightAccountNumber") != null && !jsonObj.get("freightAccountNumber").isJsonNull()) && !jsonObj.get("freightAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freightAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freightAccountNumber").toString()));
      }
      if ((jsonObj.get("shipComplete") != null && !jsonObj.get("shipComplete").isJsonNull()) && !jsonObj.get("shipComplete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipComplete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipComplete").toString()));
      }
      if ((jsonObj.get("shippingInstructions") != null && !jsonObj.get("shippingInstructions").isJsonNull()) && !jsonObj.get("shippingInstructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingInstructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingInstructions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequestShipmentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequestShipmentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequestShipmentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequestShipmentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequestShipmentDetails>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequestShipmentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequestShipmentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateRequestShipmentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateRequestShipmentDetails
  * @throws IOException if the JSON string is invalid with respect to OrderCreateRequestShipmentDetails
  */
  public static OrderCreateRequestShipmentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequestShipmentDetails.class);
  }

 /**
  * Convert an instance of OrderCreateRequestShipmentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

