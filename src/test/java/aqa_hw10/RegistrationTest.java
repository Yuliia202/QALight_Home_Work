package aqa_hw10;

import aqa_hw_10.DbDataProvider;
import aqa_hw_10.page_object.HomePage;
import org.apache.commons.lang3.tuple.Pair;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest {

    @Test
    public void testAuthFunctionality() {
        Pair<String, String> userCredential = DbDataProvider.getUserInfo();
        HomePage homePage = new HomePage(getDriver());

        if (userCredential == null) {
            throw new RuntimeException("No user credentials found in the database.");
        }

        String email = userCredential.getLeft();
        String password = userCredential.getRight();

        homePage.clickLogInButton();
        homePage.enterLogInAndPasswordButton(email, password);
    }
}
