import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class ElementBasicActions {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        By views = MobileBy.AccessibilityId("Views");
        By textFields = MobileBy.AccessibilityId("TextFields");
        By editText = MobileBy.id("io.appium.android.apis:id/edit");

        driver.findElement(views).click();

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(612, 2441))
                .moveTo(new PointOption().withCoordinates(528, 625))
                .release()
                .perform();

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(612, 2441))
                .moveTo(new PointOption().withCoordinates(499, 567))
                .release()
                .perform();

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(612, 2441))
                .moveTo(new PointOption().withCoordinates(494, 525))
                .release()
                .perform();


        driver.findElement(textFields).click();
        driver.findElement(editText).sendKeys("my text");
        Thread.sleep(3000);
        driver.findElement(editText).clear();



    }
}
