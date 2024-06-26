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
import xiresellers.client.model.PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner;

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
 * PriceAndAvailabilityResponseInnerAvailability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class PriceAndAvailabilityResponseInnerAvailability {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public static final String SERIALIZED_NAME_TOTAL_AVAILABILITY = "totalAvailability";
  @SerializedName(SERIALIZED_NAME_TOTAL_AVAILABILITY)
  private Integer totalAvailability;

  public static final String SERIALIZED_NAME_AVAILABILITY_BY_WAREHOUSE = "availabilityByWarehouse";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_BY_WAREHOUSE)
  private List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner> availabilityByWarehouse = new ArrayList<>();

  public PriceAndAvailabilityResponseInnerAvailability() {
  }

  public PriceAndAvailabilityResponseInnerAvailability available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Boolean that indicates if the product ordered is available
   * @return available
  **/
  @javax.annotation.Nullable
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public PriceAndAvailabilityResponseInnerAvailability totalAvailability(Integer totalAvailability) {
    this.totalAvailability = totalAvailability;
    return this;
  }

   /**
   * The total amount of available products
   * @return totalAvailability
  **/
  @javax.annotation.Nullable
  public Integer getTotalAvailability() {
    return totalAvailability;
  }

  public void setTotalAvailability(Integer totalAvailability) {
    this.totalAvailability = totalAvailability;
  }


  public PriceAndAvailabilityResponseInnerAvailability availabilityByWarehouse(List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner> availabilityByWarehouse) {
    this.availabilityByWarehouse = availabilityByWarehouse;
    return this;
  }

  public PriceAndAvailabilityResponseInnerAvailability addAvailabilityByWarehouseItem(PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner availabilityByWarehouseItem) {
    if (this.availabilityByWarehouse == null) {
      this.availabilityByWarehouse = new ArrayList<>();
    }
    this.availabilityByWarehouse.add(availabilityByWarehouseItem);
    return this;
  }

   /**
   * Get availabilityByWarehouse
   * @return availabilityByWarehouse
  **/
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner> getAvailabilityByWarehouse() {
    return availabilityByWarehouse;
  }

  public void setAvailabilityByWarehouse(List<PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner> availabilityByWarehouse) {
    this.availabilityByWarehouse = availabilityByWarehouse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerAvailability priceAndAvailabilityResponseInnerAvailability = (PriceAndAvailabilityResponseInnerAvailability) o;
    return Objects.equals(this.available, priceAndAvailabilityResponseInnerAvailability.available) &&
        Objects.equals(this.totalAvailability, priceAndAvailabilityResponseInnerAvailability.totalAvailability) &&
        Objects.equals(this.availabilityByWarehouse, priceAndAvailabilityResponseInnerAvailability.availabilityByWarehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, totalAvailability, availabilityByWarehouse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerAvailability {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    totalAvailability: ").append(toIndentedString(totalAvailability)).append("\n");
    sb.append("    availabilityByWarehouse: ").append(toIndentedString(availabilityByWarehouse)).append("\n");
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
    openapiFields.add("available");
    openapiFields.add("totalAvailability");
    openapiFields.add("availabilityByWarehouse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerAvailability
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerAvailability.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerAvailability is not found in the empty JSON string", PriceAndAvailabilityResponseInnerAvailability.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerAvailability.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerAvailability` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("availabilityByWarehouse") != null && !jsonObj.get("availabilityByWarehouse").isJsonNull()) {
        JsonArray jsonArrayavailabilityByWarehouse = jsonObj.getAsJsonArray("availabilityByWarehouse");
        if (jsonArrayavailabilityByWarehouse != null) {
          // ensure the json data is an array
          if (!jsonObj.get("availabilityByWarehouse").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `availabilityByWarehouse` to be an array in the JSON string but got `%s`", jsonObj.get("availabilityByWarehouse").toString()));
          }

          // validate the optional field `availabilityByWarehouse` (array)
          for (int i = 0; i < jsonArrayavailabilityByWarehouse.size(); i++) {
            PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.validateJsonElement(jsonArrayavailabilityByWarehouse.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerAvailability.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerAvailability' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerAvailability> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerAvailability.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerAvailability>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerAvailability value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerAvailability read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityResponseInnerAvailability given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityResponseInnerAvailability
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerAvailability
  */
  public static PriceAndAvailabilityResponseInnerAvailability fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerAvailability.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityResponseInnerAvailability to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

