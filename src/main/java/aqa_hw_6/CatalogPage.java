package aqa_hw_6;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CatalogPage {

    private WebDriver driver;
    private WebDriverWait wait;

    By sortingButton = By.xpath("//div[@class='select__field']");
    By sortByNameButton = By.xpath("//div[contains(@class,'select__dropdown-item') and normalize-space()='найменуванням']");
    By productTitles = By.xpath("//div[@class='list-item__title-container m_b-5']/a");

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void sortByName() {
        wait.until(ExpectedConditions.elementToBeClickable(sortingButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sortByNameButton)).click();
        wait.until(ExpectedConditions.urlContains("sort=title"));
    }
    public List<String> getFirstFiveProductNames() {
        List<String> names = new ArrayList<>();
        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productTitles));
                List<WebElement> products = driver.findElements(productTitles);
                names.clear();
                for (int i = 0; i < 5 && i < products.size(); i++) {
                    String productName = products.get(i)
                            .getText()
                            .trim()
                            .toLowerCase();

                    names.add(productName);
                }
                break;

            } catch (StaleElementReferenceException e) {

                System.out.println(
                        "Page is not reloaded"
                );
            }
        }
        return names;
    }
}