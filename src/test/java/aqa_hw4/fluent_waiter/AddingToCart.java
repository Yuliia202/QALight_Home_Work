package aqa_hw4.fluent_waiter;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddingToCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> waiter = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        String expectedCount = "1";
        try {
            driver.get("https://mbooks.com.ua/");
            driver.manage().window().maximize();
            WebElement catalogButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'button' and @data-cy='catalog-open-btn']")));
            catalogButton.click();
            WebElement showAllButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href= '/catalog/']")));
            showAllButton.click();
            WebElement elementButton = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='product-wrapper']")));
            elementButton.click();
            WebElement addToCart = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Add to cart']")));
            addToCart.click();
            WebElement cartCounter = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-cy='open-cart-popup-btn']//span")));
            String actualCount = cartCounter.getText();
            assertEquals(expectedCount, actualCount, "Count in the cart is not the same!");
        } finally {
            driver.quit();
        }
    }
}