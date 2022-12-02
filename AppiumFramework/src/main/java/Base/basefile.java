package Base;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.ConfigFileReader;
import Utilities.ExtentManager;
import io.appium.java_client.touch.ActionOptions;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class basefile {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static AppiumDriver<MobileElement> wd;
	public static DesiredCapabilities dc;
	static ConfigFileReader cr;

	@BeforeSuite
	public void init() throws Exception {
		extent = ExtentManager.getInstance("reports/ExtentReports.html");
	}

	@BeforeMethod
	public void startTest(Method method) throws Exception {
		test = extent.startTest(method.getName());
	}
	@Before
	public static void launchapp() throws MalformedURLException {
		AppiumDriverLocalService service;
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();

//		dc = new DesiredCapabilities();
//		dc.setCapability("platformVersion", "8.1");
//		dc.setCapability("platformName", "Android");
//		dc.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
//		dc.setCapability("appActivity", "in.workindia.nileshdungarwal.workindiaandroid.RegisterActivity");
//		dc.setCapability("app", "C:/Users/ritiksonker/Downloads/in.workindia.apk");
//		dc.setCapability("deviceName", "Android");
		
		cr = new ConfigFileReader();
		dc = new DesiredCapabilities();
		dc.setCapability("platformVersion", cr.getProperty("platformVersion"));
		dc.setCapability("platformName", cr.getProperty("Android"));
		dc.setCapability("appPackage", cr.getProperty("in.workindia.nileshdungarwal.workindiaandroid"));
		dc.setCapability("appActivity", cr.getProperty("in.workindia.nileshdungarwal.workindiaandroid.RegisterActivity"));
		dc.setCapability("app", cr.getProperty("C:/Users/ritiksonker/Downloads/in.workindia.apk"));
		dc.setCapability("deviceName", cr.getProperty("Android"));
		
		
//	dc.setCapability("noSign", "True");

		try {
			wd = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		//using get and set method to call the Appium driver//
//		AppDriver.setDriver(wd);
	}

	///// Scroll down Method//////

	public static void scrolldown() {
		/// storing all the elements in the list present in the MobileElement
		List<MobileElement> lists = wd.findElements(By.xpath("//android.widget.TextView"));

		// fetching all the element one by one
		for (MobileElement e : lists)
			System.out.println(e.getAttribute("text"));

		// getting the dimension and storing it in the object
		Dimension dime = AppDriver.getDriver().manage().window().getSize();

		// parsing the dimension into int datatype//
		int start_x = (int) (dime.width * 0.5);
		int start_y = (int) (dime.height * 0.7);

		int end_x = (int) (dime.width * 0.2);
		int end_y = (int) (dime.height * 0.1);

		TouchAction touch = new TouchAction(wd);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	@AfterTest
	// Calling the app to quit//
	public static void closeapp() {
		wd.quit();
	}

	static {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "./Resource/log4j2.xml";
		Configurator.initialize(null, log4jConfigFile);
	}

	public static Logger logger = LogManager.getLogger(basefile.class);
	

	@AfterMethod
	public void testResult(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		if (result.getStatus() == ITestResult.FAILURE)
			test.log(LogStatus.FAIL, result.getThrowable());
		else if (result.getStatus() == ITestResult.SKIP)
			test.log(LogStatus.SKIP, result.getThrowable());
		else
			test.log(LogStatus.PASS, "Test Passed");
	}

	@AfterSuite
	public void reportFlush() {
		extent.flush();
	}

}
