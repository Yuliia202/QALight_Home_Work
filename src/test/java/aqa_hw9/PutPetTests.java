package aqa_hw9;

import aqa_hw9.dto.CategoryDto;
import aqa_hw9.dto.PetDto;
import aqa_hw9.dto.TagDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified(){
        int petIdToCreate = 864;
        int categoryId = 5;
        String categoryName = "Doggy";

        String petName = "Doggy";
        List<String> photoUrls = List.of(
                "https://lingolandedu.com/ru/english-russian-dictionary/dog",
                "https://atlantahumane.org/adopt/dogs/");
        List<TagDto> tags = List.of(new TagDto(32, "Some Tag"));
        String status = "available";
        CategoryDto categoryDto = new CategoryDto(categoryId, categoryName);


        PetDto petToCreate = new PetDto(
                petIdToCreate, categoryDto, petName, photoUrls, tags, status
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
        Assert.assertEquals(previouslyCreatedPetDto.getCategory().getId(), categoryId);
        Assert.assertEquals(previouslyCreatedPetDto.getCategory().getName(), categoryName);
        Assert.assertEquals(previouslyCreatedPetDto.getName(), petName);

        PetDto updatedPetData = new PetDto(
                petIdToCreate,
                new CategoryDto(10, "German Shepherd"),
                "Rex",
                photoUrls,
                tags,
                "sold"
        );

        given()
                .contentType("application/json")
                .body(updatedPetData)
                .put("https://petstore.swagger.io/v2/pet");

        PetDto updatedPet = given()
                .get("https://petstore.swagger.io/v2/pet/" + petIdToCreate)
                .as(PetDto.class);

        Assert.assertEquals(updatedPet.getName(), "Rex");
        Assert.assertEquals(updatedPet.getStatus(), "sold");
        Assert.assertEquals(updatedPet.getCategory().getName(), "German Shepherd");
        Assert.assertEquals(updatedPet.getId(), petIdToCreate);
    }


}
