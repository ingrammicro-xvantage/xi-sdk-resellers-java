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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.QuoteToOrderDetailsDTOAdditionalAttributesInner;
import xiresellers.client.model.QuoteToOrderDetailsDTOEndUserInfoInner;
import xiresellers.client.model.QuoteToOrderDetailsDTOLinesInner;
import xiresellers.client.model.QuoteToOrderDetailsDTOShipToInfoInner;
import xiresellers.client.model.QuoteToOrderDetailsDTOVmfadditionalAttributesInner;

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
 * QuoteToOrderDetailsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T12:20:55.562369Z[Etc/UTC]")
public class QuoteToOrderDetailsDTO {
  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_ENDUSER_ORDER_NUMBER = "enduserOrderNumber";
  @SerializedName(SERIALIZED_NAME_ENDUSER_ORDER_NUMBER)
  private String enduserOrderNumber;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private List<QuoteToOrderDetailsDTOEndUserInfoInner> endUserInfo;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private List<QuoteToOrderDetailsDTOShipToInfoInner> shipToInfo;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<QuoteToOrderDetailsDTOAdditionalAttributesInner> additionalAttributes;

  public static final String SERIALIZED_NAME_VMFADDITIONAL_ATTRIBUTES = "vmfadditionalAttributes";
  @SerializedName(SERIALIZED_NAME_VMFADDITIONAL_ATTRIBUTES)
  private List<QuoteToOrderDetailsDTOVmfadditionalAttributesInner> vmfadditionalAttributes;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<QuoteToOrderDetailsDTOLinesInner> lines;

  public QuoteToOrderDetailsDTO() {
  }

  public QuoteToOrderDetailsDTO quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

   /**
   * A unique identifier generated by Ingram Micro&#39;s CRM specific to each quote.
   * @return quoteNumber
  **/
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public QuoteToOrderDetailsDTO customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public QuoteToOrderDetailsDTO enduserOrderNumber(String enduserOrderNumber) {
    this.enduserOrderNumber = enduserOrderNumber;
    return this;
  }

   /**
   * The end customer&#39;s order number for reference in their system.
   * @return enduserOrderNumber
  **/
  @javax.annotation.Nullable
  public String getEnduserOrderNumber() {
    return enduserOrderNumber;
  }

  public void setEnduserOrderNumber(String enduserOrderNumber) {
    this.enduserOrderNumber = enduserOrderNumber;
  }


  public QuoteToOrderDetailsDTO billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

