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
import xiresellers.client.model.PriceAndAvailabilityResponseServiceresponsePriceandstockresponse;
import xiresellers.client.model.PriceAndAvailabilityResponseServiceresponseResponsepreamble;

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
 * PriceAndAvailabilityResponseServiceresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class PriceAndAvailabilityResponseServiceresponse {
  public static final String SERIALIZED_NAME_RESPONSEPREAMBLE = "responsepreamble";
  @SerializedName(SERIALIZED_NAME_RESPONSEPREAMBLE)
  private PriceAndAvailabilityResponseServiceresponseResponsepreamble responsepreamble;

  public static final String SERIALIZED_NAME_PRICEANDSTOCKRESPONSE = "priceandstockresponse";
  @SerializedName(SERIALIZED_NAME_PRICEANDSTOCKRESPONSE)
  private PriceAndAvailabilityResponseServiceresponsePriceandstockresponse priceandstockresponse;

  public PriceAndAvailabilityResponseServiceresponse() {
  }

  public PriceAndAvailabilityResponseServiceresponse responsepreamble(PriceAndAvailabilityResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
    return this;
  }

   /**
   * Get responsepreamble
   * @return responsepreamble
  **/
  @javax.annotation.Nullable
  public PriceAndAvailabilityResponseServiceresponseResponsepreamble getResponsepreamble() {
    return responsepreamble;
  }

  public void setResponsepreamble(PriceAndAvailabilityResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
  }


  public PriceAndAvailabilityResponseServiceresponse priceandstockresponse(PriceAndAvailabilityResponseServiceresponsePriceandstockresponse priceandstockresponse) {
    this.priceandstockresponse = priceandstockresponse;
    return this;
  }

   /**
   * Get priceandstockresponse
   * @return priceandstockresponse
  **/
  @javax.annotation.Nullable
  public PriceAndAvailabilityResponseServiceresponsePriceandstockresponse getPriceandstockresponse() {
    return priceandstockresponse;
  }

  public void setPriceandstockresponse(PriceAndAvailabilityResponseServiceresponsePriceandstockresponse priceandstockresponse) {
    this.priceandstockresponse = priceandstockresponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseServiceresponse priceAndAvailabilityResponseServiceresponse = (PriceAndAvailabilityResponseServiceresponse) o;
    return Objects.equals(this.responsepreamble, priceAndAvailabilityResponseServiceresponse.responsepreamble) &&
        Objects.equals(this.priceandstockresponse, priceAndAvailabilityResponseServiceresponse.priceandstockresponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsepreamble, priceandstockresponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseServiceresponse {\n");
    sb.append("    responsepreamble: ").append(toIndentedString(responsepreamble)).append("\n");
    sb.append("    priceandstockresponse: ").append(toIndentedString(priceandstockresponse)).append("\n");
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
    openapiFields.add("responsepreamble");
    openapiFields.add("priceandstockresponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseServiceresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseServiceresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseServiceresponse is not found in the empty JSON string", PriceAndAvailabilityResponseServiceresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseServiceresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseServiceresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `responsepreamble`
      if (jsonObj.get("responsepreamble") != null && !jsonObj.get("responsepreamble").isJsonNull()) {
        PriceAndAvailabilityResponseServiceresponseResponsepreamble.validateJsonElement(jsonObj.get("responsepreamble"));
      }
      // validate the optional field `priceandstockresponse`
      if (jsonObj.get("priceandstockresponse") != null && !jsonObj.get("priceandstockresponse").isJsonNull()) {
        PriceAndAvailabilityResponseServiceresponsePriceandstockresponse.validateJsonElement(jsonObj.get("priceandstockresponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseServiceresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseServiceresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseServiceresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseServiceresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseServiceresponse>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseServiceresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseServiceresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityResponseServiceresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityResponseServiceresponse
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseServiceresponse
  */
  public static PriceAndAvailabilityResponseServiceresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseServiceresponse.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityResponseServiceresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

