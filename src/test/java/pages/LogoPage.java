package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class LogoPage extends BasePage{
    public LogoPage() throws MalformedURLException {
    }
    public void scrollToLogo() {
        String scrollToLogo = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")" +
                ".scrollable(true)).setAsVerticalList().scrollIntoView(new UiSelector().description(\"optavia-logo\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToLogo));
    }
    public WebElement getLogoElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("shared-optavia-logo"));
    }
}
