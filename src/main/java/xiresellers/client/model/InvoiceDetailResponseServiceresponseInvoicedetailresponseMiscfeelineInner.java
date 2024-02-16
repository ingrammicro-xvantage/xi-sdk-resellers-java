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
 * InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T08:56:25.348026Z[Etc/UTC]")
public class InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CHARGEAMOUNT = "chargeamount";
  @SerializedName(SERIALIZED_NAME_CHARGEAMOUNT)
  private String chargeamount;

  public InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner() {
  }

  public InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner chargeamount(String chargeamount) {
    this.chargeamount = chargeamount;
    return this;
  }

   /**
   * Get chargeamount
   * @return chargeamount
  **/
  @javax.annotation.Nullable
  public String getChargeamount() {
    return chargeamount;
  }

  public void setChargeamount(String chargeamount) {
    this.chargeamount = chargeamount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner invoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner = (InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner) o;
    return Objects.equals(this.code, invoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.code) &&
        Objects.equals(this.description, invoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.description) &&
        Objects.equals(this.chargeamount, invoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.chargeamount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, chargeamount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    chargeamount: ").append(toIndentedString(chargeamount)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("chargeamount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner is not found in the empty JSON string", InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("chargeamount") != null && !jsonObj.get("chargeamount").isJsonNull()) && !jsonObj.get("chargeamount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeamount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeamount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner
  */
  public static InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner.class);
  }

 /**
  * Convert an instance of InvoiceDetailResponseServiceresponseInvoicedetailresponseMiscfeelineInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

