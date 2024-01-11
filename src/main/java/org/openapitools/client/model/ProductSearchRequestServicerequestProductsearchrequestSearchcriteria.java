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
 * ProductSearchRequestServicerequestProductsearchrequestSearchcriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class ProductSearchRequestServicerequestProductsearchrequestSearchcriteria {
  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_VENDORPARTNUMBER = "vendorpartnumber";
  @SerializedName(SERIALIZED_NAME_VENDORPARTNUMBER)
  private String vendorpartnumber;

  public static final String SERIALIZED_NAME_PARTDESCRIPTION = "partdescription";
  @SerializedName(SERIALIZED_NAME_PARTDESCRIPTION)
  private String partdescription;

  public static final String SERIALIZED_NAME_U_P_C = "UPC";
  @SerializedName(SERIALIZED_NAME_U_P_C)
  private String UPC;

  public static final String SERIALIZED_NAME_CUSTOMERPARTNUMBER = "customerpartnumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERPARTNUMBER)
  private String customerpartnumber;

  public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria() {
  }

  public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Name of the vendor or manufacturer or brand of the product
   * @return vendor
  **/
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria vendorpartnumber(String vendorpartnumber) {
    this.vendorpartnumber = vendorpartnumber;
    return this;
  }

   /**
   * Vendor provided part number
   * @return vendorpartnumber
  **/
  @javax.annotation.Nullable
  public String getVendorpartnumber() {
    return vendorpartnumber;
  }

  public void setVendorpartnumber(String vendorpartnumber) {
    this.vendorpartnumber = vendorpartnumber;
  }


  public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria partdescription(String partdescription) {
    this.partdescription = partdescription;
    return this;
  }

   /**
   * This field seraches the decriptioon of the product.
   * @return partdescription
  **/
  @javax.annotation.Nullable
  public String getPartdescription() {
    return partdescription;
  }

  public void setPartdescription(String partdescription) {
    this.partdescription = partdescription;
  }


  public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria UPC(String UPC) {
    this.UPC = UPC;
    return this;
  }

   /**
   * Universal Product Code
   * @return UPC
  **/
  @javax.annotation.Nullable
  public String getUPC() {
    return UPC;
  }

  public void setUPC(String UPC) {
    this.UPC = UPC;
  }


  public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria customerpartnumber(String customerpartnumber) {
    this.customerpartnumber = customerpartnumber;
    return this;
  }

   /**
   * Customer’s designated part number 
   * @return customerpartnumber
  **/
  @javax.annotation.Nullable
  public String getCustomerpartnumber() {
    return customerpartnumber;
  }

  public void setCustomerpartnumber(String customerpartnumber) {
    this.customerpartnumber = customerpartnumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchRequestServicerequestProductsearchrequestSearchcriteria productSearchRequestServicerequestProductsearchrequestSearchcriteria = (ProductSearchRequestServicerequestProductsearchrequestSearchcriteria) o;
    return Objects.equals(this.vendor, productSearchRequestServicerequestProductsearchrequestSearchcriteria.vendor) &&
        Objects.equals(this.vendorpartnumber, productSearchRequestServicerequestProductsearchrequestSearchcriteria.vendorpartnumber) &&
        Objects.equals(this.partdescription, productSearchRequestServicerequestProductsearchrequestSearchcriteria.partdescription) &&
        Objects.equals(this.UPC, productSearchRequestServicerequestProductsearchrequestSearchcriteria.UPC) &&
        Objects.equals(this.customerpartnumber, productSearchRequestServicerequestProductsearchrequestSearchcriteria.customerpartnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendor, vendorpartnumber, partdescription, UPC, customerpartnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSearchRequestServicerequestProductsearchrequestSearchcriteria {\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorpartnumber: ").append(toIndentedString(vendorpartnumber)).append("\n");
    sb.append("    partdescription: ").append(toIndentedString(partdescription)).append("\n");
    sb.append("    UPC: ").append(toIndentedString(UPC)).append("\n");
    sb.append("    customerpartnumber: ").append(toIndentedString(customerpartnumber)).append("\n");
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
    openapiFields.add("vendor");
    openapiFields.add("vendorpartnumber");
    openapiFields.add("partdescription");
    openapiFields.add("UPC");
    openapiFields.add("customerpartnumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductSearchRequestServicerequestProductsearchrequestSearchcriteria
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductSearchRequestServicerequestProductsearchrequestSearchcriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchRequestServicerequestProductsearchrequestSearchcriteria is not found in the empty JSON string", ProductSearchRequestServicerequestProductsearchrequestSearchcriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductSearchRequestServicerequestProductsearchrequestSearchcriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchRequestServicerequestProductsearchrequestSearchcriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("vendorpartnumber") != null && !jsonObj.get("vendorpartnumber").isJsonNull()) && !jsonObj.get("vendorpartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorpartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorpartnumber").toString()));
      }
      if ((jsonObj.get("partdescription") != null && !jsonObj.get("partdescription").isJsonNull()) && !jsonObj.get("partdescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partdescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partdescription").toString()));
      }
      if ((jsonObj.get("UPC") != null && !jsonObj.get("UPC").isJsonNull()) && !jsonObj.get("UPC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UPC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UPC").toString()));
      }
      if ((jsonObj.get("customerpartnumber") != null && !jsonObj.get("customerpartnumber").isJsonNull()) && !jsonObj.get("customerpartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerpartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerpartnumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchRequestServicerequestProductsearchrequestSearchcriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchRequestServicerequestProductsearchrequestSearchcriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchRequestServicerequestProductsearchrequestSearchcriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchRequestServicerequestProductsearchrequestSearchcriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchRequestServicerequestProductsearchrequestSearchcriteria>() {
           @Override
           public void write(JsonWriter out, ProductSearchRequestServicerequestProductsearchrequestSearchcriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchRequestServicerequestProductsearchrequestSearchcriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSearchRequestServicerequestProductsearchrequestSearchcriteria given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSearchRequestServicerequestProductsearchrequestSearchcriteria
  * @throws IOException if the JSON string is invalid with respect to ProductSearchRequestServicerequestProductsearchrequestSearchcriteria
  */
  public static ProductSearchRequestServicerequestProductsearchrequestSearchcriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchRequestServicerequestProductsearchrequestSearchcriteria.class);
  }

 /**
  * Convert an instance of ProductSearchRequestServicerequestProductsearchrequestSearchcriteria to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

