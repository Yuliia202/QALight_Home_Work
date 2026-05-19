package aqa_hw4.fluent_waiter;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class LogInTab {
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
            WebElement profileButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-cy='open-profile-dropdown']")));
            profileButton.click();
            WebElement LogInButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-cy='open-login-modal-btn']")));
            LogInButton.click();
            WebElement phoneInput = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Номер телефону']")));
            phoneInput.sendKeys("931230000");
            WebElement getCodeButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            getCodeButton.click();
            waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
            WebElement codeInput = waiter.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@autocomplete='one-time-code']")
            ));
            assertTrue(codeInput.isDisplayed(), "Filed for code is not displayed!");
        } finally {
            driver.quit();
        }
    }
}