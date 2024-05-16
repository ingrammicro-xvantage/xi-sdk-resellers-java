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
import xiresellers.client.model.ProductSearchResponseCatalogInnerLinksInner;

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
 * ProductSearchResponseCatalogInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T06:51:51.114588Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class ProductSearchResponseCatalogInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_SUB_CATEGORY = "subCategory";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private String subCategory;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "productType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private String productType;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_UPC_CODE = "upcCode";
  @SerializedName(SERIALIZED_NAME_UPC_CODE)
  private String upcCode;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_END_USER_REQUIRED = "endUserRequired";
  @SerializedName(SERIALIZED_NAME_END_USER_REQUIRED)
  private String endUserRequired;

  public static final String SERIALIZED_NAME_HAS_DISCOUNTS = "hasDiscounts";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNTS)
  private String hasDiscounts;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DISCONTINUED = "discontinued";
  @SerializedName(SERIALIZED_NAME_DISCONTINUED)
  private String discontinued;

  public static final String SERIALIZED_NAME_NEW_PRODUCT = "newProduct";
  @SerializedName(SERIALIZED_NAME_NEW_PRODUCT)
  private String newProduct;

  public static final String SERIALIZED_NAME_DIRECT_SHIP = "directShip";
  @SerializedName(SERIALIZED_NAME_DIRECT_SHIP)
  private String directShip;

  public static final String SERIALIZED_NAME_HAS_WARRANTY = "hasWarranty";
  @SerializedName(SERIALIZED_NAME_HAS_WARRANTY)
  private String hasWarranty;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ProductSearchResponseCatalogInnerLinksInner> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTRA_DESCRIPTION = "extraDescription";
  @SerializedName(SERIALIZED_NAME_EXTRA_DESCRIPTION)
  private String extraDescription;

  public static final String SERIALIZED_NAME_REPLACEMENT_SKU = "replacementSku";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_SKU)
  private String replacementSku;

  public static final String SERIALIZED_NAME_AUTHORIZED_TO_PURCHASE = "authorizedToPurchase";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_TO_PURCHASE)
  private String authorizedToPurchase;

  public ProductSearchResponseCatalogInner() {
  }

  public ProductSearchResponseCatalogInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the product.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ProductSearchResponseCatalogInner category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the product. Example: Displays.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public ProductSearchResponseCatalogInner subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

   /**
   * The sub category for the product. Example: ComputernMonitors.
   * @return subCategory
  **/
  @javax.annotation.Nullable
  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  public ProductSearchResponseCatalogInner productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The product type of the product. Example: LCD Monitors.
   * @return productType
  **/
  @javax.annotation.Nullable
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }


  public ProductSearchResponseCatalogInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * The Unique IngramMicro part number for the product.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public ProductSearchResponseCatalogInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendor part number for the product.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public ProductSearchResponseCatalogInner upcCode(String upcCode) {
    this.upcCode = upcCode;
    return this;
  }

   /**
   * The UPC code for the product. Consists of 12 numeric digits that are uniquly assigned to each trade item.
   * @return upcCode
  **/
  @javax.annotation.Nullable
  public String getUpcCode() {
    return upcCode;
  }

  public void setUpcCode(String upcCode) {
    this.upcCode = upcCode;
  }


  public ProductSearchResponseCatalogInner vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * The name of the vendor/manufacturer of the product.
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public ProductSearchResponseCatalogInner endUserRequired(String endUserRequired) {
    this.endUserRequired = endUserRequired;
    return this;
  }

   /**
   * Indicates whether the contact information for the end user/customer is required, which determines pricing and discounts.
   * @return endUserRequired
  **/
  @javax.annotation.Nullable
  public String getEndUserRequired() {
    return endUserRequired;
  }

  public void setEndUserRequired(String endUserRequired) {
    this.endUserRequired = endUserRequired;
  }


  public ProductSearchResponseCatalogInner hasDiscounts(String hasDiscounts) {
    this.hasDiscounts = hasDiscounts;
    return this;
  }

   /**
   * Specifies if there are discounts available for the product.
   * @return hasDiscounts
  **/
  @javax.annotation.Nullable
  public String getHasDiscounts() {
    return hasDiscounts;
  }

  public void setHasDiscounts(String hasDiscounts) {
    this.hasDiscounts = hasDiscounts;
  }


  public ProductSearchResponseCatalogInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The SKU type of product. One of Physical, Digital, or Any.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public ProductSearchResponseCatalogInner discontinued(String discontinued) {
    this.discontinued = discontinued;
    return this;
  }

   /**
   * Indicates if the product has been discontinued.
   * @return discontinued
  **/
  @javax.annotation.Nullable
  public String getDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(String discontinued) {
    this.discontinued = discontinued;
  }


  public ProductSearchResponseCatalogInner newProduct(String newProduct) {
    this.newProduct = newProduct;
    return this;
  }

   /**
   * Indicates if the product is new. For digital products, newer than 10 days. For physical products, newer than 150 days.
   * @return newProduct
  **/
  @javax.annotation.Nullable
  public String getNewProduct() {
    return newProduct;
  }

  public void setNewProduct(String newProduct) {
    this.newProduct = newProduct;
  }


  public ProductSearchResponseCatalogInner directShip(String directShip) {
    this.directShip = directShip;
    return this;
  }

   /**
   * Indicates if the product will be shipped directly to the reseller or end user from the vendor/manufacturer.
   * @return directShip
  **/
  @javax.annotation.Nullable
  public String getDirectShip() {
    return directShip;
  }

  public void setDirectShip(String directShip) {
    this.directShip = directShip;
  }


  public ProductSearchResponseCatalogInner hasWarranty(String hasWarranty) {
    this.hasWarranty = hasWarranty;
    return this;
  }

   /**
   * Indicates if the product has a warranty.
   * @return hasWarranty
  **/
  @javax.annotation.Nullable
  public String getHasWarranty() {
    return hasWarranty;
  }

  public void setHasWarranty(String hasWarranty) {
    this.hasWarranty = hasWarranty;
  }


  public ProductSearchResponseCatalogInner links(List<ProductSearchResponseCatalogInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public ProductSearchResponseCatalogInner addLinksItem(ProductSearchResponseCatalogInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public List<ProductSearchResponseCatalogInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<ProductSearchResponseCatalogInnerLinksInner> links) {
    this.links = links;
  }


  public ProductSearchResponseCatalogInner extraDescription(String extraDescription) {
    this.extraDescription = extraDescription;
    return this;
  }

   /**
   * The extended description of the product.
   * @return extraDescription
  **/
  @javax.annotation.Nullable
  public String getExtraDescription() {
    return extraDescription;
  }

  public void setExtraDescription(String extraDescription) {
    this.extraDescription = extraDescription;
  }


  public ProductSearchResponseCatalogInner replacementSku(String replacementSku) {
    this.replacementSku = replacementSku;
    return this;
  }

   /**
   * Identifies a SKU that is a comparable subsititution of the current SKU if available.
   * @return replacementSku
  **/
  @javax.annotation.Nullable
  public String getReplacementSku() {
    return replacementSku;
  }

  public void setReplacementSku(String replacementSku) {
    this.replacementSku = replacementSku;
  }


  public ProductSearchResponseCatalogInner authorizedToPurchase(String authorizedToPurchase) {
    this.authorizedToPurchase = authorizedToPurchase;
    return this;
  }

   /**
   * It is true when it exists in matched queries field of ealstic search API.
   * @return authorizedToPurchase
  **/
  @javax.annotation.Nullable
  public String getAuthorizedToPurchase() {
    return authorizedToPurchase;
  }

  public void setAuthorizedToPurchase(String authorizedToPurchase) {
    this.authorizedToPurchase = authorizedToPurchase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchResponseCatalogInner productSearchResponseCatalogInner = (ProductSearchResponseCatalogInner) o;
    return Objects.equals(this.description, productSearchResponseCatalogInner.description) &&
        Objects.equals(this.category, productSearchResponseCatalogInner.category) &&
        Objects.equals(this.subCategory, productSearchResponseCatalogInner.subCategory) &&
        Objects.equals(this.productType, productSearchResponseCatalogInner.productType) &&
        Objects.equals(this.ingramPartNumber, productSearchResponseCatalogInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, productSearchResponseCatalogInner.vendorPartNumber) &&
        Objects.equals(this.upcCode, productSearchResponseCatalogInner.upcCode) &&
        Objects.equals(this.vendorName, productSearchResponseCatalogInner.vendorName) &&
        Objects.equals(this.endUserRequired, productSearchResponseCatalogInner.endUserRequired) &&
        Objects.equals(this.hasDiscounts, productSearchResponseCatalogInner.hasDiscounts) &&
        Objects.equals(this.type, productSearchResponseCatalogInner.type) &&
        Objects.equals(this.discontinued, productSearchResponseCatalogInner.discontinued) &&
        Objects.equals(this.newProduct, productSearchResponseCatalogInner.newProduct) &&
        Objects.equals(this.directShip, productSearchResponseCatalogInner.directShip) &&
        Objects.equals(this.hasWarranty, productSearchResponseCatalogInner.hasWarranty) &&
        Objects.equals(this.links, productSearchResponseCatalogInner.links) &&
        Objects.equals(this.extraDescription, productSearchResponseCatalogInner.extraDescription) &&
        Objects.equals(this.replacementSku, productSearchResponseCatalogInner.replacementSku) &&
        Objects.equals(this.authorizedToPurchase, productSearchResponseCatalogInner.authorizedToPurchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, category, subCategory, productType, ingramPartNumber, vendorPartNumber, upcCode, vendorName, endUserRequired, hasDiscounts, type, discontinued, newProduct, directShip, hasWarranty, links, extraDescription, replacementSku, authorizedToPurchase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSearchResponseCatalogInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    upcCode: ").append(toIndentedString(upcCode)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    endUserRequired: ").append(toIndentedString(endUserRequired)).append("\n");
    sb.append("    hasDiscounts: ").append(toIndentedString(hasDiscounts)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    discontinued: ").append(toIndentedString(discontinued)).append("\n");
    sb.append("    newProduct: ").append(toIndentedString(newProduct)).append("\n");
    sb.append("    directShip: ").append(toIndentedString(directShip)).append("\n");
    sb.append("    hasWarranty: ").append(toIndentedString(hasWarranty)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    extraDescription: ").append(toIndentedString(extraDescription)).append("\n");
    sb.append("    replacementSku: ").append(toIndentedString(replacementSku)).append("\n");
    sb.append("    authorizedToPurchase: ").append(toIndentedString(authorizedToPurchase)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("category");
    openapiFields.add("subCategory");
    openapiFields.add("productType");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("upcCode");
    openapiFields.add("vendorName");
    openapiFields.add("endUserRequired");
    openapiFields.add("hasDiscounts");
    openapiFields.add("type");
    openapiFields.add("discontinued");
    openapiFields.add("newProduct");
    openapiFields.add("directShip");
    openapiFields.add("hasWarranty");
    openapiFields.add("links");
    openapiFields.add("extraDescription");
    openapiFields.add("replacementSku");
    openapiFields.add("authorizedToPurchase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductSearchResponseCatalogInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductSearchResponseCatalogInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchResponseCatalogInner is not found in the empty JSON string", ProductSearchResponseCatalogInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductSearchResponseCatalogInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchResponseCatalogInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("subCategory") != null && !jsonObj.get("subCategory").isJsonNull()) && !jsonObj.get("subCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subCategory").toString()));
      }
      if ((jsonObj.get("productType") != null && !jsonObj.get("productType").isJsonNull()) && !jsonObj.get("productType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productType").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("upcCode") != null && !jsonObj.get("upcCode").isJsonNull()) && !jsonObj.get("upcCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upcCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upcCode").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("endUserRequired") != null && !jsonObj.get("endUserRequired").isJsonNull()) && !jsonObj.get("endUserRequired").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserRequired` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserRequired").toString()));
      }
      if ((jsonObj.get("hasDiscounts") != null && !jsonObj.get("hasDiscounts").isJsonNull()) && !jsonObj.get("hasDiscounts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hasDiscounts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hasDiscounts").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("discontinued") != null && !jsonObj.get("discontinued").isJsonNull()) && !jsonObj.get("discontinued").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discontinued` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discontinued").toString()));
      }
      if ((jsonObj.get("newProduct") != null && !jsonObj.get("newProduct").isJsonNull()) && !jsonObj.get("newProduct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newProduct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newProduct").toString()));
      }
      if ((jsonObj.get("directShip") != null && !jsonObj.get("directShip").isJsonNull()) && !jsonObj.get("directShip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directShip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directShip").toString()));
      }
      if ((jsonObj.get("hasWarranty") != null && !jsonObj.get("hasWarranty").isJsonNull()) && !jsonObj.get("hasWarranty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hasWarranty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hasWarranty").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            ProductSearchResponseCatalogInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
      if ((jsonObj.get("extraDescription") != null && !jsonObj.get("extraDescription").isJsonNull()) && !jsonObj.get("extraDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extraDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extraDescription").toString()));
      }
      if ((jsonObj.get("replacementSku") != null && !jsonObj.get("replacementSku").isJsonNull()) && !jsonObj.get("replacementSku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacementSku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacementSku").toString()));
      }
      if ((jsonObj.get("authorizedToPurchase") != null && !jsonObj.get("authorizedToPurchase").isJsonNull()) && !jsonObj.get("authorizedToPurchase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizedToPurchase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorizedToPurchase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchResponseCatalogInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchResponseCatalogInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchResponseCatalogInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchResponseCatalogInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchResponseCatalogInner>() {
           @Override
           public void write(JsonWriter out, ProductSearchResponseCatalogInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchResponseCatalogInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSearchResponseCatalogInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSearchResponseCatalogInner
  * @throws IOException if the JSON string is invalid with respect to ProductSearchResponseCatalogInner
  */
  public static ProductSearchResponseCatalogInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchResponseCatalogInner.class);
  }

 /**
  * Convert an instance of ProductSearchResponseCatalogInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

