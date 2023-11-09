package pages;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;

public class GreetingPage extends BasePage{
    public GreetingPage() throws MalformedURLException {
    }
    public String getGreetingMessage() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("dashboard-greeting-hello")).getText() +
                appiumDriver.findElement(AppiumBy.accessibilityId("dashboard-greeting-name")).getText();
    }
}
