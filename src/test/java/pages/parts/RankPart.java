package pages.parts;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.PropertyHelper;
import java.io.IOException;

public class RankPart extends BasePage {
    public RankPart() throws IOException {
    }

    public WebElement getRankProgressCardElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-card"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getRankTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-title"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getRankDescriptionElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-description"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getRankIconElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("rank-icon"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getRankSeeProgressAndPerformanceElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("rank-see-progress"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getRankProgressBarElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-bar"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public void scrollToRank() {
        String scrollToRank = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")" +
                ".scrollable(true)).setAsVerticalList().scrollIntoView(new UiSelector().description(\"rank-progress-card\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToRank));
    }
}
