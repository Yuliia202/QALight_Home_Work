package aqa_hw_7;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BestsellersPage {
    private WebDriver driver;

    public BestsellersPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("User adds item to the basket")
    public void clickAddToTheBasketButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By addButtonXpath = By.xpath("//a[@data-id='949469']");
        wait.until(ExpectedConditions.elementToBeClickable(addButtonXpath)).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        By confirmationPopupLocator = By.xpath("//div[contains(text(), 'Товар доданий в')] | //span[contains(text(), 'кошик')]");
        try {
            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationPopupLocator));
            return message.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}