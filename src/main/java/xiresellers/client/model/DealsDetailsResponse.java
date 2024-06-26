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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.DealsDetailsResponseProductsInner;
import xiresellers.client.model.RenewalsDetailsResponseEndUserInfo;

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
 * DealsDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DealsDetailsResponse {
  public static final String SERIALIZED_NAME_DEAL_ID = "dealId";
  @SerializedName(SERIALIZED_NAME_DEAL_ID)
  private String dealId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_END_USER = "endUser";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private String endUser;

  public static final String SERIALIZED_NAME_EXTENDED_MSRP = "extendedMsrp";
  @SerializedName(SERIALIZED_NAME_EXTENDED_MSRP)
  private BigDecimal extendedMsrp;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_DEAL_RECEIVED_ON = "dealReceivedOn";
  @SerializedName(SERIALIZED_NAME_DEAL_RECEIVED_ON)
  private String dealReceivedOn;

  public static final String SERIALIZED_NAME_DEAL_EXPIRY_DATE = "dealExpiryDate";
  @SerializedName(SERIALIZED_NAME_DEAL_EXPIRY_DATE)
  private String dealExpiryDate;

  public static final String SERIALIZED_NAME_PRICE_PROTECTION_END_DATE = "priceProtectionEndDate";
  @SerializedName(SERIALIZED_NAME_PRICE_PROTECTION_END_DATE)
  private String priceProtectionEndDate;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private RenewalsDetailsResponseEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<DealsDetailsResponseProductsInner> products = new ArrayList<>();

  public DealsDetailsResponse() {
  }

  public DealsDetailsResponse dealId(String dealId) {
    this.dealId = dealId;
    return this;
  }

   /**
   * Deal/Special bid number.
   * @return dealId
  **/
  @javax.annotation.Nullable
  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }


  public DealsDetailsResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Most recent version number of the deal.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public DealsDetailsResponse endUser(String endUser) {
    this.endUser = endUser;
    return this;
  }

   /**
   * The end user/customer&#39;s name.
   * @return endUser
  **/
  @javax.annotation.Nullable
  public String getEndUser() {
    return endUser;
  }

  public void setEndUser(String endUser) {
    this.endUser = endUser;
  }


  public DealsDetailsResponse extendedMsrp(BigDecimal extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
    return this;
  }

   /**
   * Extended MSRP - Manufacturer Suggested Retail Price X Quantity.
   * @return extendedMsrp
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedMsrp() {
    return extendedMsrp;
  }

  public void setExtendedMsrp(BigDecimal extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
  }


  public DealsDetailsResponse vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * The vendor&#39;s name.
   * @return vendor
  **/
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public DealsDetailsResponse dealReceivedOn(String dealReceivedOn) {
    this.dealReceivedOn = dealReceivedOn;
    return this;
  }

   /**
   * The date on which the deal starts.
   * @return dealReceivedOn
  **/
  @javax.annotation.Nullable
  public String getDealReceivedOn() {
    return dealReceivedOn;
  }

  public void setDealReceivedOn(String dealReceivedOn) {
    this.dealReceivedOn = dealReceivedOn;
  }


  public DealsDetailsResponse dealExpiryDate(String dealExpiryDate) {
    this.dealExpiryDate = dealExpiryDate;
    return this;
  }

   /**
   * Expiration date of the deal/Special bid.
   * @return dealExpiryDate
  **/
  @javax.annotation.Nullable
  public String getDealExpiryDate() {
    return dealExpiryDate;
  }

  public void setDealExpiryDate(String dealExpiryDate) {
    this.dealExpiryDate = dealExpiryDate;
  }


  public DealsDetailsResponse priceProtectionEndDate(String priceProtectionEndDate) {
    this.priceProtectionEndDate = priceProtectionEndDate;
    return this;
  }

   /**
   * The date on which the price protection will end.
   * @return priceProtectionEndDate
  **/
  @javax.annotation.Nullable
  public String getPriceProtectionEndDate() {
    return priceProtectionEndDate;
  }

  public void setPriceProtectionEndDate(String priceProtectionEndDate) {
    this.priceProtectionEndDate = priceProtectionEndDate;
  }


  public DealsDetailsResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Country specific currency code.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public DealsDetailsResponse endUserInfo(RenewalsDetailsResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public RenewalsDetailsResponseEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(RenewalsDetailsResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public DealsDetailsResponse products(List<DealsDetailsResponseProductsInner> products) {
    this.products = products;
    return this;
  }

  public DealsDetailsResponse addProductsItem(DealsDetailsResponseProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  public List<DealsDetailsResponseProductsInner> getProducts() {
    return products;
  }

  public void setProducts(List<DealsDetailsResponseProductsInner> products) {
    this.products = products;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealsDetailsResponse dealsDetailsResponse = (DealsDetailsResponse) o;
    return Objects.equals(this.dealId, dealsDetailsResponse.dealId) &&
        Objects.equals(this.version, dealsDetailsResponse.version) &&
        Objects.equals(this.endUser, dealsDetailsResponse.endUser) &&
        Objects.equals(this.extendedMsrp, dealsDetailsResponse.extendedMsrp) &&
        Objects.equals(this.vendor, dealsDetailsResponse.vendor) &&
        Objects.equals(this.dealReceivedOn, dealsDetailsResponse.dealReceivedOn) &&
        Objects.equals(this.dealExpiryDate, dealsDetailsResponse.dealExpiryDate) &&
        Objects.equals(this.priceProtectionEndDate, dealsDetailsResponse.priceProtectionEndDate) &&
        Objects.equals(this.currencyCode, dealsDetailsResponse.currencyCode) &&
        Objects.equals(this.endUserInfo, dealsDetailsResponse.endUserInfo) &&
        Objects.equals(this.products, dealsDetailsResponse.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, version, endUser, extendedMsrp, vendor, dealReceivedOn, dealExpiryDate, priceProtectionEndDate, currencyCode, endUserInfo, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealsDetailsResponse {\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser)).append("\n");
    sb.append("    extendedMsrp: ").append(toIndentedString(extendedMsrp)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    dealReceivedOn: ").append(toIndentedString(dealReceivedOn)).append("\n");
    sb.append("    dealExpiryDate: ").append(toIndentedString(dealExpiryDate)).append("\n");
    sb.append("    priceProtectionEndDate: ").append(toIndentedString(priceProtectionEndDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
    openapiFields.add("dealId");
    openapiFields.add("version");
    openapiFields.add("endUser");
    openapiFields.add("extendedMsrp");
    openapiFields.add("vendor");
    openapiFields.add("dealReceivedOn");
    openapiFields.add("dealExpiryDate");
    openapiFields.add("priceProtectionEndDate");
    openapiFields.add("currencyCode");
    openapiFields.add("endUserInfo");
    openapiFields.add("products");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DealsDetailsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DealsDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DealsDetailsResponse is not found in the empty JSON string", DealsDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DealsDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DealsDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dealId") != null && !jsonObj.get("dealId").isJsonNull()) && !jsonObj.get("dealId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealId").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("endUser") != null && !jsonObj.get("endUser").isJsonNull()) && !jsonObj.get("endUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUser").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("dealReceivedOn") != null && !jsonObj.get("dealReceivedOn").isJsonNull()) && !jsonObj.get("dealReceivedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealReceivedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealReceivedOn").toString()));
      }
      if ((jsonObj.get("dealExpiryDate") != null && !jsonObj.get("dealExpiryDate").isJsonNull()) && !jsonObj.get("dealExpiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealExpiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealExpiryDate").toString()));
      }
      if ((jsonObj.get("priceProtectionEndDate") != null && !jsonObj.get("priceProtectionEndDate").isJsonNull()) && !jsonObj.get("priceProtectionEndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceProtectionEndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceProtectionEndDate").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        RenewalsDetailsResponseEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            DealsDetailsResponseProductsInner.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DealsDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DealsDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DealsDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DealsDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DealsDetailsResponse>() {
           @Override
           public void write(JsonWriter out, DealsDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DealsDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DealsDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DealsDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to DealsDetailsResponse
  */
  public static DealsDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DealsDetailsResponse.class);
  }

 /**
  * Convert an instance of DealsDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

