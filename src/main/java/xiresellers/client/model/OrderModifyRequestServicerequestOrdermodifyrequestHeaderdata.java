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
 * OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T11:06:29.712836Z[Etc/UTC]")
public class OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata {
  public static final String SERIALIZED_NAME_ACTIONCODE = "actioncode";
  @SerializedName(SERIALIZED_NAME_ACTIONCODE)
  private String actioncode;

  public static final String SERIALIZED_NAME_SHIPVIACODE = "shipviacode";
  @SerializedName(SERIALIZED_NAME_SHIPVIACODE)
  private String shipviacode;

  public OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata() {
  }

  public OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata actioncode(String actioncode) {
    this.actioncode = actioncode;
    return this;
  }

   /**
   * Get actioncode
   * @return actioncode
  **/
  @javax.annotation.Nullable
  public String getActioncode() {
    return actioncode;
  }

  public void setActioncode(String actioncode) {
    this.actioncode = actioncode;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata shipviacode(String shipviacode) {
    this.shipviacode = shipviacode;
    return this;
  }

   /**
   * Get shipviacode
   * @return shipviacode
  **/
  @javax.annotation.Nullable
  public String getShipviacode() {
    return shipviacode;
  }

  public void setShipviacode(String shipviacode) {
    this.shipviacode = shipviacode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata orderModifyRequestServicerequestOrdermodifyrequestHeaderdata = (OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata) o;
    return Objects.equals(this.actioncode, orderModifyRequestServicerequestOrdermodifyrequestHeaderdata.actioncode) &&
        Objects.equals(this.shipviacode, orderModifyRequestServicerequestOrdermodifyrequestHeaderdata.shipviacode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actioncode, shipviacode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata {\n");
    sb.append("    actioncode: ").append(toIndentedString(actioncode)).append("\n");
    sb.append("    shipviacode: ").append(toIndentedString(shipviacode)).append("\n");
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
    openapiFields.add("actioncode");
    openapiFields.add("shipviacode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata is not found in the empty JSON string", OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("actioncode") != null && !jsonObj.get("actioncode").isJsonNull()) && !jsonObj.get("actioncode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actioncode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actioncode").toString()));
      }
      if ((jsonObj.get("shipviacode") != null && !jsonObj.get("shipviacode").isJsonNull()) && !jsonObj.get("shipviacode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipviacode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipviacode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata
  * @throws IOException if the JSON string is invalid with respect to OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata
  */
  public static OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.class);
  }

 /**
  * Convert an instance of OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

