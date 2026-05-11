package aqa_hw3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;


public class ItemName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String expectedName = "Енергозабезпечення";
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            WebElement itemCatalog = driver.findElement(By.xpath("//span[@class='text' and @data-v-5ea15b59 and text()='Енергозабезпечення']"));
            itemCatalog.click();
            sleep(3000);
            WebElement headerOnNextPage = driver.findElement (By.xpath("//h1[contains(@class, 'title-page')]"));

            String actualName = headerOnNextPage.getText();
            Assertions.assertEquals(expectedName, actualName);

        } finally {
            driver.quit();
        }
    }
}
