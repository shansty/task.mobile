package pages;

import driver.DriverSingleton;
import io.appium.java_client.AppiumDriver;
import java.io.IOException;

public class BasePage {
    public AppiumDriver appiumDriver;
    public BasePage() throws IOException {
        appiumDriver = DriverSingleton.getDriver();
    }
}
