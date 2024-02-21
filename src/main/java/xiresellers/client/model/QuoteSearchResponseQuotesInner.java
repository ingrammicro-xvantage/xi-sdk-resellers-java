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
import java.math.BigDecimal;
import java.util.Arrays;
import xiresellers.client.model.QuoteSearchResponseQuotesInnerLinks;

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
 * QuoteSearchResponseQuotesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T11:34:45.471304Z[Etc/UTC]")
public class QuoteSearchResponseQuotesInner {
  public static final String SERIALIZED_NAME_QUOTE_GUID = "quoteGuid";
  @SerializedName(SERIALIZED_NAME_QUOTE_GUID)
  private String quoteGuid;

  public static final String SERIALIZED_NAME_QUOTE_NAME = "quoteName";
  @SerializedName(SERIALIZED_NAME_QUOTE_NAME)
  private String quoteName;

  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_END_USER_CONTACT = "endUserContact";
  @SerializedName(SERIALIZED_NAME_END_USER_CONTACT)
  private String endUserContact;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_QUOTE_TOTAL = "quoteTotal";
  @SerializedName(SERIALIZED_NAME_QUOTE_TOTAL)
  private BigDecimal quoteTotal;

  public static final String SERIALIZED_NAME_QUOTE_STATUS = "quoteStatus";
  @SerializedName(SERIALIZED_NAME_QUOTE_STATUS)
  private String quoteStatus;

  public static final String SERIALIZED_NAME_INGRAM_QUOTE_DATE = "ingramQuoteDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_QUOTE_DATE)
  private String ingramQuoteDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_INGRAM_QUOTE_EXPIRY_DATE = "ingramQuoteExpiryDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_QUOTE_EXPIRY_DATE)
  private String ingramQuoteExpiryDate;

  public static final String SERIALIZED_NAME_END_USER_NAME = "endUserName";
  @SerializedName(SERIALIZED_NAME_END_USER_NAME)
  private String endUserName;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_QUOTE_TYPE = "quoteType";
  @SerializedName(SERIALIZED_NAME_QUOTE_TYPE)
  private String quoteType;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private QuoteSearchResponseQuotesInnerLinks links;

  public QuoteSearchResponseQuotesInner() {
  }

  public QuoteSearchResponseQuotesInner quoteGuid(String quoteGuid) {
    this.quoteGuid = quoteGuid;
    return this;
  }

   /**
   * Get quoteGuid
   * @return quoteGuid
  **/
  @javax.annotation.Nullable
  public String getQuoteGuid() {
    return quoteGuid;
  }

  public void setQuoteGuid(String quoteGuid) {
    this.quoteGuid = quoteGuid;
  }


  public QuoteSearchResponseQuotesInner quoteName(String quoteName) {
    this.quoteName = quoteName;
    return this;
  }

   /**
   * Quote Name given to quote by sales team or system generated.  Generally used as a reference to identify the quote.
   * @return quoteName
  **/
  @javax.annotation.Nullable
  public String getQuoteName() {
    return quoteName;
  }

  public void setQuoteName(String quoteName) {
    this.quoteName = quoteName;
  }


  public QuoteSearchResponseQuotesInner quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

