package Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Base.basefile;
import Screen.DetailScreen;
import Screen.RegisterScreen;
import Utilities.Common;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Detailstepdefinition extends basefile {
	private static Logger log = LogManager.getLogger(firststepdefinition.class.getName());
	AppiumDriver<MobileElement> mb;
	basefile ob;
	RegisterScreen res;
	DetailScreen d;
	Common c;

	public Detailstepdefinition() {
		basefile ob = new basefile();
		AppiumDriver<MobileElement> mb = ob.wd;

	}

	@Given("^User enters the \"([^\"])\" and \"([^\"])\" and \"([^\"]*)\"$")
	public void user_enters_the_and_and(String arg1, String arg2, String arg3) throws Throwable {

		res.set_Fullname(arg1);
		res.set_number(arg2);
		res.click_submit();
		res.click_cityname();
		res.set_nativecity(arg3);
		res.click_submitbtn();

	}

	@When("^User selects all the details on the page$")
	public void user_selects_all_the_details_on_the_page() throws Throwable {

		d.click_gender();
		d.click_qualification();
		d.click_medium();
		d.click_englishlevel();
		c.verticalswipebypercentage(mb, 0.70, 0.07, 0.50);
		d.click_fresher();
		d.click_age();
		d.age_select();
		d.select_peon();
		d.click_submitt();

	}

	@Then("^User goes to Qualification page$")
	public void user_goes_to_Qualification_page() throws Throwable {
		String qualtext = d.get_Text();
		Assert.assertEquals(qualtext, "� Aapne Kya Padhai Ki hai ?");

	}

	@When("^User selects selects the qualification$")
	public void user_selects_selects_the_qualification() throws Throwable {
		d.click_qua();
		d.select_ba();
		d.click_subbmitt();
	}

	@Then("^User goes to Language page$")
	public void user_goes_to_Language_page() throws Throwable {

		System.out.println("ChooseLanguage");
	}

	@When("^User selects Language$")
	public void user_selects_Language() throws Throwable {

		d.click_Languageselection();
	}

	@Then("^App is opened sucessfully$")
	public void app_is_opened_sucessfully() throws Throwable {
		String apptext = d.get_Text();
		Assert.assertEquals(apptext, "WorkIndia");

		System.out.println("WorkIndia");

	}

}
