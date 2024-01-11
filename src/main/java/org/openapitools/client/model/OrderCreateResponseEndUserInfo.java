/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

import org.openapitools.client.JSON;

/**
 * The contact information for the end user/customer provided by the reseller. Used to determine pricing and discounts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class OrderCreateResponseEndUserInfo {
  public static final String SERIALIZED_NAME_END_USER_ID = "endUserId";
  @SerializedName(SERIALIZED_NAME_END_USER_ID)
  private String endUserId;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_NAME1 = "name1";
  @SerializedName(SERIALIZED_NAME_NAME1)
  private String name1;

  public static final String SERIALIZED_NAME_NAME2 = "name2";
  @SerializedName(SERIALIZED_NAME_NAME2)
  private String name2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "addressLine3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  private String addressLine3;

  public static final String SERIALIZED_NAME_ADDRESS_LINE4 = "addressLine4";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE4)
  private String addressLine4;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public OrderCreateResponseEndUserInfo() {
  }

  public OrderCreateResponseEndUserInfo endUserId(String endUserId) {
    this.endUserId = endUserId;
    return this;
  }

   /**
   * The unique ID provided by the reseller for the end user/customer.
   * @return endUserId
  **/
  @javax.annotation.Nullable
  public String getEndUserId() {
    return endUserId;
  }

  public void setEndUserId(String endUserId) {
    this.endUserId = endUserId;
  }


  public OrderCreateResponseEndUserInfo contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * The contact name for the end user/customer.
   * @return contact
  **/
  @javax.annotation.Nullable
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public OrderCreateResponseEndUserInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The company name for the end user/customer.
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public OrderCreateResponseEndUserInfo name1(String name1) {
    this.name1 = name1;
    return this;
  }

   /**
   * name1
   * @return name1
  **/
  @javax.annotation.Nullable
  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }


  public OrderCreateResponseEndUserInfo name2(String name2) {
    this.name2 = name2;
    return this;
  }

   /**
   * name2
   * @return name2
  **/
  @javax.annotation.Nullable
  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }


  public OrderCreateResponseEndUserInfo addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The street adress and building or house number for the end user/customer.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public OrderCreateResponseEndUserInfo addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The apartment number for the end user/customer.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public OrderCreateResponseEndUserInfo addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Line 3 of the address for the end user/customer.
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public OrderCreateResponseEndUserInfo addressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
    return this;
  }

   /**
   * Street address4
   * @return addressLine4
  **/
  @javax.annotation.Nullable
  public String getAddressLine4() {
    return addressLine4;
  }

  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }


  public OrderCreateResponseEndUserInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The end user/customer&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public OrderCreateResponseEndUserInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The end user/customer&#39;s state.
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public OrderCreateResponseEndUserInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The end user/customer&#39;s zip or postal code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public OrderCreateResponseEndUserInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The end user/customer&#39;s two-character ISO country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public OrderCreateResponseEndUserInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The end user/customer&#39;s phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public OrderCreateResponseEndUserInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The end user/customer&#39;s email.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseEndUserInfo orderCreateResponseEndUserInfo = (OrderCreateResponseEndUserInfo) o;
    return Objects.equals(this.endUserId, orderCreateResponseEndUserInfo.endUserId) &&
        Objects.equals(this.contact, orderCreateResponseEndUserInfo.contact) &&
        Objects.equals(this.companyName, orderCreateResponseEndUserInfo.companyName) &&
        Objects.equals(this.name1, orderCreateResponseEndUserInfo.name1) &&
        Objects.equals(this.name2, orderCreateResponseEndUserInfo.name2) &&
        Objects.equals(this.addressLine1, orderCreateResponseEndUserInfo.addressLine1) &&
        Objects.equals(this.addressLine2, orderCreateResponseEndUserInfo.addressLine2) &&
        Objects.equals(this.addressLine3, orderCreateResponseEndUserInfo.addressLine3) &&
        Objects.equals(this.addressLine4, orderCreateResponseEndUserInfo.addressLine4) &&
        Objects.equals(this.city, orderCreateResponseEndUserInfo.city) &&
        Objects.equals(this.state, orderCreateResponseEndUserInfo.state) &&
        Objects.equals(this.postalCode, orderCreateResponseEndUserInfo.postalCode) &&
        Objects.equals(this.countryCode, orderCreateResponseEndUserInfo.countryCode) &&
        Objects.equals(this.phoneNumber, orderCreateResponseEndUserInfo.phoneNumber) &&
        Objects.equals(this.email, orderCreateResponseEndUserInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserId, contact, companyName, name1, name2, addressLine1, addressLine2, addressLine3, addressLine4, city, state, postalCode, countryCode, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseEndUserInfo {\n");
    sb.append("    endUserId: ").append(toIndentedString(endUserId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressLine4: ").append(toIndentedString(addressLine4)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("endUserId");
    openapiFields.add("contact");
    openapiFields.add("companyName");
    openapiFields.add("name1");
    openapiFields.add("name2");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("addressLine3");
    openapiFields.add("addressLine4");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postalCode");
    openapiFields.add("countryCode");
    openapiFields.add("phoneNumber");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseEndUserInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseEndUserInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseEndUserInfo is not found in the empty JSON string", OrderCreateResponseEndUserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseEndUserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseEndUserInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("endUserId") != null && !jsonObj.get("endUserId").isJsonNull()) && !jsonObj.get("endUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserId").toString()));
      }
      if ((jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) && !jsonObj.get("contact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("name1") != null && !jsonObj.get("name1").isJsonNull()) && !jsonObj.get("name1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name1").toString()));
      }
      if ((jsonObj.get("name2") != null && !jsonObj.get("name2").isJsonNull()) && !jsonObj.get("name2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name2").toString()));
      }
      if ((jsonObj.get("addressLine1") != null && !jsonObj.get("addressLine1").isJsonNull()) && !jsonObj.get("addressLine1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine1").toString()));
      }
      if ((jsonObj.get("addressLine2") != null && !jsonObj.get("addressLine2").isJsonNull()) && !jsonObj.get("addressLine2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine2").toString()));
      }
      if ((jsonObj.get("addressLine3") != null && !jsonObj.get("addressLine3").isJsonNull()) && !jsonObj.get("addressLine3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine3").toString()));
      }
      if ((jsonObj.get("addressLine4") != null && !jsonObj.get("addressLine4").isJsonNull()) && !jsonObj.get("addressLine4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine4").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseEndUserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseEndUserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseEndUserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseEndUserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseEndUserInfo>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseEndUserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseEndUserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponseEndUserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponseEndUserInfo
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseEndUserInfo
  */
  public static OrderCreateResponseEndUserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseEndUserInfo.class);
  }

 /**
  * Convert an instance of OrderCreateResponseEndUserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

