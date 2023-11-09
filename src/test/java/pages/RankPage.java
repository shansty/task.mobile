package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class RankPage extends BasePage{
    public RankPage() throws MalformedURLException {
    }
    public WebElement getRankProgressCardElement(){
        return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-card"));
    }
    public WebElement getRankTitleElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-title"));
    }
    public WebElement getRankDescriptionElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-description"));
    }
    public WebElement getRankIconElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("rank-icon"));
    }
    public WebElement getRankSeeProgressAndPerformanceElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("rank-see-progress"));
    }
    public WebElement getRankProgressBarElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("rank-progress-bar"));
    }
    public void scrollToRank() {
        String scrollToRank = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")" +
                ".scrollable(true)).setAsVerticalList().scrollIntoView(new UiSelector().description(\"rank-progress-card\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToRank));
    }
}
