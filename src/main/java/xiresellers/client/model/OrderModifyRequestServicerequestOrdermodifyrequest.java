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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata;
import xiresellers.client.model.OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner;
import xiresellers.client.model.OrderModifyRequestServicerequestOrdermodifyrequestShipto;

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
 * OrderModifyRequestServicerequestOrdermodifyrequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class OrderModifyRequestServicerequestOrdermodifyrequest {
  public static final String SERIALIZED_NAME_INGRAMORDERBRANCH = "ingramorderbranch";
  @SerializedName(SERIALIZED_NAME_INGRAMORDERBRANCH)
  private String ingramorderbranch;

  public static final String SERIALIZED_NAME_INGRAMORDERNUMBER = "ingramordernumber";
  @SerializedName(SERIALIZED_NAME_INGRAMORDERNUMBER)
  private String ingramordernumber;

  public static final String SERIALIZED_NAME_INGRAMORDERDIST = "ingramorderdist";
  @SerializedName(SERIALIZED_NAME_INGRAMORDERDIST)
  private String ingramorderdist;

  public static final String SERIALIZED_NAME_INGRAMORDERSHIP = "ingramordership";
  @SerializedName(SERIALIZED_NAME_INGRAMORDERSHIP)
  private String ingramordership;

  public static final String SERIALIZED_NAME_CUSTOMERPONUMBER = "customerponumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERPONUMBER)
  private String customerponumber;

  public static final String SERIALIZED_NAME_SHIPTO = "shipto";
  @SerializedName(SERIALIZED_NAME_SHIPTO)
  private OrderModifyRequestServicerequestOrdermodifyrequestShipto shipto;

  public static final String SERIALIZED_NAME_HEADERDATA = "headerdata";
  @SerializedName(SERIALIZED_NAME_HEADERDATA)
  private OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata headerdata;

  public static final String SERIALIZED_NAME_LINEDATA = "linedata";
  @SerializedName(SERIALIZED_NAME_LINEDATA)
  private List<OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner> linedata;

  public OrderModifyRequestServicerequestOrdermodifyrequest() {
  }

  public OrderModifyRequestServicerequestOrdermodifyrequest ingramorderbranch(String ingramorderbranch) {
    this.ingramorderbranch = ingramorderbranch;
    return this;
  }

   /**
   * Get ingramorderbranch
   * @return ingramorderbranch
  **/
  @javax.annotation.Nullable
  public String getIngramorderbranch() {
    return ingramorderbranch;
  }

  public void setIngramorderbranch(String ingramorderbranch) {
    this.ingramorderbranch = ingramorderbranch;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequest ingramordernumber(String ingramordernumber) {
    this.ingramordernumber = ingramordernumber;
    return this;
  }

   /**
   * Get ingramordernumber
   * @return ingramordernumber
  **/
  @javax.annotation.Nullable
  public String getIngramordernumber() {
    return ingramordernumber;
  }

  public void setIngramordernumber(String ingramordernumber) {
    this.ingramordernumber = ingramordernumber;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequest ingramorderdist(String ingramorderdist) {
    this.ingramorderdist = ingramorderdist;
    return this;
  }

   /**
   * Get ingramorderdist
   * @return ingramorderdist
  **/
  @javax.annotation.Nullable
  public String getIngramorderdist() {
    return ingramorderdist;
  }

  public void setIngramorderdist(String ingramorderdist) {
    this.ingramorderdist = ingramorderdist;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequest ingramordership(String ingramordership) {
    this.ingramordership = ingramordership;
    return this;
  }

   /**
   * Get ingramordership
   * @return ingramordership
  **/
  @javax.annotation.Nullable
  public String getIngramordership() {
    return ingramordership;
  }

  public void setIngramordership(String ingramordership) {
    this.ingramordership = ingramordership;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequest customerponumber(String customerponumber) {
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


  public OrderModifyRequestServicerequestOrdermodifyrequest shipto(OrderModifyRequestServicerequestOrdermodifyrequestShipto shipto) {
    this.shipto = shipto;
    return this;
  }

   /**
   * Get shipto
   * @return shipto
  **/
  @javax.annotation.Nullable
  public OrderModifyRequestServicerequestOrdermodifyrequestShipto getShipto() {
    return shipto;
  }

  public void setShipto(OrderModifyRequestServicerequestOrdermodifyrequestShipto shipto) {
    this.shipto = shipto;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequest headerdata(OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata headerdata) {
    this.headerdata = headerdata;
    return this;
  }

   /**
   * Get headerdata
   * @return headerdata
  **/
  @javax.annotation.Nullable
  public OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata getHeaderdata() {
    return headerdata;
  }

  public void setHeaderdata(OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata headerdata) {
    this.headerdata = headerdata;
  }


  public OrderModifyRequestServicerequestOrdermodifyrequest linedata(List<OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner> linedata) {
    this.linedata = linedata;
    return this;
  }

  public OrderModifyRequestServicerequestOrdermodifyrequest addLinedataItem(OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner linedataItem) {
    if (this.linedata == null) {
      this.linedata = new ArrayList<>();
    }
    this.linedata.add(linedataItem);
    return this;
  }

   /**
   * Get linedata
   * @return linedata
  **/
  @javax.annotation.Nullable
  public List<OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner> getLinedata() {
    return linedata;
  }

  public void setLinedata(List<OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner> linedata) {
    this.linedata = linedata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyRequestServicerequestOrdermodifyrequest orderModifyRequestServicerequestOrdermodifyrequest = (OrderModifyRequestServicerequestOrdermodifyrequest) o;
    return Objects.equals(this.ingramorderbranch, orderModifyRequestServicerequestOrdermodifyrequest.ingramorderbranch) &&
        Objects.equals(this.ingramordernumber, orderModifyRequestServicerequestOrdermodifyrequest.ingramordernumber) &&
        Objects.equals(this.ingramorderdist, orderModifyRequestServicerequestOrdermodifyrequest.ingramorderdist) &&
        Objects.equals(this.ingramordership, orderModifyRequestServicerequestOrdermodifyrequest.ingramordership) &&
        Objects.equals(this.customerponumber, orderModifyRequestServicerequestOrdermodifyrequest.customerponumber) &&
        Objects.equals(this.shipto, orderModifyRequestServicerequestOrdermodifyrequest.shipto) &&
        Objects.equals(this.headerdata, orderModifyRequestServicerequestOrdermodifyrequest.headerdata) &&
        Objects.equals(this.linedata, orderModifyRequestServicerequestOrdermodifyrequest.linedata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramorderbranch, ingramordernumber, ingramorderdist, ingramordership, customerponumber, shipto, headerdata, linedata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequestServicerequestOrdermodifyrequest {\n");
    sb.append("    ingramorderbranch: ").append(toIndentedString(ingramorderbranch)).append("\n");
    sb.append("    ingramordernumber: ").append(toIndentedString(ingramordernumber)).append("\n");
    sb.append("    ingramorderdist: ").append(toIndentedString(ingramorderdist)).append("\n");
    sb.append("    ingramordership: ").append(toIndentedString(ingramordership)).append("\n");
    sb.append("    customerponumber: ").append(toIndentedString(customerponumber)).append("\n");
    sb.append("    shipto: ").append(toIndentedString(shipto)).append("\n");
    sb.append("    headerdata: ").append(toIndentedString(headerdata)).append("\n");
    sb.append("    linedata: ").append(toIndentedString(linedata)).append("\n");
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
    openapiFields.add("ingramorderbranch");
    openapiFields.add("ingramordernumber");
    openapiFields.add("ingramorderdist");
    openapiFields.add("ingramordership");
    openapiFields.add("customerponumber");
    openapiFields.add("shipto");
    openapiFields.add("headerdata");
    openapiFields.add("linedata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequestServicerequestOrdermodifyrequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequestServicerequestOrdermodifyrequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequestServicerequestOrdermodifyrequest is not found in the empty JSON string", OrderModifyRequestServicerequestOrdermodifyrequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequestServicerequestOrdermodifyrequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequestServicerequestOrdermodifyrequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramorderbranch") != null && !jsonObj.get("ingramorderbranch").isJsonNull()) && !jsonObj.get("ingramorderbranch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramorderbranch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramorderbranch").toString()));
      }
      if ((jsonObj.get("ingramordernumber") != null && !jsonObj.get("ingramordernumber").isJsonNull()) && !jsonObj.get("ingramordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramordernumber").toString()));
      }
      if ((jsonObj.get("ingramorderdist") != null && !jsonObj.get("ingramorderdist").isJsonNull()) && !jsonObj.get("ingramorderdist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramorderdist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramorderdist").toString()));
      }
      if ((jsonObj.get("ingramordership") != null && !jsonObj.get("ingramordership").isJsonNull()) && !jsonObj.get("ingramordership").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramordership` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramordership").toString()));
      }
      if ((jsonObj.get("customerponumber") != null && !jsonObj.get("customerponumber").isJsonNull()) && !jsonObj.get("customerponumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerponumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerponumber").toString()));
      }
      // validate the optional field `shipto`
      if (jsonObj.get("shipto") != null && !jsonObj.get("shipto").isJsonNull()) {
        OrderModifyRequestServicerequestOrdermodifyrequestShipto.validateJsonElement(jsonObj.get("shipto"));
      }
      // validate the optional field `headerdata`
      if (jsonObj.get("headerdata") != null && !jsonObj.get("headerdata").isJsonNull()) {
        OrderModifyRequestServicerequestOrdermodifyrequestHeaderdata.validateJsonElement(jsonObj.get("headerdata"));
      }
      if (jsonObj.get("linedata") != null && !jsonObj.get("linedata").isJsonNull()) {
        JsonArray jsonArraylinedata = jsonObj.getAsJsonArray("linedata");
        if (jsonArraylinedata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("linedata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `linedata` to be an array in the JSON string but got `%s`", jsonObj.get("linedata").toString()));
          }

          // validate the optional field `linedata` (array)
          for (int i = 0; i < jsonArraylinedata.size(); i++) {
            OrderModifyRequestServicerequestOrdermodifyrequestLinedataInner.validateJsonElement(jsonArraylinedata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyRequestServicerequestOrdermodifyrequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequestServicerequestOrdermodifyrequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequestServicerequestOrdermodifyrequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequestServicerequestOrdermodifyrequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequestServicerequestOrdermodifyrequest>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequestServicerequestOrdermodifyrequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequestServicerequestOrdermodifyrequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyRequestServicerequestOrdermodifyrequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyRequestServicerequestOrdermodifyrequest
  * @throws IOException if the JSON string is invalid with respect to OrderModifyRequestServicerequestOrdermodifyrequest
  */
  public static OrderModifyRequestServicerequestOrdermodifyrequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequestServicerequestOrdermodifyrequest.class);
  }

 /**
  * Convert an instance of OrderModifyRequestServicerequestOrdermodifyrequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

