package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import utils.PropertyHelper;
import java.io.IOException;

public class LoginPage extends BasePage {
    public LoginPage() throws IOException {
    }

    public WebElement getEmailElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("login-username-input"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getPasswordElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("login-password-input"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getLoginButtonElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("login-login-button"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }
}
