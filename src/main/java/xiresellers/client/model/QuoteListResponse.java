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
import xiresellers.client.model.QuoteListResponseQuoteSearchResponse;

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
 * Response schema for get quote list endpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class QuoteListResponse {
  public static final String SERIALIZED_NAME_QUOTE_SEARCH_RESPONSE = "quoteSearchResponse";
  @SerializedName(SERIALIZED_NAME_QUOTE_SEARCH_RESPONSE)
  private QuoteListResponseQuoteSearchResponse quoteSearchResponse;

  public QuoteListResponse() {
  }

  public QuoteListResponse quoteSearchResponse(QuoteListResponseQuoteSearchResponse quoteSearchResponse) {
    this.quoteSearchResponse = quoteSearchResponse;
    return this;
  }

   /**
   * Get quoteSearchResponse
   * @return quoteSearchResponse
  **/
  @javax.annotation.Nullable
  public QuoteListResponseQuoteSearchResponse getQuoteSearchResponse() {
    return quoteSearchResponse;
  }

  public void setQuoteSearchResponse(QuoteListResponseQuoteSearchResponse quoteSearchResponse) {
    this.quoteSearchResponse = quoteSearchResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteListResponse quoteListResponse = (QuoteListResponse) o;
    return Objects.equals(this.quoteSearchResponse, quoteListResponse.quoteSearchResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteSearchResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteListResponse {\n");
    sb.append("    quoteSearchResponse: ").append(toIndentedString(quoteSearchResponse)).append("\n");
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
    openapiFields.add("quoteSearchResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteListResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteListResponse is not found in the empty JSON string", QuoteListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `quoteSearchResponse`
      if (jsonObj.get("quoteSearchResponse") != null && !jsonObj.get("quoteSearchResponse").isJsonNull()) {
        QuoteListResponseQuoteSearchResponse.validateJsonElement(jsonObj.get("quoteSearchResponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteListResponse>() {
           @Override
           public void write(JsonWriter out, QuoteListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteListResponse
  * @throws IOException if the JSON string is invalid with respect to QuoteListResponse
  */
  public static QuoteListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteListResponse.class);
  }

 /**
  * Convert an instance of QuoteListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

