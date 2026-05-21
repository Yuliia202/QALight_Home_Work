package aqa_hw_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddShopMarketPage {
    private WebDriver driver;

    public AddShopMarketPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void clickFillOutTheApplicationButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By reviewButtonXpath = By.xpath("//button[@class= 'form-button btn btn--graphite']");
        wait.until(ExpectedConditions.elementToBeClickable(reviewButtonXpath)).click();
    }
}

