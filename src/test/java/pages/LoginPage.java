package pages;

import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;

public class LoginPage extends BasePage{
    public LoginPage() throws MalformedURLException {
    }
    public void fillEmail() {
        appiumDriver.findElement(AppiumBy.accessibilityId("login-username-input")).sendKeys("ed-domestic@medifastinc.com");
    }
    public void fillPassword(){
        appiumDriver.findElement(AppiumBy.accessibilityId("login-password-input")).sendKeys("Medifast2017**");
    }
    public void submitLoginButton() {
        appiumDriver.findElement(AppiumBy.accessibilityId("login-login-button")).click();
    }
}
