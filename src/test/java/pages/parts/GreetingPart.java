package pages.parts;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.PropertyHelper;
import java.io.IOException;

public class GreetingPart extends BasePage {
    public GreetingPart() throws IOException {
    }

    public WebElement getGreetingMessage() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("dashboard-greeting-hello"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }
}
