package aqa_hw_7;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GiftCertificatePage {
    private WebDriver driver;

    public GiftCertificatePage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("User checking the price on the main page")
    public String getItemPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By priceLabel = By.xpath("//a[@class='to_product']");
        wait.until(ExpectedConditions.elementToBeClickable(priceLabel));
        String itemText = driver.findElement(priceLabel).getText();
        driver.findElement(priceLabel).click();
        return itemText;
    }
    @Step("User is clicking on the Gift Certificate button")
    public void clickOnGiftCertificateButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By priceLabel = By.xpath("//a[@class='to_product']");
        wait.until(ExpectedConditions.elementToBeClickable(priceLabel));
        driver.findElement(priceLabel).click();
    }


}



