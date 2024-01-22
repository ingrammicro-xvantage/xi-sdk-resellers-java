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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseBilltoaddress;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseEnduserinfo;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseLinesInner;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseShiptoaddress;

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
 * OrderDetailResponseServiceresponseOrderdetailresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T11:06:29.712836Z[Etc/UTC]")
public class OrderDetailResponseServiceresponseOrderdetailresponse {
  public static final String SERIALIZED_NAME_ORDERNUMBER = "ordernumber";
  @SerializedName(SERIALIZED_NAME_ORDERNUMBER)
  private String ordernumber;

  public static final String SERIALIZED_NAME_ORDERTYPE = "ordertype";
  @SerializedName(SERIALIZED_NAME_ORDERTYPE)
  private String ordertype;

  public static final String SERIALIZED_NAME_CUSTOMERORDERNUMBER = "customerordernumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERORDERNUMBER)
  private String customerordernumber;

  public static final String SERIALIZED_NAME_ENDUSERPONUMBER = "enduserponumber";
  @SerializedName(SERIALIZED_NAME_ENDUSERPONUMBER)
  private String enduserponumber;

  public static final String SERIALIZED_NAME_ORDERSTATUS = "orderstatus";
  @SerializedName(SERIALIZED_NAME_ORDERSTATUS)
  private String orderstatus;

  public static final String SERIALIZED_NAME_ENTRYTIMESTAMP = "entrytimestamp";
  @SerializedName(SERIALIZED_NAME_ENTRYTIMESTAMP)
  private String entrytimestamp;

  public static final String SERIALIZED_NAME_ENTRYMETHODDESCRIPTION = "entrymethoddescription";
  @SerializedName(SERIALIZED_NAME_ENTRYMETHODDESCRIPTION)
  private String entrymethoddescription;

  public static final String SERIALIZED_NAME_ORDERTOTALVALUE = "ordertotalvalue";
  @SerializedName(SERIALIZED_NAME_ORDERTOTALVALUE)
  private BigDecimal ordertotalvalue;

  public static final String SERIALIZED_NAME_ORDERSUBTOTAL = "ordersubtotal";
  @SerializedName(SERIALIZED_NAME_ORDERSUBTOTAL)
  private BigDecimal ordersubtotal;

  public static final String SERIALIZED_NAME_FREIGHTAMOUNT = "freightamount";
  @SerializedName(SERIALIZED_NAME_FREIGHTAMOUNT)
  private String freightamount;

  public static final String SERIALIZED_NAME_CURRENCYCODE = "currencycode";
  @SerializedName(SERIALIZED_NAME_CURRENCYCODE)
  private String currencycode;

  public static final String SERIALIZED_NAME_TOTALWEIGHT = "totalweight";
  @SerializedName(SERIALIZED_NAME_TOTALWEIGHT)
  private String totalweight;

  public static final String SERIALIZED_NAME_TOTALTAX = "totaltax";
  @SerializedName(SERIALIZED_NAME_TOTALTAX)
  private String totaltax;

  public static final String SERIALIZED_NAME_BILLTOADDRESS = "billtoaddress";
  @SerializedName(SERIALIZED_NAME_BILLTOADDRESS)
  private OrderDetailResponseServiceresponseOrderdetailresponseBilltoaddress billtoaddress;

  public static final String SERIALIZED_NAME_SHIPTOADDRESS = "shiptoaddress";
  @SerializedName(SERIALIZED_NAME_SHIPTOADDRESS)
  private OrderDetailResponseServiceresponseOrderdetailresponseShiptoaddress shiptoaddress;

  public static final String SERIALIZED_NAME_ENDUSERINFO = "enduserinfo";
  @SerializedName(SERIALIZED_NAME_ENDUSERINFO)
  private OrderDetailResponseServiceresponseOrderdetailresponseEnduserinfo enduserinfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInner> lines;

  public static final String SERIALIZED_NAME_COMMENTLINES = "commentlines";
  @SerializedName(SERIALIZED_NAME_COMMENTLINES)
  private List<OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner> commentlines;

  public static final String SERIALIZED_NAME_MISCFEELINE = "miscfeeline";
  @SerializedName(SERIALIZED_NAME_MISCFEELINE)
  private List<OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner> miscfeeline;

