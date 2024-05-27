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
 * InvoiceDetailsv61ResponseSummaryLines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T10:35:17.995191Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class InvoiceDetailsv61ResponseSummaryLines {
  public static final String SERIALIZED_NAME_PRODUCT_LINE_COUNT = "productLineCount";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE_COUNT)
  private Integer productLineCount;

  public static final String SERIALIZED_NAME_PRODUCT_LINE_TOTAL_QUANTITY = "productLineTotalQuantity";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE_TOTAL_QUANTITY)
  private Integer productLineTotalQuantity;

  public InvoiceDetailsv61ResponseSummaryLines() {
  }

  public InvoiceDetailsv61ResponseSummaryLines productLineCount(Integer productLineCount) {
    this.productLineCount = productLineCount;
    return this;
  }

   /**
   * Number of lines in the order.
   * @return productLineCount
  **/
  @javax.annotation.Nullable
  public Integer getProductLineCount() {
    return productLineCount;
  }

  public void setProductLineCount(Integer productLineCount) {
    this.productLineCount = productLineCount;
  }


  public InvoiceDetailsv61ResponseSummaryLines productLineTotalQuantity(Integer productLineTotalQuantity) {
    this.productLineTotalQuantity = productLineTotalQuantity;
    return this;
  }

   /**
   * Total quantity of the order.
   * @return productLineTotalQuantity
  **/
  @javax.annotation.Nullable
  public Integer getProductLineTotalQuantity() {
    return productLineTotalQuantity;
  }

  public void setProductLineTotalQuantity(Integer productLineTotalQuantity) {
    this.productLineTotalQuantity = productLineTotalQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseSummaryLines invoiceDetailsv61ResponseSummaryLines = (InvoiceDetailsv61ResponseSummaryLines) o;
    return Objects.equals(this.productLineCount, invoiceDetailsv61ResponseSummaryLines.productLineCount) &&
        Objects.equals(this.productLineTotalQuantity, invoiceDetailsv61ResponseSummaryLines.productLineTotalQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLineCount, productLineTotalQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61ResponseSummaryLines {\n");
    sb.append("    productLineCount: ").append(toIndentedString(productLineCount)).append("\n");
    sb.append("    productLineTotalQuantity: ").append(toIndentedString(productLineTotalQuantity)).append("\n");
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
    openapiFields.add("productLineCount");
    openapiFields.add("productLineTotalQuantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseSummaryLines
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseSummaryLines.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseSummaryLines is not found in the empty JSON string", InvoiceDetailsv61ResponseSummaryLines.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseSummaryLines.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseSummaryLines` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseSummaryLines.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseSummaryLines' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseSummaryLines> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseSummaryLines.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseSummaryLines>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseSummaryLines value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseSummaryLines read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailsv61ResponseSummaryLines given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsv61ResponseSummaryLines
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseSummaryLines
  */
  public static InvoiceDetailsv61ResponseSummaryLines fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseSummaryLines.class);
  }

 /**
  * Convert an instance of InvoiceDetailsv61ResponseSummaryLines to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

