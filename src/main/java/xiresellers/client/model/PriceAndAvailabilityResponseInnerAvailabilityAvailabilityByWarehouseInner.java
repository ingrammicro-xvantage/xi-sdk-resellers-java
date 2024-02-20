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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner;

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
 * PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T11:18:10.423898Z[Etc/UTC]")
public class PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_WAREHOUSE_ID = "warehouseId";
  @SerializedName(SERIALIZED_NAME_WAREHOUSE_ID)
  private String warehouseId;

  public static final String SERIALIZED_NAME_QUANTITY_AVAILABLE = "quantityAvailable";
  @SerializedName(SERIALIZED_NAME_QUANTITY_AVAILABLE)
  private Integer quantityAvailable;

  public static final String SERIALIZED_NAME_QUANTITY_BACKORDERED = "quantityBackordered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_BACKORDERED)
  private Integer quantityBackordered;

  public static final String SERIALIZED_NAME_QUANTITY_BACKORDERED_ETA = "quantityBackorderedEta";
  @SerializedName(SERIALIZED_NAME_QUANTITY_BACKORDERED_ETA)
  private String quantityBackorderedEta;

  public static final String SERIALIZED_NAME_QUANTITY_ON_ORDER = "quantityOnOrder";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ON_ORDER)
  private Integer quantityOnOrder;

  public static final String SERIALIZED_NAME_BACK_ORDER_INFO = "backOrderInfo";
  @SerializedName(SERIALIZED_NAME_BACK_ORDER_INFO)
  private List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner> backOrderInfo;

  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner() {
  }

  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Indicates where (location) the product is available.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner warehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Indicates where (Ingram Warehouse Id) the product is available.
   * @return warehouseId
  **/
  @javax.annotation.Nullable
  public String getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
  }


  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner quantityAvailable(Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
    return this;
  }

   /**
   * The quantity of the product available in a given warehouse.
   * @return quantityAvailable
  **/
  @javax.annotation.Nullable
  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }


  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner quantityBackordered(Integer quantityBackordered) {
    this.quantityBackordered = quantityBackordered;
    return this;
  }

   /**
   * The quantity of a product backordered in a given warehouse.
   * @return quantityBackordered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityBackordered() {
    return quantityBackordered;
  }

  public void setQuantityBackordered(Integer quantityBackordered) {
    this.quantityBackordered = quantityBackordered;
  }


  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner quantityBackorderedEta(String quantityBackorderedEta) {
    this.quantityBackorderedEta = quantityBackorderedEta;
    return this;
  }

   /**
   * The estimated time of arrival of a product that has been backordered in a given warehouse.
   * @return quantityBackorderedEta
  **/
  @javax.annotation.Nullable
  public String getQuantityBackorderedEta() {
    return quantityBackorderedEta;
  }

  public void setQuantityBackorderedEta(String quantityBackorderedEta) {
    this.quantityBackorderedEta = quantityBackorderedEta;
  }


  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner quantityOnOrder(Integer quantityOnOrder) {
    this.quantityOnOrder = quantityOnOrder;
    return this;
  }

   /**
   * The quantity of the product on order.
   * @return quantityOnOrder
  **/
  @javax.annotation.Nullable
  public Integer getQuantityOnOrder() {
    return quantityOnOrder;
  }

  public void setQuantityOnOrder(Integer quantityOnOrder) {
    this.quantityOnOrder = quantityOnOrder;
  }


  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner backOrderInfo(List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner> backOrderInfo) {
    this.backOrderInfo = backOrderInfo;
    return this;
  }

  public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner addBackOrderInfoItem(PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner backOrderInfoItem) {
    if (this.backOrderInfo == null) {
      this.backOrderInfo = new ArrayList<>();
    }
    this.backOrderInfo.add(backOrderInfoItem);
    return this;
  }

   /**
   * *Currently, this feature is not available in these countries (Mexico, Turkey, New Zealand, Colombia, Chile, Brazil, Peru, Western Sahara).
   * @return backOrderInfo
  **/
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner> getBackOrderInfo() {
    return backOrderInfo;
  }

  public void setBackOrderInfo(List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner> backOrderInfo) {
    this.backOrderInfo = backOrderInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner = (PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner) o;
    return Objects.equals(this.location, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.location) &&
        Objects.equals(this.warehouseId, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.warehouseId) &&
        Objects.equals(this.quantityAvailable, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.quantityAvailable) &&
        Objects.equals(this.quantityBackordered, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.quantityBackordered) &&
        Objects.equals(this.quantityBackorderedEta, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.quantityBackorderedEta) &&
        Objects.equals(this.quantityOnOrder, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.quantityOnOrder) &&
        Objects.equals(this.backOrderInfo, priceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.backOrderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, warehouseId, quantityAvailable, quantityBackordered, quantityBackorderedEta, quantityOnOrder, backOrderInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    quantityAvailable: ").append(toIndentedString(quantityAvailable)).append("\n");
    sb.append("    quantityBackordered: ").append(toIndentedString(quantityBackordered)).append("\n");
    sb.append("    quantityBackorderedEta: ").append(toIndentedString(quantityBackorderedEta)).append("\n");
    sb.append("    quantityOnOrder: ").append(toIndentedString(quantityOnOrder)).append("\n");
    sb.append("    backOrderInfo: ").append(toIndentedString(backOrderInfo)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("warehouseId");
    openapiFields.add("quantityAvailable");
    openapiFields.add("quantityBackordered");
    openapiFields.add("quantityBackorderedEta");
    openapiFields.add("quantityOnOrder");
    openapiFields.add("backOrderInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("warehouseId") != null && !jsonObj.get("warehouseId").isJsonNull()) && !jsonObj.get("warehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warehouseId").toString()));
      }
      if ((jsonObj.get("quantityBackorderedEta") != null && !jsonObj.get("quantityBackorderedEta").isJsonNull()) && !jsonObj.get("quantityBackorderedEta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantityBackorderedEta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantityBackorderedEta").toString()));
      }
      if (jsonObj.get("backOrderInfo") != null && !jsonObj.get("backOrderInfo").isJsonNull()) {
        JsonArray jsonArraybackOrderInfo = jsonObj.getAsJsonArray("backOrderInfo");
        if (jsonArraybackOrderInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("backOrderInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `backOrderInfo` to be an array in the JSON string but got `%s`", jsonObj.get("backOrderInfo").toString()));
          }

          // validate the optional field `backOrderInfo` (array)
          for (int i = 0; i < jsonArraybackOrderInfo.size(); i++) {
            PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner.validateJsonElement(jsonArraybackOrderInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner
  */
  public static PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

