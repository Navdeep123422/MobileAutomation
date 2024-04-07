package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {
    public static AppiumDriver getAndroidDriver() throws MalformedURLException {
    	DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "iPhone 14 Pro"); // Replace with your iPhone device name
        caps.setCapability("platformName", "iOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("UUID", "00008120-0006209A3A93C01E");

        return new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), caps);
    }
}
