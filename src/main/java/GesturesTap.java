import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class GesturesTap {

    public static void main(String[] args) throws Exception {
        //android
//        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        By accessibility = MobileBy.AccessibilityId("Accessibility");
//
//        //TAP
//        TouchAction t = new TouchAction(driver);
//        t.tap(ElementOption.element(driver.findElement(accessibility))).perform();
//        //t.tap(PointOption.point(538,416)).perform();
//        //t.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(accessibility)))).perform();

        //iOS
        AppiumDriver driver = CreateDriverSession.initializeDriver("iOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By activity_indicators = MobileBy.AccessibilityId("Activity Indicators");

        //TAP
        TouchAction t = new TouchAction(driver);
        //t.tap(ElementOption.element(driver.findElement(activity_indicators))).perform();
        t.tap(PointOption.point(200,114)).perform();
        //t.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(activity_indicators)))).perform();


    }

}
