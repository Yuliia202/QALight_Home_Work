package aqa_hw2;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TitleVerificationTest {
    public static void main(String[] args) throws InterruptedException {
        String searchWord = "Iphone";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            WebElement inputField = driver.findElement(By.xpath("//input"));
            inputField.sendKeys(searchWord);

            sleep(3000);
            WebElement searchButton = driver.findElement(By.xpath("//button[@title=\"Поиск\"]"));
            searchButton.click();
            sleep(4000);

            WebElement title = driver.findElement(By.xpath("//div[@class='search__title']"));
            String titleText = title.getText();

            assertTrue(titleText.contains(searchWord), format("Title page is incorrect. It doesn't contains <%s> search word", searchWord));
        } finally {
            driver.quit();
        }
    }
}