  public static final String SERIALIZED_NAME_EXTENDEDSPECS = "extendedspecs";
  @SerializedName(SERIALIZED_NAME_EXTENDEDSPECS)
  private List<OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner> extendedspecs;

  public OrderDetailResponseServiceresponseOrderdetailresponse() {
  }

  public OrderDetailResponseServiceresponseOrderdetailresponse ordernumber(String ordernumber) {
    this.ordernumber = ordernumber;
    return this;
  }

   /**
   * Get ordernumber
   * @return ordernumber
  **/
  @javax.annotation.Nullable
  public String getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(String ordernumber) {
    this.ordernumber = ordernumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse ordertype(String ordertype) {
    this.ordertype = ordertype;
    return this;
  }

   /**
   * Order Type   B - BRANCH TRANSFER C - CASH ORDER D - DIRECT ORDER F - FUTURE ORDER P - SPECIAL ORDER Q - QUOTE ORDER S - STOCK ORDER M - MEMO ORDER
   * @return ordertype
  **/
  @javax.annotation.Nullable
  public String getOrdertype() {
    return ordertype;
  }

  public void setOrdertype(String ordertype) {
    this.ordertype = ordertype;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse customerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
    return this;
  }

   /**
   * Customer PO number
   * @return customerordernumber
  **/
  @javax.annotation.Nullable
  public String getCustomerordernumber() {
    return customerordernumber;
  }

  public void setCustomerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse enduserponumber(String enduserponumber) {
    this.enduserponumber = enduserponumber;
    return this;
  }

   /**
   * End User PO number
   * @return enduserponumber
  **/
  @javax.annotation.Nullable
  public String getEnduserponumber() {
    return enduserponumber;
  }

  public void setEnduserponumber(String enduserponumber) {
    this.enduserponumber = enduserponumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse orderstatus(String orderstatus) {
    this.orderstatus = orderstatus;
    return this;
  }

   /**
   * Status of order within Ingram system S - SALES HOLD H - TAG HOLD I - INVOICED P - PENDING E - BILLING ERROR F - FORCE BILLING V - VOIDED T - TRANSFERRED D - HOLD SHIPMENT R - RELEASED O - IM ONLINE HOLD U - BILL FOR HISTORY ONLY W - ORDER NOT PRINTED A - DROP SHIP HOLD B - INTERNET CUST ORIG HOLD 1 - PICKED 2 - INSPECTED 3 - PACKED 4 - SHIPPED C - CREDIT HOLD 9 - CISCO 3A6 Q - RMA HOLD G - CREDIT HOLD N - CREDIT HOLD
   * @return orderstatus
  **/
  @javax.annotation.Nullable
  public String getOrderstatus() {
    return orderstatus;
  }

  public void setOrderstatus(String orderstatus) {
    this.orderstatus = orderstatus;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse entrytimestamp(String entrytimestamp) {
    this.entrytimestamp = entrytimestamp;
    return this;
  }

   /**
   * Time stamp of the order placed
   * @return entrytimestamp
  **/
  @javax.annotation.Nullable
  public String getEntrytimestamp() {
    return entrytimestamp;
  }

  public void setEntrytimestamp(String entrytimestamp) {
    this.entrytimestamp = entrytimestamp;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse entrymethoddescription(String entrymethoddescription) {
    this.entrymethoddescription = entrymethoddescription;
    return this;
  }

   /**
   * Description of the entry method 
   * @return entrymethoddescription
  **/
  @javax.annotation.Nullable
  public String getEntrymethoddescription() {
    return entrymethoddescription;
  }

  public void setEntrymethoddescription(String entrymethoddescription) {
    this.entrymethoddescription = entrymethoddescription;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse ordertotalvalue(BigDecimal ordertotalvalue) {
    this.ordertotalvalue = ordertotalvalue;
    return this;
  }

   /**
   * Total order value
   * @return ordertotalvalue
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrdertotalvalue() {
    return ordertotalvalue;
  }

  public void setOrdertotalvalue(BigDecimal ordertotalvalue) {
    this.ordertotalvalue = ordertotalvalue;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse ordersubtotal(BigDecimal ordersubtotal) {
    this.ordersubtotal = ordersubtotal;
    return this;
  }

   /**
   * Subtotal order value
   * @return ordersubtotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getOrdersubtotal() {
    return ordersubtotal;
  }

  public void setOrdersubtotal(BigDecimal ordersubtotal) {
    this.ordersubtotal = ordersubtotal;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse freightamount(String freightamount) {
    this.freightamount = freightamount;
    return this;
  }

   /**
   * Freight charges
   * @return freightamount
  **/
  @javax.annotation.Nullable
  public String getFreightamount() {
    return freightamount;
  }

  public void setFreightamount(String freightamount) {
    this.freightamount = freightamount;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse currencycode(String currencycode) {
    this.currencycode = currencycode;
    return this;
  }

   /**
   * Country specific currency code
   * @return currencycode
  **/
  @javax.annotation.Nullable
  public String getCurrencycode() {
    return currencycode;
  }

  public void setCurrencycode(String currencycode) {
    this.currencycode = currencycode;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse totalweight(String totalweight) {
    this.totalweight = totalweight;
    return this;
  }

   /**
   * Total order weight. unit -- North america - Pounds , other countries will be KG
   * @return totalweight
  **/
  @javax.annotation.Nullable
  public String getTotalweight() {
    return totalweight;
  }

  public void setTotalweight(String totalweight) {
    this.totalweight = totalweight;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse totaltax(String totaltax) {
    this.totaltax = totaltax;
    return this;
  }

   /**
   * total tax on the orders placed
   * @return totaltax
  **/
  @javax.annotation.Nullable
  public String getTotaltax() {
    return totaltax;
  }

  public void setTotaltax(String totaltax) {
    this.totaltax = totaltax;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse billtoaddress(OrderDetailResponseServiceresponseOrderdetailresponseBilltoaddress billtoaddress) {
    this.billtoaddress = billtoaddress;
    return this;
  }

   /**
   * Get billtoaddress
   * @return billtoaddress
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseServiceresponseOrderdetailresponseBilltoaddress getBilltoaddress() {
    return billtoaddress;
  }

  public void setBilltoaddress(OrderDetailResponseServiceresponseOrderdetailresponseBilltoaddress billtoaddress) {
    this.billtoaddress = billtoaddress;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse shiptoaddress(OrderDetailResponseServiceresponseOrderdetailresponseShiptoaddress shiptoaddress) {
    this.shiptoaddress = shiptoaddress;
    return this;
  }

   /**
   * Get shiptoaddress
   * @return shiptoaddress
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseServiceresponseOrderdetailresponseShiptoaddress getShiptoaddress() {
    return shiptoaddress;
  }

  public void setShiptoaddress(OrderDetailResponseServiceresponseOrderdetailresponseShiptoaddress shiptoaddress) {
    this.shiptoaddress = shiptoaddress;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse enduserinfo(OrderDetailResponseServiceresponseOrderdetailresponseEnduserinfo enduserinfo) {
    this.enduserinfo = enduserinfo;
    return this;
  }

   /**
   * Get enduserinfo
   * @return enduserinfo
  **/
  @javax.annotation.Nullable
  public OrderDetailResponseServiceresponseOrderdetailresponseEnduserinfo getEnduserinfo() {
    return enduserinfo;
  }

  public void setEnduserinfo(OrderDetailResponseServiceresponseOrderdetailresponseEnduserinfo enduserinfo) {
    this.enduserinfo = enduserinfo;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse lines(List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponse addLinesItem(OrderDetailResponseServiceresponseOrderdetailresponseLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInner> lines) {
    this.lines = lines;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse commentlines(List<OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner> commentlines) {
    this.commentlines = commentlines;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponse addCommentlinesItem(OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner commentlinesItem) {
    if (this.commentlines == null) {
      this.commentlines = new ArrayList<>();
    }
    this.commentlines.add(commentlinesItem);
    return this;
  }

   /**
   * Get commentlines
   * @return commentlines
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner> getCommentlines() {
    return commentlines;
  }

  public void setCommentlines(List<OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner> commentlines) {
    this.commentlines = commentlines;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse miscfeeline(List<OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner> miscfeeline) {
    this.miscfeeline = miscfeeline;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponse addMiscfeelineItem(OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner miscfeelineItem) {
    if (this.miscfeeline == null) {
      this.miscfeeline = new ArrayList<>();
    }
    this.miscfeeline.add(miscfeelineItem);
    return this;
  }

   /**
   * Get miscfeeline
   * @return miscfeeline
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner> getMiscfeeline() {
    return miscfeeline;
  }

  public void setMiscfeeline(List<OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner> miscfeeline) {
    this.miscfeeline = miscfeeline;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponse extendedspecs(List<OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner> extendedspecs) {
    this.extendedspecs = extendedspecs;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponse addExtendedspecsItem(OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner extendedspecsItem) {
    if (this.extendedspecs == null) {
      this.extendedspecs = new ArrayList<>();
    }
    this.extendedspecs.add(extendedspecsItem);
    return this;
  }

   /**
   * Get extendedspecs
   * @return extendedspecs
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner> getExtendedspecs() {
    return extendedspecs;
  }

  public void setExtendedspecs(List<OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner> extendedspecs) {
    this.extendedspecs = extendedspecs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponseServiceresponseOrderdetailresponse orderDetailResponseServiceresponseOrderdetailresponse = (OrderDetailResponseServiceresponseOrderdetailresponse) o;
    return Objects.equals(this.ordernumber, orderDetailResponseServiceresponseOrderdetailresponse.ordernumber) &&
        Objects.equals(this.ordertype, orderDetailResponseServiceresponseOrderdetailresponse.ordertype) &&
        Objects.equals(this.customerordernumber, orderDetailResponseServiceresponseOrderdetailresponse.customerordernumber) &&
        Objects.equals(this.enduserponumber, orderDetailResponseServiceresponseOrderdetailresponse.enduserponumber) &&
        Objects.equals(this.orderstatus, orderDetailResponseServiceresponseOrderdetailresponse.orderstatus) &&
        Objects.equals(this.entrytimestamp, orderDetailResponseServiceresponseOrderdetailresponse.entrytimestamp) &&
        Objects.equals(this.entrymethoddescription, orderDetailResponseServiceresponseOrderdetailresponse.entrymethoddescription) &&
        Objects.equals(this.ordertotalvalue, orderDetailResponseServiceresponseOrderdetailresponse.ordertotalvalue) &&
        Objects.equals(this.ordersubtotal, orderDetailResponseServiceresponseOrderdetailresponse.ordersubtotal) &&
        Objects.equals(this.freightamount, orderDetailResponseServiceresponseOrderdetailresponse.freightamount) &&
        Objects.equals(this.currencycode, orderDetailResponseServiceresponseOrderdetailresponse.currencycode) &&
        Objects.equals(this.totalweight, orderDetailResponseServiceresponseOrderdetailresponse.totalweight) &&
        Objects.equals(this.totaltax, orderDetailResponseServiceresponseOrderdetailresponse.totaltax) &&
        Objects.equals(this.billtoaddress, orderDetailResponseServiceresponseOrderdetailresponse.billtoaddress) &&
        Objects.equals(this.shiptoaddress, orderDetailResponseServiceresponseOrderdetailresponse.shiptoaddress) &&
        Objects.equals(this.enduserinfo, orderDetailResponseServiceresponseOrderdetailresponse.enduserinfo) &&
        Objects.equals(this.lines, orderDetailResponseServiceresponseOrderdetailresponse.lines) &&
        Objects.equals(this.commentlines, orderDetailResponseServiceresponseOrderdetailresponse.commentlines) &&
        Objects.equals(this.miscfeeline, orderDetailResponseServiceresponseOrderdetailresponse.miscfeeline) &&
        Objects.equals(this.extendedspecs, orderDetailResponseServiceresponseOrderdetailresponse.extendedspecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordernumber, ordertype, customerordernumber, enduserponumber, orderstatus, entrytimestamp, entrymethoddescription, ordertotalvalue, ordersubtotal, freightamount, currencycode, totalweight, totaltax, billtoaddress, shiptoaddress, enduserinfo, lines, commentlines, miscfeeline, extendedspecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponseServiceresponseOrderdetailresponse {\n");
    sb.append("    ordernumber: ").append(toIndentedString(ordernumber)).append("\n");
    sb.append("    ordertype: ").append(toIndentedString(ordertype)).append("\n");
    sb.append("    customerordernumber: ").append(toIndentedString(customerordernumber)).append("\n");
    sb.append("    enduserponumber: ").append(toIndentedString(enduserponumber)).append("\n");
    sb.append("    orderstatus: ").append(toIndentedString(orderstatus)).append("\n");
    sb.append("    entrytimestamp: ").append(toIndentedString(entrytimestamp)).append("\n");
    sb.append("    entrymethoddescription: ").append(toIndentedString(entrymethoddescription)).append("\n");
    sb.append("    ordertotalvalue: ").append(toIndentedString(ordertotalvalue)).append("\n");
    sb.append("    ordersubtotal: ").append(toIndentedString(ordersubtotal)).append("\n");
    sb.append("    freightamount: ").append(toIndentedString(freightamount)).append("\n");
    sb.append("    currencycode: ").append(toIndentedString(currencycode)).append("\n");
    sb.append("    totalweight: ").append(toIndentedString(totalweight)).append("\n");
    sb.append("    totaltax: ").append(toIndentedString(totaltax)).append("\n");
    sb.append("    billtoaddress: ").append(toIndentedString(billtoaddress)).append("\n");
    sb.append("    shiptoaddress: ").append(toIndentedString(shiptoaddress)).append("\n");
    sb.append("    enduserinfo: ").append(toIndentedString(enduserinfo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    commentlines: ").append(toIndentedString(commentlines)).append("\n");
    sb.append("    miscfeeline: ").append(toIndentedString(miscfeeline)).append("\n");
    sb.append("    extendedspecs: ").append(toIndentedString(extendedspecs)).append("\n");
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
    openapiFields.add("ordernumber");
    openapiFields.add("ordertype");
    openapiFields.add("customerordernumber");
    openapiFields.add("enduserponumber");
    openapiFields.add("orderstatus");
    openapiFields.add("entrytimestamp");
    openapiFields.add("entrymethoddescription");
    openapiFields.add("ordertotalvalue");
    openapiFields.add("ordersubtotal");
    openapiFields.add("freightamount");
    openapiFields.add("currencycode");
    openapiFields.add("totalweight");
    openapiFields.add("totaltax");
    openapiFields.add("billtoaddress");
    openapiFields.add("shiptoaddress");
    openapiFields.add("enduserinfo");
    openapiFields.add("lines");
    openapiFields.add("commentlines");
    openapiFields.add("miscfeeline");
    openapiFields.add("extendedspecs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponseServiceresponseOrderdetailresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponseServiceresponseOrderdetailresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponseServiceresponseOrderdetailresponse is not found in the empty JSON string", OrderDetailResponseServiceresponseOrderdetailresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponseServiceresponseOrderdetailresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponseServiceresponseOrderdetailresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ordernumber") != null && !jsonObj.get("ordernumber").isJsonNull()) && !jsonObj.get("ordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordernumber").toString()));
      }
      if ((jsonObj.get("ordertype") != null && !jsonObj.get("ordertype").isJsonNull()) && !jsonObj.get("ordertype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordertype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordertype").toString()));
      }
      if ((jsonObj.get("customerordernumber") != null && !jsonObj.get("customerordernumber").isJsonNull()) && !jsonObj.get("customerordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerordernumber").toString()));
      }
      if ((jsonObj.get("enduserponumber") != null && !jsonObj.get("enduserponumber").isJsonNull()) && !jsonObj.get("enduserponumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enduserponumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enduserponumber").toString()));
      }
      if ((jsonObj.get("orderstatus") != null && !jsonObj.get("orderstatus").isJsonNull()) && !jsonObj.get("orderstatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderstatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderstatus").toString()));
      }
      if ((jsonObj.get("entrytimestamp") != null && !jsonObj.get("entrytimestamp").isJsonNull()) && !jsonObj.get("entrytimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entrytimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entrytimestamp").toString()));
      }
      if ((jsonObj.get("entrymethoddescription") != null && !jsonObj.get("entrymethoddescription").isJsonNull()) && !jsonObj.get("entrymethoddescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entrymethoddescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entrymethoddescription").toString()));
      }
      if ((jsonObj.get("freightamount") != null && !jsonObj.get("freightamount").isJsonNull()) && !jsonObj.get("freightamount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freightamount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freightamount").toString()));
      }
      if ((jsonObj.get("currencycode") != null && !jsonObj.get("currencycode").isJsonNull()) && !jsonObj.get("currencycode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencycode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencycode").toString()));
      }
      if ((jsonObj.get("totalweight") != null && !jsonObj.get("totalweight").isJsonNull()) && !jsonObj.get("totalweight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalweight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalweight").toString()));
      }
      if ((jsonObj.get("totaltax") != null && !jsonObj.get("totaltax").isJsonNull()) && !jsonObj.get("totaltax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totaltax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totaltax").toString()));
      }
      // validate the optional field `billtoaddress`
      if (jsonObj.get("billtoaddress") != null && !jsonObj.get("billtoaddress").isJsonNull()) {
        OrderDetailResponseServiceresponseOrderdetailresponseBilltoaddress.validateJsonElement(jsonObj.get("billtoaddress"));
      }
      // validate the optional field `shiptoaddress`
      if (jsonObj.get("shiptoaddress") != null && !jsonObj.get("shiptoaddress").isJsonNull()) {
        OrderDetailResponseServiceresponseOrderdetailresponseShiptoaddress.validateJsonElement(jsonObj.get("shiptoaddress"));
      }
      // validate the optional field `enduserinfo`
      if (jsonObj.get("enduserinfo") != null && !jsonObj.get("enduserinfo").isJsonNull()) {
        OrderDetailResponseServiceresponseOrderdetailresponseEnduserinfo.validateJsonElement(jsonObj.get("enduserinfo"));
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if (jsonObj.get("commentlines") != null && !jsonObj.get("commentlines").isJsonNull()) {
        JsonArray jsonArraycommentlines = jsonObj.getAsJsonArray("commentlines");
        if (jsonArraycommentlines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("commentlines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `commentlines` to be an array in the JSON string but got `%s`", jsonObj.get("commentlines").toString()));
          }

          // validate the optional field `commentlines` (array)
          for (int i = 0; i < jsonArraycommentlines.size(); i++) {
            OrderDetailResponseServiceresponseOrderdetailresponseCommentlinesInner.validateJsonElement(jsonArraycommentlines.get(i));
          };
        }
      }
      if (jsonObj.get("miscfeeline") != null && !jsonObj.get("miscfeeline").isJsonNull()) {
        JsonArray jsonArraymiscfeeline = jsonObj.getAsJsonArray("miscfeeline");
        if (jsonArraymiscfeeline != null) {
          // ensure the json data is an array
          if (!jsonObj.get("miscfeeline").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `miscfeeline` to be an array in the JSON string but got `%s`", jsonObj.get("miscfeeline").toString()));
          }

          // validate the optional field `miscfeeline` (array)
          for (int i = 0; i < jsonArraymiscfeeline.size(); i++) {
            OrderDetailResponseServiceresponseOrderdetailresponseMiscfeelineInner.validateJsonElement(jsonArraymiscfeeline.get(i));
          };
        }
      }
      if (jsonObj.get("extendedspecs") != null && !jsonObj.get("extendedspecs").isJsonNull()) {
        JsonArray jsonArrayextendedspecs = jsonObj.getAsJsonArray("extendedspecs");
        if (jsonArrayextendedspecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extendedspecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extendedspecs` to be an array in the JSON string but got `%s`", jsonObj.get("extendedspecs").toString()));
          }

          // validate the optional field `extendedspecs` (array)
          for (int i = 0; i < jsonArrayextendedspecs.size(); i++) {
            OrderDetailResponseServiceresponseOrderdetailresponseExtendedspecsInner.validateJsonElement(jsonArrayextendedspecs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponseServiceresponseOrderdetailresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponseServiceresponseOrderdetailresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponseServiceresponseOrderdetailresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponseServiceresponseOrderdetailresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponseServiceresponseOrderdetailresponse>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponseServiceresponseOrderdetailresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponseServiceresponseOrderdetailresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponseServiceresponseOrderdetailresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponseServiceresponseOrderdetailresponse
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponseServiceresponseOrderdetailresponse
  */
  public static OrderDetailResponseServiceresponseOrderdetailresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponseServiceresponseOrderdetailresponse.class);
  }

 /**
  * Convert an instance of OrderDetailResponseServiceresponseOrderdetailresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

