/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.6
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package decentro.tech.client.api;

import decentro.tech.client.ApiException;
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private static StoreApi api;

    
    @BeforeClass
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new StoreApi(apiClient);
    }

    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws ApiException {
        Long orderId = null;
        api.deleteOrder(orderId)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInventoryTest() throws ApiException {
        Map<String, Integer> response = api.getInventory()
                .execute();
        // TODO: test validations
    }

    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        Long orderId = null;
        Order response = api.getOrderById(orderId)
                .execute();
        // TODO: test validations
    }

    /**
     * Place an order for a pet
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void placeOrderTest() throws ApiException {
        Order order = null;
        Order response = api.placeOrder(order)
                .execute();
        // TODO: test validations
    }

}
