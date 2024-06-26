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
 * AvailabilityAsyncNotificationRequestResourceInnerLinksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class AvailabilityAsyncNotificationRequestResourceInnerLinksInner {
  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AvailabilityAsyncNotificationRequestResourceInnerLinksInner() {
  }

  public AvailabilityAsyncNotificationRequestResourceInnerLinksInner topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Provides the details of the orders.
   * @return topic
  **/
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public AvailabilityAsyncNotificationRequestResourceInnerLinksInner href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The URL endpoint for accessing the relevant data.
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public AvailabilityAsyncNotificationRequestResourceInnerLinksInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of call that can be made to the href link (GET, POST, Etc.).            
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityAsyncNotificationRequestResourceInnerLinksInner availabilityAsyncNotificationRequestResourceInnerLinksInner = (AvailabilityAsyncNotificationRequestResourceInnerLinksInner) o;
    return Objects.equals(this.topic, availabilityAsyncNotificationRequestResourceInnerLinksInner.topic) &&
        Objects.equals(this.href, availabilityAsyncNotificationRequestResourceInnerLinksInner.href) &&
        Objects.equals(this.type, availabilityAsyncNotificationRequestResourceInnerLinksInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, href, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityAsyncNotificationRequestResourceInnerLinksInner {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("topic");
    openapiFields.add("href");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AvailabilityAsyncNotificationRequestResourceInnerLinksInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailabilityAsyncNotificationRequestResourceInnerLinksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailabilityAsyncNotificationRequestResourceInnerLinksInner is not found in the empty JSON string", AvailabilityAsyncNotificationRequestResourceInnerLinksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailabilityAsyncNotificationRequestResourceInnerLinksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailabilityAsyncNotificationRequestResourceInnerLinksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailabilityAsyncNotificationRequestResourceInnerLinksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailabilityAsyncNotificationRequestResourceInnerLinksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailabilityAsyncNotificationRequestResourceInnerLinksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailabilityAsyncNotificationRequestResourceInnerLinksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailabilityAsyncNotificationRequestResourceInnerLinksInner>() {
           @Override
           public void write(JsonWriter out, AvailabilityAsyncNotificationRequestResourceInnerLinksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailabilityAsyncNotificationRequestResourceInnerLinksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailabilityAsyncNotificationRequestResourceInnerLinksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailabilityAsyncNotificationRequestResourceInnerLinksInner
  * @throws IOException if the JSON string is invalid with respect to AvailabilityAsyncNotificationRequestResourceInnerLinksInner
  */
  public static AvailabilityAsyncNotificationRequestResourceInnerLinksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailabilityAsyncNotificationRequestResourceInnerLinksInner.class);
  }

 /**
  * Convert an instance of AvailabilityAsyncNotificationRequestResourceInnerLinksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

