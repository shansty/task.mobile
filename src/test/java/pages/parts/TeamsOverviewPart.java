package pages.parts;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.PropertyHelper;
import java.io.IOException;

public class TeamsOverviewPart extends BasePage {
    public TeamsOverviewPart() throws IOException {
    }

    public WebElement getTeamsOverviewSectionElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("metric-section-teams-overview"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-section-title' and @text='Teams Overview']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewInfoIconElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("info"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewSeniorCoachTeamsTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='Senior Coach Teams']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewSeniorCoachTeamsValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='6']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewExecutiveDirectorTeamsTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='Executive Director Teams']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewExecutiveDirectorTeamsValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[6]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewFIBCTeamsTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='FIBC Teams']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewFIBCTeamsValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[7]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewFIBLTeamsTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-title' and @text='FIBL Teams']"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getTeamsOverviewFIBLTeamsValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[8]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }
}
