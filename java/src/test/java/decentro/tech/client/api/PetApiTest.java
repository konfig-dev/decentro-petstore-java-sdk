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
import java.io.File;
import decentro.tech.client.model.ModelApiResponse;
import decentro.tech.client.model.Pet;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private static PetApi api;

    
    @BeforeClass
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PetApi(apiClient);
    }

    /**
     * Add a new pet to the store
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPetTest() throws ApiException {
        Pet pet = null;
        api.addPet(pet)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes a pet
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePetTest() throws ApiException {
        Long petId = null;
        String apiKey = null;
        api.deletePet(petId)
                .apiKey(apiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws ApiException {
        List<String> status = null;
        List<Pet> response = api.findPetsByStatus(status)
                .execute();
        // TODO: test validations
    }

    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws ApiException {
        List<String> tags = null;
        List<Pet> response = api.findPetsByTags(tags)
                .execute();
        // TODO: test validations
    }

    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws ApiException {
        Long petId = null;
        Pet response = api.getPetById(petId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing pet
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePetTest() throws ApiException {
        Pet pet = null;
        api.updatePet(pet)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws ApiException {
        Long petId = null;
        String name = null;
        String status = null;
        api.updatePetWithForm(petId)
                .name(name)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * uploads an image
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        Long petId = null;
        String additionalMetadata = null;
        File _file = null;
        ModelApiResponse response = api.uploadFile(petId)
                .additionalMetadata(additionalMetadata)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

}
