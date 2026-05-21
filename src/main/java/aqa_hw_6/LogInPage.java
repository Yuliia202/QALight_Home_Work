package aqa_hw_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class LogInPage {

    private WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By emailField = By.xpath("//input[@autocomplete='username']");
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
        By passwordField = By.xpath("//input[@autocomplete='current-password']");
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password, Keys.ENTER);
        By submitButton = By.xpath("//button[@type = 'submit']");
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
    }

    public String getErrorMessageText() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By errorLabel = By.xpath("//div[contains(@class, 'form-field__error') or contains(@class, 'error')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorLabel));
        return driver.findElement(errorLabel).getText();
    }

}

