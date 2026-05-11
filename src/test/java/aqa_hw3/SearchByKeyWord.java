package aqa_hw3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class SearchByKeyWord {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        String searchWord = "iPhone 15 Pro";
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            WebElement searchField = driver.findElement(By.xpath("//input[@type='text']"));
            searchField.click();
            searchField.sendKeys(searchWord);
            sleep(2000);
            WebElement searchButton = driver.findElement(By.xpath("//button[@class='search__btn flex middle-xs center-xs']"));
            searchButton.click();
            sleep(3000);

            List<WebElement> elementDescription = driver.findElements(By.xpath(("//a[@class='item-title text-md link link--black']")));
            for (WebElement element : elementDescription) {
                String currentDescription = element.getText();
                Assertions.assertTrue(currentDescription.contains(searchWord), format("Title page is incorrect. It doesn't contains <%s> search word", searchWord));
            }


        } finally {
            driver.quit();
        }
    }
}


