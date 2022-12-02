package Base;

import org.openqa.selenium.WebDriver;   

import io.appium.java_client.AppiumDriver;

public class AppDriver {
	 private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
	 
	 public static WebDriver getDriver() {
		 return driver.get();
	 }
	 
	 static void  setDriver(WebDriver Driver) {
		 driver.set((AppiumDriver) Driver);
	 }

}
