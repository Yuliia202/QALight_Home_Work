package aqa_hw9;

import aqa_hw9.dto.CategoryDto;
import aqa_hw9.dto.NotFoundPetDto;
import aqa_hw9.dto.PetDto;
import aqa_hw9.dto.TagDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;

public class DeletePetTest {

    @Test
    public void verifyPetCanBeDeleted() {
        int petIdToCreate = 864;
        CategoryDto categoryDto = new CategoryDto(13, "Doggy");
        String petName = "Doggy";
        String status = "available";


        PetDto petToCreate = new PetDto(
                petIdToCreate, categoryDto, petName, status
        );

        Response createdPetResponse = given().
                contentType("application/json").
                body(petToCreate).
                post("https://petstore.swagger.io/v2/pet");
        PetDto createdPetDto = createdPetResponse.as(PetDto.class);
        Assert.assertEquals(createdPetDto.getId(), petIdToCreate);


        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(previouslyCreatedPetDto.getId(), petIdToCreate);

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        NotFoundPetDto notFoundPetDto = deletedPetResponse.as(NotFoundPetDto.class);

        Assert.assertEquals(deletedPetResponse.getStatusCode(), 404);
        Assert.assertEquals(notFoundPetDto.getType(), "error");
        Assert.assertEquals(notFoundPetDto.getMessage(), "Pet not found");
    }

    @Test
    public void verifyNonExistingPetCannotBeDeleted() {

        long petId = 999999999L;

        Response response = given()
                .delete("https://petstore.swagger.io/v2/pet/" + petId);

        System.out.println("Status code = " + response.statusCode());
        System.out.println("Body = " + response.getBody().asString());

        Assert.assertEquals(response.statusCode(), 404);
    }
}
