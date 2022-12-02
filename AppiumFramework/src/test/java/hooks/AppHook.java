package hooks;

import java.io.IOException; 
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import com.relevantcodes.extentreports.LogStatus;

import Base.basefile;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppHook extends basefile {
	
	@Before
	public static void launchapp() throws MalformedURLException {
		AppiumDriverLocalService service;
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	@After
	public static void closeapp() {
		wd.quit();
	}

}
