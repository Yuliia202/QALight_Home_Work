package aqa_hw6;

import aqa_hw_6.LogInPage;
import aqa_hw_6.MainPage;
import aqa_hw_6.ProductReviewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewPageWithoutLoginTest extends BaseTest {

    @Test(description = "Checking that applicant cannot add review without authorization")
    public void verifyReviewPage() {
        MainPage mainPage = new MainPage(getDriver());
        ProductReviewsPage productReviewsPage = new ProductReviewsPage(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());

        mainPage.clickReviewButton();
        productReviewsPage.clickReviewRateButton();
        logInPage.login("380681752599", "Password123!");
        String actualErrorText = logInPage.getErrorMessageText();
        String expectedErrorText = "Поле не може бути порожнім";
        Assert.assertEquals(actualErrorText, expectedErrorText, "Error message is not the same!");
    }
}
