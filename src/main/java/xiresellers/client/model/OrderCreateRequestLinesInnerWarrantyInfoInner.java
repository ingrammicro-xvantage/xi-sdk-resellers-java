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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner;

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
 * OrderCreateRequestLinesInnerWarrantyInfoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T10:35:17.995191Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderCreateRequestLinesInnerWarrantyInfoInner {
  public static final String SERIALIZED_NAME_DIRECT_LINE_LINK = "directLineLink";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINE_LINK)
  private String directLineLink;

  public static final String SERIALIZED_NAME_WARRANTY_LINE_LINK = "warrantyLineLink";
  @SerializedName(SERIALIZED_NAME_WARRANTY_LINE_LINK)
  private String warrantyLineLink;

  public static final String SERIALIZED_NAME_HARDWARE_LINE_LINK = "hardwareLineLink";
  @SerializedName(SERIALIZED_NAME_HARDWARE_LINE_LINK)
  private String hardwareLineLink;

  public static final String SERIALIZED_NAME_SERIAL_INFO = "serialInfo";
  @SerializedName(SERIALIZED_NAME_SERIAL_INFO)
  private List<OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner> serialInfo = new ArrayList<>();

  public OrderCreateRequestLinesInnerWarrantyInfoInner() {
  }

  public OrderCreateRequestLinesInnerWarrantyInfoInner directLineLink(String directLineLink) {
    this.directLineLink = directLineLink;
    return this;
  }

   /**
   * Unique value to link hardware and warranty lines. Should be used only when products are purchased from both Ingram and/or vendor but the warranty is purchased through Ingram for them.
   * @return directLineLink
  **/
  @javax.annotation.Nullable
  public String getDirectLineLink() {
    return directLineLink;
  }

  public void setDirectLineLink(String directLineLink) {
    this.directLineLink = directLineLink;
  }


  public OrderCreateRequestLinesInnerWarrantyInfoInner warrantyLineLink(String warrantyLineLink) {
    this.warrantyLineLink = warrantyLineLink;
    return this;
  }

   /**
   * Customer line number of the hardware product in this request for linkage, either hardwareLineLink or warrantyLineLink can be used in a line.
   * @return warrantyLineLink
  **/
  @javax.annotation.Nullable
  public String getWarrantyLineLink() {
    return warrantyLineLink;
  }

  public void setWarrantyLineLink(String warrantyLineLink) {
    this.warrantyLineLink = warrantyLineLink;
  }


  public OrderCreateRequestLinesInnerWarrantyInfoInner hardwareLineLink(String hardwareLineLink) {
    this.hardwareLineLink = hardwareLineLink;
    return this;
  }

   /**
   * Customer line number of the warranty product in this request for linkage, either hardwareLineLink or warrantyLineLink can be used in a line 
   * @return hardwareLineLink
  **/
  @javax.annotation.Nullable
  public String getHardwareLineLink() {
    return hardwareLineLink;
  }

  public void setHardwareLineLink(String hardwareLineLink) {
    this.hardwareLineLink = hardwareLineLink;
  }


  public OrderCreateRequestLinesInnerWarrantyInfoInner serialInfo(List<OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner> serialInfo) {
    this.serialInfo = serialInfo;
    return this;
  }

  public OrderCreateRequestLinesInnerWarrantyInfoInner addSerialInfoItem(OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner serialInfoItem) {
    if (this.serialInfo == null) {
      this.serialInfo = new ArrayList<>();
    }
    this.serialInfo.add(serialInfoItem);
    return this;
  }

   /**
   * Serial information of the hardware to be associated with the warranty, applicable on post sale orders.
   * @return serialInfo
  **/
  @javax.annotation.Nullable
  public List<OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner> getSerialInfo() {
    return serialInfo;
  }

  public void setSerialInfo(List<OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner> serialInfo) {
    this.serialInfo = serialInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateRequestLinesInnerWarrantyInfoInner orderCreateRequestLinesInnerWarrantyInfoInner = (OrderCreateRequestLinesInnerWarrantyInfoInner) o;
    return Objects.equals(this.directLineLink, orderCreateRequestLinesInnerWarrantyInfoInner.directLineLink) &&
        Objects.equals(this.warrantyLineLink, orderCreateRequestLinesInnerWarrantyInfoInner.warrantyLineLink) &&
        Objects.equals(this.hardwareLineLink, orderCreateRequestLinesInnerWarrantyInfoInner.hardwareLineLink) &&
        Objects.equals(this.serialInfo, orderCreateRequestLinesInnerWarrantyInfoInner.serialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directLineLink, warrantyLineLink, hardwareLineLink, serialInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequestLinesInnerWarrantyInfoInner {\n");
    sb.append("    directLineLink: ").append(toIndentedString(directLineLink)).append("\n");
    sb.append("    warrantyLineLink: ").append(toIndentedString(warrantyLineLink)).append("\n");
    sb.append("    hardwareLineLink: ").append(toIndentedString(hardwareLineLink)).append("\n");
    sb.append("    serialInfo: ").append(toIndentedString(serialInfo)).append("\n");
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
    openapiFields.add("directLineLink");
    openapiFields.add("warrantyLineLink");
    openapiFields.add("hardwareLineLink");
    openapiFields.add("serialInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequestLinesInnerWarrantyInfoInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequestLinesInnerWarrantyInfoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequestLinesInnerWarrantyInfoInner is not found in the empty JSON string", OrderCreateRequestLinesInnerWarrantyInfoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequestLinesInnerWarrantyInfoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequestLinesInnerWarrantyInfoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("directLineLink") != null && !jsonObj.get("directLineLink").isJsonNull()) && !jsonObj.get("directLineLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directLineLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directLineLink").toString()));
      }
      if ((jsonObj.get("warrantyLineLink") != null && !jsonObj.get("warrantyLineLink").isJsonNull()) && !jsonObj.get("warrantyLineLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warrantyLineLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warrantyLineLink").toString()));
      }
      if ((jsonObj.get("hardwareLineLink") != null && !jsonObj.get("hardwareLineLink").isJsonNull()) && !jsonObj.get("hardwareLineLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hardwareLineLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hardwareLineLink").toString()));
      }
      if (jsonObj.get("serialInfo") != null && !jsonObj.get("serialInfo").isJsonNull()) {
        JsonArray jsonArrayserialInfo = jsonObj.getAsJsonArray("serialInfo");
        if (jsonArrayserialInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serialInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serialInfo` to be an array in the JSON string but got `%s`", jsonObj.get("serialInfo").toString()));
          }

          // validate the optional field `serialInfo` (array)
          for (int i = 0; i < jsonArrayserialInfo.size(); i++) {
            OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.validateJsonElement(jsonArrayserialInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequestLinesInnerWarrantyInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequestLinesInnerWarrantyInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequestLinesInnerWarrantyInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequestLinesInnerWarrantyInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequestLinesInnerWarrantyInfoInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequestLinesInnerWarrantyInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequestLinesInnerWarrantyInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateRequestLinesInnerWarrantyInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateRequestLinesInnerWarrantyInfoInner
  * @throws IOException if the JSON string is invalid with respect to OrderCreateRequestLinesInnerWarrantyInfoInner
  */
  public static OrderCreateRequestLinesInnerWarrantyInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequestLinesInnerWarrantyInfoInner.class);
  }

 /**
  * Convert an instance of OrderCreateRequestLinesInnerWarrantyInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

