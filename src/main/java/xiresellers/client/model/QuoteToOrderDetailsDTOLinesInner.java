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
import xiresellers.client.model.QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner;

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
 * QuoteToOrderDetailsDTOLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T08:56:25.348026Z[Etc/UTC]")
public class QuoteToOrderDetailsDTOLinesInner {
  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES_LINES = "vmfAdditionalAttributesLines";
  @SerializedName(SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES_LINES)
  private List<QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner> vmfAdditionalAttributesLines;

  public QuoteToOrderDetailsDTOLinesInner() {
  }

  public QuoteToOrderDetailsDTOLinesInner customerLineNumber(String customerLineNumber) {
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


  public QuoteToOrderDetailsDTOLinesInner ingramPartNumber(String ingramPartNumber) {
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


  public QuoteToOrderDetailsDTOLinesInner quantity(String quantity) {
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


  public QuoteToOrderDetailsDTOLinesInner vmfAdditionalAttributesLines(List<QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner> vmfAdditionalAttributesLines) {
    this.vmfAdditionalAttributesLines = vmfAdditionalAttributesLines;
    return this;
  }

  public QuoteToOrderDetailsDTOLinesInner addVmfAdditionalAttributesLinesItem(QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner vmfAdditionalAttributesLinesItem) {
    if (this.vmfAdditionalAttributesLines == null) {
      this.vmfAdditionalAttributesLines = new ArrayList<>();
    }
    this.vmfAdditionalAttributesLines.add(vmfAdditionalAttributesLinesItem);
    return this;
  }

   /**
   * The object containing the list of fields required at a line level by the vendor.
   * @return vmfAdditionalAttributesLines
  **/
  @javax.annotation.Nullable
  public List<QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner> getVmfAdditionalAttributesLines() {
    return vmfAdditionalAttributesLines;
  }

  public void setVmfAdditionalAttributesLines(List<QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner> vmfAdditionalAttributesLines) {
    this.vmfAdditionalAttributesLines = vmfAdditionalAttributesLines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteToOrderDetailsDTOLinesInner quoteToOrderDetailsDTOLinesInner = (QuoteToOrderDetailsDTOLinesInner) o;
    return Objects.equals(this.customerLineNumber, quoteToOrderDetailsDTOLinesInner.customerLineNumber) &&
        Objects.equals(this.ingramPartNumber, quoteToOrderDetailsDTOLinesInner.ingramPartNumber) &&
        Objects.equals(this.quantity, quoteToOrderDetailsDTOLinesInner.quantity) &&
        Objects.equals(this.vmfAdditionalAttributesLines, quoteToOrderDetailsDTOLinesInner.vmfAdditionalAttributesLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLineNumber, ingramPartNumber, quantity, vmfAdditionalAttributesLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteToOrderDetailsDTOLinesInner {\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    vmfAdditionalAttributesLines: ").append(toIndentedString(vmfAdditionalAttributesLines)).append("\n");
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
    openapiFields.add("vmfAdditionalAttributesLines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteToOrderDetailsDTOLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteToOrderDetailsDTOLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteToOrderDetailsDTOLinesInner is not found in the empty JSON string", QuoteToOrderDetailsDTOLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteToOrderDetailsDTOLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteToOrderDetailsDTOLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("vmfAdditionalAttributesLines") != null && !jsonObj.get("vmfAdditionalAttributesLines").isJsonNull()) {
        JsonArray jsonArrayvmfAdditionalAttributesLines = jsonObj.getAsJsonArray("vmfAdditionalAttributesLines");
        if (jsonArrayvmfAdditionalAttributesLines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vmfAdditionalAttributesLines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vmfAdditionalAttributesLines` to be an array in the JSON string but got `%s`", jsonObj.get("vmfAdditionalAttributesLines").toString()));
          }

          // validate the optional field `vmfAdditionalAttributesLines` (array)
          for (int i = 0; i < jsonArrayvmfAdditionalAttributesLines.size(); i++) {
            QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner.validateJsonElement(jsonArrayvmfAdditionalAttributesLines.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteToOrderDetailsDTOLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteToOrderDetailsDTOLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteToOrderDetailsDTOLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteToOrderDetailsDTOLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteToOrderDetailsDTOLinesInner>() {
           @Override
           public void write(JsonWriter out, QuoteToOrderDetailsDTOLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteToOrderDetailsDTOLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteToOrderDetailsDTOLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteToOrderDetailsDTOLinesInner
  * @throws IOException if the JSON string is invalid with respect to QuoteToOrderDetailsDTOLinesInner
  */
  public static QuoteToOrderDetailsDTOLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteToOrderDetailsDTOLinesInner.class);
  }

 /**
  * Convert an instance of QuoteToOrderDetailsDTOLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

