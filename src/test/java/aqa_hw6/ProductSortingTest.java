package aqa_hw6;

import aqa_hw_6.CatalogPage;
import aqa_hw_6.MainPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSortingTest extends BaseTest {

    @Test
    public void verifySorting() {

        MainPage mainPage = new MainPage(getDriver());
        CatalogPage catalogPage = new CatalogPage(getDriver());

        mainPage.clickAllCatalogButton();
        catalogPage.sortByName();
        List<String> actualNames = catalogPage.getFirstFiveProductNames();
        Assert.assertFalse(actualNames.isEmpty(), "List is empty");

        System.out.println("Actual: " + actualNames);

        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames);

        System.out.println("Expected: " + expectedNames);

        Assert.assertEquals(
                actualNames,
                expectedNames,
                "Items are not sorted"
        );
    }
}