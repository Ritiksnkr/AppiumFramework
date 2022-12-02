package Utilities;

import org.openqa.selenium.Dimension; 

import com.aventstack.extentreports.model.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Common {

	public static AppiumDriver<MobileElement> driver;
	Test utils = new Test();

	public void verticalswipebypercentage(AppiumDriver<MobileElement> driver, double startpercentage,
			double endpercentage, double anchorpercentage) throws Throwable {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorpercentage);
		int startpoint = (int) (size.height * startpercentage);
		int endpoint = (int) (size.height * endpercentage);
		new TouchAction(driver).press(point(anchor, startpoint)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(anchor, endpoint)).release().perform();
	}

}
