package aqa_hw4.explicity_waiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelegramIcon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String expectedTitle = "MEGOGO BOOKS";


        try {
            driver.get("https://mbooks.com.ua/");
            driver.manage().window().maximize();


            WebElement telegramButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label = 'Telegram']")));
            telegramButton.click();
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            String lastTabId = tabs.get(1);
            driver.switchTo().window(lastTabId);

            WebElement previewChannelButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'tgme_page_context_link']")));
            previewChannelButton.click();

            String currentUrl = driver.getCurrentUrl();
            assertTrue(currentUrl.contains("t.me/s/megogobooks_ua"), "URL doesn't include (preview)");

            WebElement channelTitle = driver.findElement(By.xpath("//span[@dir='auto']"));
            String titleText = channelTitle.getText();

            assertTrue(titleText.equalsIgnoreCase(expectedTitle),
                    format("Expected title '%s', but found '%s'", expectedTitle, titleText));


        } finally {
            driver.quit();
        }
    }

}
