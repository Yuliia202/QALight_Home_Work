package aqa_hw_7;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Step("User is clicking on the Gift Certificate button")
    public void clickGiftCertificateButton() {
        By GiftButtonXpath = By.xpath("//a[@href='/ua/certificates/']");
        wait.until(ExpectedConditions.elementToBeClickable(GiftButtonXpath)).click();
        By OpenGiftCertificateButtonXpath = By.xpath("//a[@href='/ua/category/Sertifikati-c8242/']");
        wait.until(ExpectedConditions.elementToBeClickable(OpenGiftCertificateButtonXpath)).click();
    }
    @Step("User open all popular items")
    public void clickAllItemsButton() {
        By AllItemsButtonXpath = By.xpath("//div[@class='tape-title']/a[contains(@href, '/product-tape/32/')]");
        wait.until(ExpectedConditions.elementToBeClickable(AllItemsButtonXpath)).click();
    }
    @Step("User click on the button for changing the location")
    public void clickCityHeader() {
        By cityHeaderLink = By.xpath("(//div[contains(@class, 'hide-on-tablet')]//a[@href='#choose-city'])[3]");
        wait.until(ExpectedConditions.elementToBeClickable(cityHeaderLink)).click();

    }

    @Step("User selects another city")
    public void selectDnipro() {
        By cityChernivtsiLink = By.xpath("//span[text()='Дніпро']");
        wait.until(ExpectedConditions.elementToBeClickable(cityChernivtsiLink)).click();
    }

    public String getCurrentCityText() {
        By cityHeaderLink = By.xpath("//div[@class = 'mycity left hide-on-tablet']");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cityHeaderLink)).getText();
    }
}

