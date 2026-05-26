package aqa_hw7;

import aqa_hw_7.GiftCertificatePage;
import aqa_hw_7.HomePage;
import aqa_hw_7.ProductDetailsPage;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFirstGiftCertificateDataTest extends BaseTest {

    @Test
    @Description("Checking the name of item")
    @Epic("Items")
    @Story("Adding the item to cart and check the name")
    @Feature("Cart")
    @Link(name = "Documentation", url = "https://www.itbox.ua/")
    @Issue("https://www.itbox.ua/")
    public void CheckFirstGiftCertificateDataTest() {
        HomePage homePage = new HomePage(getDriver());
        GiftCertificatePage giftPage = new GiftCertificatePage(getDriver());
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());

        homePage.clickGiftCertificateButton();
        String actualText = giftPage.getItemPrice();
        String expectedText = productDetailsPage.getItemPrice();
        Assert.assertEquals(actualText, expectedText, "Message is not the same!");
    }
}