package aqa_hw5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;


import java.time.Duration;

public class AuthNegativeTests extends BaseTest {

    @Test(groups = {"negative"})
    public void testAuthFunctionality() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label = 'User profile']")
        ));
        profileButton.click();

        WebElement clickButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-cy = 'open-login-modal-btn']")
        ));
        clickButton.click();
        WebElement emailButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='button' and contains(., 'Email')]")
        ));
        emailButton.click();
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@type= 'email']")
        ));
        emailInput.sendKeys("non_existent_user_2026");

        WebElement getLoginButton = getDriver().findElement(By.xpath("//button[@data-cy= 'get-login-code-btn']"));
        getLoginButton.click();

        WebElement errorText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(), 'Щось неправильно, перевір')]")
        ));

        Assert.assertTrue(errorText.isDisplayed(), "The message about error is missing!");


    }
}

