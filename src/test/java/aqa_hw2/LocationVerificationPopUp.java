package aqa_hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationVerificationPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement locationButton = driver.findElement(By.xpath("//div[@class='location__city']"));
            locationButton.click();
            sleep(3000);

            WebElement cityPopUp = driver.findElement(By.xpath("//div[@class='modal modal--center']"));
            boolean cityPopUpVisible = cityPopUp.isDisplayed();
            assertTrue(cityPopUpVisible, "City pop-up is not displayed");

        } finally {

            driver.quit();


        }
    }
}

