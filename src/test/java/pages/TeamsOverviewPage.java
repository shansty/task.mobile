package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class TeamsOverviewPage extends BasePage{
    public TeamsOverviewPage() throws MalformedURLException {
    }
    public WebElement getTeamsOverviewSectionElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("metric-section-teams-overview"));
    }
    public WebElement getTeamsOverviewTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-section-title' and @text='Teams Overview']"));
    }
    public WebElement getTeamsOverviewInfoIconElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("info"));
    }
    public WebElement getTeamsOverviewSeniorCoachTeamsTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='Senior Coach Teams']"));
    }
    public WebElement getTeamsOverviewSeniorCoachTeamsValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='metric-value' and @text='6']"));
    }
    public WebElement getTeamsOverviewExecutiveDirectorTeamsTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='Executive Director Teams']"));
    }
    public WebElement getTeamsOverviewExecutiveDirectorTeamsValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[6]"));
    }
    public WebElement getTeamsOverviewFIBCTeamsTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='FIBC Teams']"));
    }
    public WebElement getTeamsOverviewFIBCTeamsValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[7]"));
    }
    public WebElement getTeamsOverviewFIBLTeamsTitleElement() {
        return appiumDriver.findElement(AppiumBy.xpath( "//android.widget.TextView[@content-desc='metric-title' and @text='FIBL Teams']"));
    }
    public WebElement getTeamsOverviewFIBLTeamsValueElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='metric-value'])[8]"));
    }
}
