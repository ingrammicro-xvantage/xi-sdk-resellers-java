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
 * OrderModifyResponseServiceresponseOrdermodifyresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class OrderModifyResponseServiceresponseOrdermodifyresponse {
  public static final String SERIALIZED_NAME_RESPONSEFLAG = "responseflag";
  @SerializedName(SERIALIZED_NAME_RESPONSEFLAG)
  private String responseflag;

  public static final String SERIALIZED_NAME_ERRORTYPE = "errortype";
  @SerializedName(SERIALIZED_NAME_ERRORTYPE)
  private String errortype;

  public static final String SERIALIZED_NAME_ACKTRIGGERED = "acktriggered";
  @SerializedName(SERIALIZED_NAME_ACKTRIGGERED)
  private String acktriggered;

  public static final String SERIALIZED_NAME_WARNCODE = "warncode";
  @SerializedName(SERIALIZED_NAME_WARNCODE)
  private String warncode;

  public static final String SERIALIZED_NAME_HEADERRESPONSE = "headerresponse";
  @SerializedName(SERIALIZED_NAME_HEADERRESPONSE)
  private String headerresponse;

  public OrderModifyResponseServiceresponseOrdermodifyresponse() {
  }

  public OrderModifyResponseServiceresponseOrdermodifyresponse responseflag(String responseflag) {
    this.responseflag = responseflag;
    return this;
  }

   /**
   * Get responseflag
   * @return responseflag
  **/
  @javax.annotation.Nullable
  public String getResponseflag() {
    return responseflag;
  }

  public void setResponseflag(String responseflag) {
    this.responseflag = responseflag;
  }


  public OrderModifyResponseServiceresponseOrdermodifyresponse errortype(String errortype) {
    this.errortype = errortype;
    return this;
  }

   /**
   * Get errortype
   * @return errortype
  **/
  @javax.annotation.Nullable
  public String getErrortype() {
    return errortype;
  }

  public void setErrortype(String errortype) {
    this.errortype = errortype;
  }


  public OrderModifyResponseServiceresponseOrdermodifyresponse acktriggered(String acktriggered) {
    this.acktriggered = acktriggered;
    return this;
  }

   /**
   * Get acktriggered
   * @return acktriggered
  **/
  @javax.annotation.Nullable
  public String getAcktriggered() {
    return acktriggered;
  }

  public void setAcktriggered(String acktriggered) {
    this.acktriggered = acktriggered;
  }


  public OrderModifyResponseServiceresponseOrdermodifyresponse warncode(String warncode) {
    this.warncode = warncode;
    return this;
  }

   /**
   * Get warncode
   * @return warncode
  **/
  @javax.annotation.Nullable
  public String getWarncode() {
    return warncode;
  }

  public void setWarncode(String warncode) {
    this.warncode = warncode;
  }


  public OrderModifyResponseServiceresponseOrdermodifyresponse headerresponse(String headerresponse) {
    this.headerresponse = headerresponse;
    return this;
  }

   /**
   * Get headerresponse
   * @return headerresponse
  **/
  @javax.annotation.Nullable
  public String getHeaderresponse() {
    return headerresponse;
  }

  public void setHeaderresponse(String headerresponse) {
    this.headerresponse = headerresponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyResponseServiceresponseOrdermodifyresponse orderModifyResponseServiceresponseOrdermodifyresponse = (OrderModifyResponseServiceresponseOrdermodifyresponse) o;
    return Objects.equals(this.responseflag, orderModifyResponseServiceresponseOrdermodifyresponse.responseflag) &&
        Objects.equals(this.errortype, orderModifyResponseServiceresponseOrdermodifyresponse.errortype) &&
        Objects.equals(this.acktriggered, orderModifyResponseServiceresponseOrdermodifyresponse.acktriggered) &&
        Objects.equals(this.warncode, orderModifyResponseServiceresponseOrdermodifyresponse.warncode) &&
        Objects.equals(this.headerresponse, orderModifyResponseServiceresponseOrdermodifyresponse.headerresponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseflag, errortype, acktriggered, warncode, headerresponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyResponseServiceresponseOrdermodifyresponse {\n");
    sb.append("    responseflag: ").append(toIndentedString(responseflag)).append("\n");
    sb.append("    errortype: ").append(toIndentedString(errortype)).append("\n");
    sb.append("    acktriggered: ").append(toIndentedString(acktriggered)).append("\n");
    sb.append("    warncode: ").append(toIndentedString(warncode)).append("\n");
    sb.append("    headerresponse: ").append(toIndentedString(headerresponse)).append("\n");
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
    openapiFields.add("responseflag");
    openapiFields.add("errortype");
    openapiFields.add("acktriggered");
    openapiFields.add("warncode");
    openapiFields.add("headerresponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyResponseServiceresponseOrdermodifyresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyResponseServiceresponseOrdermodifyresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyResponseServiceresponseOrdermodifyresponse is not found in the empty JSON string", OrderModifyResponseServiceresponseOrdermodifyresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyResponseServiceresponseOrdermodifyresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyResponseServiceresponseOrdermodifyresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("responseflag") != null && !jsonObj.get("responseflag").isJsonNull()) && !jsonObj.get("responseflag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseflag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseflag").toString()));
      }
      if ((jsonObj.get("errortype") != null && !jsonObj.get("errortype").isJsonNull()) && !jsonObj.get("errortype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errortype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errortype").toString()));
      }
      if ((jsonObj.get("acktriggered") != null && !jsonObj.get("acktriggered").isJsonNull()) && !jsonObj.get("acktriggered").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acktriggered` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acktriggered").toString()));
      }
      if ((jsonObj.get("warncode") != null && !jsonObj.get("warncode").isJsonNull()) && !jsonObj.get("warncode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warncode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warncode").toString()));
      }
      if ((jsonObj.get("headerresponse") != null && !jsonObj.get("headerresponse").isJsonNull()) && !jsonObj.get("headerresponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `headerresponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("headerresponse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyResponseServiceresponseOrdermodifyresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyResponseServiceresponseOrdermodifyresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyResponseServiceresponseOrdermodifyresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyResponseServiceresponseOrdermodifyresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyResponseServiceresponseOrdermodifyresponse>() {
           @Override
           public void write(JsonWriter out, OrderModifyResponseServiceresponseOrdermodifyresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyResponseServiceresponseOrdermodifyresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyResponseServiceresponseOrdermodifyresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyResponseServiceresponseOrdermodifyresponse
  * @throws IOException if the JSON string is invalid with respect to OrderModifyResponseServiceresponseOrdermodifyresponse
  */
  public static OrderModifyResponseServiceresponseOrdermodifyresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyResponseServiceresponseOrdermodifyresponse.class);
  }

 /**
  * Convert an instance of OrderModifyResponseServiceresponseOrdermodifyresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

