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
 * OrderModifyRequestAdditionalAttributesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderModifyRequestAdditionalAttributesInner {
  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VALUE = "attributeValue";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VALUE)
  private String attributeValue;

  public OrderModifyRequestAdditionalAttributesInner() {
  }

  public OrderModifyRequestAdditionalAttributesInner attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Example values are &#39;entryMethod&#39;, &#39;enableCommentsAsLines&#39;, &#39;regionCode&#39;
   * @return attributeName
  **/
  @javax.annotation.Nullable
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public OrderModifyRequestAdditionalAttributesInner attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * Attribute Value
   * @return attributeValue
  **/
  @javax.annotation.Nullable
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyRequestAdditionalAttributesInner orderModifyRequestAdditionalAttributesInner = (OrderModifyRequestAdditionalAttributesInner) o;
    return Objects.equals(this.attributeName, orderModifyRequestAdditionalAttributesInner.attributeName) &&
        Objects.equals(this.attributeValue, orderModifyRequestAdditionalAttributesInner.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequestAdditionalAttributesInner {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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
    openapiFields.add("attributeName");
    openapiFields.add("attributeValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequestAdditionalAttributesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequestAdditionalAttributesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequestAdditionalAttributesInner is not found in the empty JSON string", OrderModifyRequestAdditionalAttributesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequestAdditionalAttributesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequestAdditionalAttributesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attributeName") != null && !jsonObj.get("attributeName").isJsonNull()) && !jsonObj.get("attributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeName").toString()));
      }
      if ((jsonObj.get("attributeValue") != null && !jsonObj.get("attributeValue").isJsonNull()) && !jsonObj.get("attributeValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyRequestAdditionalAttributesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequestAdditionalAttributesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequestAdditionalAttributesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequestAdditionalAttributesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequestAdditionalAttributesInner>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequestAdditionalAttributesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequestAdditionalAttributesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyRequestAdditionalAttributesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyRequestAdditionalAttributesInner
  * @throws IOException if the JSON string is invalid with respect to OrderModifyRequestAdditionalAttributesInner
  */
  public static OrderModifyRequestAdditionalAttributesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequestAdditionalAttributesInner.class);
  }

 /**
  * Convert an instance of OrderModifyRequestAdditionalAttributesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

