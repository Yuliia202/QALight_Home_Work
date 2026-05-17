package aqa_hw4.implicity_waiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiscountTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String discountWord = "Акції";
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://mbooks.com.ua/");
            driver.manage().window().maximize();
            WebElement discountButton = driver.findElement(By.xpath("//a[@href = '/promo/']"));
            discountButton.click();
            WebElement title = driver.findElement(By.xpath("//div[@data-page-type='discount-list']//h2"));
            String titleText = title.getText();
            assertTrue(titleText.contains(discountWord), format("Title page is incorrect. It doesn't contains <%s> search word", discountWord));
        } finally {
            driver.quit();
        }
    }
}