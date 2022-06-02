import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileElement;

public class iOSPredicateString {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("iOS");

        MobileElement myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
                .findElementsByIosNsPredicate("name == \"Alert Views\" OR name == \"Activity Indicators\"").get(1);
        System.out.println(myElement.getText());

        myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
                .findElementByIosNsPredicate("name CONTAINS \"Activity Indicators\"");
        System.out.println(myElement.getText());

        myElement = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]");
        System.out.println(myElement.getText());





    }
}
