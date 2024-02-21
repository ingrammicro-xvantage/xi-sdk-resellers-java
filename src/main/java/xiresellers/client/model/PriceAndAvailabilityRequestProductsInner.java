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
import xiresellers.client.model.PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner;

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
 * PriceAndAvailabilityRequestProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T07:55:29.335518Z[Etc/UTC]")
public class PriceAndAvailabilityRequestProductsInner {
  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_PART_NUMBER = "customerPartNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PART_NUMBER)
  private String customerPartNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_QUANTITY_REQUESTED = "quantityRequested";
  @SerializedName(SERIALIZED_NAME_QUANTITY_REQUESTED)
  private String quantityRequested;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner> additionalAttributes;

  public PriceAndAvailabilityRequestProductsInner() {
  }

  public PriceAndAvailabilityRequestProductsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * Ingram Micro unique part number for the product.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public PriceAndAvailabilityRequestProductsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * Vendor’s part number for the product.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public PriceAndAvailabilityRequestProductsInner customerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
    return this;
  }

   /**
   * Reseller/end-user’s part number for the product.
   * @return customerPartNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerPartNumber() {
    return customerPartNumber;
  }

  public void setCustomerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
  }


  public PriceAndAvailabilityRequestProductsInner upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * The UPC code for the product. Consists of 12 numeric digits that are uniquely assigned to each trade item.
   * @return upc
  **/
  @javax.annotation.Nullable
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }


  public PriceAndAvailabilityRequestProductsInner quantityRequested(String quantityRequested) {
    this.quantityRequested = quantityRequested;
    return this;
  }

   /**
   * Number of quantity of the Product.
   * @return quantityRequested
  **/
  @javax.annotation.Nullable
  public String getQuantityRequested() {
    return quantityRequested;
  }

  public void setQuantityRequested(String quantityRequested) {
    this.quantityRequested = quantityRequested;
  }


  public PriceAndAvailabilityRequestProductsInner additionalAttributes(List<PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public PriceAndAvailabilityRequestProductsInner addAdditionalAttributesItem(PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner additionalAttributesItem) {
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
  public List<PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityRequestProductsInner priceAndAvailabilityRequestProductsInner = (PriceAndAvailabilityRequestProductsInner) o;
    return Objects.equals(this.ingramPartNumber, priceAndAvailabilityRequestProductsInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, priceAndAvailabilityRequestProductsInner.vendorPartNumber) &&
        Objects.equals(this.customerPartNumber, priceAndAvailabilityRequestProductsInner.customerPartNumber) &&
        Objects.equals(this.upc, priceAndAvailabilityRequestProductsInner.upc) &&
        Objects.equals(this.quantityRequested, priceAndAvailabilityRequestProductsInner.quantityRequested) &&
        Objects.equals(this.additionalAttributes, priceAndAvailabilityRequestProductsInner.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramPartNumber, vendorPartNumber, customerPartNumber, upc, quantityRequested, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityRequestProductsInner {\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    customerPartNumber: ").append(toIndentedString(customerPartNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    quantityRequested: ").append(toIndentedString(quantityRequested)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("customerPartNumber");
    openapiFields.add("upc");
    openapiFields.add("quantityRequested");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityRequestProductsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityRequestProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityRequestProductsInner is not found in the empty JSON string", PriceAndAvailabilityRequestProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityRequestProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityRequestProductsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("customerPartNumber") != null && !jsonObj.get("customerPartNumber").isJsonNull()) && !jsonObj.get("customerPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerPartNumber").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("quantityRequested") != null && !jsonObj.get("quantityRequested").isJsonNull()) && !jsonObj.get("quantityRequested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantityRequested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantityRequested").toString()));
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
            PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityRequestProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityRequestProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityRequestProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityRequestProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityRequestProductsInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityRequestProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityRequestProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityRequestProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityRequestProductsInner
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityRequestProductsInner
  */
  public static PriceAndAvailabilityRequestProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityRequestProductsInner.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityRequestProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

