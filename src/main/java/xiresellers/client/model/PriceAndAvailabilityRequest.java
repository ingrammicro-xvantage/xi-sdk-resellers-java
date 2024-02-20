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
import xiresellers.client.model.PriceAndAvailabilityRequestAdditionalAttributesInner;
import xiresellers.client.model.PriceAndAvailabilityRequestAvailabilityByWarehouseInner;
import xiresellers.client.model.PriceAndAvailabilityRequestProductsInner;

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
 * PriceAndAvailabilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T11:18:10.423898Z[Etc/UTC]")
public class PriceAndAvailabilityRequest {
  public static final String SERIALIZED_NAME_SHOW_AVAILABLE_DISCOUNTS = "showAvailableDiscounts";
  @SerializedName(SERIALIZED_NAME_SHOW_AVAILABLE_DISCOUNTS)
  private Boolean showAvailableDiscounts;

  public static final String SERIALIZED_NAME_SHOW_RESERVE_INVENTORY_DETAILS = "showReserveInventoryDetails";
  @SerializedName(SERIALIZED_NAME_SHOW_RESERVE_INVENTORY_DETAILS)
  private Boolean showReserveInventoryDetails;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_AVAILABILITY_BY_WAREHOUSE = "availabilityByWarehouse";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_BY_WAREHOUSE)
  private List<PriceAndAvailabilityRequestAvailabilityByWarehouseInner> availabilityByWarehouse;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<PriceAndAvailabilityRequestProductsInner> products;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<PriceAndAvailabilityRequestAdditionalAttributesInner> additionalAttributes;

  public PriceAndAvailabilityRequest() {
  }

  public PriceAndAvailabilityRequest showAvailableDiscounts(Boolean showAvailableDiscounts) {
    this.showAvailableDiscounts = showAvailableDiscounts;
    return this;
  }

   /**
   * Boolean value that will display Discount details in the response when true.
   * @return showAvailableDiscounts
  **/
  @javax.annotation.Nullable
  public Boolean getShowAvailableDiscounts() {
    return showAvailableDiscounts;
  }

  public void setShowAvailableDiscounts(Boolean showAvailableDiscounts) {
    this.showAvailableDiscounts = showAvailableDiscounts;
  }


  public PriceAndAvailabilityRequest showReserveInventoryDetails(Boolean showReserveInventoryDetails) {
    this.showReserveInventoryDetails = showReserveInventoryDetails;
    return this;
  }

   /**
   * Boolean value that will display reserve inventory details in the response when true.
   * @return showReserveInventoryDetails
  **/
  @javax.annotation.Nullable
  public Boolean getShowReserveInventoryDetails() {
    return showReserveInventoryDetails;
  }

  public void setShowReserveInventoryDetails(Boolean showReserveInventoryDetails) {
    this.showReserveInventoryDetails = showReserveInventoryDetails;
  }


  public PriceAndAvailabilityRequest specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * Pre-approved special pricing/bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number where different line items have different bid numbers.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public PriceAndAvailabilityRequest availabilityByWarehouse(List<PriceAndAvailabilityRequestAvailabilityByWarehouseInner> availabilityByWarehouse) {
    this.availabilityByWarehouse = availabilityByWarehouse;
    return this;
  }

  public PriceAndAvailabilityRequest addAvailabilityByWarehouseItem(PriceAndAvailabilityRequestAvailabilityByWarehouseInner availabilityByWarehouseItem) {
    if (this.availabilityByWarehouse == null) {
      this.availabilityByWarehouse = new ArrayList<>();
    }
    this.availabilityByWarehouse.add(availabilityByWarehouseItem);
    return this;
  }

   /**
   * Get availabilityByWarehouse
   * @return availabilityByWarehouse
  **/
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityRequestAvailabilityByWarehouseInner> getAvailabilityByWarehouse() {
    return availabilityByWarehouse;
  }

  public void setAvailabilityByWarehouse(List<PriceAndAvailabilityRequestAvailabilityByWarehouseInner> availabilityByWarehouse) {
    this.availabilityByWarehouse = availabilityByWarehouse;
  }


  public PriceAndAvailabilityRequest products(List<PriceAndAvailabilityRequestProductsInner> products) {
    this.products = products;
    return this;
  }

  public PriceAndAvailabilityRequest addProductsItem(PriceAndAvailabilityRequestProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityRequestProductsInner> getProducts() {
    return products;
  }

  public void setProducts(List<PriceAndAvailabilityRequestProductsInner> products) {
    this.products = products;
  }


  public PriceAndAvailabilityRequest additionalAttributes(List<PriceAndAvailabilityRequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public PriceAndAvailabilityRequest addAdditionalAttributesItem(PriceAndAvailabilityRequestAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Get additionalAttributes
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityRequestAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<PriceAndAvailabilityRequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityRequest priceAndAvailabilityRequest = (PriceAndAvailabilityRequest) o;
    return Objects.equals(this.showAvailableDiscounts, priceAndAvailabilityRequest.showAvailableDiscounts) &&
        Objects.equals(this.showReserveInventoryDetails, priceAndAvailabilityRequest.showReserveInventoryDetails) &&
        Objects.equals(this.specialBidNumber, priceAndAvailabilityRequest.specialBidNumber) &&
        Objects.equals(this.availabilityByWarehouse, priceAndAvailabilityRequest.availabilityByWarehouse) &&
        Objects.equals(this.products, priceAndAvailabilityRequest.products) &&
        Objects.equals(this.additionalAttributes, priceAndAvailabilityRequest.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showAvailableDiscounts, showReserveInventoryDetails, specialBidNumber, availabilityByWarehouse, products, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityRequest {\n");
    sb.append("    showAvailableDiscounts: ").append(toIndentedString(showAvailableDiscounts)).append("\n");
    sb.append("    showReserveInventoryDetails: ").append(toIndentedString(showReserveInventoryDetails)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    availabilityByWarehouse: ").append(toIndentedString(availabilityByWarehouse)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("showAvailableDiscounts");
    openapiFields.add("showReserveInventoryDetails");
    openapiFields.add("specialBidNumber");
    openapiFields.add("availabilityByWarehouse");
    openapiFields.add("products");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityRequest is not found in the empty JSON string", PriceAndAvailabilityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if (jsonObj.get("availabilityByWarehouse") != null && !jsonObj.get("availabilityByWarehouse").isJsonNull()) {
        JsonArray jsonArrayavailabilityByWarehouse = jsonObj.getAsJsonArray("availabilityByWarehouse");
        if (jsonArrayavailabilityByWarehouse != null) {
          // ensure the json data is an array
          if (!jsonObj.get("availabilityByWarehouse").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `availabilityByWarehouse` to be an array in the JSON string but got `%s`", jsonObj.get("availabilityByWarehouse").toString()));
          }

          // validate the optional field `availabilityByWarehouse` (array)
          for (int i = 0; i < jsonArrayavailabilityByWarehouse.size(); i++) {
            PriceAndAvailabilityRequestAvailabilityByWarehouseInner.validateJsonElement(jsonArrayavailabilityByWarehouse.get(i));
          };
        }
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            PriceAndAvailabilityRequestProductsInner.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            PriceAndAvailabilityRequestAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityRequest>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceAndAvailabilityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceAndAvailabilityRequest
  * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityRequest
  */
  public static PriceAndAvailabilityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityRequest.class);
  }

 /**
  * Convert an instance of PriceAndAvailabilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

