package aqa_hw_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductReviewsPage {
    private WebDriver driver;

    public ProductReviewsPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void clickReviewRateButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By reviewButtonXpath = By.xpath("//button[@class = 'review__rate-review-btn btn btn--graphite']");
        wait.until(ExpectedConditions.elementToBeClickable(reviewButtonXpath)).click();
    }
}
