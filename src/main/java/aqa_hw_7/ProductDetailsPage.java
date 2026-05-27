package aqa_hw_7;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    private WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("User is checking the price")
    public String getItemPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By priceLabel = By.xpath("//h1[@class = 'h1 scada']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(priceLabel));
        return driver.findElement(priceLabel).getText();
    }
    @Step("User is adding to compare list")
    public void addToTheCompareBasket() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By compareButton = By.xpath("//a[@class = 'add add-compare add-smt__large left']");
        wait.until(ExpectedConditions.elementToBeClickable(compareButton)).click();
    }
    @Step("User is checking the count")
    public String getCompareCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By compareCounter = By.xpath("//a[contains(@href, '/comparison/')]//span[contains(@class, 'userlinks-count')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(compareCounter));
        return driver.findElement(compareCounter).getText();
    }
}




