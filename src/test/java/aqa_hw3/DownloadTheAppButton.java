package aqa_hw3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class DownloadTheAppButton {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            WebElement iosButton = driver.findElement(By.xpath("//div[contains(@class, 'app-text__buttons')]/a[contains(@href, 'apps.apple.com')]"));
            iosButton.click();
            sleep(3000);
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            String lastTabId = tabs.get(1);
            driver.switchTo().window(lastTabId);

            String title = driver.getTitle();
            Assertions.assertTrue(title.toLowerCase().contains("hotline"), "Title incorrect! Current title: " + title);

        } finally {
            driver.quit();
        }
    }
}


