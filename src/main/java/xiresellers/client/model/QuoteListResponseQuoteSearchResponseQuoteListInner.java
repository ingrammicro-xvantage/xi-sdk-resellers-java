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
import java.time.LocalDate;
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
 * QuoteListResponseQuoteSearchResponseQuoteListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class QuoteListResponseQuoteSearchResponseQuoteListInner {
  public static final String SERIALIZED_NAME_QUOTE_NAME = "quoteName";
  @SerializedName(SERIALIZED_NAME_QUOTE_NAME)
  private String quoteName;

  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_REVISION_NUMBER = "revisionNumber";
  @SerializedName(SERIALIZED_NAME_REVISION_NUMBER)
  private Integer revisionNumber;

  public static final String SERIALIZED_NAME_END_USER_NAME = "endUserName";
  @SerializedName(SERIALIZED_NAME_END_USER_NAME)
  private String endUserName;

  public static final String SERIALIZED_NAME_BID_NUMBER = "bidNumber";
  @SerializedName(SERIALIZED_NAME_BID_NUMBER)
  private String bidNumber;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "totalAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_QUOTE_STATUS = "quoteStatus";
  @SerializedName(SERIALIZED_NAME_QUOTE_STATUS)
  private String quoteStatus;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private LocalDate createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private LocalDate lastModifiedDate;

  public static final String SERIALIZED_NAME_QUOTE_EXPIRY_DATE = "quoteExpiryDate";
  @SerializedName(SERIALIZED_NAME_QUOTE_EXPIRY_DATE)
  private LocalDate quoteExpiryDate;

  public QuoteListResponseQuoteSearchResponseQuoteListInner() {
  }

  public QuoteListResponseQuoteSearchResponseQuoteListInner quoteName(String quoteName) {
    this.quoteName = quoteName;
    return this;
  }

   /**
   * Quote Name given to quote by sales team or system generated. Generally used as a reference to identify the quote.
   * @return quoteName
  **/
  @javax.annotation.Nullable
  public String getQuoteName() {
    return quoteName;
  }

  public void setQuoteName(String quoteName) {
    this.quoteName = quoteName;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

   /**
   * Unique identifier generated by Ingram Micro&#39;s CRM specific to each quote. When applying a filter to the quoteNumber and including a partial quote number in the filter, all quotes containing any information included in the filter can be retrieved as a subset of all available customer quotes.
   * @return quoteNumber
  **/
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner revisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
    return this;
  }

   /**
   * When a quote has been revised and updated, the quote number remains the same throughout the lifecycle of the quote, however, a Revision number is updated for each revision of the quote. The revision numbers is associated with the Unique Quote Number.
   * @return revisionNumber
  **/
  @javax.annotation.Nullable
  public Integer getRevisionNumber() {
    return revisionNumber;
  }

  public void setRevisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner endUserName(String endUserName) {
    this.endUserName = endUserName;
    return this;
  }

   /**
   * End User Name is the end customer name that is associated with a quote in Ingram Micro&#39;s CRM
   * @return endUserName
  **/
  @javax.annotation.Nullable
  public String getEndUserName() {
    return endUserName;
  }

  public void setEndUserName(String endUserName) {
    this.endUserName = endUserName;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner bidNumber(String bidNumber) {
    this.bidNumber = bidNumber;
    return this;
  }

   /**
   * Special Pricing Bid Number, also refers to as Dart Number relates to a unique pricing deal associated with a vendor for the quote.
   * @return bidNumber
  **/
  @javax.annotation.Nullable
  public String getBidNumber() {
    return bidNumber;
  }

  public void setBidNumber(String bidNumber) {
    this.bidNumber = bidNumber;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of quoted price for all products in the quote.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner quoteStatus(String quoteStatus) {
    this.quoteStatus = quoteStatus;
    return this;
  }

   /**
   * This refers to the primary status of the quote. API responses will return: Active
   * @return quoteStatus
  **/
  @javax.annotation.Nullable
  public String getQuoteStatus() {
    return quoteStatus;
  }

  public void setQuoteStatus(String quoteStatus) {
    this.quoteStatus = quoteStatus;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner createdDate(LocalDate createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date the Quote was initially Created
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner lastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date the Quote was last updated or modified.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  public LocalDate getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public QuoteListResponseQuoteSearchResponseQuoteListInner quoteExpiryDate(LocalDate quoteExpiryDate) {
    this.quoteExpiryDate = quoteExpiryDate;
    return this;
  }

   /**
   * Date the Quote Expires
   * @return quoteExpiryDate
  **/
  @javax.annotation.Nullable
  public LocalDate getQuoteExpiryDate() {
    return quoteExpiryDate;
  }

  public void setQuoteExpiryDate(LocalDate quoteExpiryDate) {
    this.quoteExpiryDate = quoteExpiryDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteListResponseQuoteSearchResponseQuoteListInner quoteListResponseQuoteSearchResponseQuoteListInner = (QuoteListResponseQuoteSearchResponseQuoteListInner) o;
    return Objects.equals(this.quoteName, quoteListResponseQuoteSearchResponseQuoteListInner.quoteName) &&
        Objects.equals(this.quoteNumber, quoteListResponseQuoteSearchResponseQuoteListInner.quoteNumber) &&
        Objects.equals(this.revisionNumber, quoteListResponseQuoteSearchResponseQuoteListInner.revisionNumber) &&
        Objects.equals(this.endUserName, quoteListResponseQuoteSearchResponseQuoteListInner.endUserName) &&
        Objects.equals(this.bidNumber, quoteListResponseQuoteSearchResponseQuoteListInner.bidNumber) &&
        Objects.equals(this.totalAmount, quoteListResponseQuoteSearchResponseQuoteListInner.totalAmount) &&
        Objects.equals(this.quoteStatus, quoteListResponseQuoteSearchResponseQuoteListInner.quoteStatus) &&
        Objects.equals(this.createdDate, quoteListResponseQuoteSearchResponseQuoteListInner.createdDate) &&
        Objects.equals(this.lastModifiedDate, quoteListResponseQuoteSearchResponseQuoteListInner.lastModifiedDate) &&
        Objects.equals(this.quoteExpiryDate, quoteListResponseQuoteSearchResponseQuoteListInner.quoteExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteName, quoteNumber, revisionNumber, endUserName, bidNumber, totalAmount, quoteStatus, createdDate, lastModifiedDate, quoteExpiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteListResponseQuoteSearchResponseQuoteListInner {\n");
    sb.append("    quoteName: ").append(toIndentedString(quoteName)).append("\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
    sb.append("    endUserName: ").append(toIndentedString(endUserName)).append("\n");
    sb.append("    bidNumber: ").append(toIndentedString(bidNumber)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    quoteStatus: ").append(toIndentedString(quoteStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    quoteExpiryDate: ").append(toIndentedString(quoteExpiryDate)).append("\n");
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
    openapiFields.add("quoteName");
    openapiFields.add("quoteNumber");
    openapiFields.add("revisionNumber");
    openapiFields.add("endUserName");
    openapiFields.add("bidNumber");
    openapiFields.add("totalAmount");
    openapiFields.add("quoteStatus");
    openapiFields.add("createdDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("quoteExpiryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteListResponseQuoteSearchResponseQuoteListInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteListResponseQuoteSearchResponseQuoteListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteListResponseQuoteSearchResponseQuoteListInner is not found in the empty JSON string", QuoteListResponseQuoteSearchResponseQuoteListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteListResponseQuoteSearchResponseQuoteListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteListResponseQuoteSearchResponseQuoteListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteName") != null && !jsonObj.get("quoteName").isJsonNull()) && !jsonObj.get("quoteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteName").toString()));
      }
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("endUserName") != null && !jsonObj.get("endUserName").isJsonNull()) && !jsonObj.get("endUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserName").toString()));
      }
      if ((jsonObj.get("bidNumber") != null && !jsonObj.get("bidNumber").isJsonNull()) && !jsonObj.get("bidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bidNumber").toString()));
      }
      if ((jsonObj.get("totalAmount") != null && !jsonObj.get("totalAmount").isJsonNull()) && !jsonObj.get("totalAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalAmount").toString()));
      }
      if ((jsonObj.get("quoteStatus") != null && !jsonObj.get("quoteStatus").isJsonNull()) && !jsonObj.get("quoteStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteListResponseQuoteSearchResponseQuoteListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteListResponseQuoteSearchResponseQuoteListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteListResponseQuoteSearchResponseQuoteListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteListResponseQuoteSearchResponseQuoteListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteListResponseQuoteSearchResponseQuoteListInner>() {
           @Override
           public void write(JsonWriter out, QuoteListResponseQuoteSearchResponseQuoteListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteListResponseQuoteSearchResponseQuoteListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteListResponseQuoteSearchResponseQuoteListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteListResponseQuoteSearchResponseQuoteListInner
  * @throws IOException if the JSON string is invalid with respect to QuoteListResponseQuoteSearchResponseQuoteListInner
  */
  public static QuoteListResponseQuoteSearchResponseQuoteListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteListResponseQuoteSearchResponseQuoteListInner.class);
  }

 /**
  * Convert an instance of QuoteListResponseQuoteSearchResponseQuoteListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
