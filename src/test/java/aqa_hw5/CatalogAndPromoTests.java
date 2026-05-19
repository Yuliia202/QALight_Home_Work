package aqa_hw5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;


import java.time.Duration;

public class CatalogAndPromoTests extends BaseTest {
    @Test(groups = {"positive"}, description = "Checking the opening of the product catalog")
    public void testOpenFullCatalog() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement catalogButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='button' and @data-cy='catalog-open-btn']")
        ));
        catalogButton.click();

        WebElement showAllButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='/catalog/']")
        ));
        showAllButton.click();

        By productXpath = By.xpath("//div[@class='product-wrapper']");
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(productXpath, 0));

        int count = getDriver().findElements(productXpath).size();
        Assert.assertTrue(count > 0, "Catalog is empty ot items are not loaded!");
    }

    @Test(groups = {"positive"}, description = "Checking og the title certain promotion")
    public void testPromoTitleVerification() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        WebElement promoLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/promo/')]")
        ));
        promoLink.click();

        By titleXpath = By.xpath("//h1[contains(text(), 'Книгознижка 10%')]");
        WebElement promoTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(titleXpath));

        String expectedText = "Книгознижка 10% для передплатників MEGOGO";
        Assert.assertEquals(promoTitleElement.getText().trim(), expectedText, "The text of the promotion is missing or is not the same!");
    }
}

