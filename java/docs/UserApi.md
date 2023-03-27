# UserApi

All URIs are relative to *https://petstore.swagger.io/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /user | Create user |
| [**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array |
| [**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array |
| [**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{username} | Delete user |
| [**getUserByName**](UserApi.md#getUserByName) | **GET** /user/{username} | Get user by user name |
| [**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system |
| [**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session |
| [**updateUser**](UserApi.md#updateUser) | **PUT** /user/{username} | Updated user |


<a name="createUser"></a>
# **createUser**
> createUser(user).execute();

Create user

This can only be done by the logged in user.

### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    User user = new User(); // User | Created user object
    try {
      apiInstance.createUser(user)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
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
| **user** | [**User**](User.md)| Created user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="createUsersWithArrayInput"></a>
# **createUsersWithArrayInput**
> createUsersWithArrayInput(user).execute();

Creates list of users with given input array



### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    List<User> user = Arrays.asList(); // List<User> | List of user object
    try {
      apiInstance.createUsersWithArrayInput(user)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUsersWithArrayInput");
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
| **user** | [**List&lt;User&gt;**](User.md)| List of user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="createUsersWithListInput"></a>
# **createUsersWithListInput**
> createUsersWithListInput(user).execute();

Creates list of users with given input array



### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    List<User> user = Arrays.asList(); // List<User> | List of user object
    try {
      apiInstance.createUsersWithListInput(user)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUsersWithListInput");
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
| **user** | [**List&lt;User&gt;**](User.md)| List of user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(username).execute();

Delete user

This can only be done by the logged in user.

### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    String username = "username_example"; // String | The name that needs to be deleted
    try {
      apiInstance.deleteUser(username)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUser");
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
| **username** | **String**| The name that needs to be deleted | |

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
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |

<a name="getUserByName"></a>
# **getUserByName**
> User getUserByName(username).execute();

Get user by user name



### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
    try {
      User result = apiInstance.getUserByName(username)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserByName");
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
| **username** | **String**| The name that needs to be fetched. Use user1 for testing.  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |

<a name="loginUser"></a>
# **loginUser**
> String loginUser(username, password).execute();

Logs user into the system



### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    String username = "username_example"; // String | The user name for login
    String password = "password_example"; // String | The password for login in clear text
    try {
      String result = apiInstance.loginUser(username, password)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#loginUser");
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
| **username** | **String**| The user name for login | |
| **password** | **String**| The password for login in clear text | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-Expires-After - date in UTC when token expires <br>  * X-Rate-Limit - calls per hour allowed by the user <br>  |
| **400** | Invalid username/password supplied |  -  |

<a name="logoutUser"></a>
# **logoutUser**
> logoutUser().execute();

Logs out current logged in user session



### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    try {
      apiInstance.logoutUser()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#logoutUser");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

<a name="updateUser"></a>
# **updateUser**
> updateUser(username, user).execute();

Updated user

This can only be done by the logged in user.

### Example
```java
import decentro.tech.client.ApiClient;
import decentro.tech.client.ApiException;
import decentro.tech.client.Configuration;
import decentro.tech.client.model.*;
import decentro.tech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://petstore.swagger.io/v2");

    UserApi apiInstance = new UserApi(apiClient);
    String username = "username_example"; // String | name that need to be updated
    User user = new User(); // User | Updated user object
    try {
      apiInstance.updateUser(username, user)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
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
| **username** | **String**| name that need to be updated | |
| **user** | [**User**](User.md)| Updated user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid user supplied |  -  |
| **404** | User not found |  -  |

