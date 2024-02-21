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
import xiresellers.client.model.RenewalsSearchRequestDateType;
import xiresellers.client.model.RenewalsSearchRequestStatus;

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
 * RenewalsSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T11:49:36.439472Z[Etc/UTC]")
public class RenewalsSearchRequest {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RenewalsSearchRequestStatus status;

  public static final String SERIALIZED_NAME_DATE_TYPE = "dateType";
  @SerializedName(SERIALIZED_NAME_DATE_TYPE)
  private RenewalsSearchRequestDateType dateType;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_END_USER = "endUser";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private String endUser;

  public RenewalsSearchRequest() {
  }

  public RenewalsSearchRequest status(RenewalsSearchRequestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public RenewalsSearchRequestStatus getStatus() {
    return status;
  }

  public void setStatus(RenewalsSearchRequestStatus status) {
    this.status = status;
  }


  public RenewalsSearchRequest dateType(RenewalsSearchRequestDateType dateType) {
    this.dateType = dateType;
    return this;
  }

   /**
   * Get dateType
   * @return dateType
  **/
  @javax.annotation.Nullable
  public RenewalsSearchRequestDateType getDateType() {
    return dateType;
  }

  public void setDateType(RenewalsSearchRequestDateType dateType) {
    this.dateType = dateType;
  }


  public RenewalsSearchRequest vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * The name of the Vendor.
   * @return vendor
  **/
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public RenewalsSearchRequest endUser(String endUser) {
    this.endUser = endUser;
    return this;
  }

   /**
   * The name of the enduser. 
   * @return endUser
  **/
  @javax.annotation.Nullable
  public String getEndUser() {
    return endUser;
  }

  public void setEndUser(String endUser) {
    this.endUser = endUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsSearchRequest renewalsSearchRequest = (RenewalsSearchRequest) o;
    return Objects.equals(this.status, renewalsSearchRequest.status) &&
        Objects.equals(this.dateType, renewalsSearchRequest.dateType) &&
        Objects.equals(this.vendor, renewalsSearchRequest.vendor) &&
        Objects.equals(this.endUser, renewalsSearchRequest.endUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, dateType, vendor, endUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsSearchRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("dateType");
    openapiFields.add("vendor");
    openapiFields.add("endUser");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RenewalsSearchRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsSearchRequest is not found in the empty JSON string", RenewalsSearchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsSearchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsSearchRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RenewalsSearchRequestStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `dateType`
      if (jsonObj.get("dateType") != null && !jsonObj.get("dateType").isJsonNull()) {
        RenewalsSearchRequestDateType.validateJsonElement(jsonObj.get("dateType"));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("endUser") != null && !jsonObj.get("endUser").isJsonNull()) && !jsonObj.get("endUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUser").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsSearchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsSearchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsSearchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsSearchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsSearchRequest>() {
           @Override
           public void write(JsonWriter out, RenewalsSearchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsSearchRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RenewalsSearchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RenewalsSearchRequest
  * @throws IOException if the JSON string is invalid with respect to RenewalsSearchRequest
  */
  public static RenewalsSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsSearchRequest.class);
  }

 /**
  * Convert an instance of RenewalsSearchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

