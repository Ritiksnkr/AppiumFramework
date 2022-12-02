package Stepdefinition;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.basefile;
import Screen.FirstScreen;
import Screen.SecondScreen;
import Screen.ThirdScreen;
import Utilities.ExtentManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class firststepdefinition extends basefile {
	private static Logger log = LogManager.getLogger(firststepdefinition.class.getName());
	AppiumDriver<MobileElement> mb;
	basefile ob;

	public firststepdefinition() {
		basefile ob = new basefile();
		AppiumDriver<MobileElement> mb = ob.wd;

	}

	@Test(priority = 1)
	@Given("^open the emulator$")
	public void open_the_emulator() throws Throwable {
		// basefile ob = new basefile();
		ob.launchapp();
		log.info("The App was launched successfully");

	}

	@Test(priority = 2)
	@When("^the user enter the username$")
	public void the_user_enter_the_username() {

		FirstScreen fs = new FirstScreen();

		fs.username("ABC");
		log.info("The user enter the Name");

	}

	@Test(priority = 3)
	@And("^the mobile number$")
	public void the_mobile_number() {
		FirstScreen fs = new FirstScreen();
		fs.phoneno("1234567890");
		log.info("The user enter the Number");

	}

	@Test(priority = 4)
	@Then("^the user clicks on submit button$")
	public void the_user_clicks_on_submit_button() throws InterruptedException {
		FirstScreen fs = new FirstScreen();
		fs.submitbtn();
		log.info("The user clicks on the submit button");

		// To wait for sometime and reload the element//
		Thread.sleep(20000);
	}

	///////////////////// Secondpage////////////////////////

	@Test(priority = 5)
	@When("^the user tap on the option$")
	public void the_user_tap_on_the_option() throws Throwable {
		SecondScreen sg = new SecondScreen();
		sg.location_option();
		log.info("The user select the City");
		// Thread.sleep(3000);
	}

	@Test(priority = 6)
	@And("^select the area$")
	public void select_the_area() throws Throwable {
		SecondScreen sg = new SecondScreen();
		sg.location("NEW DELHI");
		Thread.sleep(3000);

	}

	@Test(priority = 7)
	@Then("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
		SecondScreen sg = new SecondScreen();
		sg.submitbtn();
		log.info("The user select Submit button");

	}

	//////////////////////////// Thirdpage//////////////////////////////////////////

	@Test(priority = 8)
	@And("^select the gender$")
	public void select_the_gender() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.genderoption();
		Thread.sleep(3000);
		log.info("The user select the gender");
	}

	@Test(priority = 9)
	@And("^select the qualification$")
	public void select_the_qualification() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.qualificationoption();
		Thread.sleep(3000);
		log.info("The user select the qulaification");
	}

	@Test(priority = 10)
	@And("^select the medium$")
	public void select_the_medium() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.mediumoption();
		Thread.sleep(3000);
		log.info("The user select the medium");
	}

	@Test(priority = 11)
	@And("^select the language$")
	public void select_the_language() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.languageoption();
		Thread.sleep(3000);
		log.info("The user select the language");
	}

	@Test(priority = 12)
	@When("^user scroll the page$")
	public void user_scroll_the_page() throws Throwable {
		basefile obj = new basefile();
		obj.scrolldown();
		log.info("page is scrolled");
	}

	@Test(priority = 13)
	@And("^select the Experience$")
	public void select_the_Experience() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.experienceoption();
		log.info("The user select the experience");
		Thread.sleep(3000);

	}

	@Test(priority = 14)
	@And("^select the year$")
	public void select_the_year() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.yearoption();
		Thread.sleep(3000);
	}

	@Test(priority = 15)
	@And("^Select the age$")
	public void select_the_age() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.agetption();

	}

	@Test(priority = 16)
	@And("^select the Interest$")
	public void select_the_Interest() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.interestoption();
		Thread.sleep(3000);

	}

	@Test(priority = 17)
	@Then("^Click the submit button$")
	public void click_the_submit_button() throws Throwable {
		ThirdScreen th = new ThirdScreen();
		th.doneoption();
	}

}
