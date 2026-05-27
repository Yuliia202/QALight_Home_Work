package aqa_hw7;

import aqa_hw_7.GiftCertificatePage;
import aqa_hw_7.HomePage;
import aqa_hw_7.ProductDetailsPage;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingItemToTheCompareListTest extends BaseTest {
    @Test
    @Description("Adding gift certificate to compare list")
    @Epic("Items")
    @Story("Adding the item to compare list")
    @Feature("Compare List")
    @Link(name = "Documentation", url = "https://www.itbox.ua/")
    @Issue("https://www.itbox.ua/")
    public void CheckFirstGiftCertificateDataTest() {
        HomePage homePage = new HomePage(getDriver());
        GiftCertificatePage giftPage = new GiftCertificatePage(getDriver());
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());

        homePage.clickGiftCertificateButton();
        giftPage.clickOnGiftCertificateButton();
        productDetailsPage.addToTheCompareBasket();
        String actualCount = productDetailsPage.getCompareCount();
        String expectedCount = "1";
        Assert.assertEquals(actualCount, expectedCount, "Count is not the same!");
    }
}