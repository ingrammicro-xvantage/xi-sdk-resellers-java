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
import java.time.LocalDate;
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
 * InvoiceDetailResponseServiceresponseInvoicedetailresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:39:09.782810Z[Etc/UTC]")
public class InvoiceDetailResponseServiceresponseInvoicedetailresponse {
  public static final String SERIALIZED_NAME_CUSTOMERNUMBER = "customernumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERNUMBER)
  private String customernumber;

  public static final String SERIALIZED_NAME_INVOICENUMBER = "invoicenumber";
  @SerializedName(SERIALIZED_NAME_INVOICENUMBER)
  private String invoicenumber;

  public static final String SERIALIZED_NAME_INVOICEDATE = "invoicedate";
  @SerializedName(SERIALIZED_NAME_INVOICEDATE)
  private LocalDate invoicedate;

  public static final String SERIALIZED_NAME_INVOICETYPE = "invoicetype";
  @SerializedName(SERIALIZED_NAME_INVOICETYPE)
  private String invoicetype;

  public static final String SERIALIZED_NAME_CUSTOMERORDERNUMBER = "customerordernumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERORDERNUMBER)
  private String customerordernumber;

  public static final String SERIALIZED_NAME_CUSTOMERFREIGHTAMOUNT = "customerfreightamount";
  @SerializedName(SERIALIZED_NAME_CUSTOMERFREIGHTAMOUNT)
  private Double customerfreightamount;

  public static final String SERIALIZED_NAME_CUSTOMERFOREIGNFRIGHTAMT = "customerforeignfrightamt";
  @SerializedName(SERIALIZED_NAME_CUSTOMERFOREIGNFRIGHTAMT)
  private Float customerforeignfrightamt;

  public static final String SERIALIZED_NAME_TOTALTAXAMOUNT = "totaltaxamount";
  @SerializedName(SERIALIZED_NAME_TOTALTAXAMOUNT)
  private Double totaltaxamount;

  public static final String SERIALIZED_NAME_TOTALAMOUNT = "totalamount";
  @SerializedName(SERIALIZED_NAME_TOTALAMOUNT)
  private Double totalamount;

  public static final String SERIALIZED_NAME_SHIPTOSUFFIX = "shiptosuffix";
  @SerializedName(SERIALIZED_NAME_SHIPTOSUFFIX)
  private String shiptosuffix;

  public static final String SERIALIZED_NAME_BILLTOSUFFIX = "billtosuffix";
  @SerializedName(SERIALIZED_NAME_BILLTOSUFFIX)
  private String billtosuffix;

  public static final String SERIALIZED_NAME_FREIGHTAMOUNT = "freightamount";
  @SerializedName(SERIALIZED_NAME_FREIGHTAMOUNT)
  private Double freightamount;

  public static final String SERIALIZED_NAME_PAYMENTTERMS = "paymentterms";
  @SerializedName(SERIALIZED_NAME_PAYMENTTERMS)
  private String paymentterms;

  public static final String SERIALIZED_NAME_ORDERDATE = "orderdate";
  @SerializedName(SERIALIZED_NAME_ORDERDATE)
  private String orderdate;

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private String carrier;

  public static final String SERIALIZED_NAME_CARRIERDESCRIPTION = "carrierdescription";
  @SerializedName(SERIALIZED_NAME_CARRIERDESCRIPTION)
  private String carrierdescription;

  public static final String SERIALIZED_NAME_DISCOUNTAMOUNT = "discountamount";
  @SerializedName(SERIALIZED_NAME_DISCOUNTAMOUNT)
  private Double discountamount;

  public static final String SERIALIZED_NAME_TAXTYPE = "taxtype";
  @SerializedName(SERIALIZED_NAME_TAXTYPE)
  private String taxtype;

  public static final String SERIALIZED_NAME_ENDUSERPONUMBER = "enduserponumber";
  @SerializedName(SERIALIZED_NAME_ENDUSERPONUMBER)
  private String enduserponumber;

  public static final String SERIALIZED_NAME_FREIGHTFORWARDERCODE = "freightforwardercode";
  @SerializedName(SERIALIZED_NAME_FREIGHTFORWARDERCODE)
  private String freightforwardercode;

  public static final String SERIALIZED_NAME_CREDITMEMOREASONCODE = "creditmemoreasoncode";
  @SerializedName(SERIALIZED_NAME_CREDITMEMOREASONCODE)
  private String creditmemoreasoncode;

