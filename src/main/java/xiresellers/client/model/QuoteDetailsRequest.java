/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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
import xiresellers.client.model.QuoteDetailsRequestQuoteProductsRequest;

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
 * Request schema for get quote details endpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T11:06:29.712836Z[Etc/UTC]")
public class QuoteDetailsRequest {
  public static final String SERIALIZED_NAME_QUOTE_PRODUCTS_REQUEST = "quoteProductsRequest";
  @SerializedName(SERIALIZED_NAME_QUOTE_PRODUCTS_REQUEST)
  private QuoteDetailsRequestQuoteProductsRequest quoteProductsRequest;

  public QuoteDetailsRequest() {
  }

  public QuoteDetailsRequest quoteProductsRequest(QuoteDetailsRequestQuoteProductsRequest quoteProductsRequest) {
    this.quoteProductsRequest = quoteProductsRequest;
    return this;
  }

   /**
   * Get quoteProductsRequest
   * @return quoteProductsRequest
  **/
  @javax.annotation.Nullable
  public QuoteDetailsRequestQuoteProductsRequest getQuoteProductsRequest() {
    return quoteProductsRequest;
  }

  public void setQuoteProductsRequest(QuoteDetailsRequestQuoteProductsRequest quoteProductsRequest) {
    this.quoteProductsRequest = quoteProductsRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsRequest quoteDetailsRequest = (QuoteDetailsRequest) o;
    return Objects.equals(this.quoteProductsRequest, quoteDetailsRequest.quoteProductsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteProductsRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsRequest {\n");
    sb.append("    quoteProductsRequest: ").append(toIndentedString(quoteProductsRequest)).append("\n");
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
    openapiFields.add("quoteProductsRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsRequest is not found in the empty JSON string", QuoteDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `quoteProductsRequest`
      if (jsonObj.get("quoteProductsRequest") != null && !jsonObj.get("quoteProductsRequest").isJsonNull()) {
        QuoteDetailsRequestQuoteProductsRequest.validateJsonElement(jsonObj.get("quoteProductsRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsRequest>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsRequest
  */
  public static QuoteDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsRequest.class);
  }

 /**
  * Convert an instance of QuoteDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

