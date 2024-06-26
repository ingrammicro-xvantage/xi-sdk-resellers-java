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


package xiresellers.client.api;

import xiresellers.client.ApiException;
import xiresellers.client.model.ErrorResponse;
import xiresellers.client.model.InvoiceDetailsv61Response;
import xiresellers.client.model.InvoiceSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
@Disabled
public class InvoicesApiTest {

    private final InvoicesApi api = new InvoicesApi();

    /**
     * Get Invoice Details v6.1
     *
     * Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoicedetailsV61Test() throws ApiException {
        String invoiceNumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imApplicationID = null;
        String customerType = null;
        Boolean includeSerialNumbers = null;
        InvoiceDetailsv61Response response = api.getInvoicedetailsV61(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers);
        // TODO: test validations
    }

    /**
     * Search your invoice
     *
     * Search your Ingram Micro invoices. This endpoint searches by multiple invoice parameters and supports pagination of results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellersV6InvoicesearchTest() throws ApiException {
        String imApplicationID = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String paymentTermsNetDate = null;
        String invoiceDate = null;
        String invoiceDueDate = null;
        String orderDate = null;
        String orderFromDate = null;
        String orderToDate = null;
        String orderNumber = null;
        String deliveryNumber = null;
        String invoiceNumber = null;
        String invoiceStatus = null;
        String invoiceType = null;
        String customerOrderNumber = null;
        String endCustomerOrderNumber = null;
        String specialBidNumber = null;
        String invoiceFromDueDate = null;
        String invoiceToDueDate = null;
        List<String> invoiceFromDate = null;
        List<String> invoiceToDate = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String orderby = null;
        String direction = null;
        String serialNumber = null;
        InvoiceSearchResponse response = api.getResellersV6Invoicesearch(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber);
        // TODO: test validations
    }

}
