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
 * PriceAndAvailabilityRequestAvailabilityByWarehouseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T05:40:29.622284Z[Etc/UTC]")
public class PriceAndAvailabilityRequestAvailabilityByWarehouseInner {
  public static final String SERIALIZED_NAME_AVAILABILITY_BY_WAREHOUSE_ID = "availabilityByWarehouseId";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_BY_WAREHOUSE_ID)
  private String availabilityByWarehouseId;

  public static final String SERIALIZED_NAME_AVAILABILITY_FOR_ALL_LOCATION = "availabilityForAllLocation";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_FOR_ALL_LOCATION)
  private Boolean availabilityForAllLocation;

  public PriceAndAvailabilityRequestAvailabilityByWarehouseInner() {
  }

  public PriceAndAvailabilityRequestAvailabilityByWarehouseInner availabilityByWarehouseId(String availabilityByWarehouseId) {
    this.availabilityByWarehouseId = availabilityByWarehouseId;
    return this;
  }

   /**
   * Plant/warehouse Id of a particular location in order to get just the inventory of that location.
   * @return availabilityByWarehouseId
  **/
  @javax.annotation.Nullable
  public String getAvailabilityByWarehouseId() {
    return availabilityByWarehouseId;
  }

  public void setAvailabilityByWarehouseId(String availabilityByWarehouseId) {
    this.availabilityByWarehouseId = availabilityByWarehouseId;
  }


  public PriceAndAvailabilityRequestAvailabilityByWarehouseInner availabilityForAllLocation(Boolean availabilityForAllLocation) {
    this.availabilityForAllLocation = availabilityForAllLocation;
    return this;
  }

   /**
   * Pass boolean value as input, if true the response will contain warehouse location details, if false the response will not hold warehouse location details. By default value is true.
   * @return availabilityForAllLocation
  **/
  @javax.annotation.Nullable
  public Boolean getAvailabilityForAllLocation() {
    return availabilityForAllLocation;
  }

  public void setAvailabilityForAllLocation(Boolean availabilityForAllLocation) {
    this.availabilityForAllLocation = availabilityForAllLocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityRequestAvailabilityByWarehouseInner priceAndAvailabilityRequestAvailabilityByWarehouseInner = (PriceAndAvailabilityRequestAvailabilityByWarehouseInner) o;
    return Objects.equals(this.availabilityByWarehouseId, priceAndAvailabilityRequestAvailabilityByWarehouseInner.availabilityByWarehouseId) &&
        Objects.equals(this.availabilityForAllLocation, priceAndAvailabilityRequestAvailabilityByWarehouseInner.availabilityForAllLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityByWarehouseId, availabilityForAllLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityRequestAvailabilityByWarehouseInner {\n");
    sb.append("    availabilityByWarehouseId: ").append(toIndentedString(availabilityByWarehouseId)).append("\n");
    sb.append("    availabilityForAllLocation: ").append(toIndentedString(availabilityForAllLocation)).append("\n");
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
    openapiFields.add("availabilityByWarehouseId");
    openapiFields.add("availabilityForAllLocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityRequestAvailabilityByWarehouseInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityRequestAvailabilityByWarehouseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityRequestAvailabilityByWarehouseInner is not found in the empty JSON string", PriceAndAvailabilityRequestAvailabilityByWarehouseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityRequestAvailabilityByWarehouseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityRequestAvailabilityByWarehouseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("availabilityByWarehouseId") != null && !jsonObj.get("availabilityByWarehouseId").isJsonNull()) && !jsonObj.get("availabilityByWarehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availabilityByWarehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availabilityByWarehouseId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityRequestAvailabilityByWarehouseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityRequestAvailabilityByWarehouseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityRequestAvailabilityByWarehouseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityRequestAvailabilityByWarehouseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityRequestAvailabilityByWarehouseInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityRequestAvailabilityByWarehouseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityRequestAvailabilityByWarehouseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityRequestAvailabilityByWarehouseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityRequestAvailabilityByWarehouseInner
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityRequestAvailabilityByWarehouseInner
  */
  public static PriceAndAvailabilityRequestAvailabilityByWarehouseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityRequestAvailabilityByWarehouseInner.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityRequestAvailabilityByWarehouseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

