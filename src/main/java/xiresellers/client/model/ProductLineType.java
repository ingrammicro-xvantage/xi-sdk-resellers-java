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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner;
import xiresellers.client.model.ProductLineTypeSerialnumberdetailsInner;
import xiresellers.client.model.ProductLineTypeTrackingnumberdetailsInner;

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
 * Product line items object under each invoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class ProductLineType {
  public static final String SERIALIZED_NAME_LINENUMBER = "linenumber";
  @SerializedName(SERIALIZED_NAME_LINENUMBER)
  private String linenumber;

  public static final String SERIALIZED_NAME_LINETYPE = "linetype";
  @SerializedName(SERIALIZED_NAME_LINETYPE)
  private String linetype;

  public static final String SERIALIZED_NAME_PARTNUMBER = "partnumber";
  @SerializedName(SERIALIZED_NAME_PARTNUMBER)
  private String partnumber;

  public static final String SERIALIZED_NAME_VENDORPARTNUMBER = "vendorpartnumber";
  @SerializedName(SERIALIZED_NAME_VENDORPARTNUMBER)
  private String vendorpartnumber;

  public static final String SERIALIZED_NAME_PARTDESCRIPTION = "partdescription";
  @SerializedName(SERIALIZED_NAME_PARTDESCRIPTION)
  private String partdescription;

  public static final String SERIALIZED_NAME_SHIPFROMBRANCH = "shipfrombranch";
  @SerializedName(SERIALIZED_NAME_SHIPFROMBRANCH)
  private String shipfrombranch;

  public static final String SERIALIZED_NAME_SHIPPEDQUANTITY = "shippedquantity";
  @SerializedName(SERIALIZED_NAME_SHIPPEDQUANTITY)
  private String shippedquantity;

  public static final String SERIALIZED_NAME_ORDEREDQUANTITY = "orderedquantity";
  @SerializedName(SERIALIZED_NAME_ORDEREDQUANTITY)
  private String orderedquantity;

  public static final String SERIALIZED_NAME_MARGINPERCENT = "marginpercent";
  @SerializedName(SERIALIZED_NAME_MARGINPERCENT)
  private String marginpercent;

  public static final String SERIALIZED_NAME_BACKORDERQUANTITY = "backorderquantity";
  @SerializedName(SERIALIZED_NAME_BACKORDERQUANTITY)
  private String backorderquantity;

  public static final String SERIALIZED_NAME_BACKORDERETADATE = "backorderetadate";
  @SerializedName(SERIALIZED_NAME_BACKORDERETADATE)
  private LocalDate backorderetadate;

  public static final String SERIALIZED_NAME_EXTENDEDPRICE = "extendedprice";
  @SerializedName(SERIALIZED_NAME_EXTENDEDPRICE)
  private String extendedprice;

  public static final String SERIALIZED_NAME_SPECIALBIDNUMBER = "specialbidnumber";
  @SerializedName(SERIALIZED_NAME_SPECIALBIDNUMBER)
  private String specialbidnumber;

  public static final String SERIALIZED_NAME_ORDERSUFFIX = "ordersuffix";
  @SerializedName(SERIALIZED_NAME_ORDERSUFFIX)
  private String ordersuffix;

  public static final String SERIALIZED_NAME_ISACOPAPPLIED = "isacopapplied";
  @SerializedName(SERIALIZED_NAME_ISACOPAPPLIED)
  private String isacopapplied;

  public static final String SERIALIZED_NAME_UNITPRICE = "unitprice";
  @SerializedName(SERIALIZED_NAME_UNITPRICE)
  private String unitprice;

  public static final String SERIALIZED_NAME_UNITOFMEASURE = "unitofmeasure";
  @SerializedName(SERIALIZED_NAME_UNITOFMEASURE)
  private String unitofmeasure;

  public static final String SERIALIZED_NAME_SERIALNUMBERDETAILS = "serialnumberdetails";
  @SerializedName(SERIALIZED_NAME_SERIALNUMBERDETAILS)
  private List<ProductLineTypeSerialnumberdetailsInner> serialnumberdetails;

  public static final String SERIALIZED_NAME_TRACKINGNUMBERDETAILS = "trackingnumberdetails";
  @SerializedName(SERIALIZED_NAME_TRACKINGNUMBERDETAILS)
  private List<ProductLineTypeTrackingnumberdetailsInner> trackingnumberdetails;

  public static final String SERIALIZED_NAME_PRODUCTEXTENDEDSPECS = "productextendedspecs";
  @SerializedName(SERIALIZED_NAME_PRODUCTEXTENDEDSPECS)
  private List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> productextendedspecs;

  public ProductLineType() {
  }

  public ProductLineType linenumber(String linenumber) {
    this.linenumber = linenumber;
    return this;
  }

   /**
   * Get linenumber
   * @return linenumber
  **/
  @javax.annotation.Nullable
  public String getLinenumber() {
    return linenumber;
  }

  public void setLinenumber(String linenumber) {
    this.linenumber = linenumber;
  }


  public ProductLineType linetype(String linetype) {
    this.linetype = linetype;
    return this;
  }

   /**
   * Get linetype
   * @return linetype
  **/
  @javax.annotation.Nullable
  public String getLinetype() {
    return linetype;
  }

  public void setLinetype(String linetype) {
    this.linetype = linetype;
  }


  public ProductLineType partnumber(String partnumber) {
    this.partnumber = partnumber;
    return this;
  }

   /**
   * Get partnumber
   * @return partnumber
  **/
  @javax.annotation.Nullable
  public String getPartnumber() {
    return partnumber;
  }

  public void setPartnumber(String partnumber) {
    this.partnumber = partnumber;
  }


  public ProductLineType vendorpartnumber(String vendorpartnumber) {
    this.vendorpartnumber = vendorpartnumber;
    return this;
  }

   /**
   * Get vendorpartnumber
   * @return vendorpartnumber
  **/
  @javax.annotation.Nullable
  public String getVendorpartnumber() {
    return vendorpartnumber;
  }

  public void setVendorpartnumber(String vendorpartnumber) {
    this.vendorpartnumber = vendorpartnumber;
  }


  public ProductLineType partdescription(String partdescription) {
    this.partdescription = partdescription;
    return this;
  }

   /**
   * Get partdescription
   * @return partdescription
  **/
  @javax.annotation.Nullable
  public String getPartdescription() {
    return partdescription;
  }

  public void setPartdescription(String partdescription) {
    this.partdescription = partdescription;
  }


  public ProductLineType shipfrombranch(String shipfrombranch) {
    this.shipfrombranch = shipfrombranch;
    return this;
  }

   /**
   * Get shipfrombranch
   * @return shipfrombranch
  **/
  @javax.annotation.Nullable
  public String getShipfrombranch() {
    return shipfrombranch;
  }

  public void setShipfrombranch(String shipfrombranch) {
    this.shipfrombranch = shipfrombranch;
  }


  public ProductLineType shippedquantity(String shippedquantity) {
    this.shippedquantity = shippedquantity;
    return this;
  }

   /**
   * Get shippedquantity
   * @return shippedquantity
  **/
  @javax.annotation.Nullable
  public String getShippedquantity() {
    return shippedquantity;
  }

  public void setShippedquantity(String shippedquantity) {
    this.shippedquantity = shippedquantity;
  }


  public ProductLineType orderedquantity(String orderedquantity) {
    this.orderedquantity = orderedquantity;
    return this;
  }

   /**
   * Get orderedquantity
   * @return orderedquantity
  **/
  @javax.annotation.Nullable
  public String getOrderedquantity() {
    return orderedquantity;
  }

  public void setOrderedquantity(String orderedquantity) {
    this.orderedquantity = orderedquantity;
  }


  public ProductLineType marginpercent(String marginpercent) {
    this.marginpercent = marginpercent;
    return this;
  }

   /**
   * Get marginpercent
   * @return marginpercent
  **/
  @javax.annotation.Nullable
  public String getMarginpercent() {
    return marginpercent;
  }

  public void setMarginpercent(String marginpercent) {
    this.marginpercent = marginpercent;
  }


  public ProductLineType backorderquantity(String backorderquantity) {
    this.backorderquantity = backorderquantity;
    return this;
  }

   /**
   * Get backorderquantity
   * @return backorderquantity
  **/
  @javax.annotation.Nullable
  public String getBackorderquantity() {
    return backorderquantity;
  }

  public void setBackorderquantity(String backorderquantity) {
    this.backorderquantity = backorderquantity;
  }


  public ProductLineType backorderetadate(LocalDate backorderetadate) {
    this.backorderetadate = backorderetadate;
    return this;
  }

   /**
   * Get backorderetadate
   * @return backorderetadate
  **/
  @javax.annotation.Nullable
  public LocalDate getBackorderetadate() {
    return backorderetadate;
  }

  public void setBackorderetadate(LocalDate backorderetadate) {
    this.backorderetadate = backorderetadate;
  }


  public ProductLineType extendedprice(String extendedprice) {
    this.extendedprice = extendedprice;
    return this;
  }

   /**
   * Get extendedprice
   * @return extendedprice
  **/
  @javax.annotation.Nullable
  public String getExtendedprice() {
    return extendedprice;
  }

  public void setExtendedprice(String extendedprice) {
    this.extendedprice = extendedprice;
  }


  public ProductLineType specialbidnumber(String specialbidnumber) {
    this.specialbidnumber = specialbidnumber;
    return this;
  }

   /**
   * Get specialbidnumber
   * @return specialbidnumber
  **/
  @javax.annotation.Nullable
  public String getSpecialbidnumber() {
    return specialbidnumber;
  }

  public void setSpecialbidnumber(String specialbidnumber) {
    this.specialbidnumber = specialbidnumber;
  }


  public ProductLineType ordersuffix(String ordersuffix) {
    this.ordersuffix = ordersuffix;
    return this;
  }

   /**
   * Get ordersuffix
   * @return ordersuffix
  **/
  @javax.annotation.Nullable
  public String getOrdersuffix() {
    return ordersuffix;
  }

  public void setOrdersuffix(String ordersuffix) {
    this.ordersuffix = ordersuffix;
  }


  public ProductLineType isacopapplied(String isacopapplied) {
    this.isacopapplied = isacopapplied;
    return this;
  }

   /**
   * Get isacopapplied
   * @return isacopapplied
  **/
  @javax.annotation.Nullable
  public String getIsacopapplied() {
    return isacopapplied;
  }

  public void setIsacopapplied(String isacopapplied) {
    this.isacopapplied = isacopapplied;
  }


  public ProductLineType unitprice(String unitprice) {
    this.unitprice = unitprice;
    return this;
  }

   /**
   * Get unitprice
   * @return unitprice
  **/
  @javax.annotation.Nullable
  public String getUnitprice() {
    return unitprice;
  }

  public void setUnitprice(String unitprice) {
    this.unitprice = unitprice;
  }


  public ProductLineType unitofmeasure(String unitofmeasure) {
    this.unitofmeasure = unitofmeasure;
    return this;
  }

   /**
   * Get unitofmeasure
   * @return unitofmeasure
  **/
  @javax.annotation.Nullable
  public String getUnitofmeasure() {
    return unitofmeasure;
  }

  public void setUnitofmeasure(String unitofmeasure) {
    this.unitofmeasure = unitofmeasure;
  }


  public ProductLineType serialnumberdetails(List<ProductLineTypeSerialnumberdetailsInner> serialnumberdetails) {
    this.serialnumberdetails = serialnumberdetails;
    return this;
  }

  public ProductLineType addSerialnumberdetailsItem(ProductLineTypeSerialnumberdetailsInner serialnumberdetailsItem) {
    if (this.serialnumberdetails == null) {
      this.serialnumberdetails = new ArrayList<>();
    }
    this.serialnumberdetails.add(serialnumberdetailsItem);
    return this;
  }

   /**
   * Get serialnumberdetails
   * @return serialnumberdetails
  **/
  @javax.annotation.Nullable
  public List<ProductLineTypeSerialnumberdetailsInner> getSerialnumberdetails() {
    return serialnumberdetails;
  }

  public void setSerialnumberdetails(List<ProductLineTypeSerialnumberdetailsInner> serialnumberdetails) {
    this.serialnumberdetails = serialnumberdetails;
  }


  public ProductLineType trackingnumberdetails(List<ProductLineTypeTrackingnumberdetailsInner> trackingnumberdetails) {
    this.trackingnumberdetails = trackingnumberdetails;
    return this;
  }

  public ProductLineType addTrackingnumberdetailsItem(ProductLineTypeTrackingnumberdetailsInner trackingnumberdetailsItem) {
    if (this.trackingnumberdetails == null) {
      this.trackingnumberdetails = new ArrayList<>();
    }
    this.trackingnumberdetails.add(trackingnumberdetailsItem);
    return this;
  }

   /**
   * Get trackingnumberdetails
   * @return trackingnumberdetails
  **/
  @javax.annotation.Nullable
  public List<ProductLineTypeTrackingnumberdetailsInner> getTrackingnumberdetails() {
    return trackingnumberdetails;
  }

  public void setTrackingnumberdetails(List<ProductLineTypeTrackingnumberdetailsInner> trackingnumberdetails) {
    this.trackingnumberdetails = trackingnumberdetails;
  }


  public ProductLineType productextendedspecs(List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> productextendedspecs) {
    this.productextendedspecs = productextendedspecs;
    return this;
  }

  public ProductLineType addProductextendedspecsItem(InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner productextendedspecsItem) {
    if (this.productextendedspecs == null) {
      this.productextendedspecs = new ArrayList<>();
    }
    this.productextendedspecs.add(productextendedspecsItem);
    return this;
  }

   /**
   * Get productextendedspecs
   * @return productextendedspecs
  **/
  @javax.annotation.Nullable
  public List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> getProductextendedspecs() {
    return productextendedspecs;
  }

  public void setProductextendedspecs(List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> productextendedspecs) {
    this.productextendedspecs = productextendedspecs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductLineType productLineType = (ProductLineType) o;
    return Objects.equals(this.linenumber, productLineType.linenumber) &&
        Objects.equals(this.linetype, productLineType.linetype) &&
        Objects.equals(this.partnumber, productLineType.partnumber) &&
        Objects.equals(this.vendorpartnumber, productLineType.vendorpartnumber) &&
        Objects.equals(this.partdescription, productLineType.partdescription) &&
        Objects.equals(this.shipfrombranch, productLineType.shipfrombranch) &&
        Objects.equals(this.shippedquantity, productLineType.shippedquantity) &&
        Objects.equals(this.orderedquantity, productLineType.orderedquantity) &&
        Objects.equals(this.marginpercent, productLineType.marginpercent) &&
        Objects.equals(this.backorderquantity, productLineType.backorderquantity) &&
        Objects.equals(this.backorderetadate, productLineType.backorderetadate) &&
        Objects.equals(this.extendedprice, productLineType.extendedprice) &&
        Objects.equals(this.specialbidnumber, productLineType.specialbidnumber) &&
        Objects.equals(this.ordersuffix, productLineType.ordersuffix) &&
        Objects.equals(this.isacopapplied, productLineType.isacopapplied) &&
        Objects.equals(this.unitprice, productLineType.unitprice) &&
        Objects.equals(this.unitofmeasure, productLineType.unitofmeasure) &&
        Objects.equals(this.serialnumberdetails, productLineType.serialnumberdetails) &&
        Objects.equals(this.trackingnumberdetails, productLineType.trackingnumberdetails) &&
        Objects.equals(this.productextendedspecs, productLineType.productextendedspecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linenumber, linetype, partnumber, vendorpartnumber, partdescription, shipfrombranch, shippedquantity, orderedquantity, marginpercent, backorderquantity, backorderetadate, extendedprice, specialbidnumber, ordersuffix, isacopapplied, unitprice, unitofmeasure, serialnumberdetails, trackingnumberdetails, productextendedspecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductLineType {\n");
    sb.append("    linenumber: ").append(toIndentedString(linenumber)).append("\n");
    sb.append("    linetype: ").append(toIndentedString(linetype)).append("\n");
    sb.append("    partnumber: ").append(toIndentedString(partnumber)).append("\n");
    sb.append("    vendorpartnumber: ").append(toIndentedString(vendorpartnumber)).append("\n");
    sb.append("    partdescription: ").append(toIndentedString(partdescription)).append("\n");
    sb.append("    shipfrombranch: ").append(toIndentedString(shipfrombranch)).append("\n");
    sb.append("    shippedquantity: ").append(toIndentedString(shippedquantity)).append("\n");
    sb.append("    orderedquantity: ").append(toIndentedString(orderedquantity)).append("\n");
    sb.append("    marginpercent: ").append(toIndentedString(marginpercent)).append("\n");
    sb.append("    backorderquantity: ").append(toIndentedString(backorderquantity)).append("\n");
    sb.append("    backorderetadate: ").append(toIndentedString(backorderetadate)).append("\n");
    sb.append("    extendedprice: ").append(toIndentedString(extendedprice)).append("\n");
    sb.append("    specialbidnumber: ").append(toIndentedString(specialbidnumber)).append("\n");
    sb.append("    ordersuffix: ").append(toIndentedString(ordersuffix)).append("\n");
    sb.append("    isacopapplied: ").append(toIndentedString(isacopapplied)).append("\n");
    sb.append("    unitprice: ").append(toIndentedString(unitprice)).append("\n");
    sb.append("    unitofmeasure: ").append(toIndentedString(unitofmeasure)).append("\n");
    sb.append("    serialnumberdetails: ").append(toIndentedString(serialnumberdetails)).append("\n");
    sb.append("    trackingnumberdetails: ").append(toIndentedString(trackingnumberdetails)).append("\n");
    sb.append("    productextendedspecs: ").append(toIndentedString(productextendedspecs)).append("\n");
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
    openapiFields.add("linenumber");
    openapiFields.add("linetype");
    openapiFields.add("partnumber");
    openapiFields.add("vendorpartnumber");
    openapiFields.add("partdescription");
    openapiFields.add("shipfrombranch");
    openapiFields.add("shippedquantity");
    openapiFields.add("orderedquantity");
    openapiFields.add("marginpercent");
    openapiFields.add("backorderquantity");
    openapiFields.add("backorderetadate");
    openapiFields.add("extendedprice");
    openapiFields.add("specialbidnumber");
    openapiFields.add("ordersuffix");
    openapiFields.add("isacopapplied");
    openapiFields.add("unitprice");
    openapiFields.add("unitofmeasure");
    openapiFields.add("serialnumberdetails");
    openapiFields.add("trackingnumberdetails");
    openapiFields.add("productextendedspecs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductLineType
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductLineType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductLineType is not found in the empty JSON string", ProductLineType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductLineType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductLineType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("linenumber") != null && !jsonObj.get("linenumber").isJsonNull()) && !jsonObj.get("linenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linenumber").toString()));
      }
      if ((jsonObj.get("linetype") != null && !jsonObj.get("linetype").isJsonNull()) && !jsonObj.get("linetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linetype").toString()));
      }
      if ((jsonObj.get("partnumber") != null && !jsonObj.get("partnumber").isJsonNull()) && !jsonObj.get("partnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnumber").toString()));
      }
      if ((jsonObj.get("vendorpartnumber") != null && !jsonObj.get("vendorpartnumber").isJsonNull()) && !jsonObj.get("vendorpartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorpartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorpartnumber").toString()));
      }
      if ((jsonObj.get("partdescription") != null && !jsonObj.get("partdescription").isJsonNull()) && !jsonObj.get("partdescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partdescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partdescription").toString()));
      }
      if ((jsonObj.get("shipfrombranch") != null && !jsonObj.get("shipfrombranch").isJsonNull()) && !jsonObj.get("shipfrombranch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipfrombranch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipfrombranch").toString()));
      }
      if ((jsonObj.get("shippedquantity") != null && !jsonObj.get("shippedquantity").isJsonNull()) && !jsonObj.get("shippedquantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippedquantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippedquantity").toString()));
      }
      if ((jsonObj.get("orderedquantity") != null && !jsonObj.get("orderedquantity").isJsonNull()) && !jsonObj.get("orderedquantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderedquantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderedquantity").toString()));
      }
      if ((jsonObj.get("marginpercent") != null && !jsonObj.get("marginpercent").isJsonNull()) && !jsonObj.get("marginpercent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marginpercent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marginpercent").toString()));
      }
      if ((jsonObj.get("backorderquantity") != null && !jsonObj.get("backorderquantity").isJsonNull()) && !jsonObj.get("backorderquantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backorderquantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backorderquantity").toString()));
      }
      if ((jsonObj.get("extendedprice") != null && !jsonObj.get("extendedprice").isJsonNull()) && !jsonObj.get("extendedprice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extendedprice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extendedprice").toString()));
      }
      if ((jsonObj.get("specialbidnumber") != null && !jsonObj.get("specialbidnumber").isJsonNull()) && !jsonObj.get("specialbidnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialbidnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialbidnumber").toString()));
      }
      if ((jsonObj.get("ordersuffix") != null && !jsonObj.get("ordersuffix").isJsonNull()) && !jsonObj.get("ordersuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordersuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordersuffix").toString()));
      }
      if ((jsonObj.get("isacopapplied") != null && !jsonObj.get("isacopapplied").isJsonNull()) && !jsonObj.get("isacopapplied").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isacopapplied` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isacopapplied").toString()));
      }
      if ((jsonObj.get("unitprice") != null && !jsonObj.get("unitprice").isJsonNull()) && !jsonObj.get("unitprice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitprice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitprice").toString()));
      }
      if ((jsonObj.get("unitofmeasure") != null && !jsonObj.get("unitofmeasure").isJsonNull()) && !jsonObj.get("unitofmeasure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitofmeasure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitofmeasure").toString()));
      }
      if (jsonObj.get("serialnumberdetails") != null && !jsonObj.get("serialnumberdetails").isJsonNull()) {
        JsonArray jsonArrayserialnumberdetails = jsonObj.getAsJsonArray("serialnumberdetails");
        if (jsonArrayserialnumberdetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serialnumberdetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serialnumberdetails` to be an array in the JSON string but got `%s`", jsonObj.get("serialnumberdetails").toString()));
          }

          // validate the optional field `serialnumberdetails` (array)
          for (int i = 0; i < jsonArrayserialnumberdetails.size(); i++) {
            ProductLineTypeSerialnumberdetailsInner.validateJsonElement(jsonArrayserialnumberdetails.get(i));
          };
        }
      }
      if (jsonObj.get("trackingnumberdetails") != null && !jsonObj.get("trackingnumberdetails").isJsonNull()) {
        JsonArray jsonArraytrackingnumberdetails = jsonObj.getAsJsonArray("trackingnumberdetails");
        if (jsonArraytrackingnumberdetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trackingnumberdetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trackingnumberdetails` to be an array in the JSON string but got `%s`", jsonObj.get("trackingnumberdetails").toString()));
          }

          // validate the optional field `trackingnumberdetails` (array)
          for (int i = 0; i < jsonArraytrackingnumberdetails.size(); i++) {
            ProductLineTypeTrackingnumberdetailsInner.validateJsonElement(jsonArraytrackingnumberdetails.get(i));
          };
        }
      }
      if (jsonObj.get("productextendedspecs") != null && !jsonObj.get("productextendedspecs").isJsonNull()) {
        JsonArray jsonArrayproductextendedspecs = jsonObj.getAsJsonArray("productextendedspecs");
        if (jsonArrayproductextendedspecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productextendedspecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productextendedspecs` to be an array in the JSON string but got `%s`", jsonObj.get("productextendedspecs").toString()));
          }

          // validate the optional field `productextendedspecs` (array)
          for (int i = 0; i < jsonArrayproductextendedspecs.size(); i++) {
            InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner.validateJsonElement(jsonArrayproductextendedspecs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductLineType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductLineType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductLineType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductLineType.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductLineType>() {
           @Override
           public void write(JsonWriter out, ProductLineType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductLineType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductLineType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductLineType
  * @throws IOException if the JSON string is invalid with respect to ProductLineType
  */
  public static ProductLineType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductLineType.class);
  }

 /**
  * Convert an instance of ProductLineType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

