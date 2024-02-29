/*
 * XI Sdk Resellers
 * For Ingram Micro Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
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
import xiresellers.client.model.ErrorResponseDTO;
import java.time.LocalDate;
import xiresellers.client.model.OrderCreateRequest;
import xiresellers.client.model.OrderCreateResponse;
import xiresellers.client.model.OrderDetailB2B;
import xiresellers.client.model.OrderModifyRequest;
import xiresellers.client.model.OrderModifyResponse;
import xiresellers.client.model.OrderSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Disabled
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    /**
     * Cancel your Order
     *
     * This call must be submitted before the order is released to Ingram Micro’s warehouse. The order cannot be canceled once it is released to the warehouse. Order should be on customer hold to delete any order from Ingram system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrdercancelTest() throws ApiException {
        String orderNumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String regionCode = null;
        String imSenderID = null;
        api.deleteOrdercancel(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, regionCode, imSenderID);
        // TODO: test validations
    }

    /**
     * Get Order Details v6.1
     *
     * The Orders details API endpoint allows a customer to retrieve their Ingram Micro orders details by using the Ingram Micro sales order number as a path parameter. The sales order number, IM-CustomerNumber, IM-CountryCode, and IM-CorrelationID are required parameters.&lt;br&gt;&lt;br&gt;*Service contracts, subscriptions, and license information are unavailable at the moment, this information will be available in the future. &lt;br&gt;&lt;br&gt; Recent bug fixes:   - Fixed duplication of serial numbers in the API response.   - Fixed API time-out issues   - Fixed missing tracking information.   - Implemented enhanced order status.  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderdetailsV61Test() throws ApiException {
        String ordernumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imSenderID = null;
        LocalDate ingramOrderDate = null;
        String vendorNumber = null;
        String simulateStatus = null;
        Boolean isIml = null;
        String regionCode = null;
        OrderDetailB2B response = api.getOrderdetailsV61(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode);
        // TODO: test validations
    }

    /**
     * Search your Orders
     *
     * The Orders Search API endpoint allows a customer to search their Ingram Micro orders by using any of the available query string parameters, customer can search their order by using single query string parameters or combining them together. This endpoint supports the pagination of results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellersV6OrdersearchTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String ingramOrderNumber = null;
        String orderStatus = null;
        List<String> orderStatusIn = null;
        String ingramOrderDate = null;
        List<String> ingramOrderDateBt = null;
        String imSenderID = null;
        String customerOrderNumber = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String endCustomerOrderNumber = null;
        List<String> invoiceDateBt = null;
        List<String> shipDateBt = null;
        List<String> deliveryDateBt = null;
        String ingramPartNumber = null;
        String vendorPartNumber = null;
        String serialNumber = null;
        String trackingNumber = null;
        String vendorName = null;
        String specialBidNumber = null;
        OrderSearchResponse response = api.getResellersV6Ordersearch(imCustomerNumber, imCountryCode, imCorrelationID, ingramOrderNumber, orderStatus, orderStatusIn, ingramOrderDate, ingramOrderDateBt, imSenderID, customerOrderNumber, pageSize, pageNumber, endCustomerOrderNumber, invoiceDateBt, shipDateBt, deliveryDateBt, ingramPartNumber, vendorPartNumber, serialNumber, trackingNumber, vendorName, specialBidNumber);
        // TODO: test validations
    }

    /**
     * Create your Order
     *
     * Instantly create and place orders. The POST API supports stocked SKUs as well as licensing and warranties SKUs. IM-CustomerNumber, IM-CountryCode, IM-SenderID and IM-CorrelationID are required parameters. Ingram Micro recommends that you provide the ingrampartnumber for each SKU contained in each order. NOTE: You must have net terms to use the Ingram Micro Order Create API. Ingram Micro offers trade credit when using our APIs, and repayment is based on net terms. For example, if your net terms agreement is net-30, you will have 30 days to make a full payment. Ingram Micro does not allow credit card transactions for API ordering. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCreateorderV6Test() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        OrderCreateRequest orderCreateRequest = null;
        String imSenderID = null;
        OrderCreateResponse response = api.postCreateorderV6(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateRequest, imSenderID);
        // TODO: test validations
    }

    /**
     * Modify your Order
     *
     * The Order Modify API endpoint allows for changes to be made to an order after the order creation process as long as the order was created with the customer hold flag.  * Orders can be modified within 24hrs of being placed with the customer hold flag, after 24hrs they are voided if they are not released by the customer.  * Modifying orders that were placed without the customer hold flag is not possible 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putOrdermodifyTest() throws ApiException {
        String orderNumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        OrderModifyRequest orderModifyRequest = null;
        String actionCode = null;
        String regionCode = null;
        String imSenderID = null;
        OrderModifyResponse response = api.putOrdermodify(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, orderModifyRequest, actionCode, regionCode, imSenderID);
        // TODO: test validations
    }

}
