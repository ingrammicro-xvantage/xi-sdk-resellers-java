/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of APIs and webhooks to craft a seamless journey for your customers.
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
 * Indicators of the Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T10:46:33.700889Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductDetailResponseIndicators {
  public static final String SERIALIZED_NAME_HAS_WARRANTY = "hasWarranty";
  @SerializedName(SERIALIZED_NAME_HAS_WARRANTY)
  private Boolean hasWarranty;

  public static final String SERIALIZED_NAME_IS_NEW_PRODUCT = "isNewProduct";
  @SerializedName(SERIALIZED_NAME_IS_NEW_PRODUCT)
  private Boolean isNewProduct;

  public static final String SERIALIZED_NAME_HAS_RETURN_LIMITS = "hasReturnLimits";
  @SerializedName(SERIALIZED_NAME_HAS_RETURN_LIMITS)
  private Boolean hasReturnLimits;

  public static final String SERIALIZED_NAME_IS_BACK_ORDER_ALLOWED = "isBackOrderAllowed";
  @SerializedName(SERIALIZED_NAME_IS_BACK_ORDER_ALLOWED)
  private Boolean isBackOrderAllowed;

  public static final String SERIALIZED_NAME_IS_SHIPPED_FROM_PARTNER = "isShippedFromPartner";
  @SerializedName(SERIALIZED_NAME_IS_SHIPPED_FROM_PARTNER)
  private Boolean isShippedFromPartner;

  public static final String SERIALIZED_NAME_IS_REPLACEMENT_PRODUCT = "isReplacementProduct";
  @SerializedName(SERIALIZED_NAME_IS_REPLACEMENT_PRODUCT)
  private Boolean isReplacementProduct;

  public static final String SERIALIZED_NAME_REPLACEMENT_TYPE = "replacementType";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_TYPE)
  private String replacementType;

  public static final String SERIALIZED_NAME_IS_DIRECTSHIP = "isDirectship";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTSHIP)
  private Boolean isDirectship;

  public static final String SERIALIZED_NAME_IS_DOWNLOADABLE = "isDownloadable";
  @SerializedName(SERIALIZED_NAME_IS_DOWNLOADABLE)
  private Boolean isDownloadable;

  public static final String SERIALIZED_NAME_IS_DIGITAL_TYPE = "isDigitalType";
  @SerializedName(SERIALIZED_NAME_IS_DIGITAL_TYPE)
  private Boolean isDigitalType;

  public static final String SERIALIZED_NAME_SKU_TYPE = "skuType";
  @SerializedName(SERIALIZED_NAME_SKU_TYPE)
  private String skuType;

  public static final String SERIALIZED_NAME_HAS_STD_SPECIAL_PRICE = "hasStdSpecialPrice";
  @SerializedName(SERIALIZED_NAME_HAS_STD_SPECIAL_PRICE)
  private Boolean hasStdSpecialPrice;

  public static final String SERIALIZED_NAME_HAS_ACOP_SPECIAL_PRICE = "hasAcopSpecialPrice";
  @SerializedName(SERIALIZED_NAME_HAS_ACOP_SPECIAL_PRICE)
  private Boolean hasAcopSpecialPrice;

  public static final String SERIALIZED_NAME_HAS_ACOP_QUANTITY_BREAK = "hasAcopQuantityBreak";
  @SerializedName(SERIALIZED_NAME_HAS_ACOP_QUANTITY_BREAK)
  private Boolean hasAcopQuantityBreak;

  public static final String SERIALIZED_NAME_HAS_STD_WEB_DISCOUNT = "hasStdWebDiscount";
  @SerializedName(SERIALIZED_NAME_HAS_STD_WEB_DISCOUNT)
  private Boolean hasStdWebDiscount;

  public static final String SERIALIZED_NAME_HAS_ACOP_WEB_DISCOUNT = "hasAcopWebDiscount";
  @SerializedName(SERIALIZED_NAME_HAS_ACOP_WEB_DISCOUNT)
  private Boolean hasAcopWebDiscount;

  public static final String SERIALIZED_NAME_HAS_SPECIAL_BID = "hasSpecialBid";
  @SerializedName(SERIALIZED_NAME_HAS_SPECIAL_BID)
  private Boolean hasSpecialBid;

  public static final String SERIALIZED_NAME_IS_EXPORTABLE_TO_COUNTRY = "isExportableToCountry";
  @SerializedName(SERIALIZED_NAME_IS_EXPORTABLE_TO_COUNTRY)
  private Boolean isExportableToCountry;

  public static final String SERIALIZED_NAME_IS_DISCONTINUED_PRODUCT = "isDiscontinuedProduct";
  @SerializedName(SERIALIZED_NAME_IS_DISCONTINUED_PRODUCT)
  private Boolean isDiscontinuedProduct;

  public static final String SERIALIZED_NAME_IS_REFURBISHED = "isRefurbished";
  @SerializedName(SERIALIZED_NAME_IS_REFURBISHED)
  private Boolean isRefurbished;

  public static final String SERIALIZED_NAME_IS_RETURNABLE_PRODUCT = "isReturnableProduct";
  @SerializedName(SERIALIZED_NAME_IS_RETURNABLE_PRODUCT)
  private Boolean isReturnableProduct;

  public static final String SERIALIZED_NAME_IS_INGRAM_SHIP = "isIngramShip";
  @SerializedName(SERIALIZED_NAME_IS_INGRAM_SHIP)
  private Boolean isIngramShip;

  public static final String SERIALIZED_NAME_IS_ENDUSER_REQUIRED = "isEnduserRequired";
  @SerializedName(SERIALIZED_NAME_IS_ENDUSER_REQUIRED)
  private Boolean isEnduserRequired;

  public static final String SERIALIZED_NAME_IS_HEAVY_WEIGHT = "isHeavyWeight";
  @SerializedName(SERIALIZED_NAME_IS_HEAVY_WEIGHT)
  private Boolean isHeavyWeight;

  public static final String SERIALIZED_NAME_HAS_LTL = "hasLtl";
  @SerializedName(SERIALIZED_NAME_HAS_LTL)
  private Boolean hasLtl;

  public static final String SERIALIZED_NAME_IS_CLEARANCE_PRODUCT = "isClearanceProduct";
  @SerializedName(SERIALIZED_NAME_IS_CLEARANCE_PRODUCT)
  private Boolean isClearanceProduct;

  public static final String SERIALIZED_NAME_HAS_BUNDLE = "hasBundle";
  @SerializedName(SERIALIZED_NAME_HAS_BUNDLE)
  private Boolean hasBundle;

  public static final String SERIALIZED_NAME_IS_OVERSIZE_PRODUCT = "isOversizeProduct";
  @SerializedName(SERIALIZED_NAME_IS_OVERSIZE_PRODUCT)
  private Boolean isOversizeProduct;

  public static final String SERIALIZED_NAME_IS_PREORDER_PRODUCT = "isPreorderProduct";
  @SerializedName(SERIALIZED_NAME_IS_PREORDER_PRODUCT)
  private Boolean isPreorderProduct;

  public static final String SERIALIZED_NAME_IS_LICENSE_PRODUCT = "isLicenseProduct";
  @SerializedName(SERIALIZED_NAME_IS_LICENSE_PRODUCT)
  private Boolean isLicenseProduct;

  public static final String SERIALIZED_NAME_IS_DIRECTSHIP_ORDERABLE = "isDirectshipOrderable";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTSHIP_ORDERABLE)
  private Boolean isDirectshipOrderable;

  public static final String SERIALIZED_NAME_IS_SERVICE_SKU = "isServiceSku";
  @SerializedName(SERIALIZED_NAME_IS_SERVICE_SKU)
  private Boolean isServiceSku;

  public static final String SERIALIZED_NAME_IS_CONFIGURABLE = "isConfigurable";
  @SerializedName(SERIALIZED_NAME_IS_CONFIGURABLE)
  private Boolean isConfigurable;

  public ProductDetailResponseIndicators() {
  }

  public ProductDetailResponseIndicators hasWarranty(Boolean hasWarranty) {
    this.hasWarranty = hasWarranty;
    return this;
  }

   /**
   * Boolean that indicates whether product has a warranty.
   * @return hasWarranty
  **/
  @javax.annotation.Nullable
  public Boolean getHasWarranty() {
    return hasWarranty;
  }

  public void setHasWarranty(Boolean hasWarranty) {
    this.hasWarranty = hasWarranty;
  }


  public ProductDetailResponseIndicators isNewProduct(Boolean isNewProduct) {
    this.isNewProduct = isNewProduct;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a new product. 
   * @return isNewProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsNewProduct() {
    return isNewProduct;
  }

  public void setIsNewProduct(Boolean isNewProduct) {
    this.isNewProduct = isNewProduct;
  }


  public ProductDetailResponseIndicators hasReturnLimits(Boolean hasReturnLimits) {
    this.hasReturnLimits = hasReturnLimits;
    return this;
  }

   /**
   * Boolean that indicates whether there is any limit to return the product.
   * @return hasReturnLimits
  **/
  @javax.annotation.Nullable
  public Boolean getHasReturnLimits() {
    return hasReturnLimits;
  }

  public void setHasReturnLimits(Boolean hasReturnLimits) {
    this.hasReturnLimits = hasReturnLimits;
  }


  public ProductDetailResponseIndicators isBackOrderAllowed(Boolean isBackOrderAllowed) {
    this.isBackOrderAllowed = isBackOrderAllowed;
    return this;
  }

   /**
   * Boolean that indicates whether back order is allowed for the product.
   * @return isBackOrderAllowed
  **/
  @javax.annotation.Nullable
  public Boolean getIsBackOrderAllowed() {
    return isBackOrderAllowed;
  }

  public void setIsBackOrderAllowed(Boolean isBackOrderAllowed) {
    this.isBackOrderAllowed = isBackOrderAllowed;
  }


  public ProductDetailResponseIndicators isShippedFromPartner(Boolean isShippedFromPartner) {
    this.isShippedFromPartner = isShippedFromPartner;
    return this;
  }

   /**
   * Boolean that indicates whether product is shipped from the partner.
   * @return isShippedFromPartner
  **/
  @javax.annotation.Nullable
  public Boolean getIsShippedFromPartner() {
    return isShippedFromPartner;
  }

  public void setIsShippedFromPartner(Boolean isShippedFromPartner) {
    this.isShippedFromPartner = isShippedFromPartner;
  }


  public ProductDetailResponseIndicators isReplacementProduct(Boolean isReplacementProduct) {
    this.isReplacementProduct = isReplacementProduct;
    return this;
  }

   /**
   * Boolean that indicates whether product is a replacement product.
   * @return isReplacementProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsReplacementProduct() {
    return isReplacementProduct;
  }

  public void setIsReplacementProduct(Boolean isReplacementProduct) {
    this.isReplacementProduct = isReplacementProduct;
  }


  public ProductDetailResponseIndicators replacementType(String replacementType) {
    this.replacementType = replacementType;
    return this;
  }

   /**
   * Get replacementType
   * @return replacementType
  **/
  @javax.annotation.Nullable
  public String getReplacementType() {
    return replacementType;
  }

  public void setReplacementType(String replacementType) {
    this.replacementType = replacementType;
  }


  public ProductDetailResponseIndicators isDirectship(Boolean isDirectship) {
    this.isDirectship = isDirectship;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a direct ship product.
   * @return isDirectship
  **/
  @javax.annotation.Nullable
  public Boolean getIsDirectship() {
    return isDirectship;
  }

  public void setIsDirectship(Boolean isDirectship) {
    this.isDirectship = isDirectship;
  }


  public ProductDetailResponseIndicators isDownloadable(Boolean isDownloadable) {
    this.isDownloadable = isDownloadable;
    return this;
  }

   /**
   * Boolean that indicates whether product is downloadable.
   * @return isDownloadable
  **/
  @javax.annotation.Nullable
  public Boolean getIsDownloadable() {
    return isDownloadable;
  }

  public void setIsDownloadable(Boolean isDownloadable) {
    this.isDownloadable = isDownloadable;
  }


  public ProductDetailResponseIndicators isDigitalType(Boolean isDigitalType) {
    this.isDigitalType = isDigitalType;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a digital product. 
   * @return isDigitalType
  **/
  @javax.annotation.Nullable
  public Boolean getIsDigitalType() {
    return isDigitalType;
  }

  public void setIsDigitalType(Boolean isDigitalType) {
    this.isDigitalType = isDigitalType;
  }


  public ProductDetailResponseIndicators skuType(String skuType) {
    this.skuType = skuType;
    return this;
  }

   /**
   * skutype
   * @return skuType
  **/
  @javax.annotation.Nullable
  public String getSkuType() {
    return skuType;
  }

  public void setSkuType(String skuType) {
    this.skuType = skuType;
  }


  public ProductDetailResponseIndicators hasStdSpecialPrice(Boolean hasStdSpecialPrice) {
    this.hasStdSpecialPrice = hasStdSpecialPrice;
    return this;
  }

   /**
   * Boolean that indicates whether product has any standard special price.
   * @return hasStdSpecialPrice
  **/
  @javax.annotation.Nullable
  public Boolean getHasStdSpecialPrice() {
    return hasStdSpecialPrice;
  }

  public void setHasStdSpecialPrice(Boolean hasStdSpecialPrice) {
    this.hasStdSpecialPrice = hasStdSpecialPrice;
  }


  public ProductDetailResponseIndicators hasAcopSpecialPrice(Boolean hasAcopSpecialPrice) {
    this.hasAcopSpecialPrice = hasAcopSpecialPrice;
    return this;
  }

   /**
   * Boolean that indicates whether product has any ACOP special price.
   * @return hasAcopSpecialPrice
  **/
  @javax.annotation.Nullable
  public Boolean getHasAcopSpecialPrice() {
    return hasAcopSpecialPrice;
  }

  public void setHasAcopSpecialPrice(Boolean hasAcopSpecialPrice) {
    this.hasAcopSpecialPrice = hasAcopSpecialPrice;
  }


  public ProductDetailResponseIndicators hasAcopQuantityBreak(Boolean hasAcopQuantityBreak) {
    this.hasAcopQuantityBreak = hasAcopQuantityBreak;
    return this;
  }

   /**
   * Boolean that indicates whether product has any ACOP quantity break.
   * @return hasAcopQuantityBreak
  **/
  @javax.annotation.Nullable
  public Boolean getHasAcopQuantityBreak() {
    return hasAcopQuantityBreak;
  }

  public void setHasAcopQuantityBreak(Boolean hasAcopQuantityBreak) {
    this.hasAcopQuantityBreak = hasAcopQuantityBreak;
  }


  public ProductDetailResponseIndicators hasStdWebDiscount(Boolean hasStdWebDiscount) {
    this.hasStdWebDiscount = hasStdWebDiscount;
    return this;
  }

   /**
   * Boolean that indicates whether product has any standard web discount.
   * @return hasStdWebDiscount
  **/
  @javax.annotation.Nullable
  public Boolean getHasStdWebDiscount() {
    return hasStdWebDiscount;
  }

  public void setHasStdWebDiscount(Boolean hasStdWebDiscount) {
    this.hasStdWebDiscount = hasStdWebDiscount;
  }


  public ProductDetailResponseIndicators hasAcopWebDiscount(Boolean hasAcopWebDiscount) {
    this.hasAcopWebDiscount = hasAcopWebDiscount;
    return this;
  }

   /**
   * Get hasAcopWebDiscount
   * @return hasAcopWebDiscount
  **/
  @javax.annotation.Nullable
  public Boolean getHasAcopWebDiscount() {
    return hasAcopWebDiscount;
  }

  public void setHasAcopWebDiscount(Boolean hasAcopWebDiscount) {
    this.hasAcopWebDiscount = hasAcopWebDiscount;
  }


  public ProductDetailResponseIndicators hasSpecialBid(Boolean hasSpecialBid) {
    this.hasSpecialBid = hasSpecialBid;
    return this;
  }

   /**
   * Boolean that indicates whether product has any special bid.
   * @return hasSpecialBid
  **/
  @javax.annotation.Nullable
  public Boolean getHasSpecialBid() {
    return hasSpecialBid;
  }

  public void setHasSpecialBid(Boolean hasSpecialBid) {
    this.hasSpecialBid = hasSpecialBid;
  }


  public ProductDetailResponseIndicators isExportableToCountry(Boolean isExportableToCountry) {
    this.isExportableToCountry = isExportableToCountry;
    return this;
  }

   /**
   * Boolean that indicates whether product is exportable.
   * @return isExportableToCountry
  **/
  @javax.annotation.Nullable
  public Boolean getIsExportableToCountry() {
    return isExportableToCountry;
  }

  public void setIsExportableToCountry(Boolean isExportableToCountry) {
    this.isExportableToCountry = isExportableToCountry;
  }


  public ProductDetailResponseIndicators isDiscontinuedProduct(Boolean isDiscontinuedProduct) {
    this.isDiscontinuedProduct = isDiscontinuedProduct;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a discontinued product.
   * @return isDiscontinuedProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsDiscontinuedProduct() {
    return isDiscontinuedProduct;
  }

  public void setIsDiscontinuedProduct(Boolean isDiscontinuedProduct) {
    this.isDiscontinuedProduct = isDiscontinuedProduct;
  }


  public ProductDetailResponseIndicators isRefurbished(Boolean isRefurbished) {
    this.isRefurbished = isRefurbished;
    return this;
  }

   /**
   * Boolean that indicates whether product is refurbished.
   * @return isRefurbished
  **/
  @javax.annotation.Nullable
  public Boolean getIsRefurbished() {
    return isRefurbished;
  }

  public void setIsRefurbished(Boolean isRefurbished) {
    this.isRefurbished = isRefurbished;
  }


  public ProductDetailResponseIndicators isReturnableProduct(Boolean isReturnableProduct) {
    this.isReturnableProduct = isReturnableProduct;
    return this;
  }

   /**
   * Boolean that indicates if the product can be returned.
   * @return isReturnableProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsReturnableProduct() {
    return isReturnableProduct;
  }

  public void setIsReturnableProduct(Boolean isReturnableProduct) {
    this.isReturnableProduct = isReturnableProduct;
  }


  public ProductDetailResponseIndicators isIngramShip(Boolean isIngramShip) {
    this.isIngramShip = isIngramShip;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a Ingram shipped product.
   * @return isIngramShip
  **/
  @javax.annotation.Nullable
  public Boolean getIsIngramShip() {
    return isIngramShip;
  }

  public void setIsIngramShip(Boolean isIngramShip) {
    this.isIngramShip = isIngramShip;
  }


  public ProductDetailResponseIndicators isEnduserRequired(Boolean isEnduserRequired) {
    this.isEnduserRequired = isEnduserRequired;
    return this;
  }

   /**
   * Do vendor requires Enduser name required to create an order.
   * @return isEnduserRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnduserRequired() {
    return isEnduserRequired;
  }

  public void setIsEnduserRequired(Boolean isEnduserRequired) {
    this.isEnduserRequired = isEnduserRequired;
  }


  public ProductDetailResponseIndicators isHeavyWeight(Boolean isHeavyWeight) {
    this.isHeavyWeight = isHeavyWeight;
    return this;
  }

   /**
   * Boolean that indicates whether it’s  heavy weight product.
   * @return isHeavyWeight
  **/
  @javax.annotation.Nullable
  public Boolean getIsHeavyWeight() {
    return isHeavyWeight;
  }

  public void setIsHeavyWeight(Boolean isHeavyWeight) {
    this.isHeavyWeight = isHeavyWeight;
  }


  public ProductDetailResponseIndicators hasLtl(Boolean hasLtl) {
    this.hasLtl = hasLtl;
    return this;
  }

   /**
   * Boolean that indicates whether it hasLtl or not.
   * @return hasLtl
  **/
  @javax.annotation.Nullable
  public Boolean getHasLtl() {
    return hasLtl;
  }

  public void setHasLtl(Boolean hasLtl) {
    this.hasLtl = hasLtl;
  }


  public ProductDetailResponseIndicators isClearanceProduct(Boolean isClearanceProduct) {
    this.isClearanceProduct = isClearanceProduct;
    return this;
  }

   /**
   * Boolean that indicates whether it’s clearnce product.
   * @return isClearanceProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsClearanceProduct() {
    return isClearanceProduct;
  }

  public void setIsClearanceProduct(Boolean isClearanceProduct) {
    this.isClearanceProduct = isClearanceProduct;
  }


  public ProductDetailResponseIndicators hasBundle(Boolean hasBundle) {
    this.hasBundle = hasBundle;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a bundled product.
   * @return hasBundle
  **/
  @javax.annotation.Nullable
  public Boolean getHasBundle() {
    return hasBundle;
  }

  public void setHasBundle(Boolean hasBundle) {
    this.hasBundle = hasBundle;
  }


  public ProductDetailResponseIndicators isOversizeProduct(Boolean isOversizeProduct) {
    this.isOversizeProduct = isOversizeProduct;
    return this;
  }

   /**
   * Boolean that indicates whether it’s oversized product.
   * @return isOversizeProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsOversizeProduct() {
    return isOversizeProduct;
  }

  public void setIsOversizeProduct(Boolean isOversizeProduct) {
    this.isOversizeProduct = isOversizeProduct;
  }


  public ProductDetailResponseIndicators isPreorderProduct(Boolean isPreorderProduct) {
    this.isPreorderProduct = isPreorderProduct;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a preorder product.
   * @return isPreorderProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsPreorderProduct() {
    return isPreorderProduct;
  }

  public void setIsPreorderProduct(Boolean isPreorderProduct) {
    this.isPreorderProduct = isPreorderProduct;
  }


  public ProductDetailResponseIndicators isLicenseProduct(Boolean isLicenseProduct) {
    this.isLicenseProduct = isLicenseProduct;
    return this;
  }

   /**
   * Boolean that indicates whether it’s a licened product.
   * @return isLicenseProduct
  **/
  @javax.annotation.Nullable
  public Boolean getIsLicenseProduct() {
    return isLicenseProduct;
  }

  public void setIsLicenseProduct(Boolean isLicenseProduct) {
    this.isLicenseProduct = isLicenseProduct;
  }


  public ProductDetailResponseIndicators isDirectshipOrderable(Boolean isDirectshipOrderable) {
    this.isDirectshipOrderable = isDirectshipOrderable;
    return this;
  }

   /**
   * Boolean that indicates whether product is directship orderable.
   * @return isDirectshipOrderable
  **/
  @javax.annotation.Nullable
  public Boolean getIsDirectshipOrderable() {
    return isDirectshipOrderable;
  }

  public void setIsDirectshipOrderable(Boolean isDirectshipOrderable) {
    this.isDirectshipOrderable = isDirectshipOrderable;
  }


  public ProductDetailResponseIndicators isServiceSku(Boolean isServiceSku) {
    this.isServiceSku = isServiceSku;
    return this;
  }

   /**
   * Boolean that indicates whether product is service SKU.
   * @return isServiceSku
  **/
  @javax.annotation.Nullable
  public Boolean getIsServiceSku() {
    return isServiceSku;
  }

  public void setIsServiceSku(Boolean isServiceSku) {
    this.isServiceSku = isServiceSku;
  }


  public ProductDetailResponseIndicators isConfigurable(Boolean isConfigurable) {
    this.isConfigurable = isConfigurable;
    return this;
  }

   /**
   * Boolean that indicates whether product is configurable.
   * @return isConfigurable
  **/
  @javax.annotation.Nullable
  public Boolean getIsConfigurable() {
    return isConfigurable;
  }

  public void setIsConfigurable(Boolean isConfigurable) {
    this.isConfigurable = isConfigurable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseIndicators productDetailResponseIndicators = (ProductDetailResponseIndicators) o;
    return Objects.equals(this.hasWarranty, productDetailResponseIndicators.hasWarranty) &&
        Objects.equals(this.isNewProduct, productDetailResponseIndicators.isNewProduct) &&
        Objects.equals(this.hasReturnLimits, productDetailResponseIndicators.hasReturnLimits) &&
        Objects.equals(this.isBackOrderAllowed, productDetailResponseIndicators.isBackOrderAllowed) &&
        Objects.equals(this.isShippedFromPartner, productDetailResponseIndicators.isShippedFromPartner) &&
        Objects.equals(this.isReplacementProduct, productDetailResponseIndicators.isReplacementProduct) &&
        Objects.equals(this.replacementType, productDetailResponseIndicators.replacementType) &&
        Objects.equals(this.isDirectship, productDetailResponseIndicators.isDirectship) &&
        Objects.equals(this.isDownloadable, productDetailResponseIndicators.isDownloadable) &&
        Objects.equals(this.isDigitalType, productDetailResponseIndicators.isDigitalType) &&
        Objects.equals(this.skuType, productDetailResponseIndicators.skuType) &&
        Objects.equals(this.hasStdSpecialPrice, productDetailResponseIndicators.hasStdSpecialPrice) &&
        Objects.equals(this.hasAcopSpecialPrice, productDetailResponseIndicators.hasAcopSpecialPrice) &&
        Objects.equals(this.hasAcopQuantityBreak, productDetailResponseIndicators.hasAcopQuantityBreak) &&
        Objects.equals(this.hasStdWebDiscount, productDetailResponseIndicators.hasStdWebDiscount) &&
        Objects.equals(this.hasAcopWebDiscount, productDetailResponseIndicators.hasAcopWebDiscount) &&
        Objects.equals(this.hasSpecialBid, productDetailResponseIndicators.hasSpecialBid) &&
        Objects.equals(this.isExportableToCountry, productDetailResponseIndicators.isExportableToCountry) &&
        Objects.equals(this.isDiscontinuedProduct, productDetailResponseIndicators.isDiscontinuedProduct) &&
        Objects.equals(this.isRefurbished, productDetailResponseIndicators.isRefurbished) &&
        Objects.equals(this.isReturnableProduct, productDetailResponseIndicators.isReturnableProduct) &&
        Objects.equals(this.isIngramShip, productDetailResponseIndicators.isIngramShip) &&
        Objects.equals(this.isEnduserRequired, productDetailResponseIndicators.isEnduserRequired) &&
        Objects.equals(this.isHeavyWeight, productDetailResponseIndicators.isHeavyWeight) &&
        Objects.equals(this.hasLtl, productDetailResponseIndicators.hasLtl) &&
        Objects.equals(this.isClearanceProduct, productDetailResponseIndicators.isClearanceProduct) &&
        Objects.equals(this.hasBundle, productDetailResponseIndicators.hasBundle) &&
        Objects.equals(this.isOversizeProduct, productDetailResponseIndicators.isOversizeProduct) &&
        Objects.equals(this.isPreorderProduct, productDetailResponseIndicators.isPreorderProduct) &&
        Objects.equals(this.isLicenseProduct, productDetailResponseIndicators.isLicenseProduct) &&
        Objects.equals(this.isDirectshipOrderable, productDetailResponseIndicators.isDirectshipOrderable) &&
        Objects.equals(this.isServiceSku, productDetailResponseIndicators.isServiceSku) &&
        Objects.equals(this.isConfigurable, productDetailResponseIndicators.isConfigurable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasWarranty, isNewProduct, hasReturnLimits, isBackOrderAllowed, isShippedFromPartner, isReplacementProduct, replacementType, isDirectship, isDownloadable, isDigitalType, skuType, hasStdSpecialPrice, hasAcopSpecialPrice, hasAcopQuantityBreak, hasStdWebDiscount, hasAcopWebDiscount, hasSpecialBid, isExportableToCountry, isDiscontinuedProduct, isRefurbished, isReturnableProduct, isIngramShip, isEnduserRequired, isHeavyWeight, hasLtl, isClearanceProduct, hasBundle, isOversizeProduct, isPreorderProduct, isLicenseProduct, isDirectshipOrderable, isServiceSku, isConfigurable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseIndicators {\n");
    sb.append("    hasWarranty: ").append(toIndentedString(hasWarranty)).append("\n");
    sb.append("    isNewProduct: ").append(toIndentedString(isNewProduct)).append("\n");
    sb.append("    hasReturnLimits: ").append(toIndentedString(hasReturnLimits)).append("\n");
    sb.append("    isBackOrderAllowed: ").append(toIndentedString(isBackOrderAllowed)).append("\n");
    sb.append("    isShippedFromPartner: ").append(toIndentedString(isShippedFromPartner)).append("\n");
    sb.append("    isReplacementProduct: ").append(toIndentedString(isReplacementProduct)).append("\n");
    sb.append("    replacementType: ").append(toIndentedString(replacementType)).append("\n");
    sb.append("    isDirectship: ").append(toIndentedString(isDirectship)).append("\n");
    sb.append("    isDownloadable: ").append(toIndentedString(isDownloadable)).append("\n");
    sb.append("    isDigitalType: ").append(toIndentedString(isDigitalType)).append("\n");
    sb.append("    skuType: ").append(toIndentedString(skuType)).append("\n");
    sb.append("    hasStdSpecialPrice: ").append(toIndentedString(hasStdSpecialPrice)).append("\n");
    sb.append("    hasAcopSpecialPrice: ").append(toIndentedString(hasAcopSpecialPrice)).append("\n");
    sb.append("    hasAcopQuantityBreak: ").append(toIndentedString(hasAcopQuantityBreak)).append("\n");
    sb.append("    hasStdWebDiscount: ").append(toIndentedString(hasStdWebDiscount)).append("\n");
    sb.append("    hasAcopWebDiscount: ").append(toIndentedString(hasAcopWebDiscount)).append("\n");
    sb.append("    hasSpecialBid: ").append(toIndentedString(hasSpecialBid)).append("\n");
    sb.append("    isExportableToCountry: ").append(toIndentedString(isExportableToCountry)).append("\n");
    sb.append("    isDiscontinuedProduct: ").append(toIndentedString(isDiscontinuedProduct)).append("\n");
    sb.append("    isRefurbished: ").append(toIndentedString(isRefurbished)).append("\n");
    sb.append("    isReturnableProduct: ").append(toIndentedString(isReturnableProduct)).append("\n");
    sb.append("    isIngramShip: ").append(toIndentedString(isIngramShip)).append("\n");
    sb.append("    isEnduserRequired: ").append(toIndentedString(isEnduserRequired)).append("\n");
    sb.append("    isHeavyWeight: ").append(toIndentedString(isHeavyWeight)).append("\n");
    sb.append("    hasLtl: ").append(toIndentedString(hasLtl)).append("\n");
    sb.append("    isClearanceProduct: ").append(toIndentedString(isClearanceProduct)).append("\n");
    sb.append("    hasBundle: ").append(toIndentedString(hasBundle)).append("\n");
    sb.append("    isOversizeProduct: ").append(toIndentedString(isOversizeProduct)).append("\n");
    sb.append("    isPreorderProduct: ").append(toIndentedString(isPreorderProduct)).append("\n");
    sb.append("    isLicenseProduct: ").append(toIndentedString(isLicenseProduct)).append("\n");
    sb.append("    isDirectshipOrderable: ").append(toIndentedString(isDirectshipOrderable)).append("\n");
    sb.append("    isServiceSku: ").append(toIndentedString(isServiceSku)).append("\n");
    sb.append("    isConfigurable: ").append(toIndentedString(isConfigurable)).append("\n");
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
    openapiFields.add("hasWarranty");
    openapiFields.add("isNewProduct");
    openapiFields.add("hasReturnLimits");
    openapiFields.add("isBackOrderAllowed");
    openapiFields.add("isShippedFromPartner");
    openapiFields.add("isReplacementProduct");
    openapiFields.add("replacementType");
    openapiFields.add("isDirectship");
    openapiFields.add("isDownloadable");
    openapiFields.add("isDigitalType");
    openapiFields.add("skuType");
    openapiFields.add("hasStdSpecialPrice");
    openapiFields.add("hasAcopSpecialPrice");
    openapiFields.add("hasAcopQuantityBreak");
    openapiFields.add("hasStdWebDiscount");
    openapiFields.add("hasAcopWebDiscount");
    openapiFields.add("hasSpecialBid");
    openapiFields.add("isExportableToCountry");
    openapiFields.add("isDiscontinuedProduct");
    openapiFields.add("isRefurbished");
    openapiFields.add("isReturnableProduct");
    openapiFields.add("isIngramShip");
    openapiFields.add("isEnduserRequired");
    openapiFields.add("isHeavyWeight");
    openapiFields.add("hasLtl");
    openapiFields.add("isClearanceProduct");
    openapiFields.add("hasBundle");
    openapiFields.add("isOversizeProduct");
    openapiFields.add("isPreorderProduct");
    openapiFields.add("isLicenseProduct");
    openapiFields.add("isDirectshipOrderable");
    openapiFields.add("isServiceSku");
    openapiFields.add("isConfigurable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseIndicators
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseIndicators.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseIndicators is not found in the empty JSON string", ProductDetailResponseIndicators.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseIndicators.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseIndicators` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("replacementType") != null && !jsonObj.get("replacementType").isJsonNull()) && !jsonObj.get("replacementType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacementType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacementType").toString()));
      }
      if ((jsonObj.get("skuType") != null && !jsonObj.get("skuType").isJsonNull()) && !jsonObj.get("skuType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skuType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseIndicators.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseIndicators' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseIndicators> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseIndicators.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseIndicators>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseIndicators value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseIndicators read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDetailResponseIndicators given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDetailResponseIndicators
  * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseIndicators
  */
  public static ProductDetailResponseIndicators fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseIndicators.class);
  }

 /**
  * Convert an instance of ProductDetailResponseIndicators to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

