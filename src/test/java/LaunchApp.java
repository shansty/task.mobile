import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunchApp {
    @Test
    public void launch() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "Pixel 6");
        desiredCapabilities.setCapability("automation", "UiAutomator2");
     //   desiredCapabilities.setCapability("app", "app-staging.apk");
        URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);
//        appiumDriver.findElement(AppiumBy.accessibilityId("login-username-input")).sendKeys("ed-domestic@medifastinc.com");
//        appiumDriver.findElement(AppiumBy.accessibilityId("login-password-input")).sendKeys("Medifast2017**");
//        appiumDriver.findElement(AppiumBy.accessibilityId("login-login-button")).click();
        String greeting = appiumDriver.findElement(AppiumBy.accessibilityId("dashboard-greeting-hello")).getText() +
                appiumDriver.findElement(AppiumBy.accessibilityId("dashboard-greeting-name")).getText();
        Assertions.assertEquals("Good evening,Molly & Jon Rutty", greeting);
        WebElement rankProgressCard = appiumDriver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"rank-progress-card\"]/android.view.ViewGroup[1]"));
        Assertions.assertTrue(rankProgressCard.isEnabled());
        WebElement frontlineQualifyingVolumeCard = appiumDriver.findElement(AppiumBy.accessibilityId("FQV-card"));
        Assertions.assertTrue(frontlineQualifyingVolumeCard.isEnabled());

        String testTextForScroll = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"FIBL Teams\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(testTextForScroll));
        
        WebElement generationVolumeCard = appiumDriver.findElement(AppiumBy.accessibilityId("G0V-card"));
        Assertions.assertTrue(generationVolumeCard.isEnabled());
        WebElement totalGenerationVolumeCard = appiumDriver.findElement(AppiumBy.accessibilityId("TGV-card"));
        Assertions.assertTrue(totalGenerationVolumeCard.isEnabled());
        appiumDriver.quit();
    }
}
