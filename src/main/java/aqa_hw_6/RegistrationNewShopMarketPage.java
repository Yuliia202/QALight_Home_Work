package aqa_hw_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationNewShopMarketPage {

    private WebDriver driver;

    public RegistrationNewShopMarketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By submitButtonXpath = By.xpath("//button[@class= 'form__button btn btn--graphite']");
        wait.until(ExpectedConditions.elementToBeClickable(submitButtonXpath)).click();
    }

    public String getErrorText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By errorLabel = By.xpath("//div[contains(@class, 'form-field__error') or contains(@class, 'error')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorLabel));
        return driver.findElement(errorLabel).getText();
    }
}
