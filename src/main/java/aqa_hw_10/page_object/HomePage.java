package aqa_hw_10.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickLogInButton() {
        By logInButtonXpath = By.xpath("//a[contains(@class, 'js-popup') and contains(@class, 'box-signin')]");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(logInButtonXpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    public void enterLogInAndPasswordButton(String email, String password) {
        By loginFieldBy = By.xpath("//input[@name='login']");
        WebElement loginField = wait.until(ExpectedConditions.visibilityOfElementLocated(loginFieldBy));
        loginField.sendKeys(email);

        By passwordFieldBy = By.xpath("//input[@name='password']");
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordFieldBy));
        passwordField.sendKeys(password);

        By submitButtonBy = By.xpath("//button[@class='btn login-btn btn-block']");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(submitButtonBy));
        submitButton.click();
    }

}

