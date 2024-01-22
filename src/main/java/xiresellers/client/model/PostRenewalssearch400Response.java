/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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
import xiresellers.client.model.GetResellerV6ValidateQuote400ResponseFieldsInner;

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
 * PostRenewalssearch400Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class PostRenewalssearch400Response {
  public static final String SERIALIZED_NAME_TRACEID = "traceid";
  @SerializedName(SERIALIZED_NAME_TRACEID)
  private String traceid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<GetResellerV6ValidateQuote400ResponseFieldsInner> fields;

  public PostRenewalssearch400Response() {
  }

  public PostRenewalssearch400Response traceid(String traceid) {
    this.traceid = traceid;
    return this;
  }

   /**
   * Unique Id to identify error.
   * @return traceid
  **/
  @javax.annotation.Nullable
  public String getTraceid() {
    return traceid;
  }

  public void setTraceid(String traceid) {
    this.traceid = traceid;
  }


  public PostRenewalssearch400Response type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Describes the type of the error.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public PostRenewalssearch400Response fields(List<GetResellerV6ValidateQuote400ResponseFieldsInner> fields) {
    this.fields = fields;
    return this;
  }

  public PostRenewalssearch400Response addFieldsItem(GetResellerV6ValidateQuote400ResponseFieldsInner fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<GetResellerV6ValidateQuote400ResponseFieldsInner> getFields() {
    return fields;
  }

  public void setFields(List<GetResellerV6ValidateQuote400ResponseFieldsInner> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRenewalssearch400Response postRenewalssearch400Response = (PostRenewalssearch400Response) o;
    return Objects.equals(this.traceid, postRenewalssearch400Response.traceid) &&
        Objects.equals(this.type, postRenewalssearch400Response.type) &&
        Objects.equals(this.fields, postRenewalssearch400Response.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceid, type, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRenewalssearch400Response {\n");
    sb.append("    traceid: ").append(toIndentedString(traceid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("traceid");
    openapiFields.add("type");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostRenewalssearch400Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostRenewalssearch400Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostRenewalssearch400Response is not found in the empty JSON string", PostRenewalssearch400Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostRenewalssearch400Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostRenewalssearch400Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("traceid") != null && !jsonObj.get("traceid").isJsonNull()) && !jsonObj.get("traceid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            GetResellerV6ValidateQuote400ResponseFieldsInner.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostRenewalssearch400Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostRenewalssearch400Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostRenewalssearch400Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostRenewalssearch400Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PostRenewalssearch400Response>() {
           @Override
           public void write(JsonWriter out, PostRenewalssearch400Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostRenewalssearch400Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostRenewalssearch400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostRenewalssearch400Response
  * @throws IOException if the JSON string is invalid with respect to PostRenewalssearch400Response
  */
  public static PostRenewalssearch400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostRenewalssearch400Response.class);
  }

 /**
  * Convert an instance of PostRenewalssearch400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
