package Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Base.basefile;
import Screen.RegisterScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RegisterStepDefinition extends basefile {

	private static Logger log = LogManager.getLogger(firststepdefinition.class.getName());
	AppiumDriver<MobileElement> mb;
	basefile ob;
	RegisterScreen res;

	public RegisterStepDefinition() {
		basefile ob = new basefile();
		AppiumDriver<MobileElement> mb = ob.wd;

	}

	@Given("^WorkindiaApp is Launched$")
	public void workindiaapp_is_Launched() throws Throwable {

		ob.launchapp();
	}

	@Given("^User is on JobSearch Register page$")
	public void user_is_on_JobSearch_Register_page() throws Throwable {

		String text = res.get_Text();
		Assert.assertEquals(text, "Job Search");

	}

	@When("^User enters the \"([^\"])\" and \"([^\"])\"$")
	public void user_enters_the_and(String arg1, String arg2) throws Throwable {
		res.set_Fullname(arg1);
		res.set_number(arg2);
	}

	@When("^User click on Submit$")
	public void user_click_on_Submit() throws Throwable {
		res.click_submit();
	}

	@Then("^User redirects to Citypage$")
	public void user_redirects_to_Citypage() throws Throwable {

		String citytext = res.get_Text();
		Assert.assertEquals(citytext, "Hi Jahanavi !! Choose Your City");

	}

	@Given("^User enters the \"([^\"])\" and \"([^\"])\" to register and get to city page$")
	public void user_enters_the_and_to_register_and_get_to_city_page(String arg1, String arg2) throws Throwable {
		res.set_Fullname(arg1);
		res.set_number(arg2);
		res.click_submit();

	}

	@When("^User selects a city and Enter \"([^\"]*)\"$")
	public void user_selects_a_city_and_Enter(String arg1) throws Throwable {
		res.click_cityname();
		res.set_nativecity(arg1);

	}

	@When("^User click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {

		res.click_submitbtn();

	}

	@Then("^User Redirect to Detailpage$")
	public void user_Redirect_to_Detailpage() throws Throwable {
		String detailtext = res.get_Text();
		Assert.assertEquals(detailtext, "Hi Jahanavi !! Choose Your City");
	}

}
