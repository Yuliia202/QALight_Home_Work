package aqa_hw6;

import aqa_hw_6.LogInPage;
import aqa_hw_6.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class InvalidCredentialsLoginTest extends BaseTest {

    @Test
    public void verifyLogInWithInvalidCredential() {
        MainPage mainPage = new MainPage(getDriver());
        LogInPage logInPage = new LogInPage(getDriver());

        mainPage.clickLoginButton();
        logInPage.login("380681752599", "Password123!");
        String actualErrorText = logInPage.getErrorMessageText();
        String expectedErrorText = "Поле не може бути порожнім";
        Assert.assertEquals(actualErrorText, expectedErrorText, "Error message is not the same!");

    }

}
