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

import xiresellers.client.ApiCallback;
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.ApiResponse;
import xiresellers.client.Configuration;
import xiresellers.client.Pair;
import xiresellers.client.ProgressRequestBody;
import xiresellers.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import xiresellers.client.model.OrderStatusAsyncNotificationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderStatusApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrderStatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderStatusApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for resellersV1WebhooksOrderstatuseventPost
     * @param targeturl The webhook url where the request needs to sent. (required)
     * @param xHubSignature Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works. (required)
     * @param orderStatusAsyncNotificationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resellersV1WebhooksOrderstatuseventPostCall(String targeturl, String xHubSignature, OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = orderStatusAsyncNotificationRequest;

        // create path and map variables
        String localVarPath = "/resellers/v1/webhooks/orderstatusevent";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targeturl != null) {
            localVarHeaderParams.put("targeturl", localVarApiClient.parameterToString(targeturl));
        }

        if (xHubSignature != null) {
            localVarHeaderParams.put("x-hub-signature", localVarApiClient.parameterToString(xHubSignature));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "application" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resellersV1WebhooksOrderstatuseventPostValidateBeforeCall(String targeturl, String xHubSignature, OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'targeturl' is set
        if (targeturl == null) {
            throw new ApiException("Missing the required parameter 'targeturl' when calling resellersV1WebhooksOrderstatuseventPost(Async)");
        }

        // verify the required parameter 'xHubSignature' is set
        if (xHubSignature == null) {
            throw new ApiException("Missing the required parameter 'xHubSignature' when calling resellersV1WebhooksOrderstatuseventPost(Async)");
        }

        // verify the required parameter 'orderStatusAsyncNotificationRequest' is set
        if (orderStatusAsyncNotificationRequest == null) {
            throw new ApiException("Missing the required parameter 'orderStatusAsyncNotificationRequest' when calling resellersV1WebhooksOrderstatuseventPost(Async)");
        }

        return resellersV1WebhooksOrderstatuseventPostCall(targeturl, xHubSignature, orderStatusAsyncNotificationRequest, _callback);

    }

    /**
     * Order Status
     * 
     * @param targeturl The webhook url where the request needs to sent. (required)
     * @param xHubSignature Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works. (required)
     * @param orderStatusAsyncNotificationRequest  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void resellersV1WebhooksOrderstatuseventPost(String targeturl, String xHubSignature, OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest) throws ApiException {
        resellersV1WebhooksOrderstatuseventPostWithHttpInfo(targeturl, xHubSignature, orderStatusAsyncNotificationRequest);
    }

    /**
     * Order Status
     * 
     * @param targeturl The webhook url where the request needs to sent. (required)
     * @param xHubSignature Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works. (required)
     * @param orderStatusAsyncNotificationRequest  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> resellersV1WebhooksOrderstatuseventPostWithHttpInfo(String targeturl, String xHubSignature, OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest) throws ApiException {
        okhttp3.Call localVarCall = resellersV1WebhooksOrderstatuseventPostValidateBeforeCall(targeturl, xHubSignature, orderStatusAsyncNotificationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Order Status (asynchronously)
     * 
     * @param targeturl The webhook url where the request needs to sent. (required)
     * @param xHubSignature Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works. (required)
     * @param orderStatusAsyncNotificationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resellersV1WebhooksOrderstatuseventPostAsync(String targeturl, String xHubSignature, OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = resellersV1WebhooksOrderstatuseventPostValidateBeforeCall(targeturl, xHubSignature, orderStatusAsyncNotificationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
