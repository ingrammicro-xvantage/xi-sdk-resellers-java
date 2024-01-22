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
 * PriceAndAvailabilityResponseInnerPricing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class PriceAndAvailabilityResponseInnerPricing {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_RETAIL_PRICE = "retailPrice";
  @SerializedName(SERIALIZED_NAME_RETAIL_PRICE)
  private BigDecimal retailPrice;

  public static final String SERIALIZED_NAME_MAP_PRICE = "mapPrice";
  @SerializedName(SERIALIZED_NAME_MAP_PRICE)
  private BigDecimal mapPrice;

  public static final String SERIALIZED_NAME_CUSTOMER_PRICE = "customerPrice";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PRICE)
  private BigDecimal customerPrice;

  public static final String SERIALIZED_NAME_SPECIAL_BID_PRICING_AVAILABLE = "specialBidPricingAvailable";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_PRICING_AVAILABLE)
  private Boolean specialBidPricingAvailable;

  public static final String SERIALIZED_NAME_WEB_DISCOUNTS_AVAILABLE = "webDiscountsAvailable";
  @SerializedName(SERIALIZED_NAME_WEB_DISCOUNTS_AVAILABLE)
  private Boolean webDiscountsAvailable;

  public PriceAndAvailabilityResponseInnerPricing() {
  }

  public PriceAndAvailabilityResponseInnerPricing currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The 3-digit ISO currency code.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PriceAndAvailabilityResponseInnerPricing retailPrice(BigDecimal retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }

   /**
   * The retail price of the product.
   * @return retailPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(BigDecimal retailPrice) {
    this.retailPrice = retailPrice;
  }


  public PriceAndAvailabilityResponseInnerPricing mapPrice(BigDecimal mapPrice) {
    this.mapPrice = mapPrice;
    return this;
  }

   /**
   * Minimum Advertised Price (MAP). If required by the vendor, resellers can not sell below MAP price.
   * @return mapPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getMapPrice() {
    return mapPrice;
  }

  public void setMapPrice(BigDecimal mapPrice) {
    this.mapPrice = mapPrice;
  }


  public PriceAndAvailabilityResponseInnerPricing customerPrice(BigDecimal customerPrice) {
    this.customerPrice = customerPrice;
    return this;
  }

   /**
   * The price customer pays after all special pricing and discounts have been applied.
   * @return customerPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getCustomerPrice() {
    return customerPrice;
  }

  public void setCustomerPrice(BigDecimal customerPrice) {
    this.customerPrice = customerPrice;
  }


  public PriceAndAvailabilityResponseInnerPricing specialBidPricingAvailable(Boolean specialBidPricingAvailable) {
    this.specialBidPricingAvailable = specialBidPricingAvailable;
    return this;
  }

   /**
   * Boolean values specifies whether special Bid discounts are available for the product.
   * @return specialBidPricingAvailable
  **/
  @javax.annotation.Nullable
  public Boolean getSpecialBidPricingAvailable() {
    return specialBidPricingAvailable;
  }

  public void setSpecialBidPricingAvailable(Boolean specialBidPricingAvailable) {
    this.specialBidPricingAvailable = specialBidPricingAvailable;
  }


  public PriceAndAvailabilityResponseInnerPricing webDiscountsAvailable(Boolean webDiscountsAvailable) {
    this.webDiscountsAvailable = webDiscountsAvailable;
    return this;
  }

   /**
   * Boolean values specifies whether web Discounts are available for the product.
   * @return webDiscountsAvailable
  **/
  @javax.annotation.Nullable
  public Boolean getWebDiscountsAvailable() {
    return webDiscountsAvailable;
  }

  public void setWebDiscountsAvailable(Boolean webDiscountsAvailable) {
    this.webDiscountsAvailable = webDiscountsAvailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerPricing priceAndAvailabilityResponseInnerPricing = (PriceAndAvailabilityResponseInnerPricing) o;
    return Objects.equals(this.currencyCode, priceAndAvailabilityResponseInnerPricing.currencyCode) &&
        Objects.equals(this.retailPrice, priceAndAvailabilityResponseInnerPricing.retailPrice) &&
        Objects.equals(this.mapPrice, priceAndAvailabilityResponseInnerPricing.mapPrice) &&
        Objects.equals(this.customerPrice, priceAndAvailabilityResponseInnerPricing.customerPrice) &&
        Objects.equals(this.specialBidPricingAvailable, priceAndAvailabilityResponseInnerPricing.specialBidPricingAvailable) &&
        Objects.equals(this.webDiscountsAvailable, priceAndAvailabilityResponseInnerPricing.webDiscountsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, retailPrice, mapPrice, customerPrice, specialBidPricingAvailable, webDiscountsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerPricing {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    mapPrice: ").append(toIndentedString(mapPrice)).append("\n");
    sb.append("    customerPrice: ").append(toIndentedString(customerPrice)).append("\n");
    sb.append("    specialBidPricingAvailable: ").append(toIndentedString(specialBidPricingAvailable)).append("\n");
    sb.append("    webDiscountsAvailable: ").append(toIndentedString(webDiscountsAvailable)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("retailPrice");
    openapiFields.add("mapPrice");
    openapiFields.add("customerPrice");
    openapiFields.add("specialBidPricingAvailable");
    openapiFields.add("webDiscountsAvailable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerPricing
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerPricing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerPricing is not found in the empty JSON string", PriceAndAvailabilityResponseInnerPricing.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerPricing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerPricing` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerPricing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerPricing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerPricing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerPricing.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerPricing>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerPricing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerPricing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityResponseInnerPricing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityResponseInnerPricing
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerPricing
  */
  public static PriceAndAvailabilityResponseInnerPricing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerPricing.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityResponseInnerPricing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

