package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverSingleton {
    private static AppiumDriver appiumDriver;
    public static AppiumDriver getDriver() throws MalformedURLException {
        if (appiumDriver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability("platformVersion", "11.0");
            desiredCapabilities.setCapability("deviceName", "Pixel 6");
            desiredCapabilities.setCapability("automation", "UiAutomator2");
            URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
            appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        }
        return appiumDriver;
    }
    private DriverSingleton() {
    }
    public static void quit() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}