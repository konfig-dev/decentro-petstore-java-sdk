# StoreApi

All URIs are relative to *https://petstore.swagger.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrder**](StoreApi.md#deleteOrder) | **DELETE** /store/order/{orderId} | Delete purchase order by ID |
| [**getInventory**](StoreApi.md#getInventory) | **GET** /store/inventory | Returns pet inventories by status |
| [**getOrderById**](StoreApi.md#getOrderById) | **GET** /store/order/{orderId} | Find purchase order by ID |
| [**placeOrder**](StoreApi.md#placeOrder) | **POST** /store/order | Place an order for a pet |


<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId).execute();

Delete purchase order by ID

For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors

### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.StoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    StoreApi apiInstance = new StoreApi(apiClient);
    Long orderId = 56L; // Long | ID of the order that needs to be deleted
    try {
      apiInstance.deleteOrder(orderId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreApi#deleteOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **Long**| ID of the order that needs to be deleted | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |

<a name="getInventory"></a>
# **getInventory**
> Map&lt;String, Integer&gt; getInventory().execute();

Returns pet inventories by status

Returns a map of status codes to quantities

### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.auth.*;
import decentro.tech.client.model.*;
import decentro.tech.client.api.StoreApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://petstore.swagger.io/v2");
    
    // Configure API key authorization: api_key
    apiClient.setApiKey("api_key", "YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiClient.setApiKeyPrefix("api_key", "Token");

    StoreApi apiInstance = new StoreApi(apiClient);
    try {
      Map<String, Integer> result = apiInstance.getInventory()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreApi#getInventory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getOrderById"></a>
# **getOrderById**
> Order getOrderById(orderId).execute();

Find purchase order by ID

For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions

### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.StoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    StoreApi apiInstance = new StoreApi(apiClient);
    Long orderId = 56L; // Long | ID of pet that needs to be fetched
    try {
      Order result = apiInstance.getOrderById(orderId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreApi#getOrderById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **Long**| ID of pet that needs to be fetched | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |

<a name="placeOrder"></a>
# **placeOrder**
> Order placeOrder(order).execute();

Place an order for a pet



### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.StoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    StoreApi apiInstance = new StoreApi(apiClient);
    Order order = new Order(); // Order | order placed for purchasing the pet
    try {
      Order result = apiInstance.placeOrder(order)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoreApi#placeOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **order** | [**Order**](Order.md)| order placed for purchasing the pet | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Order |  -  |