   /**
   * Unique identifier generated by Ingram Micros CRM specific to each quote.  When applying a filter to the quoteNumber and including a partial quote number in the filter, all quotes containing any information included in the filter can be retrieved as a subset of all available customer quotes.
   * @return quoteNumber
  **/
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public QuoteSearchResponseQuotesInner revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * When a quote has been revised and updated, the quote number remains the same throughout the lifecycle of the quote, however, a Revision number is updated for each revision of the quote.  The revision numbers is associated with the Unique Quote Number.
   * @return revision
  **/
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }


  public QuoteSearchResponseQuotesInner endUserContact(String endUserContact) {
    this.endUserContact = endUserContact;
    return this;
  }

   /**
   * End User Name is the end customer name that is associated with a quote in Ingram Micros CRM.
   * @return endUserContact
  **/
  @javax.annotation.Nullable
  public String getEndUserContact() {
    return endUserContact;
  }

  public void setEndUserContact(String endUserContact) {
    this.endUserContact = endUserContact;
  }


  public QuoteSearchResponseQuotesInner specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * Special Pricing Bid Number, also refers to as Dart Number relates to a unique pricing deal associated with a vendor for the quote.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public QuoteSearchResponseQuotesInner quoteTotal(BigDecimal quoteTotal) {
    this.quoteTotal = quoteTotal;
    return this;
  }

   /**
   * Total amount of quoted price for all products in the quote.
   * @return quoteTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getQuoteTotal() {
    return quoteTotal;
  }

  public void setQuoteTotal(BigDecimal quoteTotal) {
    this.quoteTotal = quoteTotal;
  }


  public QuoteSearchResponseQuotesInner quoteStatus(String quoteStatus) {
    this.quoteStatus = quoteStatus;
    return this;
  }

   /**
   * This refers to the primary status of the quote.
   * @return quoteStatus
  **/
  @javax.annotation.Nullable
  public String getQuoteStatus() {
    return quoteStatus;
  }

  public void setQuoteStatus(String quoteStatus) {
    this.quoteStatus = quoteStatus;
  }


  public QuoteSearchResponseQuotesInner ingramQuoteDate(String ingramQuoteDate) {
    this.ingramQuoteDate = ingramQuoteDate;
    return this;
  }

   /**
   * Date the Quote was initially Created.
   * @return ingramQuoteDate
  **/
  @javax.annotation.Nullable
  public String getIngramQuoteDate() {
    return ingramQuoteDate;
  }

  public void setIngramQuoteDate(String ingramQuoteDate) {
    this.ingramQuoteDate = ingramQuoteDate;
  }


  public QuoteSearchResponseQuotesInner lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Date the Quote was last updated or modified.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public QuoteSearchResponseQuotesInner ingramQuoteExpiryDate(String ingramQuoteExpiryDate) {
    this.ingramQuoteExpiryDate = ingramQuoteExpiryDate;
    return this;
  }

   /**
   * Date when the Quote Expires.
   * @return ingramQuoteExpiryDate
  **/
  @javax.annotation.Nullable
  public String getIngramQuoteExpiryDate() {
    return ingramQuoteExpiryDate;
  }

  public void setIngramQuoteExpiryDate(String ingramQuoteExpiryDate) {
    this.ingramQuoteExpiryDate = ingramQuoteExpiryDate;
  }


  public QuoteSearchResponseQuotesInner endUserName(String endUserName) {
    this.endUserName = endUserName;
    return this;
  }

   /**
   * End User Name
   * @return endUserName
  **/
  @javax.annotation.Nullable
  public String getEndUserName() {
    return endUserName;
  }

  public void setEndUserName(String endUserName) {
    this.endUserName = endUserName;
  }


  public QuoteSearchResponseQuotesInner vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Name of the vendor.
   * @return vendor
  **/
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public QuoteSearchResponseQuotesInner createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Name of the end user/customer who created a quote.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public QuoteSearchResponseQuotesInner quoteType(String quoteType) {
    this.quoteType = quoteType;
    return this;
  }

   /**
   * Type of quote
   * @return quoteType
  **/
  @javax.annotation.Nullable
  public String getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(String quoteType) {
    this.quoteType = quoteType;
  }


  public QuoteSearchResponseQuotesInner links(QuoteSearchResponseQuotesInnerLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public QuoteSearchResponseQuotesInnerLinks getLinks() {
    return links;
  }

  public void setLinks(QuoteSearchResponseQuotesInnerLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSearchResponseQuotesInner quoteSearchResponseQuotesInner = (QuoteSearchResponseQuotesInner) o;
    return Objects.equals(this.quoteGuid, quoteSearchResponseQuotesInner.quoteGuid) &&
        Objects.equals(this.quoteName, quoteSearchResponseQuotesInner.quoteName) &&
        Objects.equals(this.quoteNumber, quoteSearchResponseQuotesInner.quoteNumber) &&
        Objects.equals(this.revision, quoteSearchResponseQuotesInner.revision) &&
        Objects.equals(this.endUserContact, quoteSearchResponseQuotesInner.endUserContact) &&
        Objects.equals(this.specialBidNumber, quoteSearchResponseQuotesInner.specialBidNumber) &&
        Objects.equals(this.quoteTotal, quoteSearchResponseQuotesInner.quoteTotal) &&
        Objects.equals(this.quoteStatus, quoteSearchResponseQuotesInner.quoteStatus) &&
        Objects.equals(this.ingramQuoteDate, quoteSearchResponseQuotesInner.ingramQuoteDate) &&
        Objects.equals(this.lastModifiedDate, quoteSearchResponseQuotesInner.lastModifiedDate) &&
        Objects.equals(this.ingramQuoteExpiryDate, quoteSearchResponseQuotesInner.ingramQuoteExpiryDate) &&
        Objects.equals(this.endUserName, quoteSearchResponseQuotesInner.endUserName) &&
        Objects.equals(this.vendor, quoteSearchResponseQuotesInner.vendor) &&
        Objects.equals(this.createdBy, quoteSearchResponseQuotesInner.createdBy) &&
        Objects.equals(this.quoteType, quoteSearchResponseQuotesInner.quoteType) &&
        Objects.equals(this.links, quoteSearchResponseQuotesInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteGuid, quoteName, quoteNumber, revision, endUserContact, specialBidNumber, quoteTotal, quoteStatus, ingramQuoteDate, lastModifiedDate, ingramQuoteExpiryDate, endUserName, vendor, createdBy, quoteType, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSearchResponseQuotesInner {\n");
    sb.append("    quoteGuid: ").append(toIndentedString(quoteGuid)).append("\n");
    sb.append("    quoteName: ").append(toIndentedString(quoteName)).append("\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    endUserContact: ").append(toIndentedString(endUserContact)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    quoteTotal: ").append(toIndentedString(quoteTotal)).append("\n");
    sb.append("    quoteStatus: ").append(toIndentedString(quoteStatus)).append("\n");
    sb.append("    ingramQuoteDate: ").append(toIndentedString(ingramQuoteDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    ingramQuoteExpiryDate: ").append(toIndentedString(ingramQuoteExpiryDate)).append("\n");
    sb.append("    endUserName: ").append(toIndentedString(endUserName)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("quoteGuid");
    openapiFields.add("quoteName");
    openapiFields.add("quoteNumber");
    openapiFields.add("revision");
    openapiFields.add("endUserContact");
    openapiFields.add("specialBidNumber");
    openapiFields.add("quoteTotal");
    openapiFields.add("quoteStatus");
    openapiFields.add("ingramQuoteDate");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("ingramQuoteExpiryDate");
    openapiFields.add("endUserName");
    openapiFields.add("vendor");
    openapiFields.add("createdBy");
    openapiFields.add("quoteType");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteSearchResponseQuotesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteSearchResponseQuotesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteSearchResponseQuotesInner is not found in the empty JSON string", QuoteSearchResponseQuotesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteSearchResponseQuotesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteSearchResponseQuotesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteGuid") != null && !jsonObj.get("quoteGuid").isJsonNull()) && !jsonObj.get("quoteGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteGuid").toString()));
      }
      if ((jsonObj.get("quoteName") != null && !jsonObj.get("quoteName").isJsonNull()) && !jsonObj.get("quoteName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteName").toString()));
      }
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
      if ((jsonObj.get("endUserContact") != null && !jsonObj.get("endUserContact").isJsonNull()) && !jsonObj.get("endUserContact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserContact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserContact").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("quoteStatus") != null && !jsonObj.get("quoteStatus").isJsonNull()) && !jsonObj.get("quoteStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteStatus").toString()));
      }
      if ((jsonObj.get("ingramQuoteDate") != null && !jsonObj.get("ingramQuoteDate").isJsonNull()) && !jsonObj.get("ingramQuoteDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramQuoteDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramQuoteDate").toString()));
      }
      if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull()) && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedDate").toString()));
      }
      if ((jsonObj.get("ingramQuoteExpiryDate") != null && !jsonObj.get("ingramQuoteExpiryDate").isJsonNull()) && !jsonObj.get("ingramQuoteExpiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramQuoteExpiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramQuoteExpiryDate").toString()));
      }
      if ((jsonObj.get("endUserName") != null && !jsonObj.get("endUserName").isJsonNull()) && !jsonObj.get("endUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserName").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("quoteType") != null && !jsonObj.get("quoteType").isJsonNull()) && !jsonObj.get("quoteType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteType").toString()));
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        QuoteSearchResponseQuotesInnerLinks.validateJsonElement(jsonObj.get("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteSearchResponseQuotesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteSearchResponseQuotesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteSearchResponseQuotesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteSearchResponseQuotesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteSearchResponseQuotesInner>() {
           @Override
           public void write(JsonWriter out, QuoteSearchResponseQuotesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteSearchResponseQuotesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteSearchResponseQuotesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteSearchResponseQuotesInner
  * @throws IOException if the JSON string is invalid with respect to QuoteSearchResponseQuotesInner
  */
  public static QuoteSearchResponseQuotesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteSearchResponseQuotesInner.class);
  }

 /**
  * Convert an instance of QuoteSearchResponseQuotesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

