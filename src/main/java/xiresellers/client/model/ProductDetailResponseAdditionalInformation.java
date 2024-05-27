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
import xiresellers.client.model.ProductDetailResponseAdditionalInformationProductWeightInner;

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
 * Additional Information related to the product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T10:35:17.995191Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class ProductDetailResponseAdditionalInformation {
  public static final String SERIALIZED_NAME_PRODUCT_WEIGHT = "productWeight";
  @SerializedName(SERIALIZED_NAME_PRODUCT_WEIGHT)
  private List<ProductDetailResponseAdditionalInformationProductWeightInner> productWeight = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_BULK_FREIGHT = "isBulkFreight";
  @SerializedName(SERIALIZED_NAME_IS_BULK_FREIGHT)
  private Boolean isBulkFreight;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private String length;

  public static final String SERIALIZED_NAME_NET_WEIGHT = "netWeight";
  @SerializedName(SERIALIZED_NAME_NET_WEIGHT)
  private String netWeight;

  public static final String SERIALIZED_NAME_DIMENSION_UNIT = "dimensionUnit";
  @SerializedName(SERIALIZED_NAME_DIMENSION_UNIT)
  private String dimensionUnit;

  public ProductDetailResponseAdditionalInformation() {
  }

  public ProductDetailResponseAdditionalInformation productWeight(List<ProductDetailResponseAdditionalInformationProductWeightInner> productWeight) {
    this.productWeight = productWeight;
    return this;
  }

  public ProductDetailResponseAdditionalInformation addProductWeightItem(ProductDetailResponseAdditionalInformationProductWeightInner productWeightItem) {
    if (this.productWeight == null) {
      this.productWeight = new ArrayList<>();
    }
    this.productWeight.add(productWeightItem);
    return this;
  }

   /**
   * Weight information related to the product.
   * @return productWeight
  **/
  @javax.annotation.Nullable
  public List<ProductDetailResponseAdditionalInformationProductWeightInner> getProductWeight() {
    return productWeight;
  }

  public void setProductWeight(List<ProductDetailResponseAdditionalInformationProductWeightInner> productWeight) {
    this.productWeight = productWeight;
  }


  public ProductDetailResponseAdditionalInformation isBulkFreight(Boolean isBulkFreight) {
    this.isBulkFreight = isBulkFreight;
    return this;
  }

   /**
   * Example : true or false
   * @return isBulkFreight
  **/
  @javax.annotation.Nullable
  public Boolean getIsBulkFreight() {
    return isBulkFreight;
  }

  public void setIsBulkFreight(Boolean isBulkFreight) {
    this.isBulkFreight = isBulkFreight;
  }


  public ProductDetailResponseAdditionalInformation height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Example : &#39;5.2 Inches&#39;
   * @return height
  **/
  @javax.annotation.Nullable
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }


  public ProductDetailResponseAdditionalInformation width(String width) {
    this.width = width;
    return this;
  }

   /**
   * Example : &#39;13 inches&#39;
   * @return width
  **/
  @javax.annotation.Nullable
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }


  public ProductDetailResponseAdditionalInformation length(String length) {
    this.length = length;
    return this;
  }

   /**
   * Example : &#39;20.4 inches&#39;
   * @return length
  **/
  @javax.annotation.Nullable
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }


  public ProductDetailResponseAdditionalInformation netWeight(String netWeight) {
    this.netWeight = netWeight;
    return this;
  }

   /**
   * Example : &#39;10 lb&#39;
   * @return netWeight
  **/
  @javax.annotation.Nullable
  public String getNetWeight() {
    return netWeight;
  }

  public void setNetWeight(String netWeight) {
    this.netWeight = netWeight;
  }


  public ProductDetailResponseAdditionalInformation dimensionUnit(String dimensionUnit) {
    this.dimensionUnit = dimensionUnit;
    return this;
  }

   /**
   * Example : &#39;Unit value&#39;
   * @return dimensionUnit
  **/
  @javax.annotation.Nullable
  public String getDimensionUnit() {
    return dimensionUnit;
  }

  public void setDimensionUnit(String dimensionUnit) {
    this.dimensionUnit = dimensionUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseAdditionalInformation productDetailResponseAdditionalInformation = (ProductDetailResponseAdditionalInformation) o;
    return Objects.equals(this.productWeight, productDetailResponseAdditionalInformation.productWeight) &&
        Objects.equals(this.isBulkFreight, productDetailResponseAdditionalInformation.isBulkFreight) &&
        Objects.equals(this.height, productDetailResponseAdditionalInformation.height) &&
        Objects.equals(this.width, productDetailResponseAdditionalInformation.width) &&
        Objects.equals(this.length, productDetailResponseAdditionalInformation.length) &&
        Objects.equals(this.netWeight, productDetailResponseAdditionalInformation.netWeight) &&
        Objects.equals(this.dimensionUnit, productDetailResponseAdditionalInformation.dimensionUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productWeight, isBulkFreight, height, width, length, netWeight, dimensionUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseAdditionalInformation {\n");
    sb.append("    productWeight: ").append(toIndentedString(productWeight)).append("\n");
    sb.append("    isBulkFreight: ").append(toIndentedString(isBulkFreight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    netWeight: ").append(toIndentedString(netWeight)).append("\n");
    sb.append("    dimensionUnit: ").append(toIndentedString(dimensionUnit)).append("\n");
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
    openapiFields.add("productWeight");
    openapiFields.add("isBulkFreight");
    openapiFields.add("height");
    openapiFields.add("width");
    openapiFields.add("length");
    openapiFields.add("netWeight");
    openapiFields.add("dimensionUnit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseAdditionalInformation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseAdditionalInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseAdditionalInformation is not found in the empty JSON string", ProductDetailResponseAdditionalInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseAdditionalInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseAdditionalInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("productWeight") != null && !jsonObj.get("productWeight").isJsonNull()) {
        JsonArray jsonArrayproductWeight = jsonObj.getAsJsonArray("productWeight");
        if (jsonArrayproductWeight != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productWeight").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productWeight` to be an array in the JSON string but got `%s`", jsonObj.get("productWeight").toString()));
          }

          // validate the optional field `productWeight` (array)
          for (int i = 0; i < jsonArrayproductWeight.size(); i++) {
            ProductDetailResponseAdditionalInformationProductWeightInner.validateJsonElement(jsonArrayproductWeight.get(i));
          };
        }
      }
      if ((jsonObj.get("height") != null && !jsonObj.get("height").isJsonNull()) && !jsonObj.get("height").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `height` to be a primitive type in the JSON string but got `%s`", jsonObj.get("height").toString()));
      }
      if ((jsonObj.get("width") != null && !jsonObj.get("width").isJsonNull()) && !jsonObj.get("width").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `width` to be a primitive type in the JSON string but got `%s`", jsonObj.get("width").toString()));
      }
      if ((jsonObj.get("length") != null && !jsonObj.get("length").isJsonNull()) && !jsonObj.get("length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("length").toString()));
      }
      if ((jsonObj.get("netWeight") != null && !jsonObj.get("netWeight").isJsonNull()) && !jsonObj.get("netWeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netWeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netWeight").toString()));
      }
      if ((jsonObj.get("dimensionUnit") != null && !jsonObj.get("dimensionUnit").isJsonNull()) && !jsonObj.get("dimensionUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensionUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dimensionUnit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseAdditionalInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseAdditionalInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseAdditionalInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseAdditionalInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseAdditionalInformation>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseAdditionalInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseAdditionalInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDetailResponseAdditionalInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDetailResponseAdditionalInformation
  * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseAdditionalInformation
  */
  public static ProductDetailResponseAdditionalInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseAdditionalInformation.class);
  }

 /**
  * Convert an instance of ProductDetailResponseAdditionalInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

