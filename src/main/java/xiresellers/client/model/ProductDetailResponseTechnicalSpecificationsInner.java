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
 * ProductDetailResponseTechnicalSpecificationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T09:00:28.102704Z[Etc/UTC]")
public class ProductDetailResponseTechnicalSpecificationsInner {
  public static final String SERIALIZED_NAME_HEADERNAME = "headername";
  @SerializedName(SERIALIZED_NAME_HEADERNAME)
  private String headername;

  public static final String SERIALIZED_NAME_ATTRIBUTEVALUE = "attributevalue";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTEVALUE)
  private String attributevalue;

  public static final String SERIALIZED_NAME_ATTRIBUTEDISPLAY = "attributedisplay";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTEDISPLAY)
  private String attributedisplay;

  public static final String SERIALIZED_NAME_ATTRIBUTENAME = "attributename";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTENAME)
  private String attributename;

  public ProductDetailResponseTechnicalSpecificationsInner() {
  }

  public ProductDetailResponseTechnicalSpecificationsInner headername(String headername) {
    this.headername = headername;
    return this;
  }

   /**
   * Example : &#39;Basic&#39;
   * @return headername
  **/
  @javax.annotation.Nullable
  public String getHeadername() {
    return headername;
  }

  public void setHeadername(String headername) {
    this.headername = headername;
  }


  public ProductDetailResponseTechnicalSpecificationsInner attributevalue(String attributevalue) {
    this.attributevalue = attributevalue;
    return this;
  }

   /**
   * Example : &#39;LCD Monitor&#39;
   * @return attributevalue
  **/
  @javax.annotation.Nullable
  public String getAttributevalue() {
    return attributevalue;
  }

  public void setAttributevalue(String attributevalue) {
    this.attributevalue = attributevalue;
  }


  public ProductDetailResponseTechnicalSpecificationsInner attributedisplay(String attributedisplay) {
    this.attributedisplay = attributedisplay;
    return this;
  }

   /**
   * Example : &#39;Basic|Product Type|LCD Monitor&#39;
   * @return attributedisplay
  **/
  @javax.annotation.Nullable
  public String getAttributedisplay() {
    return attributedisplay;
  }

  public void setAttributedisplay(String attributedisplay) {
    this.attributedisplay = attributedisplay;
  }


  public ProductDetailResponseTechnicalSpecificationsInner attributename(String attributename) {
    this.attributename = attributename;
    return this;
  }

   /**
   * Example : &#39;Product Type&#39;
   * @return attributename
  **/
  @javax.annotation.Nullable
  public String getAttributename() {
    return attributename;
  }

  public void setAttributename(String attributename) {
    this.attributename = attributename;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseTechnicalSpecificationsInner productDetailResponseTechnicalSpecificationsInner = (ProductDetailResponseTechnicalSpecificationsInner) o;
    return Objects.equals(this.headername, productDetailResponseTechnicalSpecificationsInner.headername) &&
        Objects.equals(this.attributevalue, productDetailResponseTechnicalSpecificationsInner.attributevalue) &&
        Objects.equals(this.attributedisplay, productDetailResponseTechnicalSpecificationsInner.attributedisplay) &&
        Objects.equals(this.attributename, productDetailResponseTechnicalSpecificationsInner.attributename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headername, attributevalue, attributedisplay, attributename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseTechnicalSpecificationsInner {\n");
    sb.append("    headername: ").append(toIndentedString(headername)).append("\n");
    sb.append("    attributevalue: ").append(toIndentedString(attributevalue)).append("\n");
    sb.append("    attributedisplay: ").append(toIndentedString(attributedisplay)).append("\n");
    sb.append("    attributename: ").append(toIndentedString(attributename)).append("\n");
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
    openapiFields.add("headername");
    openapiFields.add("attributevalue");
    openapiFields.add("attributedisplay");
    openapiFields.add("attributename");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseTechnicalSpecificationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseTechnicalSpecificationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseTechnicalSpecificationsInner is not found in the empty JSON string", ProductDetailResponseTechnicalSpecificationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseTechnicalSpecificationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseTechnicalSpecificationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("headername") != null && !jsonObj.get("headername").isJsonNull()) && !jsonObj.get("headername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headername").toString()));
      }
      if ((jsonObj.get("attributevalue") != null && !jsonObj.get("attributevalue").isJsonNull()) && !jsonObj.get("attributevalue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributevalue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributevalue").toString()));
      }
      if ((jsonObj.get("attributedisplay") != null && !jsonObj.get("attributedisplay").isJsonNull()) && !jsonObj.get("attributedisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributedisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributedisplay").toString()));
      }
      if ((jsonObj.get("attributename") != null && !jsonObj.get("attributename").isJsonNull()) && !jsonObj.get("attributename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributename").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseTechnicalSpecificationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseTechnicalSpecificationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseTechnicalSpecificationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseTechnicalSpecificationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseTechnicalSpecificationsInner>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseTechnicalSpecificationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseTechnicalSpecificationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDetailResponseTechnicalSpecificationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDetailResponseTechnicalSpecificationsInner
  * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseTechnicalSpecificationsInner
  */
  public static ProductDetailResponseTechnicalSpecificationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseTechnicalSpecificationsInner.class);
  }

 /**
  * Convert an instance of ProductDetailResponseTechnicalSpecificationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

