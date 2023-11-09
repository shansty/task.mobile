package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class CoachesPage extends BasePage{
    public CoachesPage() throws MalformedURLException {
    }
    public WebElement getCoachesSectionElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("metric-section-coaches"));
    }
    public WebElement getCoachesTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-section-title' and @text='Coaches']"));
    }
    public WebElement getCoachesInfoIconElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='info'])[1]"));
    }
    public WebElement getCoachesNewFrontlineTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='New Frontline Coaches']"));
    }
    public WebElement getCoachesNewFrontlineValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[1]"));
    }
    public WebElement getCoachesAllFrontlineTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='All Frontline Coaches']"));
    }
    public WebElement getCoachesAllFrontlineValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='33']"));
    }
    public WebElement getCoachesNewGeneration0TitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='New Generation 0 Coaches']"));
    }
    public WebElement getCoachesNewGeneration0ValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[3]"));
    }
    public WebElement getCoachesAllGeneration0TitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='All Generation 0 Coaches']"));
    }
    public WebElement getCoachesAllGeneration0ValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='59']"));
    }
    public WebElement getCoachesNewOrganizationTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='New Organization Coaches']"));
    }
    public WebElement getCoachesNewOrganizationValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='2']"));
    }
    public WebElement getCoachesAllOrganizationTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='All Organization Coaches']"));
    }
    public WebElement getCoachesAllOrganizationValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='249']"));
    }
    public void scrollToCoachesNewOrganizationValue() {
        String scrollToCoachesNewOrganizationValue = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")" +
                ".scrollable(true)).setAsVerticalList().scrollIntoView(new UiSelector().description(\"metric-new-organization-coaches\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToCoachesNewOrganizationValue));
    }
}
