package pages.parts;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.PropertyHelper;
import java.io.IOException;

public class LogoPart extends BasePage {
    public LogoPart() throws IOException {
    }

    public void scrollToLogo() {
        String scrollToLogo = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")" +
                ".scrollable(true)).setAsVerticalList().scrollIntoView(new UiSelector().description(\"optavia-logo\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToLogo));
    }

    public WebElement getLogoElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("shared-optavia-logo"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }
}
