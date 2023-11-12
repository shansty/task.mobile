package utils;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;

public class DesiredCapabilitiesHelper {
    public static DesiredCapabilities getDesiredCapabilities() throws IOException {
        PropertyHelper.readProperty();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, PropertyHelper.getPlatformName());
        desiredCapabilities.setCapability("platformVersion", PropertyHelper.getPlatformVersion());
        desiredCapabilities.setCapability("deviceName", PropertyHelper.getDeviceName());
        desiredCapabilities.setCapability("automation", PropertyHelper.getAutomation());
        desiredCapabilities.setCapability("app", PropertyHelper.getApp());
        return desiredCapabilities;
    }
}
