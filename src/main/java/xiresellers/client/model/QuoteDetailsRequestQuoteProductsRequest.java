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
import xiresellers.client.model.QuoteDetailsRequestQuoteProductsRequestRequestpreamble;
import xiresellers.client.model.QuoteDetailsRequestQuoteProductsRequestRetrieveQuoteProductsRequest;

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
 * QuoteDetailsRequestQuoteProductsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class QuoteDetailsRequestQuoteProductsRequest {
  public static final String SERIALIZED_NAME_REQUESTPREAMBLE = "requestpreamble";
  @SerializedName(SERIALIZED_NAME_REQUESTPREAMBLE)
  private QuoteDetailsRequestQuoteProductsRequestRequestpreamble requestpreamble;

  public static final String SERIALIZED_NAME_RETRIEVE_QUOTE_PRODUCTS_REQUEST = "retrieveQuoteProductsRequest";
  @SerializedName(SERIALIZED_NAME_RETRIEVE_QUOTE_PRODUCTS_REQUEST)
  private QuoteDetailsRequestQuoteProductsRequestRetrieveQuoteProductsRequest retrieveQuoteProductsRequest;

  public QuoteDetailsRequestQuoteProductsRequest() {
  }

  public QuoteDetailsRequestQuoteProductsRequest requestpreamble(QuoteDetailsRequestQuoteProductsRequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
    return this;
  }

   /**
   * Get requestpreamble
   * @return requestpreamble
  **/
  @javax.annotation.Nullable
  public QuoteDetailsRequestQuoteProductsRequestRequestpreamble getRequestpreamble() {
    return requestpreamble;
  }

  public void setRequestpreamble(QuoteDetailsRequestQuoteProductsRequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
  }


  public QuoteDetailsRequestQuoteProductsRequest retrieveQuoteProductsRequest(QuoteDetailsRequestQuoteProductsRequestRetrieveQuoteProductsRequest retrieveQuoteProductsRequest) {
    this.retrieveQuoteProductsRequest = retrieveQuoteProductsRequest;
    return this;
  }

   /**
   * Get retrieveQuoteProductsRequest
   * @return retrieveQuoteProductsRequest
  **/
  @javax.annotation.Nullable
  public QuoteDetailsRequestQuoteProductsRequestRetrieveQuoteProductsRequest getRetrieveQuoteProductsRequest() {
    return retrieveQuoteProductsRequest;
  }

  public void setRetrieveQuoteProductsRequest(QuoteDetailsRequestQuoteProductsRequestRetrieveQuoteProductsRequest retrieveQuoteProductsRequest) {
    this.retrieveQuoteProductsRequest = retrieveQuoteProductsRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsRequestQuoteProductsRequest quoteDetailsRequestQuoteProductsRequest = (QuoteDetailsRequestQuoteProductsRequest) o;
    return Objects.equals(this.requestpreamble, quoteDetailsRequestQuoteProductsRequest.requestpreamble) &&
        Objects.equals(this.retrieveQuoteProductsRequest, quoteDetailsRequestQuoteProductsRequest.retrieveQuoteProductsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestpreamble, retrieveQuoteProductsRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsRequestQuoteProductsRequest {\n");
    sb.append("    requestpreamble: ").append(toIndentedString(requestpreamble)).append("\n");
    sb.append("    retrieveQuoteProductsRequest: ").append(toIndentedString(retrieveQuoteProductsRequest)).append("\n");
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
    openapiFields.add("requestpreamble");
    openapiFields.add("retrieveQuoteProductsRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsRequestQuoteProductsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsRequestQuoteProductsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsRequestQuoteProductsRequest is not found in the empty JSON string", QuoteDetailsRequestQuoteProductsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsRequestQuoteProductsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsRequestQuoteProductsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `requestpreamble`
      if (jsonObj.get("requestpreamble") != null && !jsonObj.get("requestpreamble").isJsonNull()) {
        QuoteDetailsRequestQuoteProductsRequestRequestpreamble.validateJsonElement(jsonObj.get("requestpreamble"));
      }
      // validate the optional field `retrieveQuoteProductsRequest`
      if (jsonObj.get("retrieveQuoteProductsRequest") != null && !jsonObj.get("retrieveQuoteProductsRequest").isJsonNull()) {
        QuoteDetailsRequestQuoteProductsRequestRetrieveQuoteProductsRequest.validateJsonElement(jsonObj.get("retrieveQuoteProductsRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsRequestQuoteProductsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsRequestQuoteProductsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsRequestQuoteProductsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsRequestQuoteProductsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsRequestQuoteProductsRequest>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsRequestQuoteProductsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsRequestQuoteProductsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsRequestQuoteProductsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsRequestQuoteProductsRequest
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsRequestQuoteProductsRequest
  */
  public static QuoteDetailsRequestQuoteProductsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsRequestQuoteProductsRequest.class);
  }

 /**
  * Convert an instance of QuoteDetailsRequestQuoteProductsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
