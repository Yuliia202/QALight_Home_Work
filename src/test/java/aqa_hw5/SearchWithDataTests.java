package aqa_hw5;

import aqa_hw5.dataprovider.ProvideData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test; // Змінили імпорт на TestNG

import java.time.Duration;


public class SearchWithDataTests extends BaseTest {

    @Test(groups = {"positive"}, dataProvider = "getSearchQueries", dataProviderClass = aqa_hw5.dataprovider.ProvideData.class)
    public void testSearchFunctionality(String searchQuery) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));


        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@type='text' and @data-cy='global-search-input']")
        ));
        searchButton.click();
        searchButton.sendKeys(searchQuery);
        searchButton.sendKeys(Keys.ENTER);
        WebElement clickButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@class='Button-module__7yqGIG__block btnBorderGradient Button-module__7yqGIG__filled btn-lg btn-icon-right md:btn-md w-full self-center md:w-auto']")
        ));
        clickButton.click();
        WebElement searchTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[contains(@class, 'text-headlineMedium')]")
        ));
        String actualTitleText = searchTitle.getText();

        Assert.assertTrue(actualTitleText.contains(searchQuery),
                "Error! Title of the page '" + actualTitleText + "' o: " + searchQuery);


    }
}