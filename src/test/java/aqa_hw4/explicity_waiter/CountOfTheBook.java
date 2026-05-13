package aqa_hw4.explicity_waiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOfTheBook {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        int expectedNumber = 24;


        try {
            driver.get("https://mbooks.com.ua/");
            driver.manage().window().maximize();


            WebElement catalogButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'button' and @data-cy='catalog-open-btn']")));
            catalogButton.click();
            WebElement showAllButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href= '/catalog/']")));
            showAllButton.click();


            By productXpath = By.xpath("//div[@class= 'product-wrapper']");
            wait.until(ExpectedConditions.numberOfElementsToBe(productXpath, expectedNumber));
            assertEquals(expectedNumber, driver.findElements(productXpath).size());

        } finally {
            driver.quit();
        }
    }

}
