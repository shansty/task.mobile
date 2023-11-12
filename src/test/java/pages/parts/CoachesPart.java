package pages.parts;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.PropertyHelper;
import java.io.IOException;

public class CoachesPart extends BasePage {
    public CoachesPart() throws IOException {
    }

    public WebElement getCoachesSectionElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("metric-section-coaches"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCoachesTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-section-title' and @text='Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesInfoIconElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='info'])[1]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesNewFrontlineTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='New Frontline Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesNewFrontlineValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[1]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesAllFrontlineTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='All Frontline Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesAllFrontlineValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='33']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesNewGeneration0TitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='New Generation 0 Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesNewGeneration0ValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[3]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesAllGeneration0TitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='All Generation 0 Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesAllGeneration0ValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='59']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesNewOrganizationTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='New Organization Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesNewOrganizationValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='2']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesAllOrganizationTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='All Organization Coaches']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCoachesAllOrganizationValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='249']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public void scrollToCoachesNewOrganizationValue() {
        String scrollToCoachesNewOrganizationValue = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")" +
                ".scrollable(true)).setAsVerticalList().scrollIntoView(new UiSelector().description(\"metric-new-organization-coaches\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToCoachesNewOrganizationValue));
    }
}
