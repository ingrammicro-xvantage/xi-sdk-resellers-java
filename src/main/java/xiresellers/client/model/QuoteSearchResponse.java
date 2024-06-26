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
import xiresellers.client.model.QuoteSearchResponseQuotesInner;

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
 * QuoteSearchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class QuoteSearchResponse {
  public static final String SERIALIZED_NAME_RECORDS_FOUND = "recordsFound";
  @SerializedName(SERIALIZED_NAME_RECORDS_FOUND)
  private Integer recordsFound;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_QUOTES = "quotes";
  @SerializedName(SERIALIZED_NAME_QUOTES)
  private List<QuoteSearchResponseQuotesInner> quotes = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREV_PAGE = "prevPage";
  @SerializedName(SERIALIZED_NAME_PREV_PAGE)
  private String prevPage;

  public QuoteSearchResponse() {
  }

  public QuoteSearchResponse recordsFound(Integer recordsFound) {
    this.recordsFound = recordsFound;
    return this;
  }

   /**
   * Total count of quotes retrieved in the request response.
   * @return recordsFound
  **/
  @javax.annotation.Nullable
  public Integer getRecordsFound() {
    return recordsFound;
  }

  public void setRecordsFound(Integer recordsFound) {
    this.recordsFound = recordsFound;
  }


  public QuoteSearchResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of records (quotes) displayed per page in the quote list.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public QuoteSearchResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page index or page number for the list of quotes being returned.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public QuoteSearchResponse quotes(List<QuoteSearchResponseQuotesInner> quotes) {
    this.quotes = quotes;
    return this;
  }

  public QuoteSearchResponse addQuotesItem(QuoteSearchResponseQuotesInner quotesItem) {
    if (this.quotes == null) {
      this.quotes = new ArrayList<>();
    }
    this.quotes.add(quotesItem);
    return this;
  }

   /**
   * The quote details for the requested criteria.
   * @return quotes
  **/
  @javax.annotation.Nullable
  public List<QuoteSearchResponseQuotesInner> getQuotes() {
    return quotes;
  }

  public void setQuotes(List<QuoteSearchResponseQuotesInner> quotes) {
    this.quotes = quotes;
  }


  public QuoteSearchResponse nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public QuoteSearchResponse prevPage(String prevPage) {
    this.prevPage = prevPage;
    return this;
  }

   /**
   * Get prevPage
   * @return prevPage
  **/
  @javax.annotation.Nullable
  public String getPrevPage() {
    return prevPage;
  }

  public void setPrevPage(String prevPage) {
    this.prevPage = prevPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSearchResponse quoteSearchResponse = (QuoteSearchResponse) o;
    return Objects.equals(this.recordsFound, quoteSearchResponse.recordsFound) &&
        Objects.equals(this.pageSize, quoteSearchResponse.pageSize) &&
        Objects.equals(this.pageNumber, quoteSearchResponse.pageNumber) &&
        Objects.equals(this.quotes, quoteSearchResponse.quotes) &&
        Objects.equals(this.nextPage, quoteSearchResponse.nextPage) &&
        Objects.equals(this.prevPage, quoteSearchResponse.prevPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordsFound, pageSize, pageNumber, quotes, nextPage, prevPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSearchResponse {\n");
    sb.append("    recordsFound: ").append(toIndentedString(recordsFound)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    prevPage: ").append(toIndentedString(prevPage)).append("\n");
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
    openapiFields.add("recordsFound");
    openapiFields.add("pageSize");
    openapiFields.add("pageNumber");
    openapiFields.add("quotes");
    openapiFields.add("nextPage");
    openapiFields.add("prevPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteSearchResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteSearchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteSearchResponse is not found in the empty JSON string", QuoteSearchResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteSearchResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteSearchResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("quotes") != null && !jsonObj.get("quotes").isJsonNull()) {
        JsonArray jsonArrayquotes = jsonObj.getAsJsonArray("quotes");
        if (jsonArrayquotes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("quotes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `quotes` to be an array in the JSON string but got `%s`", jsonObj.get("quotes").toString()));
          }

          // validate the optional field `quotes` (array)
          for (int i = 0; i < jsonArrayquotes.size(); i++) {
            QuoteSearchResponseQuotesInner.validateJsonElement(jsonArrayquotes.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("prevPage") != null && !jsonObj.get("prevPage").isJsonNull()) && !jsonObj.get("prevPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prevPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prevPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteSearchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteSearchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteSearchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteSearchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteSearchResponse>() {
           @Override
           public void write(JsonWriter out, QuoteSearchResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteSearchResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteSearchResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteSearchResponse
  * @throws IOException if the JSON string is invalid with respect to QuoteSearchResponse
  */
  public static QuoteSearchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteSearchResponse.class);
  }

 /**
  * Convert an instance of QuoteSearchResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

