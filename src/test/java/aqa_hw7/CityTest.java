package aqa_hw7;

import aqa_hw_7.HomePage;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CityTest extends BaseTest {
    @Test
    @Description("Checking changing the user location manually")
    @Epic("Location")
    @Story("Changing the location by applicant")
    @Feature("Location")
    @Link(name = "Documentation", url = "https://www.itbox.ua/")
    @Issue("https://www.itbox.ua/")
    public void testChangeLocationToChernivtsi() {
        HomePage homePage = new HomePage(getDriver());

        homePage.clickCityHeader();

        homePage.selectDnipro();

        String actualCity = homePage.getCurrentCityText();
        Assert.assertEquals(actualCity, "Дніпро", "City is not Dnipro!");
    }
}
