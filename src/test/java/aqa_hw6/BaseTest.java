package aqa_hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; // Додали імпорт

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void driverInit() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        driver = new ChromeDriver(options);

        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void driverQuit() {
        if (driver != null) {
            driver.quit();
        }
    }
}