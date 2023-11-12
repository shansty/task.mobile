package pages.parts;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.PropertyHelper;

import java.io.IOException;

public class CardPart extends BasePage {
    public CardPart() throws IOException {
    }

    public WebElement getFQVCardElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("FQV-card"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getG0VCardElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("G0V-card"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getTGVCardElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("TGV-card"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-title"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardMainValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-main-value"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardInfoIconElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.xpath("(//android.widget.TextView[@content-desc='info'])[1]"));
        } else {
            return appiumDriver.findElement(AppiumBy.xpath("IOS selector"));
        }
    }

    public WebElement getCardProjectedThisMonthTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-projected-this-month-title"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardProjectedThisMonthValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-projected-this-month-value"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardSameTimeLastMonthTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-same-last-month-title"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardSameTimeLastMonthValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-same-last-month-value"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardLastMonthTotalTitleElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-last-month-total-title"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public WebElement getCardLastMonthTotalValueElement() {
        if (PropertyHelper.getPlatformName().equals("Android")) {
            return appiumDriver.findElement(AppiumBy.accessibilityId("card-last-month-total-value"));
        } else {
            return appiumDriver.findElement(AppiumBy.accessibilityId("IOS selector"));
        }
    }

    public void scrollToGOVCard() {
        String scrollG0V = "new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\")" + ".scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().description(\"G0V-card\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollG0V));
    }

    public void scrollToTGVCard() {
        String scrollTGV = "new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\")" + ".scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().description(\"TGV-card\"))";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollTGV));
    }

    public void scrollToFirstCard() {
        String scrollToFirstCard = "new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\")" + ".scrollable(true)).setAsHorizontalList().scrollToBeginning(2)";
        appiumDriver.findElement(AppiumBy.androidUIAutomator(scrollToFirstCard));
    }
}
