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
import java.math.BigDecimal;
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
 * QuoteProductListPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class QuoteProductListPrice {
  public static final String SERIALIZED_NAME_QUOTE_PRICE = "quotePrice";
  @SerializedName(SERIALIZED_NAME_QUOTE_PRICE)
  private BigDecimal quotePrice;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private BigDecimal msrp;

  public static final String SERIALIZED_NAME_EXTENDED_MSRP = "extendedMsrp";
  @SerializedName(SERIALIZED_NAME_EXTENDED_MSRP)
  private BigDecimal extendedMsrp;

  public static final String SERIALIZED_NAME_EXTENDED_QUOTE_PRICE = "extendedQuotePrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_QUOTE_PRICE)
  private BigDecimal extendedQuotePrice;

  public QuoteProductListPrice() {
  }

  public QuoteProductListPrice quotePrice(BigDecimal quotePrice) {
    this.quotePrice = quotePrice;
    return this;
  }

   /**
   * Get quotePrice
   * @return quotePrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getQuotePrice() {
    return quotePrice;
  }

  public void setQuotePrice(BigDecimal quotePrice) {
    this.quotePrice = quotePrice;
  }


  public QuoteProductListPrice msrp(BigDecimal msrp) {
    this.msrp = msrp;
    return this;
  }

   /**
   * Get msrp
   * @return msrp
  **/
  @javax.annotation.Nullable
  public BigDecimal getMsrp() {
    return msrp;
  }

  public void setMsrp(BigDecimal msrp) {
    this.msrp = msrp;
  }


  public QuoteProductListPrice extendedMsrp(BigDecimal extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
    return this;
  }

   /**
   * Get extendedMsrp
   * @return extendedMsrp
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedMsrp() {
    return extendedMsrp;
  }

  public void setExtendedMsrp(BigDecimal extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
  }


  public QuoteProductListPrice extendedQuotePrice(BigDecimal extendedQuotePrice) {
    this.extendedQuotePrice = extendedQuotePrice;
    return this;
  }

   /**
   * Get extendedQuotePrice
   * @return extendedQuotePrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedQuotePrice() {
    return extendedQuotePrice;
  }

  public void setExtendedQuotePrice(BigDecimal extendedQuotePrice) {
    this.extendedQuotePrice = extendedQuotePrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteProductListPrice quoteProductListPrice = (QuoteProductListPrice) o;
    return Objects.equals(this.quotePrice, quoteProductListPrice.quotePrice) &&
        Objects.equals(this.msrp, quoteProductListPrice.msrp) &&
        Objects.equals(this.extendedMsrp, quoteProductListPrice.extendedMsrp) &&
        Objects.equals(this.extendedQuotePrice, quoteProductListPrice.extendedQuotePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotePrice, msrp, extendedMsrp, extendedQuotePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteProductListPrice {\n");
    sb.append("    quotePrice: ").append(toIndentedString(quotePrice)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    extendedMsrp: ").append(toIndentedString(extendedMsrp)).append("\n");
    sb.append("    extendedQuotePrice: ").append(toIndentedString(extendedQuotePrice)).append("\n");
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
    openapiFields.add("quotePrice");
    openapiFields.add("msrp");
    openapiFields.add("extendedMsrp");
    openapiFields.add("extendedQuotePrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteProductListPrice
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteProductListPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteProductListPrice is not found in the empty JSON string", QuoteProductListPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteProductListPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteProductListPrice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteProductListPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteProductListPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteProductListPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteProductListPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteProductListPrice>() {
           @Override
           public void write(JsonWriter out, QuoteProductListPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteProductListPrice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteProductListPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteProductListPrice
  * @throws IOException if the JSON string is invalid with respect to QuoteProductListPrice
  */
  public static QuoteProductListPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteProductListPrice.class);
  }

 /**
  * Convert an instance of QuoteProductListPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

