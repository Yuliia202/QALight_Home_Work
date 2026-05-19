package aqa_hw5.dataprovider;

import org.testng.annotations.DataProvider;

public class ProvideData {

    @DataProvider(name = "getSearchQueries")
    public Object[][] getSearchQueries() {
        return new Object[][] {
                { "Стівен Кінг" },
                { "Гаррі Поттер" }
        };
    }
}