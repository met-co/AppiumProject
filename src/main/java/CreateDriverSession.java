import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class CreateDriverSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        switch (platformName) {
            case "Android":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 XL API 31");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                //caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability(MobileCapabilityType.UDID, "R3CT202TMDJ");
                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "app-debug.apk";
                caps.setCapability("appPackage", "io.appium.android.apis");
                caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
                caps.setCapability("chromedriverExecutable", "/Users/elly/Desktop/AppTest/chromedriver");
                return new AndroidDriver(url, caps);


            case "iOS":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "8E7491AB-5DB2-4751-8D94-DEB14ADF4640");
                String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";

                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
                return new IOSDriver(url, caps);
            default:
                throw new Exception("invalid platform");
        }
    }
}
