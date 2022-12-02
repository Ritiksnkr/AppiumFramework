package Screen;

import org.openqa.selenium.support.PageFactory;

import Base.basefile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterScreen {



	public RegisterScreen() {

		PageFactory.initElements(new AppiumFieldDecorator(basefile.wd), this);

	}

	//*************Package********************
	public static final String package_name = "in.workindia.nileshdungarwal.workindiaandroid";

	//*************Locators*******************

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	public static MobileElement jobsearch;

	@AndroidFindBy(id = package_name + ":id/tv_city")
	public static MobileElement citytext;

	@AndroidFindBy(id = package_name + ":id/tv_profile_heading")
	public static MobileElement detailtext;


	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	public static MobileElement number;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	public static MobileElement myFullname;

	@AndroidFindBy(id = package_name + ":id/btn_submit")
	public static MobileElement submit;

	@AndroidFindBy(id = package_name + ":id/rb_Thane")
	public static MobileElement cityname;

	@AndroidFindBy(id = package_name + ":id/act_auto_complete")
	public static MobileElement nativecity;

	@AndroidFindBy(id = package_name + ":id/btn_done")
	public static MobileElement submitbtn;


	//**************Methods**********************

	public String getdetail_Text() {
		String text=detailtext.getText();
		return text;
	}

	public String get_Text() {
		String text=jobsearch.getText();
		return text;
	}

	public void set_Fullname(String username) {
		myFullname.sendKeys(username);

	}


	public void set_number(String mobile) {
		number.sendKeys(mobile);
	}

	public void click_submit() {
		submit.click();
	}

	public void click_cityname() {
		cityname.click();
	}

	public void set_nativecity(String city) {
		nativecity.sendKeys(city);
	}

	public void click_submitbtn() {
		submitbtn.click();
	}
}
