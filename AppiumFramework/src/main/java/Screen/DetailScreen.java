package Screen;

import org.openqa.selenium.support.PageFactory;

import Base.basefile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DetailScreen {

	public DetailScreen() {

		PageFactory.initElements(new AppiumFieldDecorator(basefile.wd), this);

	}

	// *************Package********************
	public static final String package_name = "in.workindia.nileshdungarwal.workindiaandroid";

	// *************Locators*******************

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	public static MobileElement apptext;

	@AndroidFindBy(id = package_name + ":id/tv_profile_heading")
	public static MobileElement detailtext;

	@AndroidFindBy(id = package_name + ":id/tv_degree_course")
	public static MobileElement qualtext;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
	public static MobileElement sel_qua;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	public static MobileElement select_ba;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.CheckBox")
	public static MobileElement peon;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public static MobileElement subbmit;

	@AndroidFindBy(id = package_name + ":id/rg_male")
	public static MobileElement gender;

	@AndroidFindBy(id = package_name + ":id/rb_graduate")
	public static MobileElement qualification;

	@AndroidFindBy(id = package_name + ":id/cb_english")
	public static MobileElement medium;

	@AndroidFindBy(id = package_name + ":id/rg_eng_level_4")
	public static MobileElement englishlevel;

	@AndroidFindBy(id = package_name + ":id/cb_fresher")
	public static MobileElement fresher;

	@AndroidFindBy(id = package_name + ":id/et_age")
	public static MobileElement age;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]")
	public static MobileElement age_select;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.GridView/android.widget.FrameLayout[6]/android.widget.CheckBox")
	public static MobileElement interest_select;

	@AndroidFindBy(id = package_name + ":id/btn_done")
	public static MobileElement submit_button;

	@AndroidFindBy(id = package_name + ":id/btn_english")
	public static MobileElement select_language;

	// **************Methods**********************

	public String get_Text() {
		String text = detailtext.getText();
		return text;
	}

	public void click_gender() {
		gender.click();
	}

	public void click_qualification() {
		qualification.click();
	}

	public void click_medium() {
		medium.click();
	}

	public void click_englishlevel() {
		englishlevel.click();
	}

	public void click_fresher() {
		fresher.click();
	}

	public void click_age() {
		age.click();
	}

	public void age_select() {
		age_select.click();
	}

	public void click_interestselect() {
		interest_select.click();
	}

	public void click_submitt() {
		submit_button.click();
	}

	public void click_Languageselection() {
		select_language.click();
	}

	public void select_peon() {
		peon.click();
	}

	public void select_ba() {
		select_ba.click();
	}

	public void click_subbmitt() {
		subbmit.click();
	}

	public void click_qua() {
		sel_qua.click();
	}

}
