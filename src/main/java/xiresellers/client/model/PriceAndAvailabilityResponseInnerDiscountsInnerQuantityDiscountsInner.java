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
 * PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner {
  public static final String SERIALIZED_NAME_CONDITION_TYPE = "conditionType";
  @SerializedName(SERIALIZED_NAME_CONDITION_TYPE)
  private String conditionType;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CURRENCY_TYPE = "currencyType";
  @SerializedName(SERIALIZED_NAME_CURRENCY_TYPE)
  private String currencyType;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner() {
  }

  public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner conditionType(String conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * Indicates when the discount is applied after ordering the product.
   * @return conditionType
  **/
  @javax.annotation.Nullable
  public String getConditionType() {
    return conditionType;
  }

  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The country-specific three digit ISO 4217 currency code for the order.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner currencyType(String currencyType) {
    this.currencyType = currencyType;
    return this;
  }

   /**
   * Type of currency.
   * @return currencyType
  **/
  @javax.annotation.Nullable
  public String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The total discounted quantity of the product.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total price of all the discounts applied.
   * @return amount
  **/
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner priceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner = (PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner) o;
    return Objects.equals(this.conditionType, priceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.conditionType) &&
        Objects.equals(this.currencyCode, priceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.currencyCode) &&
        Objects.equals(this.currencyType, priceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.currencyType) &&
        Objects.equals(this.quantity, priceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.quantity) &&
        Objects.equals(this.amount, priceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, currencyCode, currencyType, quantity, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("conditionType");
    openapiFields.add("currencyCode");
    openapiFields.add("currencyType");
    openapiFields.add("quantity");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("conditionType") != null && !jsonObj.get("conditionType").isJsonNull()) && !jsonObj.get("conditionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conditionType").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("currencyType") != null && !jsonObj.get("currencyType").isJsonNull()) && !jsonObj.get("currencyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner
  */
  public static PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