  public InvoiceDetailResponseServiceresponseInvoicedetailresponse() {
  }

  public InvoiceDetailResponseServiceresponseInvoicedetailresponse customernumber(String customernumber) {
    this.customernumber = customernumber;
    return this;
  }

   /**
   * Get customernumber
   * @return customernumber
  **/
  @javax.annotation.Nullable
  public String getCustomernumber() {
    return customernumber;
  }

  public void setCustomernumber(String customernumber) {
    this.customernumber = customernumber;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse invoicenumber(String invoicenumber) {
    this.invoicenumber = invoicenumber;
    return this;
  }

   /**
   * Get invoicenumber
   * @return invoicenumber
  **/
  @javax.annotation.Nullable
  public String getInvoicenumber() {
    return invoicenumber;
  }

  public void setInvoicenumber(String invoicenumber) {
    this.invoicenumber = invoicenumber;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse invoicedate(LocalDate invoicedate) {
    this.invoicedate = invoicedate;
    return this;
  }

   /**
   * Get invoicedate
   * @return invoicedate
  **/
  @javax.annotation.Nullable
  public LocalDate getInvoicedate() {
    return invoicedate;
  }

  public void setInvoicedate(LocalDate invoicedate) {
    this.invoicedate = invoicedate;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse invoicetype(String invoicetype) {
    this.invoicetype = invoicetype;
    return this;
  }

   /**
   * Get invoicetype
   * @return invoicetype
  **/
  @javax.annotation.Nullable
  public String getInvoicetype() {
    return invoicetype;
  }

  public void setInvoicetype(String invoicetype) {
    this.invoicetype = invoicetype;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse customerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
    return this;
  }

   /**
   * Get customerordernumber
   * @return customerordernumber
  **/
  @javax.annotation.Nullable
  public String getCustomerordernumber() {
    return customerordernumber;
  }

  public void setCustomerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse customerfreightamount(Double customerfreightamount) {
    this.customerfreightamount = customerfreightamount;
    return this;
  }

   /**
   * Get customerfreightamount
   * @return customerfreightamount
  **/
  @javax.annotation.Nullable
  public Double getCustomerfreightamount() {
    return customerfreightamount;
  }

  public void setCustomerfreightamount(Double customerfreightamount) {
    this.customerfreightamount = customerfreightamount;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse customerforeignfrightamt(Float customerforeignfrightamt) {
    this.customerforeignfrightamt = customerforeignfrightamt;
    return this;
  }

   /**
   * Get customerforeignfrightamt
   * @return customerforeignfrightamt
  **/
  @javax.annotation.Nullable
  public Float getCustomerforeignfrightamt() {
    return customerforeignfrightamt;
  }

  public void setCustomerforeignfrightamt(Float customerforeignfrightamt) {
    this.customerforeignfrightamt = customerforeignfrightamt;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse totaltaxamount(Double totaltaxamount) {
    this.totaltaxamount = totaltaxamount;
    return this;
  }

   /**
   * Get totaltaxamount
   * @return totaltaxamount
  **/
  @javax.annotation.Nullable
  public Double getTotaltaxamount() {
    return totaltaxamount;
  }

  public void setTotaltaxamount(Double totaltaxamount) {
    this.totaltaxamount = totaltaxamount;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse totalamount(Double totalamount) {
    this.totalamount = totalamount;
    return this;
  }

   /**
   * Get totalamount
   * @return totalamount
  **/
  @javax.annotation.Nullable
  public Double getTotalamount() {
    return totalamount;
  }

  public void setTotalamount(Double totalamount) {
    this.totalamount = totalamount;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse shiptosuffix(String shiptosuffix) {
    this.shiptosuffix = shiptosuffix;
    return this;
  }

   /**
   * Get shiptosuffix
   * @return shiptosuffix
  **/
  @javax.annotation.Nullable
  public String getShiptosuffix() {
    return shiptosuffix;
  }

  public void setShiptosuffix(String shiptosuffix) {
    this.shiptosuffix = shiptosuffix;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse billtosuffix(String billtosuffix) {
    this.billtosuffix = billtosuffix;
    return this;
  }

   /**
   * Get billtosuffix
   * @return billtosuffix
  **/
  @javax.annotation.Nullable
  public String getBilltosuffix() {
    return billtosuffix;
  }

  public void setBilltosuffix(String billtosuffix) {
    this.billtosuffix = billtosuffix;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse freightamount(Double freightamount) {
    this.freightamount = freightamount;
    return this;
  }

   /**
   * Get freightamount
   * @return freightamount
  **/
  @javax.annotation.Nullable
  public Double getFreightamount() {
    return freightamount;
  }

  public void setFreightamount(Double freightamount) {
    this.freightamount = freightamount;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse paymentterms(String paymentterms) {
    this.paymentterms = paymentterms;
    return this;
  }

   /**
   * Get paymentterms
   * @return paymentterms
  **/
  @javax.annotation.Nullable
  public String getPaymentterms() {
    return paymentterms;
  }

  public void setPaymentterms(String paymentterms) {
    this.paymentterms = paymentterms;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse orderdate(String orderdate) {
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


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @javax.annotation.Nullable
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse carrierdescription(String carrierdescription) {
    this.carrierdescription = carrierdescription;
    return this;
  }

   /**
   * Get carrierdescription
   * @return carrierdescription
  **/
  @javax.annotation.Nullable
  public String getCarrierdescription() {
    return carrierdescription;
  }

  public void setCarrierdescription(String carrierdescription) {
    this.carrierdescription = carrierdescription;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse discountamount(Double discountamount) {
    this.discountamount = discountamount;
    return this;
  }

   /**
   * Get discountamount
   * @return discountamount
  **/
  @javax.annotation.Nullable
  public Double getDiscountamount() {
    return discountamount;
  }

  public void setDiscountamount(Double discountamount) {
    this.discountamount = discountamount;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse taxtype(String taxtype) {
    this.taxtype = taxtype;
    return this;
  }

   /**
   * Get taxtype
   * @return taxtype
  **/
  @javax.annotation.Nullable
  public String getTaxtype() {
    return taxtype;
  }

  public void setTaxtype(String taxtype) {
    this.taxtype = taxtype;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse enduserponumber(String enduserponumber) {
    this.enduserponumber = enduserponumber;
    return this;
  }

   /**
   * Get enduserponumber
   * @return enduserponumber
  **/
  @javax.annotation.Nullable
  public String getEnduserponumber() {
    return enduserponumber;
  }

  public void setEnduserponumber(String enduserponumber) {
    this.enduserponumber = enduserponumber;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse freightforwardercode(String freightforwardercode) {
    this.freightforwardercode = freightforwardercode;
    return this;
  }

   /**
   * Get freightforwardercode
   * @return freightforwardercode
  **/
  @javax.annotation.Nullable
  public String getFreightforwardercode() {
    return freightforwardercode;
  }

  public void setFreightforwardercode(String freightforwardercode) {
    this.freightforwardercode = freightforwardercode;
  }


  public InvoiceDetailResponseServiceresponseInvoicedetailresponse creditmemoreasoncode(String creditmemoreasoncode) {
    this.creditmemoreasoncode = creditmemoreasoncode;
    return this;
  }

   /**
   * Get creditmemoreasoncode
   * @return creditmemoreasoncode
  **/
  @javax.annotation.Nullable
  public String getCreditmemoreasoncode() {
    return creditmemoreasoncode;
  }

  public void setCreditmemoreasoncode(String creditmemoreasoncode) {
    this.creditmemoreasoncode = creditmemoreasoncode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailResponseServiceresponseInvoicedetailresponse invoiceDetailResponseServiceresponseInvoicedetailresponse = (InvoiceDetailResponseServiceresponseInvoicedetailresponse) o;
    return Objects.equals(this.customernumber, invoiceDetailResponseServiceresponseInvoicedetailresponse.customernumber) &&
        Objects.equals(this.invoicenumber, invoiceDetailResponseServiceresponseInvoicedetailresponse.invoicenumber) &&
        Objects.equals(this.invoicedate, invoiceDetailResponseServiceresponseInvoicedetailresponse.invoicedate) &&
        Objects.equals(this.invoicetype, invoiceDetailResponseServiceresponseInvoicedetailresponse.invoicetype) &&
        Objects.equals(this.customerordernumber, invoiceDetailResponseServiceresponseInvoicedetailresponse.customerordernumber) &&
        Objects.equals(this.customerfreightamount, invoiceDetailResponseServiceresponseInvoicedetailresponse.customerfreightamount) &&
        Objects.equals(this.customerforeignfrightamt, invoiceDetailResponseServiceresponseInvoicedetailresponse.customerforeignfrightamt) &&
        Objects.equals(this.totaltaxamount, invoiceDetailResponseServiceresponseInvoicedetailresponse.totaltaxamount) &&
        Objects.equals(this.totalamount, invoiceDetailResponseServiceresponseInvoicedetailresponse.totalamount) &&
        Objects.equals(this.shiptosuffix, invoiceDetailResponseServiceresponseInvoicedetailresponse.shiptosuffix) &&
        Objects.equals(this.billtosuffix, invoiceDetailResponseServiceresponseInvoicedetailresponse.billtosuffix) &&
        Objects.equals(this.freightamount, invoiceDetailResponseServiceresponseInvoicedetailresponse.freightamount) &&
        Objects.equals(this.paymentterms, invoiceDetailResponseServiceresponseInvoicedetailresponse.paymentterms) &&
        Objects.equals(this.orderdate, invoiceDetailResponseServiceresponseInvoicedetailresponse.orderdate) &&
        Objects.equals(this.carrier, invoiceDetailResponseServiceresponseInvoicedetailresponse.carrier) &&
        Objects.equals(this.carrierdescription, invoiceDetailResponseServiceresponseInvoicedetailresponse.carrierdescription) &&
        Objects.equals(this.discountamount, invoiceDetailResponseServiceresponseInvoicedetailresponse.discountamount) &&
        Objects.equals(this.taxtype, invoiceDetailResponseServiceresponseInvoicedetailresponse.taxtype) &&
        Objects.equals(this.enduserponumber, invoiceDetailResponseServiceresponseInvoicedetailresponse.enduserponumber) &&
        Objects.equals(this.freightforwardercode, invoiceDetailResponseServiceresponseInvoicedetailresponse.freightforwardercode) &&
        Objects.equals(this.creditmemoreasoncode, invoiceDetailResponseServiceresponseInvoicedetailresponse.creditmemoreasoncode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customernumber, invoicenumber, invoicedate, invoicetype, customerordernumber, customerfreightamount, customerforeignfrightamt, totaltaxamount, totalamount, shiptosuffix, billtosuffix, freightamount, paymentterms, orderdate, carrier, carrierdescription, discountamount, taxtype, enduserponumber, freightforwardercode, creditmemoreasoncode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailResponseServiceresponseInvoicedetailresponse {\n");
    sb.append("    customernumber: ").append(toIndentedString(customernumber)).append("\n");
    sb.append("    invoicenumber: ").append(toIndentedString(invoicenumber)).append("\n");
    sb.append("    invoicedate: ").append(toIndentedString(invoicedate)).append("\n");
    sb.append("    invoicetype: ").append(toIndentedString(invoicetype)).append("\n");
    sb.append("    customerordernumber: ").append(toIndentedString(customerordernumber)).append("\n");
    sb.append("    customerfreightamount: ").append(toIndentedString(customerfreightamount)).append("\n");
    sb.append("    customerforeignfrightamt: ").append(toIndentedString(customerforeignfrightamt)).append("\n");
    sb.append("    totaltaxamount: ").append(toIndentedString(totaltaxamount)).append("\n");
    sb.append("    totalamount: ").append(toIndentedString(totalamount)).append("\n");
    sb.append("    shiptosuffix: ").append(toIndentedString(shiptosuffix)).append("\n");
    sb.append("    billtosuffix: ").append(toIndentedString(billtosuffix)).append("\n");
    sb.append("    freightamount: ").append(toIndentedString(freightamount)).append("\n");
    sb.append("    paymentterms: ").append(toIndentedString(paymentterms)).append("\n");
    sb.append("    orderdate: ").append(toIndentedString(orderdate)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    carrierdescription: ").append(toIndentedString(carrierdescription)).append("\n");
    sb.append("    discountamount: ").append(toIndentedString(discountamount)).append("\n");
    sb.append("    taxtype: ").append(toIndentedString(taxtype)).append("\n");
    sb.append("    enduserponumber: ").append(toIndentedString(enduserponumber)).append("\n");
    sb.append("    freightforwardercode: ").append(toIndentedString(freightforwardercode)).append("\n");
    sb.append("    creditmemoreasoncode: ").append(toIndentedString(creditmemoreasoncode)).append("\n");
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
    openapiFields.add("customernumber");
    openapiFields.add("invoicenumber");
    openapiFields.add("invoicedate");
    openapiFields.add("invoicetype");
    openapiFields.add("customerordernumber");
    openapiFields.add("customerfreightamount");
    openapiFields.add("customerforeignfrightamt");
    openapiFields.add("totaltaxamount");
    openapiFields.add("totalamount");
    openapiFields.add("shiptosuffix");
    openapiFields.add("billtosuffix");
    openapiFields.add("freightamount");
    openapiFields.add("paymentterms");
    openapiFields.add("orderdate");
    openapiFields.add("carrier");
    openapiFields.add("carrierdescription");
    openapiFields.add("discountamount");
    openapiFields.add("taxtype");
    openapiFields.add("enduserponumber");
    openapiFields.add("freightforwardercode");
    openapiFields.add("creditmemoreasoncode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailResponseServiceresponseInvoicedetailresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailResponseServiceresponseInvoicedetailresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailResponseServiceresponseInvoicedetailresponse is not found in the empty JSON string", InvoiceDetailResponseServiceresponseInvoicedetailresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailResponseServiceresponseInvoicedetailresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailResponseServiceresponseInvoicedetailresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customernumber") != null && !jsonObj.get("customernumber").isJsonNull()) && !jsonObj.get("customernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customernumber").toString()));
      }
      if ((jsonObj.get("invoicenumber") != null && !jsonObj.get("invoicenumber").isJsonNull()) && !jsonObj.get("invoicenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoicenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoicenumber").toString()));
      }
      if ((jsonObj.get("invoicetype") != null && !jsonObj.get("invoicetype").isJsonNull()) && !jsonObj.get("invoicetype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoicetype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoicetype").toString()));
      }
      if ((jsonObj.get("customerordernumber") != null && !jsonObj.get("customerordernumber").isJsonNull()) && !jsonObj.get("customerordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerordernumber").toString()));
      }
      if ((jsonObj.get("shiptosuffix") != null && !jsonObj.get("shiptosuffix").isJsonNull()) && !jsonObj.get("shiptosuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shiptosuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shiptosuffix").toString()));
      }
      if ((jsonObj.get("billtosuffix") != null && !jsonObj.get("billtosuffix").isJsonNull()) && !jsonObj.get("billtosuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billtosuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billtosuffix").toString()));
      }
      if ((jsonObj.get("paymentterms") != null && !jsonObj.get("paymentterms").isJsonNull()) && !jsonObj.get("paymentterms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentterms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentterms").toString()));
      }
      if ((jsonObj.get("orderdate") != null && !jsonObj.get("orderdate").isJsonNull()) && !jsonObj.get("orderdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderdate").toString()));
      }
      if ((jsonObj.get("carrier") != null && !jsonObj.get("carrier").isJsonNull()) && !jsonObj.get("carrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier").toString()));
      }
      if ((jsonObj.get("carrierdescription") != null && !jsonObj.get("carrierdescription").isJsonNull()) && !jsonObj.get("carrierdescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierdescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierdescription").toString()));
      }
      if ((jsonObj.get("taxtype") != null && !jsonObj.get("taxtype").isJsonNull()) && !jsonObj.get("taxtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxtype").toString()));
      }
      if ((jsonObj.get("enduserponumber") != null && !jsonObj.get("enduserponumber").isJsonNull()) && !jsonObj.get("enduserponumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enduserponumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enduserponumber").toString()));
      }
      if ((jsonObj.get("freightforwardercode") != null && !jsonObj.get("freightforwardercode").isJsonNull()) && !jsonObj.get("freightforwardercode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freightforwardercode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freightforwardercode").toString()));
      }
      if ((jsonObj.get("creditmemoreasoncode") != null && !jsonObj.get("creditmemoreasoncode").isJsonNull()) && !jsonObj.get("creditmemoreasoncode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditmemoreasoncode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditmemoreasoncode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailResponseServiceresponseInvoicedetailresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailResponseServiceresponseInvoicedetailresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailResponseServiceresponseInvoicedetailresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailResponseServiceresponseInvoicedetailresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailResponseServiceresponseInvoicedetailresponse>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailResponseServiceresponseInvoicedetailresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailResponseServiceresponseInvoicedetailresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailResponseServiceresponseInvoicedetailresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailResponseServiceresponseInvoicedetailresponse
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailResponseServiceresponseInvoicedetailresponse
  */
  public static InvoiceDetailResponseServiceresponseInvoicedetailresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailResponseServiceresponseInvoicedetailresponse.class);
  }

 /**
  * Convert an instance of InvoiceDetailResponseServiceresponseInvoicedetailresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

