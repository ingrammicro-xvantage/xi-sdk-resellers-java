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
import xiresellers.client.model.AvailabilityAsyncNotificationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StockUpdateApi
 */
@Disabled
public class StockUpdateApiTest {

    private final StockUpdateApi api = new StockUpdateApi();

    /**
     * Stock Update
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resellersV1WebhooksAvailabilityupdatePostTest() throws ApiException {
        String targeturl = null;
        String xHubSignature = null;
        AvailabilityAsyncNotificationRequest availabilityAsyncNotificationRequest = null;
        api.resellersV1WebhooksAvailabilityupdatePost(targeturl, xHubSignature, availabilityAsyncNotificationRequest);
        // TODO: test validations
    }

}
