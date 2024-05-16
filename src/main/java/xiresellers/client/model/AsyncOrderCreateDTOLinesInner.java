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
import xiresellers.client.model.AsyncOrderCreateDTOLinesInnerEndUserInfoInner;

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
 * AsyncOrderCreateDTOLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T06:51:51.114588Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class AsyncOrderCreateDTOLinesInner {
  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private String unitPrice;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_END_USER_PRICE = "endUserPrice";
  @SerializedName(SERIALIZED_NAME_END_USER_PRICE)
  private String endUserPrice;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private List<AsyncOrderCreateDTOLinesInnerEndUserInfoInner> endUserInfo = new ArrayList<>();

  public AsyncOrderCreateDTOLinesInner() {
  }

  public AsyncOrderCreateDTOLinesInner customerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

   /**
   * The reseller&#39;s line item number for reference in their system.
   * @return customerLineNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public AsyncOrderCreateDTOLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * Unique IngramMicro part number.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public AsyncOrderCreateDTOLinesInner quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the line item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public AsyncOrderCreateDTOLinesInner unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Unit Price of Item
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  public AsyncOrderCreateDTOLinesInner specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * Get specialBidNumber
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public AsyncOrderCreateDTOLinesInner endUserPrice(String endUserPrice) {
    this.endUserPrice = endUserPrice;
    return this;
  }

   /**
   * Get endUserPrice
   * @return endUserPrice
  **/
  @javax.annotation.Nullable
  public String getEndUserPrice() {
    return endUserPrice;
  }

  public void setEndUserPrice(String endUserPrice) {
    this.endUserPrice = endUserPrice;
  }


  public AsyncOrderCreateDTOLinesInner notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public AsyncOrderCreateDTOLinesInner endUserInfo(List<AsyncOrderCreateDTOLinesInnerEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  public AsyncOrderCreateDTOLinesInner addEndUserInfoItem(AsyncOrderCreateDTOLinesInnerEndUserInfoInner endUserInfoItem) {
    if (this.endUserInfo == null) {
      this.endUserInfo = new ArrayList<>();
    }
    this.endUserInfo.add(endUserInfoItem);
    return this;
  }

   /**
   * The contact information for the end user/customer provided by the reseller. Used to determine pricing and discounts.
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public List<AsyncOrderCreateDTOLinesInnerEndUserInfoInner> getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(List<AsyncOrderCreateDTOLinesInnerEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncOrderCreateDTOLinesInner asyncOrderCreateDTOLinesInner = (AsyncOrderCreateDTOLinesInner) o;
    return Objects.equals(this.customerLineNumber, asyncOrderCreateDTOLinesInner.customerLineNumber) &&
        Objects.equals(this.ingramPartNumber, asyncOrderCreateDTOLinesInner.ingramPartNumber) &&
        Objects.equals(this.quantity, asyncOrderCreateDTOLinesInner.quantity) &&
        Objects.equals(this.unitPrice, asyncOrderCreateDTOLinesInner.unitPrice) &&
        Objects.equals(this.specialBidNumber, asyncOrderCreateDTOLinesInner.specialBidNumber) &&
        Objects.equals(this.endUserPrice, asyncOrderCreateDTOLinesInner.endUserPrice) &&
        Objects.equals(this.notes, asyncOrderCreateDTOLinesInner.notes) &&
        Objects.equals(this.endUserInfo, asyncOrderCreateDTOLinesInner.endUserInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLineNumber, ingramPartNumber, quantity, unitPrice, specialBidNumber, endUserPrice, notes, endUserInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncOrderCreateDTOLinesInner {\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    endUserPrice: ").append(toIndentedString(endUserPrice)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
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
    openapiFields.add("customerLineNumber");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("quantity");
    openapiFields.add("unitPrice");
    openapiFields.add("specialBidNumber");
    openapiFields.add("endUserPrice");
    openapiFields.add("notes");
    openapiFields.add("endUserInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AsyncOrderCreateDTOLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsyncOrderCreateDTOLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncOrderCreateDTOLinesInner is not found in the empty JSON string", AsyncOrderCreateDTOLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsyncOrderCreateDTOLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsyncOrderCreateDTOLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerLineNumber") != null && !jsonObj.get("customerLineNumber").isJsonNull()) && !jsonObj.get("customerLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLineNumber").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull()) && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if ((jsonObj.get("unitPrice") != null && !jsonObj.get("unitPrice").isJsonNull()) && !jsonObj.get("unitPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitPrice").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("endUserPrice") != null && !jsonObj.get("endUserPrice").isJsonNull()) && !jsonObj.get("endUserPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserPrice").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        JsonArray jsonArrayendUserInfo = jsonObj.getAsJsonArray("endUserInfo");
        if (jsonArrayendUserInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endUserInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endUserInfo` to be an array in the JSON string but got `%s`", jsonObj.get("endUserInfo").toString()));
          }

          // validate the optional field `endUserInfo` (array)
          for (int i = 0; i < jsonArrayendUserInfo.size(); i++) {
            AsyncOrderCreateDTOLinesInnerEndUserInfoInner.validateJsonElement(jsonArrayendUserInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncOrderCreateDTOLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncOrderCreateDTOLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncOrderCreateDTOLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncOrderCreateDTOLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncOrderCreateDTOLinesInner>() {
           @Override
           public void write(JsonWriter out, AsyncOrderCreateDTOLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncOrderCreateDTOLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncOrderCreateDTOLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncOrderCreateDTOLinesInner
  * @throws IOException if the JSON string is invalid with respect to AsyncOrderCreateDTOLinesInner
  */
  public static AsyncOrderCreateDTOLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncOrderCreateDTOLinesInner.class);
  }

 /**
  * Convert an instance of AsyncOrderCreateDTOLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

