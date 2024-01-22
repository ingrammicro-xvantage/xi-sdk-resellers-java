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
 * OrderCreateResponseOrdersInnerRejectedLineItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderCreateResponseOrdersInnerRejectedLineItemsInner {
  public static final String SERIALIZED_NAME_CUSTOMER_LINENUMBER = "customerLinenumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINENUMBER)
  private String customerLinenumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_REJECT_CODE = "rejectCode";
  @SerializedName(SERIALIZED_NAME_REJECT_CODE)
  private String rejectCode;

  public static final String SERIALIZED_NAME_REJECT_REASON = "rejectReason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public OrderCreateResponseOrdersInnerRejectedLineItemsInner() {
  }

  public OrderCreateResponseOrdersInnerRejectedLineItemsInner customerLinenumber(String customerLinenumber) {
    this.customerLinenumber = customerLinenumber;
    return this;
  }

   /**
   * The reseller&#39;s line item number of the rejected item for their reference. Number
   * @return customerLinenumber
  **/
  @javax.annotation.Nullable
  public String getCustomerLinenumber() {
    return customerLinenumber;
  }

  public void setCustomerLinenumber(String customerLinenumber) {
    this.customerLinenumber = customerLinenumber;
  }


  public OrderCreateResponseOrdersInnerRejectedLineItemsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * The Ingram Micro part number for the rejected line item.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderCreateResponseOrdersInnerRejectedLineItemsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendor part number for the rejected line item.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public OrderCreateResponseOrdersInnerRejectedLineItemsInner quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The quantity ordered of the rejected line item.
   * @return quantityOrdered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderCreateResponseOrdersInnerRejectedLineItemsInner rejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
    return this;
  }

   /**
   * The rejection code for the rejected line item. Ex: &#39;EN&#39; 
   * @return rejectCode
  **/
  @javax.annotation.Nullable
  public String getRejectCode() {
    return rejectCode;
  }

  public void setRejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
  }


  public OrderCreateResponseOrdersInnerRejectedLineItemsInner rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * The rejection reason for the rejected line item. Ex: &#39;SKU-NOTFOUND    DF41281&#39; 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseOrdersInnerRejectedLineItemsInner orderCreateResponseOrdersInnerRejectedLineItemsInner = (OrderCreateResponseOrdersInnerRejectedLineItemsInner) o;
    return Objects.equals(this.customerLinenumber, orderCreateResponseOrdersInnerRejectedLineItemsInner.customerLinenumber) &&
        Objects.equals(this.ingramPartNumber, orderCreateResponseOrdersInnerRejectedLineItemsInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, orderCreateResponseOrdersInnerRejectedLineItemsInner.vendorPartNumber) &&
        Objects.equals(this.quantityOrdered, orderCreateResponseOrdersInnerRejectedLineItemsInner.quantityOrdered) &&
        Objects.equals(this.rejectCode, orderCreateResponseOrdersInnerRejectedLineItemsInner.rejectCode) &&
        Objects.equals(this.rejectReason, orderCreateResponseOrdersInnerRejectedLineItemsInner.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLinenumber, ingramPartNumber, vendorPartNumber, quantityOrdered, rejectCode, rejectReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseOrdersInnerRejectedLineItemsInner {\n");
    sb.append("    customerLinenumber: ").append(toIndentedString(customerLinenumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    rejectCode: ").append(toIndentedString(rejectCode)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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
    openapiFields.add("customerLinenumber");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("quantityOrdered");
    openapiFields.add("rejectCode");
    openapiFields.add("rejectReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseOrdersInnerRejectedLineItemsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseOrdersInnerRejectedLineItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseOrdersInnerRejectedLineItemsInner is not found in the empty JSON string", OrderCreateResponseOrdersInnerRejectedLineItemsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseOrdersInnerRejectedLineItemsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseOrdersInnerRejectedLineItemsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerLinenumber") != null && !jsonObj.get("customerLinenumber").isJsonNull()) && !jsonObj.get("customerLinenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLinenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLinenumber").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("rejectCode") != null && !jsonObj.get("rejectCode").isJsonNull()) && !jsonObj.get("rejectCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectCode").toString()));
      }
      if ((jsonObj.get("rejectReason") != null && !jsonObj.get("rejectReason").isJsonNull()) && !jsonObj.get("rejectReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseOrdersInnerRejectedLineItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseOrdersInnerRejectedLineItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseOrdersInnerRejectedLineItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseOrdersInnerRejectedLineItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseOrdersInnerRejectedLineItemsInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseOrdersInnerRejectedLineItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseOrdersInnerRejectedLineItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponseOrdersInnerRejectedLineItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponseOrdersInnerRejectedLineItemsInner
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseOrdersInnerRejectedLineItemsInner
  */
  public static OrderCreateResponseOrdersInnerRejectedLineItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseOrdersInnerRejectedLineItemsInner.class);
  }

 /**
  * Convert an instance of OrderCreateResponseOrdersInnerRejectedLineItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
