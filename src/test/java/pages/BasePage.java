package pages;

import driver.DriverSingleton;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;

public class BasePage {
    public AppiumDriver appiumDriver = DriverSingleton.getDriver();
    public BasePage() throws MalformedURLException {
    }
}
