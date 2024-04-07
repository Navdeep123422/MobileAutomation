package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.DriverUtils;

import java.net.MalformedURLException;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = DriverUtils.getAndroidDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
