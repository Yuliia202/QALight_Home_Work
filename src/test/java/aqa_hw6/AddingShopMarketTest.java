package aqa_hw6;

import aqa_hw_6.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingShopMarketTest extends BaseTest {

    @Test(description = "Verifying that the user cannot submit the form without filling in all the fields")
    public void verifyAddingShopMarket() {
        MainPage mainPage = new MainPage(getDriver());
        AddShopMarketPage addShopMarketPage = new AddShopMarketPage(getDriver());
        RegistrationNewShopMarketPage registrationNewShopMarketPage = new RegistrationNewShopMarketPage(getDriver());

        mainPage.clickAddShopMarketButton();
        addShopMarketPage.clickFillOutTheApplicationButton();
        registrationNewShopMarketPage.clickSubmit();
        String actualErrorText = registrationNewShopMarketPage.getErrorText();
        String expectedErrorText = "Помилка. У деяких полях форми були допущені помилки при заповненні. Будь ласка, виправте їх і надішліть форму повторно.";
        Assert.assertEquals(actualErrorText, expectedErrorText, "Error message is not the same!");
    }
}