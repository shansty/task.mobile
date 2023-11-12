package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.DesiredCapabilitiesHelper;
import utils.PropertyHelper;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;

public class DriverSingleton {
    private static AppiumDriver appiumDriver;
    public static AppiumDriver getDriver() throws IOException {
        if (appiumDriver == null) {
            DesiredCapabilities desiredCapabilities = DesiredCapabilitiesHelper.getDesiredCapabilities();
            URI appiumServer = URI.create(PropertyHelper.getUrl());
            appiumDriver = new AppiumDriver(appiumServer.toURL(), desiredCapabilities);
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