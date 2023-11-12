package utils;

import org.openqa.selenium.WebElement;

public class WebElementHelper {
    public static int getIntFromWebElementText(WebElement webElement) {
        return Integer.parseInt(webElement.getText().replaceAll("[^0-9]+", ""));
    }
}
