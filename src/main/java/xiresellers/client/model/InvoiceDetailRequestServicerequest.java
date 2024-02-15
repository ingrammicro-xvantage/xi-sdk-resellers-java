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
import xiresellers.client.model.InvoiceDetailRequestServicerequestInvoicedetailrequest;
import xiresellers.client.model.InvoiceDetailRequestServicerequestRequestpreamble;

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
 * InvoiceDetailRequestServicerequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class InvoiceDetailRequestServicerequest {
  public static final String SERIALIZED_NAME_REQUESTPREAMBLE = "requestpreamble";
  @SerializedName(SERIALIZED_NAME_REQUESTPREAMBLE)
  private InvoiceDetailRequestServicerequestRequestpreamble requestpreamble;

  public static final String SERIALIZED_NAME_INVOICEDETAILREQUEST = "invoicedetailrequest";
  @SerializedName(SERIALIZED_NAME_INVOICEDETAILREQUEST)
  private InvoiceDetailRequestServicerequestInvoicedetailrequest invoicedetailrequest;

  public InvoiceDetailRequestServicerequest() {
  }

  public InvoiceDetailRequestServicerequest requestpreamble(InvoiceDetailRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
    return this;
  }

   /**
   * Get requestpreamble
   * @return requestpreamble
  **/
  @javax.annotation.Nullable
  public InvoiceDetailRequestServicerequestRequestpreamble getRequestpreamble() {
    return requestpreamble;
  }

  public void setRequestpreamble(InvoiceDetailRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
  }


  public InvoiceDetailRequestServicerequest invoicedetailrequest(InvoiceDetailRequestServicerequestInvoicedetailrequest invoicedetailrequest) {
    this.invoicedetailrequest = invoicedetailrequest;
    return this;
  }

   /**
   * Get invoicedetailrequest
   * @return invoicedetailrequest
  **/
  @javax.annotation.Nullable
  public InvoiceDetailRequestServicerequestInvoicedetailrequest getInvoicedetailrequest() {
    return invoicedetailrequest;
  }

  public void setInvoicedetailrequest(InvoiceDetailRequestServicerequestInvoicedetailrequest invoicedetailrequest) {
    this.invoicedetailrequest = invoicedetailrequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailRequestServicerequest invoiceDetailRequestServicerequest = (InvoiceDetailRequestServicerequest) o;
    return Objects.equals(this.requestpreamble, invoiceDetailRequestServicerequest.requestpreamble) &&
        Objects.equals(this.invoicedetailrequest, invoiceDetailRequestServicerequest.invoicedetailrequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestpreamble, invoicedetailrequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailRequestServicerequest {\n");
    sb.append("    requestpreamble: ").append(toIndentedString(requestpreamble)).append("\n");
    sb.append("    invoicedetailrequest: ").append(toIndentedString(invoicedetailrequest)).append("\n");
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
    openapiFields.add("requestpreamble");
    openapiFields.add("invoicedetailrequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailRequestServicerequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailRequestServicerequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailRequestServicerequest is not found in the empty JSON string", InvoiceDetailRequestServicerequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailRequestServicerequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailRequestServicerequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `requestpreamble`
      if (jsonObj.get("requestpreamble") != null && !jsonObj.get("requestpreamble").isJsonNull()) {
        InvoiceDetailRequestServicerequestRequestpreamble.validateJsonElement(jsonObj.get("requestpreamble"));
      }
      // validate the optional field `invoicedetailrequest`
      if (jsonObj.get("invoicedetailrequest") != null && !jsonObj.get("invoicedetailrequest").isJsonNull()) {
        InvoiceDetailRequestServicerequestInvoicedetailrequest.validateJsonElement(jsonObj.get("invoicedetailrequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailRequestServicerequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailRequestServicerequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailRequestServicerequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailRequestServicerequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailRequestServicerequest>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailRequestServicerequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailRequestServicerequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailRequestServicerequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailRequestServicerequest
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailRequestServicerequest
  */
  public static InvoiceDetailRequestServicerequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailRequestServicerequest.class);
  }

 /**
  * Convert an instance of InvoiceDetailRequestServicerequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

