import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class iOSCreateDriverSession {


    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability(MobileCapabilityType.UDID, "8E7491AB-5DB2-4751-8D94-DEB14ADF4640");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
        caps.setCapability(MobileCapabilityType.APP, appUrl);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new IOSDriver(url, caps);


    }
}
