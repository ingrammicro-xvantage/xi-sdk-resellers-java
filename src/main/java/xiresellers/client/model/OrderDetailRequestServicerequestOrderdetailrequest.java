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
 * OrderDetailRequestServicerequestOrderdetailrequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderDetailRequestServicerequestOrderdetailrequest {
  public static final String SERIALIZED_NAME_ORDERNUMBER = "ordernumber";
  @SerializedName(SERIALIZED_NAME_ORDERNUMBER)
  private String ordernumber;

  public static final String SERIALIZED_NAME_CUSTOMERPONUMBER = "customerponumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERPONUMBER)
  private String customerponumber;

  public static final String SERIALIZED_NAME_ORDERDATE = "orderdate";
  @SerializedName(SERIALIZED_NAME_ORDERDATE)
  private String orderdate;

  public static final String SERIALIZED_NAME_SYSTEMID = "systemid";
  @SerializedName(SERIALIZED_NAME_SYSTEMID)
  private String systemid;

  public OrderDetailRequestServicerequestOrderdetailrequest() {
  }

  public OrderDetailRequestServicerequestOrderdetailrequest ordernumber(String ordernumber) {
    this.ordernumber = ordernumber;
    return this;
  }

   /**
   * Ingram Micro Order Number
   * @return ordernumber
  **/
  @javax.annotation.Nonnull
  public String getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(String ordernumber) {
    this.ordernumber = ordernumber;
  }


  public OrderDetailRequestServicerequestOrderdetailrequest customerponumber(String customerponumber) {
    this.customerponumber = customerponumber;
    return this;
  }

   /**
   * Get customerponumber
   * @return customerponumber
  **/
  @javax.annotation.Nullable
  public String getCustomerponumber() {
    return customerponumber;
  }

  public void setCustomerponumber(String customerponumber) {
    this.customerponumber = customerponumber;
  }


  public OrderDetailRequestServicerequestOrderdetailrequest orderdate(String orderdate) {
    this.orderdate = orderdate;
    return this;
  }

   /**
   * Get orderdate
   * @return orderdate
  **/
  @javax.annotation.Nullable
  public String getOrderdate() {
    return orderdate;
  }

  public void setOrderdate(String orderdate) {
    this.orderdate = orderdate;
  }


  public OrderDetailRequestServicerequestOrderdetailrequest systemid(String systemid) {
    this.systemid = systemid;
    return this;
  }

   /**
   * Get systemid
   * @return systemid
  **/
  @javax.annotation.Nullable
  public String getSystemid() {
    return systemid;
  }

  public void setSystemid(String systemid) {
    this.systemid = systemid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailRequestServicerequestOrderdetailrequest orderDetailRequestServicerequestOrderdetailrequest = (OrderDetailRequestServicerequestOrderdetailrequest) o;
    return Objects.equals(this.ordernumber, orderDetailRequestServicerequestOrderdetailrequest.ordernumber) &&
        Objects.equals(this.customerponumber, orderDetailRequestServicerequestOrderdetailrequest.customerponumber) &&
        Objects.equals(this.orderdate, orderDetailRequestServicerequestOrderdetailrequest.orderdate) &&
        Objects.equals(this.systemid, orderDetailRequestServicerequestOrderdetailrequest.systemid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordernumber, customerponumber, orderdate, systemid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailRequestServicerequestOrderdetailrequest {\n");
    sb.append("    ordernumber: ").append(toIndentedString(ordernumber)).append("\n");
    sb.append("    customerponumber: ").append(toIndentedString(customerponumber)).append("\n");
    sb.append("    orderdate: ").append(toIndentedString(orderdate)).append("\n");
    sb.append("    systemid: ").append(toIndentedString(systemid)).append("\n");
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
    openapiFields.add("ordernumber");
    openapiFields.add("customerponumber");
    openapiFields.add("orderdate");
    openapiFields.add("systemid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ordernumber");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailRequestServicerequestOrderdetailrequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailRequestServicerequestOrderdetailrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailRequestServicerequestOrderdetailrequest is not found in the empty JSON string", OrderDetailRequestServicerequestOrderdetailrequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailRequestServicerequestOrderdetailrequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailRequestServicerequestOrderdetailrequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderDetailRequestServicerequestOrderdetailrequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordernumber").toString()));
      }
      if ((jsonObj.get("customerponumber") != null && !jsonObj.get("customerponumber").isJsonNull()) && !jsonObj.get("customerponumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerponumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerponumber").toString()));
      }
      if ((jsonObj.get("orderdate") != null && !jsonObj.get("orderdate").isJsonNull()) && !jsonObj.get("orderdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderdate").toString()));
      }
      if ((jsonObj.get("systemid") != null && !jsonObj.get("systemid").isJsonNull()) && !jsonObj.get("systemid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailRequestServicerequestOrderdetailrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailRequestServicerequestOrderdetailrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailRequestServicerequestOrderdetailrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailRequestServicerequestOrderdetailrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailRequestServicerequestOrderdetailrequest>() {
           @Override
           public void write(JsonWriter out, OrderDetailRequestServicerequestOrderdetailrequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailRequestServicerequestOrderdetailrequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailRequestServicerequestOrderdetailrequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailRequestServicerequestOrderdetailrequest
  * @throws IOException if the JSON string is invalid with respect to OrderDetailRequestServicerequestOrderdetailrequest
  */
  public static OrderDetailRequestServicerequestOrderdetailrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailRequestServicerequestOrderdetailrequest.class);
  }

 /**
  * Convert an instance of OrderDetailRequestServicerequestOrderdetailrequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
