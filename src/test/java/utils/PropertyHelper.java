package utils;

import java.io.IOException;

public class PropertyHelper {
    public static void readProperty() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
    }

    public static String getPlatformName() {
        return System.getProperty("platform.name");
    }

    public static String getPlatformVersion() {
        return System.getProperty("platform.version");
    }

    public static String getDeviceName() {
        return System.getProperty("deviceName");
    }

    public static String getAutomation() {
        return System.getProperty("UiAutomator2");
    }

    public static String getApp() {
        return System.getProperty("app");
    }

    public static String getUrl() {
        return System.getProperty("url");
    }
}
