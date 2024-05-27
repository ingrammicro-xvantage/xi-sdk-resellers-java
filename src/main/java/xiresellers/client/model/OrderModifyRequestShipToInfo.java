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
 * The shipping information provided by the reseller.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T10:35:17.995191Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class OrderModifyRequestShipToInfo {
  public static final String SERIALIZED_NAME_ADDRESS_ID = "addressId";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ID)
  private String addressId;

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

  public OrderModifyRequestShipToInfo() {
  }

  public OrderModifyRequestShipToInfo addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit.
   * @return addressId
  **/
  @javax.annotation.Nullable
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public OrderModifyRequestShipToInfo contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * The company contact provided by the reseller.
   * @return contact
  **/
  @javax.annotation.Nullable
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public OrderModifyRequestShipToInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The name of the company the order will be shipped to.
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public OrderModifyRequestShipToInfo name1(String name1) {
    this.name1 = name1;
    return this;
  }

   /**
   * name1.
   * @return name1
  **/
  @javax.annotation.Nullable
  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }


  public OrderModifyRequestShipToInfo name2(String name2) {
    this.name2 = name2;
    return this;
  }

   /**
   * name2.
   * @return name2
  **/
  @javax.annotation.Nullable
  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }


  public OrderModifyRequestShipToInfo addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The street address and building or house number the order will be shipped to.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public OrderModifyRequestShipToInfo addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The apartment number the order will be shipped to.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public OrderModifyRequestShipToInfo addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Line 3 of the address the order will be shipped to.
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public OrderModifyRequestShipToInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city the order will be shipped to.
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public OrderModifyRequestShipToInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state the order will be shipped to.
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public OrderModifyRequestShipToInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The zip or postal code the order will be shipped to.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public OrderModifyRequestShipToInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two-character ISO country code the order will be shipped to.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public OrderModifyRequestShipToInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The company contact phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public OrderModifyRequestShipToInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The company contact email address.
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
    OrderModifyRequestShipToInfo orderModifyRequestShipToInfo = (OrderModifyRequestShipToInfo) o;
    return Objects.equals(this.addressId, orderModifyRequestShipToInfo.addressId) &&
        Objects.equals(this.contact, orderModifyRequestShipToInfo.contact) &&
        Objects.equals(this.companyName, orderModifyRequestShipToInfo.companyName) &&
        Objects.equals(this.name1, orderModifyRequestShipToInfo.name1) &&
        Objects.equals(this.name2, orderModifyRequestShipToInfo.name2) &&
        Objects.equals(this.addressLine1, orderModifyRequestShipToInfo.addressLine1) &&
        Objects.equals(this.addressLine2, orderModifyRequestShipToInfo.addressLine2) &&
        Objects.equals(this.addressLine3, orderModifyRequestShipToInfo.addressLine3) &&
        Objects.equals(this.city, orderModifyRequestShipToInfo.city) &&
        Objects.equals(this.state, orderModifyRequestShipToInfo.state) &&
        Objects.equals(this.postalCode, orderModifyRequestShipToInfo.postalCode) &&
        Objects.equals(this.countryCode, orderModifyRequestShipToInfo.countryCode) &&
        Objects.equals(this.phoneNumber, orderModifyRequestShipToInfo.phoneNumber) &&
        Objects.equals(this.email, orderModifyRequestShipToInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, contact, companyName, name1, name2, addressLine1, addressLine2, addressLine3, city, state, postalCode, countryCode, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequestShipToInfo {\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
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
    openapiFields.add("addressId");
    openapiFields.add("contact");
    openapiFields.add("companyName");
    openapiFields.add("name1");
    openapiFields.add("name2");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("addressLine3");
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
  * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequestShipToInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequestShipToInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequestShipToInfo is not found in the empty JSON string", OrderModifyRequestShipToInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequestShipToInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequestShipToInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("addressId") != null && !jsonObj.get("addressId").isJsonNull()) && !jsonObj.get("addressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressId").toString()));
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
       if (!OrderModifyRequestShipToInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequestShipToInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequestShipToInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequestShipToInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequestShipToInfo>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequestShipToInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequestShipToInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderModifyRequestShipToInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderModifyRequestShipToInfo
  * @throws IOException if the JSON string is invalid with respect to OrderModifyRequestShipToInfo
  */
  public static OrderModifyRequestShipToInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequestShipToInfo.class);
  }

 /**
  * Convert an instance of OrderModifyRequestShipToInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

