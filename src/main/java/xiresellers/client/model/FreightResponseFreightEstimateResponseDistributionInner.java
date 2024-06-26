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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner;

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
 * FreightResponseFreightEstimateResponseDistributionInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class FreightResponseFreightEstimateResponseDistributionInner {
  public static final String SERIALIZED_NAME_SHIP_FROM_BRANCH_NUMBER = "shipFromBranchNumber";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_BRANCH_NUMBER)
  private String shipFromBranchNumber;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_SHIP_VIA = "shipVia";
  @SerializedName(SERIALIZED_NAME_SHIP_VIA)
  private String shipVia;

  public static final String SERIALIZED_NAME_FREIGHT_RATE = "freightRate";
  @SerializedName(SERIALIZED_NAME_FREIGHT_RATE)
  private BigDecimal freightRate;

  public static final String SERIALIZED_NAME_TOTAL_WEIGHT = "totalWeight";
  @SerializedName(SERIALIZED_NAME_TOTAL_WEIGHT)
  private BigDecimal totalWeight;

  public static final String SERIALIZED_NAME_TRANSIT_DAYS = "transitDays";
  @SerializedName(SERIALIZED_NAME_TRANSIT_DAYS)
  private Integer transitDays;

  public static final String SERIALIZED_NAME_CARRIER_LIST = "carrierList";
  @SerializedName(SERIALIZED_NAME_CARRIER_LIST)
  private List<FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner> carrierList = new ArrayList<>();

  public FreightResponseFreightEstimateResponseDistributionInner() {
  }

  public FreightResponseFreightEstimateResponseDistributionInner shipFromBranchNumber(String shipFromBranchNumber) {
    this.shipFromBranchNumber = shipFromBranchNumber;
    return this;
  }

   /**
   * The ID of the warehouse the line item will ship from.
   * @return shipFromBranchNumber
  **/
  @javax.annotation.Nullable
  public String getShipFromBranchNumber() {
    return shipFromBranchNumber;
  }

  public void setShipFromBranchNumber(String shipFromBranchNumber) {
    this.shipFromBranchNumber = shipFromBranchNumber;
  }


  public FreightResponseFreightEstimateResponseDistributionInner carrierCode(String carrierCode) {
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


  public FreightResponseFreightEstimateResponseDistributionInner shipVia(String shipVia) {
    this.shipVia = shipVia;
    return this;
  }

   /**
   * The name of the shipping carrier.
   * @return shipVia
  **/
  @javax.annotation.Nullable
  public String getShipVia() {
    return shipVia;
  }

  public void setShipVia(String shipVia) {
    this.shipVia = shipVia;
  }


  public FreightResponseFreightEstimateResponseDistributionInner freightRate(BigDecimal freightRate) {
    this.freightRate = freightRate;
    return this;
  }

   /**
   * Estimated freight charge.
   * @return freightRate
  **/
  @javax.annotation.Nullable
  public BigDecimal getFreightRate() {
    return freightRate;
  }

  public void setFreightRate(BigDecimal freightRate) {
    this.freightRate = freightRate;
  }


  public FreightResponseFreightEstimateResponseDistributionInner totalWeight(BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * Total weight.
   * @return totalWeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
  }


  public FreightResponseFreightEstimateResponseDistributionInner transitDays(Integer transitDays) {
    this.transitDays = transitDays;
    return this;
  }

   /**
   * Number of transit days.
   * @return transitDays
  **/
  @javax.annotation.Nullable
  public Integer getTransitDays() {
    return transitDays;
  }

  public void setTransitDays(Integer transitDays) {
    this.transitDays = transitDays;
  }


  public FreightResponseFreightEstimateResponseDistributionInner carrierList(List<FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner> carrierList) {
    this.carrierList = carrierList;
    return this;
  }

  public FreightResponseFreightEstimateResponseDistributionInner addCarrierListItem(FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner carrierListItem) {
    if (this.carrierList == null) {
      this.carrierList = new ArrayList<>();
    }
    this.carrierList.add(carrierListItem);
    return this;
  }

   /**
   * Get carrierList
   * @return carrierList
  **/
  @javax.annotation.Nullable
  public List<FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner> getCarrierList() {
    return carrierList;
  }

  public void setCarrierList(List<FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner> carrierList) {
    this.carrierList = carrierList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreightResponseFreightEstimateResponseDistributionInner freightResponseFreightEstimateResponseDistributionInner = (FreightResponseFreightEstimateResponseDistributionInner) o;
    return Objects.equals(this.shipFromBranchNumber, freightResponseFreightEstimateResponseDistributionInner.shipFromBranchNumber) &&
        Objects.equals(this.carrierCode, freightResponseFreightEstimateResponseDistributionInner.carrierCode) &&
        Objects.equals(this.shipVia, freightResponseFreightEstimateResponseDistributionInner.shipVia) &&
        Objects.equals(this.freightRate, freightResponseFreightEstimateResponseDistributionInner.freightRate) &&
        Objects.equals(this.totalWeight, freightResponseFreightEstimateResponseDistributionInner.totalWeight) &&
        Objects.equals(this.transitDays, freightResponseFreightEstimateResponseDistributionInner.transitDays) &&
        Objects.equals(this.carrierList, freightResponseFreightEstimateResponseDistributionInner.carrierList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipFromBranchNumber, carrierCode, shipVia, freightRate, totalWeight, transitDays, carrierList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightResponseFreightEstimateResponseDistributionInner {\n");
    sb.append("    shipFromBranchNumber: ").append(toIndentedString(shipFromBranchNumber)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    freightRate: ").append(toIndentedString(freightRate)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    transitDays: ").append(toIndentedString(transitDays)).append("\n");
    sb.append("    carrierList: ").append(toIndentedString(carrierList)).append("\n");
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
    openapiFields.add("shipFromBranchNumber");
    openapiFields.add("carrierCode");
    openapiFields.add("shipVia");
    openapiFields.add("freightRate");
    openapiFields.add("totalWeight");
    openapiFields.add("transitDays");
    openapiFields.add("carrierList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FreightResponseFreightEstimateResponseDistributionInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreightResponseFreightEstimateResponseDistributionInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreightResponseFreightEstimateResponseDistributionInner is not found in the empty JSON string", FreightResponseFreightEstimateResponseDistributionInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreightResponseFreightEstimateResponseDistributionInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreightResponseFreightEstimateResponseDistributionInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("shipFromBranchNumber") != null && !jsonObj.get("shipFromBranchNumber").isJsonNull()) && !jsonObj.get("shipFromBranchNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromBranchNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromBranchNumber").toString()));
      }
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("shipVia") != null && !jsonObj.get("shipVia").isJsonNull()) && !jsonObj.get("shipVia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipVia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipVia").toString()));
      }
      if (jsonObj.get("carrierList") != null && !jsonObj.get("carrierList").isJsonNull()) {
        JsonArray jsonArraycarrierList = jsonObj.getAsJsonArray("carrierList");
        if (jsonArraycarrierList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("carrierList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `carrierList` to be an array in the JSON string but got `%s`", jsonObj.get("carrierList").toString()));
          }

          // validate the optional field `carrierList` (array)
          for (int i = 0; i < jsonArraycarrierList.size(); i++) {
            FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.validateJsonElement(jsonArraycarrierList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreightResponseFreightEstimateResponseDistributionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreightResponseFreightEstimateResponseDistributionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreightResponseFreightEstimateResponseDistributionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreightResponseFreightEstimateResponseDistributionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FreightResponseFreightEstimateResponseDistributionInner>() {
           @Override
           public void write(JsonWriter out, FreightResponseFreightEstimateResponseDistributionInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreightResponseFreightEstimateResponseDistributionInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FreightResponseFreightEstimateResponseDistributionInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FreightResponseFreightEstimateResponseDistributionInner
  * @throws IOException if the JSON string is invalid with respect to FreightResponseFreightEstimateResponseDistributionInner
  */
  public static FreightResponseFreightEstimateResponseDistributionInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreightResponseFreightEstimateResponseDistributionInner.class);
  }

 /**
  * Convert an instance of FreightResponseFreightEstimateResponseDistributionInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

