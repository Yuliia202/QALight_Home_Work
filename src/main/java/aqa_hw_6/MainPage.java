package aqa_hw_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By loginButtonXpath = By.xpath("//a[contains(@class, 'login-button')]");
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonXpath)).click();
    }

    public void clickReviewButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By reviewButtonXpath = By.xpath("//a[@data-tracking-id = 'global-1']");
        wait.until(ExpectedConditions.elementToBeClickable(reviewButtonXpath)).click();
    }

    public void clickAddShopMarketButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By addShopMarketButtonXpath = By.xpath("//a[@data-tracking-id= 'global-32']");
        wait.until(ExpectedConditions.elementToBeClickable(addShopMarketButtonXpath)).click();
    }

    public void clickAllCatalogButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By catalogButtonXpath = By.xpath("//div[@class = 'button-menu-main ']");
        wait.until(ExpectedConditions.elementToBeClickable(catalogButtonXpath)).click();
        By firstItemInCatalogButtonXpath = By.xpath("//a[contains(@class, 'menu-main__item-link') and normalize-space()='Енергозабезпечення']");
        wait.until(ExpectedConditions.elementToBeClickable(firstItemInCatalogButtonXpath)).click();
        By firstItemOnThePageButtonXpath = By.xpath("//div[@class = 'section-navigation__link-text']");
        wait.until(ExpectedConditions.elementToBeClickable(firstItemOnThePageButtonXpath)).click();

    }


}