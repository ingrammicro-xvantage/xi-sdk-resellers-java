/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import org.openapitools.client.JSON;

/**
 * QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes {
  public static final String SERIALIZED_NAME_ESTIMATE_ID = "estimateId";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_ID)
  private String estimateId;

  public static final String SERIALIZED_NAME_DEAL_ID = "dealId";
  @SerializedName(SERIALIZED_NAME_DEAL_ID)
  private String dealId;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_VENDOR_SETTING_MESSAGE = "vendorSettingMessage";
  @SerializedName(SERIALIZED_NAME_VENDOR_SETTING_MESSAGE)
  private String vendorSettingMessage;

  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes() {
  }

  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes estimateId(String estimateId) {
    this.estimateId = estimateId;
    return this;
  }

   /**
   * Get estimateId
   * @return estimateId
  **/
  @javax.annotation.Nullable
  public String getEstimateId() {
    return estimateId;
  }

  public void setEstimateId(String estimateId) {
    this.estimateId = estimateId;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes dealId(String dealId) {
    this.dealId = dealId;
    return this;
  }

   /**
   * Get dealId
   * @return dealId
  **/
  @javax.annotation.Nullable
  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes vendorSettingMessage(String vendorSettingMessage) {
    this.vendorSettingMessage = vendorSettingMessage;
    return this;
  }

   /**
   * Get vendorSettingMessage
   * @return vendorSettingMessage
  **/
  @javax.annotation.Nullable
  public String getVendorSettingMessage() {
    return vendorSettingMessage;
  }

  public void setVendorSettingMessage(String vendorSettingMessage) {
    this.vendorSettingMessage = vendorSettingMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes quoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes = (QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes) o;
    return Objects.equals(this.estimateId, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.estimateId) &&
        Objects.equals(this.dealId, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.dealId) &&
        Objects.equals(this.vendorName, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.vendorName) &&
        Objects.equals(this.vendorSettingMessage, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.vendorSettingMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateId, dealId, vendorName, vendorSettingMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes {\n");
    sb.append("    estimateId: ").append(toIndentedString(estimateId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorSettingMessage: ").append(toIndentedString(vendorSettingMessage)).append("\n");
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
    openapiFields.add("estimateId");
    openapiFields.add("dealId");
    openapiFields.add("vendorName");
    openapiFields.add("vendorSettingMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes is not found in the empty JSON string", QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("estimateId") != null && !jsonObj.get("estimateId").isJsonNull()) && !jsonObj.get("estimateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimateId").toString()));
      }
      if ((jsonObj.get("dealId") != null && !jsonObj.get("dealId").isJsonNull()) && !jsonObj.get("dealId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealId").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("vendorSettingMessage") != null && !jsonObj.get("vendorSettingMessage").isJsonNull()) && !jsonObj.get("vendorSettingMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorSettingMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorSettingMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes
  */
  public static QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes.class);
  }

 /**
  * Convert an instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseVendorAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

