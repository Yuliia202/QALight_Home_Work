package aqa_hw9;

import aqa_hw9.dto.PetDto;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;


public class GetPetTest {

    @Test
    public void verifyPetEntityCanBeObtained() {
        int petIdToGet = 333;

        Response response = given().get("https://petstore.swagger.io/v2/pet/" + petIdToGet);

        PetDto obtainedPet = response.as(PetDto.class);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(obtainedPet.getId(), petIdToGet);
    }
}