   /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit.
   * @return billToAddressId
  **/
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public QuoteToOrderDetailsDTO endUserInfo(List<QuoteToOrderDetailsDTOEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  public QuoteToOrderDetailsDTO addEndUserInfoItem(QuoteToOrderDetailsDTOEndUserInfoInner endUserInfoItem) {
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
  public List<QuoteToOrderDetailsDTOEndUserInfoInner> getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(List<QuoteToOrderDetailsDTOEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public QuoteToOrderDetailsDTO shipToInfo(List<QuoteToOrderDetailsDTOShipToInfoInner> shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

  public QuoteToOrderDetailsDTO addShipToInfoItem(QuoteToOrderDetailsDTOShipToInfoInner shipToInfoItem) {
    if (this.shipToInfo == null) {
      this.shipToInfo = new ArrayList<>();
    }
    this.shipToInfo.add(shipToInfoItem);
    return this;
  }

   /**
   * The shipping information provided by the reseller for order delivery.
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public List<QuoteToOrderDetailsDTOShipToInfoInner> getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(List<QuoteToOrderDetailsDTOShipToInfoInner> shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public QuoteToOrderDetailsDTO additionalAttributes(List<QuoteToOrderDetailsDTOAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public QuoteToOrderDetailsDTO addAdditionalAttributesItem(QuoteToOrderDetailsDTOAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Additional order create attributes.
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<QuoteToOrderDetailsDTOAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<QuoteToOrderDetailsDTOAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public QuoteToOrderDetailsDTO vmfadditionalAttributes(List<QuoteToOrderDetailsDTOVmfadditionalAttributesInner> vmfadditionalAttributes) {
    this.vmfadditionalAttributes = vmfadditionalAttributes;
    return this;
  }

  public QuoteToOrderDetailsDTO addVmfadditionalAttributesItem(QuoteToOrderDetailsDTOVmfadditionalAttributesInner vmfadditionalAttributesItem) {
    if (this.vmfadditionalAttributes == null) {
      this.vmfadditionalAttributes = new ArrayList<>();
    }
    this.vmfadditionalAttributes.add(vmfadditionalAttributesItem);
    return this;
  }

   /**
   * The object containing the list of fields required at a header level by the vendor.
   * @return vmfadditionalAttributes
  **/
  @javax.annotation.Nullable
  public List<QuoteToOrderDetailsDTOVmfadditionalAttributesInner> getVmfadditionalAttributes() {
    return vmfadditionalAttributes;
  }

  public void setVmfadditionalAttributes(List<QuoteToOrderDetailsDTOVmfadditionalAttributesInner> vmfadditionalAttributes) {
    this.vmfadditionalAttributes = vmfadditionalAttributes;
  }


  public QuoteToOrderDetailsDTO lines(List<QuoteToOrderDetailsDTOLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public QuoteToOrderDetailsDTO addLinesItem(QuoteToOrderDetailsDTOLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * The object containing the lines that require vendor mandatory fields.
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<QuoteToOrderDetailsDTOLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<QuoteToOrderDetailsDTOLinesInner> lines) {
    this.lines = lines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteToOrderDetailsDTO quoteToOrderDetailsDTO = (QuoteToOrderDetailsDTO) o;
    return Objects.equals(this.quoteNumber, quoteToOrderDetailsDTO.quoteNumber) &&
        Objects.equals(this.customerOrderNumber, quoteToOrderDetailsDTO.customerOrderNumber) &&
        Objects.equals(this.enduserOrderNumber, quoteToOrderDetailsDTO.enduserOrderNumber) &&
        Objects.equals(this.billToAddressId, quoteToOrderDetailsDTO.billToAddressId) &&
        Objects.equals(this.endUserInfo, quoteToOrderDetailsDTO.endUserInfo) &&
        Objects.equals(this.shipToInfo, quoteToOrderDetailsDTO.shipToInfo) &&
        Objects.equals(this.additionalAttributes, quoteToOrderDetailsDTO.additionalAttributes) &&
        Objects.equals(this.vmfadditionalAttributes, quoteToOrderDetailsDTO.vmfadditionalAttributes) &&
        Objects.equals(this.lines, quoteToOrderDetailsDTO.lines);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, customerOrderNumber, enduserOrderNumber, billToAddressId, endUserInfo, shipToInfo, additionalAttributes, vmfadditionalAttributes, lines);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteToOrderDetailsDTO {\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    enduserOrderNumber: ").append(toIndentedString(enduserOrderNumber)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    vmfadditionalAttributes: ").append(toIndentedString(vmfadditionalAttributes)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
    openapiFields.add("quoteNumber");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("enduserOrderNumber");
    openapiFields.add("billToAddressId");
    openapiFields.add("endUserInfo");
    openapiFields.add("shipToInfo");
    openapiFields.add("additionalAttributes");
    openapiFields.add("vmfadditionalAttributes");
    openapiFields.add("lines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteToOrderDetailsDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteToOrderDetailsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteToOrderDetailsDTO is not found in the empty JSON string", QuoteToOrderDetailsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteToOrderDetailsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteToOrderDetailsDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("enduserOrderNumber") != null && !jsonObj.get("enduserOrderNumber").isJsonNull()) && !jsonObj.get("enduserOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enduserOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enduserOrderNumber").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
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
            QuoteToOrderDetailsDTOEndUserInfoInner.validateJsonElement(jsonArrayendUserInfo.get(i));
          };
        }
      }
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        JsonArray jsonArrayshipToInfo = jsonObj.getAsJsonArray("shipToInfo");
        if (jsonArrayshipToInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipToInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipToInfo` to be an array in the JSON string but got `%s`", jsonObj.get("shipToInfo").toString()));
          }

          // validate the optional field `shipToInfo` (array)
          for (int i = 0; i < jsonArrayshipToInfo.size(); i++) {
            QuoteToOrderDetailsDTOShipToInfoInner.validateJsonElement(jsonArrayshipToInfo.get(i));
          };
        }
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
            QuoteToOrderDetailsDTOAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("vmfadditionalAttributes") != null && !jsonObj.get("vmfadditionalAttributes").isJsonNull()) {
        JsonArray jsonArrayvmfadditionalAttributes = jsonObj.getAsJsonArray("vmfadditionalAttributes");
        if (jsonArrayvmfadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vmfadditionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vmfadditionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("vmfadditionalAttributes").toString()));
          }

          // validate the optional field `vmfadditionalAttributes` (array)
          for (int i = 0; i < jsonArrayvmfadditionalAttributes.size(); i++) {
            QuoteToOrderDetailsDTOVmfadditionalAttributesInner.validateJsonElement(jsonArrayvmfadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            QuoteToOrderDetailsDTOLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteToOrderDetailsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteToOrderDetailsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteToOrderDetailsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteToOrderDetailsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteToOrderDetailsDTO>() {
           @Override
           public void write(JsonWriter out, QuoteToOrderDetailsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteToOrderDetailsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteToOrderDetailsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteToOrderDetailsDTO
  * @throws IOException if the JSON string is invalid with respect to QuoteToOrderDetailsDTO
  */
  public static QuoteToOrderDetailsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteToOrderDetailsDTO.class);
  }

 /**
  * Convert an instance of QuoteToOrderDetailsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

