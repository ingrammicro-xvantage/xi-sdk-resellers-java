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
import xiresellers.client.model.OrderCreateRequestLinesInnerAdditionalAttributesInner;
import xiresellers.client.model.OrderCreateRequestLinesInnerEndUserInfoInner;
import xiresellers.client.model.OrderCreateRequestLinesInnerWarrantyInfoInner;

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
 * OrderCreateRequestLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T10:35:17.995191Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderCreateRequestLinesInner {
  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_END_USER_PRICE = "endUserPrice";
  @SerializedName(SERIALIZED_NAME_END_USER_PRICE)
  private BigDecimal endUserPrice;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderCreateRequestLinesInnerAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARRANTY_INFO = "warrantyInfo";
  @SerializedName(SERIALIZED_NAME_WARRANTY_INFO)
  private List<OrderCreateRequestLinesInnerWarrantyInfoInner> warrantyInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private List<OrderCreateRequestLinesInnerEndUserInfoInner> endUserInfo = new ArrayList<>();

  public OrderCreateRequestLinesInner() {
  }

  public OrderCreateRequestLinesInner customerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

   /**
   * The reseller&#39;s line item number for reference in their system. The customer line number needs to be a unique numeric value between 1 and 884. In the event we receive duplicate values or alphanumeric values in the customer line number, we will re-sequence the customer line number. To prevent re-sequencing, please use a unique numeric value between 1 and 884 in the customer line number.
   * @return customerLineNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public OrderCreateRequestLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * The unique IngramMicro part number.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderCreateRequestLinesInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The requested quantity of the line item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderCreateRequestLinesInner specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * The line-level bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number in the case of split orders or where different line items have different bid numbers. Line-level bid number take precedence over header-level bid numbers.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderCreateRequestLinesInner notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Line-level notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderCreateRequestLinesInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The reseller-requested unit price for the line item. The unit price is not guaranteed.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderCreateRequestLinesInner endUserPrice(BigDecimal endUserPrice) {
    this.endUserPrice = endUserPrice;
    return this;
  }

   /**
   * The end user price.
   * @return endUserPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getEndUserPrice() {
    return endUserPrice;
  }

  public void setEndUserPrice(BigDecimal endUserPrice) {
    this.endUserPrice = endUserPrice;
  }


  public OrderCreateRequestLinesInner additionalAttributes(List<OrderCreateRequestLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderCreateRequestLinesInner addAdditionalAttributesItem(OrderCreateRequestLinesInnerAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Get additionalAttributes
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<OrderCreateRequestLinesInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderCreateRequestLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public OrderCreateRequestLinesInner warrantyInfo(List<OrderCreateRequestLinesInnerWarrantyInfoInner> warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
    return this;
  }

  public OrderCreateRequestLinesInner addWarrantyInfoItem(OrderCreateRequestLinesInnerWarrantyInfoInner warrantyInfoItem) {
    if (this.warrantyInfo == null) {
      this.warrantyInfo = new ArrayList<>();
    }
    this.warrantyInfo.add(warrantyInfoItem);
    return this;
  }

   /**
   * Warranty details for the line. This is required in case of warranty orders.
   * @return warrantyInfo
  **/
  @javax.annotation.Nullable
  public List<OrderCreateRequestLinesInnerWarrantyInfoInner> getWarrantyInfo() {
    return warrantyInfo;
  }

  public void setWarrantyInfo(List<OrderCreateRequestLinesInnerWarrantyInfoInner> warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
  }


  public OrderCreateRequestLinesInner endUserInfo(List<OrderCreateRequestLinesInnerEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  public OrderCreateRequestLinesInner addEndUserInfoItem(OrderCreateRequestLinesInnerEndUserInfoInner endUserInfoItem) {
    if (this.endUserInfo == null) {
      this.endUserInfo = new ArrayList<>();
    }
    this.endUserInfo.add(endUserInfoItem);
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public List<OrderCreateRequestLinesInnerEndUserInfoInner> getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(List<OrderCreateRequestLinesInnerEndUserInfoInner> endUserInfo) {
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
    OrderCreateRequestLinesInner orderCreateRequestLinesInner = (OrderCreateRequestLinesInner) o;
    return Objects.equals(this.customerLineNumber, orderCreateRequestLinesInner.customerLineNumber) &&
        Objects.equals(this.ingramPartNumber, orderCreateRequestLinesInner.ingramPartNumber) &&
        Objects.equals(this.quantity, orderCreateRequestLinesInner.quantity) &&
        Objects.equals(this.specialBidNumber, orderCreateRequestLinesInner.specialBidNumber) &&
        Objects.equals(this.notes, orderCreateRequestLinesInner.notes) &&
        Objects.equals(this.unitPrice, orderCreateRequestLinesInner.unitPrice) &&
        Objects.equals(this.endUserPrice, orderCreateRequestLinesInner.endUserPrice) &&
        Objects.equals(this.additionalAttributes, orderCreateRequestLinesInner.additionalAttributes) &&
        Objects.equals(this.warrantyInfo, orderCreateRequestLinesInner.warrantyInfo) &&
        Objects.equals(this.endUserInfo, orderCreateRequestLinesInner.endUserInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLineNumber, ingramPartNumber, quantity, specialBidNumber, notes, unitPrice, endUserPrice, additionalAttributes, warrantyInfo, endUserInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequestLinesInner {\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    endUserPrice: ").append(toIndentedString(endUserPrice)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    warrantyInfo: ").append(toIndentedString(warrantyInfo)).append("\n");
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
    openapiFields.add("specialBidNumber");
    openapiFields.add("notes");
    openapiFields.add("unitPrice");
    openapiFields.add("endUserPrice");
    openapiFields.add("additionalAttributes");
    openapiFields.add("warrantyInfo");
    openapiFields.add("endUserInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequestLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequestLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequestLinesInner is not found in the empty JSON string", OrderCreateRequestLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequestLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequestLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerLineNumber") != null && !jsonObj.get("customerLineNumber").isJsonNull()) && !jsonObj.get("customerLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLineNumber").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            OrderCreateRequestLinesInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("warrantyInfo") != null && !jsonObj.get("warrantyInfo").isJsonNull()) {
        JsonArray jsonArraywarrantyInfo = jsonObj.getAsJsonArray("warrantyInfo");
        if (jsonArraywarrantyInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warrantyInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warrantyInfo` to be an array in the JSON string but got `%s`", jsonObj.get("warrantyInfo").toString()));
          }

          // validate the optional field `warrantyInfo` (array)
          for (int i = 0; i < jsonArraywarrantyInfo.size(); i++) {
            OrderCreateRequestLinesInnerWarrantyInfoInner.validateJsonElement(jsonArraywarrantyInfo.get(i));
          };
        }
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
            OrderCreateRequestLinesInnerEndUserInfoInner.validateJsonElement(jsonArrayendUserInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequestLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequestLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequestLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequestLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequestLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequestLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequestLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateRequestLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateRequestLinesInner
  * @throws IOException if the JSON string is invalid with respect to OrderCreateRequestLinesInner
  */
  public static OrderCreateRequestLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequestLinesInner.class);
  }

 /**
  * Convert an instance of OrderCreateRequestLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

