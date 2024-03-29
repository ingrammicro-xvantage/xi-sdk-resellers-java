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
 * QuoteToOrderResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-27T08:54:45.542575Z[Etc/UTC]")
public class QuoteToOrderResponse {
  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_CONFIRMATION_NUMBER = "confirmationNumber";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION_NUMBER)
  private String confirmationNumber;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public QuoteToOrderResponse() {
  }

  public QuoteToOrderResponse quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

   /**
   * Unique identifier generated by Ingram Micro&#39;s CRM specific to each quote.
   * @return quoteNumber
  **/
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public QuoteToOrderResponse confirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
    return this;
  }

   /**
   * A unique confirmation number for tracking purposes.
   * @return confirmationNumber
  **/
  @javax.annotation.Nullable
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }


  public QuoteToOrderResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A confirmation message.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteToOrderResponse quoteToOrderResponse = (QuoteToOrderResponse) o;
    return Objects.equals(this.quoteNumber, quoteToOrderResponse.quoteNumber) &&
        Objects.equals(this.confirmationNumber, quoteToOrderResponse.confirmationNumber) &&
        Objects.equals(this.message, quoteToOrderResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, confirmationNumber, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteToOrderResponse {\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    confirmationNumber: ").append(toIndentedString(confirmationNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("confirmationNumber");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteToOrderResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteToOrderResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteToOrderResponse is not found in the empty JSON string", QuoteToOrderResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteToOrderResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteToOrderResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("confirmationNumber") != null && !jsonObj.get("confirmationNumber").isJsonNull()) && !jsonObj.get("confirmationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmationNumber").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteToOrderResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteToOrderResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteToOrderResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteToOrderResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteToOrderResponse>() {
           @Override
           public void write(JsonWriter out, QuoteToOrderResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteToOrderResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteToOrderResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteToOrderResponse
  * @throws IOException if the JSON string is invalid with respect to QuoteToOrderResponse
  */
  public static QuoteToOrderResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteToOrderResponse.class);
  }

 /**
  * Convert an instance of QuoteToOrderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

