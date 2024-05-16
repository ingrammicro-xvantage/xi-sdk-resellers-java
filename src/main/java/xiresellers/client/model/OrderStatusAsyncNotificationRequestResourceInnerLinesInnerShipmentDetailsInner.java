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
import xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner;

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
 * OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T06:51:51.114588Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner {
  public static final String SERIALIZED_NAME_SHIPMENT_DATE = "shipmentDate";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DATE)
  private String shipmentDate;

  public static final String SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID = "shipFromWarehouseId";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID)
  private String shipFromWarehouseId;

  public static final String SERIALIZED_NAME_WAREHOUSE_NAME = "warehouseName";
  @SerializedName(SERIALIZED_NAME_WAREHOUSE_NAME)
  private String warehouseName;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_PACKAGE_DETAILS = "packageDetails";
  @SerializedName(SERIALIZED_NAME_PACKAGE_DETAILS)
  private List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner> packageDetails = new ArrayList<>();

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner() {
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner shipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
    return this;
  }

   /**
   * The date the line item was shipped.
   * @return shipmentDate
  **/
  @javax.annotation.Nullable
  public String getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(String shipmentDate) {
    this.shipmentDate = shipmentDate;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner shipFromWarehouseId(String shipFromWarehouseId) {
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


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner warehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
    return this;
  }

   /**
   * \&quot;\&quot;
   * @return warehouseName
  **/
  @javax.annotation.Nullable
  public String getWarehouseName() {
    return warehouseName;
  }

  public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * The carrier code for the shipment containing the  line item.
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name of the carrier of the shipment containing   the line item.
   * @return carrierName
  **/
  @javax.annotation.Nullable
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner packageDetails(List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner> packageDetails) {
    this.packageDetails = packageDetails;
    return this;
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner addPackageDetailsItem(OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner packageDetailsItem) {
    if (this.packageDetails == null) {
      this.packageDetails = new ArrayList<>();
    }
    this.packageDetails.add(packageDetailsItem);
    return this;
  }

   /**
   * Get packageDetails
   * @return packageDetails
  **/
  @javax.annotation.Nullable
  public List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner> getPackageDetails() {
    return packageDetails;
  }

  public void setPackageDetails(List<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner> packageDetails) {
    this.packageDetails = packageDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner = (OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner) o;
    return Objects.equals(this.shipmentDate, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.shipmentDate) &&
        Objects.equals(this.shipFromWarehouseId, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.shipFromWarehouseId) &&
        Objects.equals(this.warehouseName, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.warehouseName) &&
        Objects.equals(this.carrierCode, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.carrierCode) &&
        Objects.equals(this.carrierName, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.carrierName) &&
        Objects.equals(this.packageDetails, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.packageDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentDate, shipFromWarehouseId, warehouseName, carrierCode, carrierName, packageDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner {\n");
    sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
    sb.append("    shipFromWarehouseId: ").append(toIndentedString(shipFromWarehouseId)).append("\n");
    sb.append("    warehouseName: ").append(toIndentedString(warehouseName)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    packageDetails: ").append(toIndentedString(packageDetails)).append("\n");
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
    openapiFields.add("shipmentDate");
    openapiFields.add("shipFromWarehouseId");
    openapiFields.add("warehouseName");
    openapiFields.add("carrierCode");
    openapiFields.add("carrierName");
    openapiFields.add("packageDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner is not found in the empty JSON string", OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("shipmentDate") != null && !jsonObj.get("shipmentDate").isJsonNull()) && !jsonObj.get("shipmentDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipmentDate").toString()));
      }
      if ((jsonObj.get("shipFromWarehouseId") != null && !jsonObj.get("shipFromWarehouseId").isJsonNull()) && !jsonObj.get("shipFromWarehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromWarehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromWarehouseId").toString()));
      }
      if ((jsonObj.get("warehouseName") != null && !jsonObj.get("warehouseName").isJsonNull()) && !jsonObj.get("warehouseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warehouseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warehouseName").toString()));
      }
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if (jsonObj.get("packageDetails") != null && !jsonObj.get("packageDetails").isJsonNull()) {
        JsonArray jsonArraypackageDetails = jsonObj.getAsJsonArray("packageDetails");
        if (jsonArraypackageDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("packageDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `packageDetails` to be an array in the JSON string but got `%s`", jsonObj.get("packageDetails").toString()));
          }

          // validate the optional field `packageDetails` (array)
          for (int i = 0; i < jsonArraypackageDetails.size(); i++) {
            OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.validateJsonElement(jsonArraypackageDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner
  */
  public static OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.class);
  }

 /**
  * Convert an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

