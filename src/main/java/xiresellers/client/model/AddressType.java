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
 * Address type object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class AddressType {
  public static final String SERIALIZED_NAME_ATTENTION = "attention";
  @SerializedName(SERIALIZED_NAME_ATTENTION)
  private String attention;

  public static final String SERIALIZED_NAME_NAME1 = "name1";
  @SerializedName(SERIALIZED_NAME_NAME1)
  private String name1;

  public static final String SERIALIZED_NAME_NAME2 = "name2";
  @SerializedName(SERIALIZED_NAME_NAME2)
  private String name2;

  public static final String SERIALIZED_NAME_ADDRESSLINE1 = "addressline1";
  @SerializedName(SERIALIZED_NAME_ADDRESSLINE1)
  private String addressline1;

  public static final String SERIALIZED_NAME_ADDRESSLINE2 = "addressline2";
  @SerializedName(SERIALIZED_NAME_ADDRESSLINE2)
  private String addressline2;

  public static final String SERIALIZED_NAME_ADDRESSLINE3 = "addressline3";
  @SerializedName(SERIALIZED_NAME_ADDRESSLINE3)
  private String addressline3;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTALCODE = "postalcode";
  @SerializedName(SERIALIZED_NAME_POSTALCODE)
  private String postalcode;

  public static final String SERIALIZED_NAME_COUNTRYCODE = "countrycode";
  @SerializedName(SERIALIZED_NAME_COUNTRYCODE)
  private String countrycode;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_PHONENUMBER = "phonenumber";
  @SerializedName(SERIALIZED_NAME_PHONENUMBER)
  private String phonenumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public AddressType() {
  }

  public AddressType attention(String attention) {
    this.attention = attention;
    return this;
  }

   /**
   * Get attention
   * @return attention
  **/
  @javax.annotation.Nullable
  public String getAttention() {
    return attention;
  }

  public void setAttention(String attention) {
    this.attention = attention;
  }


  public AddressType name1(String name1) {
    this.name1 = name1;
    return this;
  }

   /**
   * Get name1
   * @return name1
  **/
  @javax.annotation.Nullable
  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }


  public AddressType name2(String name2) {
    this.name2 = name2;
    return this;
  }

   /**
   * Get name2
   * @return name2
  **/
  @javax.annotation.Nullable
  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }


  public AddressType addressline1(String addressline1) {
    this.addressline1 = addressline1;
    return this;
  }

   /**
   * Get addressline1
   * @return addressline1
  **/
  @javax.annotation.Nullable
  public String getAddressline1() {
    return addressline1;
  }

  public void setAddressline1(String addressline1) {
    this.addressline1 = addressline1;
  }


  public AddressType addressline2(String addressline2) {
    this.addressline2 = addressline2;
    return this;
  }

   /**
   * Get addressline2
   * @return addressline2
  **/
  @javax.annotation.Nullable
  public String getAddressline2() {
    return addressline2;
  }

  public void setAddressline2(String addressline2) {
    this.addressline2 = addressline2;
  }


  public AddressType addressline3(String addressline3) {
    this.addressline3 = addressline3;
    return this;
  }

   /**
   * Get addressline3
   * @return addressline3
  **/
  @javax.annotation.Nullable
  public String getAddressline3() {
    return addressline3;
  }

  public void setAddressline3(String addressline3) {
    this.addressline3 = addressline3;
  }


  public AddressType city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public AddressType state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public AddressType postalcode(String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

   /**
   * Get postalcode
   * @return postalcode
  **/
  @javax.annotation.Nullable
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }


  public AddressType countrycode(String countrycode) {
    this.countrycode = countrycode;
    return this;
  }

   /**
   * Get countrycode
   * @return countrycode
  **/
  @javax.annotation.Nullable
  public String getCountrycode() {
    return countrycode;
  }

  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }


  public AddressType fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @javax.annotation.Nullable
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public AddressType phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

   /**
   * Get phonenumber
   * @return phonenumber
  **/
  @javax.annotation.Nullable
  public String getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }


  public AddressType email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
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
    AddressType addressType = (AddressType) o;
    return Objects.equals(this.attention, addressType.attention) &&
        Objects.equals(this.name1, addressType.name1) &&
        Objects.equals(this.name2, addressType.name2) &&
        Objects.equals(this.addressline1, addressType.addressline1) &&
        Objects.equals(this.addressline2, addressType.addressline2) &&
        Objects.equals(this.addressline3, addressType.addressline3) &&
        Objects.equals(this.city, addressType.city) &&
        Objects.equals(this.state, addressType.state) &&
        Objects.equals(this.postalcode, addressType.postalcode) &&
        Objects.equals(this.countrycode, addressType.countrycode) &&
        Objects.equals(this.fax, addressType.fax) &&
        Objects.equals(this.phonenumber, addressType.phonenumber) &&
        Objects.equals(this.email, addressType.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attention, name1, name2, addressline1, addressline2, addressline3, city, state, postalcode, countrycode, fax, phonenumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressType {\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    addressline1: ").append(toIndentedString(addressline1)).append("\n");
    sb.append("    addressline2: ").append(toIndentedString(addressline2)).append("\n");
    sb.append("    addressline3: ").append(toIndentedString(addressline3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    countrycode: ").append(toIndentedString(countrycode)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
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
    openapiFields.add("attention");
    openapiFields.add("name1");
    openapiFields.add("name2");
    openapiFields.add("addressline1");
    openapiFields.add("addressline2");
    openapiFields.add("addressline3");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postalcode");
    openapiFields.add("countrycode");
    openapiFields.add("fax");
    openapiFields.add("phonenumber");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressType
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressType is not found in the empty JSON string", AddressType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddressType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attention") != null && !jsonObj.get("attention").isJsonNull()) && !jsonObj.get("attention").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attention` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attention").toString()));
      }
      if ((jsonObj.get("name1") != null && !jsonObj.get("name1").isJsonNull()) && !jsonObj.get("name1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name1").toString()));
      }
      if ((jsonObj.get("name2") != null && !jsonObj.get("name2").isJsonNull()) && !jsonObj.get("name2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name2").toString()));
      }
      if ((jsonObj.get("addressline1") != null && !jsonObj.get("addressline1").isJsonNull()) && !jsonObj.get("addressline1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressline1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressline1").toString()));
      }
      if ((jsonObj.get("addressline2") != null && !jsonObj.get("addressline2").isJsonNull()) && !jsonObj.get("addressline2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressline2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressline2").toString()));
      }
      if ((jsonObj.get("addressline3") != null && !jsonObj.get("addressline3").isJsonNull()) && !jsonObj.get("addressline3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressline3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressline3").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("postalcode") != null && !jsonObj.get("postalcode").isJsonNull()) && !jsonObj.get("postalcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalcode").toString()));
      }
      if ((jsonObj.get("countrycode") != null && !jsonObj.get("countrycode").isJsonNull()) && !jsonObj.get("countrycode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countrycode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countrycode").toString()));
      }
      if ((jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull()) && !jsonObj.get("fax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      if ((jsonObj.get("phonenumber") != null && !jsonObj.get("phonenumber").isJsonNull()) && !jsonObj.get("phonenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phonenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phonenumber").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressType.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressType>() {
           @Override
           public void write(JsonWriter out, AddressType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressType
  * @throws IOException if the JSON string is invalid with respect to AddressType
  */
  public static AddressType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressType.class);
  }

 /**
  * Convert an instance of AddressType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
