package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;

public class CardPage extends BasePage{
    public CardPage() throws MalformedURLException {
    }
    public WebElement getFQVCardElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("FQV-card"));
    }
    public WebElement getG0VCardElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("G0V-card"));
    }
    public WebElement getTGVCardElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("TGV-card"));
    }
    public WebElement getCardTitleElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-title"));
    }
    public WebElement getCardMainValueElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-main-value"));
    }
    public WebElement getCardInfoIconElement() {
        return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='info'])[1]"));
    }
    public WebElement getCardProjectedThisMonthTitleElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-projected-this-month-title"));
    }
    public WebElement getCardProjectedThisMonthValueElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-projected-this-month-value"));
    }
    public WebElement getCardSameTimeLastMonthTitleElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-same-last-month-title"));
    }
    public WebElement getCardSameTimeLastMonthValueElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-same-last-month-value"));
    }
    public WebElement getCardLastMonthTotalTitleElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-last-month-total-title"));
    }
    public WebElement getCardLastMonthTotalValueElement() {
        return appiumDriver.findElement(AppiumBy.accessibilityId("card-last-month-total-value"));
    }
    public void scrollToGOVCard() {
        String scrollG0V = "new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\")" +
                ".scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().description(\"G0V-card\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollG0V));
    }
    public void scrollToTGVCard() {
        String scrollTGV = "new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\")" +
                ".scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().description(\"TGV-card\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollTGV));
    }
    public void scrollToFirstCard() {
        String scrollToFirstCard = "new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\")" +
                ".scrollable(true)).setAsHorizontalList().scrollToBeginning(2)";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToFirstCard));
    }
}
