import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class iOSFindElement {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("iOS");

        MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
        System.out.println(myElement.getText());

        myElement = (MobileElement) driver.findElementsByClassName("XCUIElementTypeStaticText").get(1);
        System.out.println(myElement.getText());

        myElement = (MobileElement) driver.findElementByName("Activity Indicators");
        System.out.println(myElement.getText());

        myElement = (MobileElement) driver.findElementById("Activity Indicators");
        System.out.println(myElement.getText());

        myElement = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]");
        System.out.println(myElement.getText());




    }
}
