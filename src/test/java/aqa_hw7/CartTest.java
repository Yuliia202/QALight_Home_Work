package aqa_hw7;

import aqa_hw_7.BestsellersPage;
import aqa_hw_7.HomePage;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    @Description("Adding item to cart")
    @Epic("Items")
    @Story("Adding the item to cart")
    @Feature("Cart")
    @Link(name = "Documentation", url = "https://www.itbox.ua/")
    @Issue("https://www.itbox.ua/")
    public void testAddToCart() {
        HomePage homePage = new HomePage(getDriver());
        BestsellersPage bestsellersPage = new BestsellersPage(getDriver());
        homePage.clickAllItemsButton();
        bestsellersPage.clickAddToTheBasketButton();

        boolean isMessageVisible = bestsellersPage.isConfirmationMessageDisplayed();
        Assert.assertTrue(isMessageVisible, "Вікно підтвердження додавання в кошик не з'явилося!");
    }
}