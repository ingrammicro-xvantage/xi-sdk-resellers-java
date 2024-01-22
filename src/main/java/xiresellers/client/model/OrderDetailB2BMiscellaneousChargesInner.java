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
 * OrderDetailB2BMiscellaneousChargesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderDetailB2BMiscellaneousChargesInner {
  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_CHARGE_LINE_REFERENCE = "chargeLineReference";
  @SerializedName(SERIALIZED_NAME_CHARGE_LINE_REFERENCE)
  private String chargeLineReference;

  public static final String SERIALIZED_NAME_CHARGE_DESCRIPTION = "chargeDescription";
  @SerializedName(SERIALIZED_NAME_CHARGE_DESCRIPTION)
  private String chargeDescription;

  public static final String SERIALIZED_NAME_CHARGE_AMOUNT = "chargeAmount";
  @SerializedName(SERIALIZED_NAME_CHARGE_AMOUNT)
  private String chargeAmount;

  public OrderDetailB2BMiscellaneousChargesInner() {
  }

  public OrderDetailB2BMiscellaneousChargesInner subOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
    return this;
  }

   /**
   * The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest the reseller. The middle number is the order number. The two-digit suffix is the sub order number.
   * @return subOrderNumber
  **/
  @javax.annotation.Nullable
  public String getSubOrderNumber() {
    return subOrderNumber;
  }

  public void setSubOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderDetailB2BMiscellaneousChargesInner chargeLineReference(String chargeLineReference) {
    this.chargeLineReference = chargeLineReference;
    return this;
  }

   /**
   * Impulse line number for the miscellaneous charge.
   * @return chargeLineReference
  **/
  @javax.annotation.Nullable
  public String getChargeLineReference() {
    return chargeLineReference;
  }

  public void setChargeLineReference(String chargeLineReference) {
    this.chargeLineReference = chargeLineReference;
  }


  public OrderDetailB2BMiscellaneousChargesInner chargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
    return this;
  }

   /**
   * Description of the miscellaneous charges.
   * @return chargeDescription
  **/
  @javax.annotation.Nullable
  public String getChargeDescription() {
    return chargeDescription;
  }

  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }


  public OrderDetailB2BMiscellaneousChargesInner chargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * The amount of miscellaneous charges.
   * @return chargeAmount
  **/
  @javax.annotation.Nullable
  public String getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(String chargeAmount) {
    this.chargeAmount = chargeAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BMiscellaneousChargesInner orderDetailB2BMiscellaneousChargesInner = (OrderDetailB2BMiscellaneousChargesInner) o;
    return Objects.equals(this.subOrderNumber, orderDetailB2BMiscellaneousChargesInner.subOrderNumber) &&
        Objects.equals(this.chargeLineReference, orderDetailB2BMiscellaneousChargesInner.chargeLineReference) &&
        Objects.equals(this.chargeDescription, orderDetailB2BMiscellaneousChargesInner.chargeDescription) &&
        Objects.equals(this.chargeAmount, orderDetailB2BMiscellaneousChargesInner.chargeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderNumber, chargeLineReference, chargeDescription, chargeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BMiscellaneousChargesInner {\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    chargeLineReference: ").append(toIndentedString(chargeLineReference)).append("\n");
    sb.append("    chargeDescription: ").append(toIndentedString(chargeDescription)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
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
    openapiFields.add("subOrderNumber");
    openapiFields.add("chargeLineReference");
    openapiFields.add("chargeDescription");
    openapiFields.add("chargeAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BMiscellaneousChargesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BMiscellaneousChargesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BMiscellaneousChargesInner is not found in the empty JSON string", OrderDetailB2BMiscellaneousChargesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BMiscellaneousChargesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BMiscellaneousChargesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subOrderNumber") != null && !jsonObj.get("subOrderNumber").isJsonNull()) && !jsonObj.get("subOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subOrderNumber").toString()));
      }
      if ((jsonObj.get("chargeLineReference") != null && !jsonObj.get("chargeLineReference").isJsonNull()) && !jsonObj.get("chargeLineReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeLineReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeLineReference").toString()));
      }
      if ((jsonObj.get("chargeDescription") != null && !jsonObj.get("chargeDescription").isJsonNull()) && !jsonObj.get("chargeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeDescription").toString()));
      }
      if ((jsonObj.get("chargeAmount") != null && !jsonObj.get("chargeAmount").isJsonNull()) && !jsonObj.get("chargeAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeAmount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BMiscellaneousChargesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BMiscellaneousChargesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BMiscellaneousChargesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BMiscellaneousChargesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BMiscellaneousChargesInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BMiscellaneousChargesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BMiscellaneousChargesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BMiscellaneousChargesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BMiscellaneousChargesInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BMiscellaneousChargesInner
  */
  public static OrderDetailB2BMiscellaneousChargesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BMiscellaneousChargesInner.class);
  }

 /**
  * Convert an instance of OrderDetailB2BMiscellaneousChargesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
