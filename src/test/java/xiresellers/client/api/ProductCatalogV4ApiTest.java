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


package xiresellers.client.api;

import xiresellers.client.ApiException;
import xiresellers.client.model.MultiSKUPriceAndStockRequest;
import xiresellers.client.model.MultiSKUPriceAndStockResponse;
import xiresellers.client.model.ProductSearchRequest;
import xiresellers.client.model.ProductSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductCatalogV4Api
 */
@Disabled
public class ProductCatalogV4ApiTest {

    private final ProductCatalogV4Api api = new ProductCatalogV4Api();

    /**
     * Product availability for upto 50 SKUs
     *
     * Find price and availability of up to 50 SKUs in a single request. As you increase the number of items in the request response time will be extended. This transaction must not be used as a continuous cyclical call to populate availability and pricing for your full catalog. Customers that perform this activity will lose access to price and availability.  Ingram can provide a Price catalog file and an Inventory file in flat file format, which can be obtained through FTP download. Please contact 1800-616-4665 or Electronic.Services@ingrammicro.com for more information on these files.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4MultiskupriceandstockTest() throws ApiException {
        MultiSKUPriceAndStockRequest multiSKUPriceAndStockRequest = null;
        MultiSKUPriceAndStockResponse response = api.postV4Multiskupriceandstock(multiSKUPriceAndStockRequest);
        // TODO: test validations
    }

    /**
     * Real-time Product Search
     *
     * A real time search that provides the Ingram Micro part number using the manufacturer part number.  This API is helpful to eliminate any errors when a manufactuer has the same part number and Ingram Micro has had to create multiple sku numbers 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4ProductsearchTest() throws ApiException {
        ProductSearchRequest productSearchRequest = null;
        ProductSearchResponse response = api.postV4Productsearch(productSearchRequest);
        // TODO: test validations
    }

}