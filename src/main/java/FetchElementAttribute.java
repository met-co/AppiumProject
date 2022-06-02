import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FetchElementAttribute {

    public static void main(String[] args) throws Exception {
        //android
//        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
//
//        By accessibility = MobileBy.AccessibilityId("Accessibility");
//        System.out.println("text:" + driver.findElement(accessibility).getText());
//        System.out.println("text:" + driver.findElement(accessibility).getAttribute("text"));
//        System.out.println("checked:" + driver.findElement(accessibility).getAttribute("checked"));
//        System.out.println("enabled:" + driver.findElement(accessibility).getAttribute("enabled"));
//        System.out.println("selected:" + driver.findElement(accessibility).getAttribute("selected"));
//        System.out.println("displayed:" + driver.findElement(accessibility).getAttribute("displayed"));
//
//        System.out.println("enabled:" + driver.findElement(accessibility).isEnabled());
//        System.out.println("selected:" + driver.findElement(accessibility).isSelected());
//        System.out.println("displayed:" + driver.findElement(accessibility).isDisplayed());


        //iOS
        AppiumDriver driver = CreateDriverSession.initializeDriver("iOS");

        By activity_indicators = MobileBy.AccessibilityId("Activity Indicators");
        System.out.println("text:" + driver.findElement(activity_indicators).getText());
        System.out.println("label:" + driver.findElement(activity_indicators).getAttribute("label"));
        System.out.println("value:" + driver.findElement(activity_indicators).getAttribute("value"));
        System.out.println("enabled:" + driver.findElement(activity_indicators).getAttribute("enabled"));
        System.out.println("selected:" + driver.findElement(activity_indicators).getAttribute("selected"));
        System.out.println("visible:" + driver.findElement(activity_indicators).getAttribute("visible"));

        System.out.println("enabled:" + driver.findElement(activity_indicators).isEnabled());
        System.out.println("selected:" + driver.findElement(activity_indicators).isSelected());
        System.out.println("displayed:" + driver.findElement(activity_indicators).isDisplayed());
    }
}
