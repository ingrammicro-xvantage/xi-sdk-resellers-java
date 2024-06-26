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
import xiresellers.client.model.PriceAndAvailabilityRequest;
import xiresellers.client.model.PriceAndAvailabilityResponseInner;
import xiresellers.client.model.ProductDetailResponse;
import xiresellers.client.model.ProductSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductCatalogApi
 */
@Disabled
public class ProductCatalogApiTest {

    private final ProductCatalogApi api = new ProductCatalogApi();

    /**
     * Product Details
     *
     * Search all the product-related details using a unique Ingram Part Number. Currently, this API is available in the USA, India, and Netherlands.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellerV6ProductdetailTest() throws ApiException {
        String ingramPartNumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imSenderID = null;
        ProductDetailResponse response = api.getResellerV6Productdetail(ingramPartNumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID);
        // TODO: test validations
    }

    /**
     * Search Products
     *
     * Search the Ingram Micro product catalog by providing any of the information in the keyword(Ingram part number / vendor part number/ product description / UPC
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellerV6ProductsearchTest() throws ApiException {
        String imCustomerNumber = null;
        String imCorrelationID = null;
        String imCountryCode = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String imSenderID = null;
        String type = null;
        String hasDiscounts = null;
        List<String> vendor = null;
        List<String> vendorPartNumber = null;
        String acceptLanguage = null;
        String vendorNumber = null;
        List<String> keyword = null;
        String category = null;
        String skipAuthorisation = null;
        ProductSearchResponse response = api.getResellerV6Productsearch(imCustomerNumber, imCorrelationID, imCountryCode, pageNumber, pageSize, imSenderID, type, hasDiscounts, vendor, vendorPartNumber, acceptLanguage, vendorNumber, keyword, category, skipAuthorisation);
        // TODO: test validations
    }

    /**
     * Price and Availability
     *
     * The PriceAndAvailability API, will retrieve Pricing, Availability, discounts, Inventory Location, Reserve Inventory for the products upto 50 products. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPriceandavailabilityTest() throws ApiException {
        Boolean includeAvailability = null;
        Boolean includePricing = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        PriceAndAvailabilityRequest priceAndAvailabilityRequest = null;
        Boolean includeProductAttributes = null;
        String imSenderID = null;
        List<PriceAndAvailabilityResponseInner> response = api.postPriceandavailability(includeAvailability, includePricing, imCustomerNumber, imCountryCode, imCorrelationID, priceAndAvailabilityRequest, includeProductAttributes, imSenderID);
        // TODO: test validations
    }

}
