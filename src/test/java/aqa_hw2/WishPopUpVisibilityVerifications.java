package aqa_hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WishPopUpVisibilityVerifications {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement wishListButton = driver.findElement(By.xpath("//div[@class='popover my-lists']//div[contains(@class, 'button__icon')]"));
            wishListButton.click();

            sleep(3000);

            WebElement wishListPopUp = driver.findElement(By.xpath("//div[@class='profile-sidebar__section-content flex-column']"));
            boolean wishListPopUpVisible = wishListPopUp.isDisplayed();
            assertTrue(wishListPopUpVisible, "Wish list pop-up is not displayed");
        } finally {

            driver.quit();


        }
    }
}
