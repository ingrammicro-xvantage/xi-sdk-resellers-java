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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T08:44:05.228708Z[Etc/UTC]")
public class OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo {
  public static final String SERIALIZED_NAME_LICENSE_NUMBER = "licenseNumber";
  @SerializedName(SERIALIZED_NAME_LICENSE_NUMBER)
  private List<String> licenseNumber;

  public static final String SERIALIZED_NAME_LICENSE_START_DATE = "licenseStartDate";
  @SerializedName(SERIALIZED_NAME_LICENSE_START_DATE)
  private String licenseStartDate;

  public static final String SERIALIZED_NAME_LICENSE_END_DATE = "licenseEndDate";
  @SerializedName(SERIALIZED_NAME_LICENSE_END_DATE)
  private String licenseEndDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo() {
  }

  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo licenseNumber(List<String> licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo addLicenseNumberItem(String licenseNumberItem) {
    if (this.licenseNumber == null) {
      this.licenseNumber = new ArrayList<>();
    }
    this.licenseNumber.add(licenseNumberItem);
    return this;
  }

   /**
   * License numbers.
   * @return licenseNumber
  **/
  @javax.annotation.Nullable
  public List<String> getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(List<String> licenseNumber) {
    this.licenseNumber = licenseNumber;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo licenseStartDate(String licenseStartDate) {
    this.licenseStartDate = licenseStartDate;
    return this;
  }

   /**
   * Start Date of the license.
   * @return licenseStartDate
  **/
  @javax.annotation.Nullable
  public String getLicenseStartDate() {
    return licenseStartDate;
  }

  public void setLicenseStartDate(String licenseStartDate) {
    this.licenseStartDate = licenseStartDate;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo licenseEndDate(String licenseEndDate) {
    this.licenseEndDate = licenseEndDate;
    return this;
  }

   /**
   * End Date of the license.
   * @return licenseEndDate
  **/
  @javax.annotation.Nullable
  public String getLicenseEndDate() {
    return licenseEndDate;
  }

  public void setLicenseEndDate(String licenseEndDate) {
    this.licenseEndDate = licenseEndDate;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the license.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the license.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo orderDetailB2BLinesInnerServiceContractInfoLicenseInfo = (OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo) o;
    return Objects.equals(this.licenseNumber, orderDetailB2BLinesInnerServiceContractInfoLicenseInfo.licenseNumber) &&
        Objects.equals(this.licenseStartDate, orderDetailB2BLinesInnerServiceContractInfoLicenseInfo.licenseStartDate) &&
        Objects.equals(this.licenseEndDate, orderDetailB2BLinesInnerServiceContractInfoLicenseInfo.licenseEndDate) &&
        Objects.equals(this.description, orderDetailB2BLinesInnerServiceContractInfoLicenseInfo.description) &&
        Objects.equals(this.quantity, orderDetailB2BLinesInnerServiceContractInfoLicenseInfo.quantity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseNumber, licenseStartDate, licenseEndDate, description, quantity);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo {\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    licenseStartDate: ").append(toIndentedString(licenseStartDate)).append("\n");
    sb.append("    licenseEndDate: ").append(toIndentedString(licenseEndDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("licenseNumber");
    openapiFields.add("licenseStartDate");
    openapiFields.add("licenseEndDate");
    openapiFields.add("description");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo is not found in the empty JSON string", OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("licenseNumber") != null && !jsonObj.get("licenseNumber").isJsonNull() && !jsonObj.get("licenseNumber").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseNumber` to be an array in the JSON string but got `%s`", jsonObj.get("licenseNumber").toString()));
      }
      if ((jsonObj.get("licenseStartDate") != null && !jsonObj.get("licenseStartDate").isJsonNull()) && !jsonObj.get("licenseStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseStartDate").toString()));
      }
      if ((jsonObj.get("licenseEndDate") != null && !jsonObj.get("licenseEndDate").isJsonNull()) && !jsonObj.get("licenseEndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseEndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseEndDate").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull()) && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo
  */
  public static OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

