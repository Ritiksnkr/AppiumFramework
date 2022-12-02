package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;
import Base.basefile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FourthScreen {

	public static AppiumDriver<MobileElement> wd;

	public FourthScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(basefile.wd),this);
	}

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	public MobileElement joboptionbtn;

	@FindBy(xpath = "checkbox-/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox")
	public MobileElement jobbtn;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	public MobileElement subbtn;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public MobileElement donebtn;

	public void job_ption() {
		joboptionbtn.click();
	}

	public void joboption() {
		jobbtn.click();
	}

	public void suboption() {
		subbtn.click();
		;
	}

	public void doneoption() {
		donebtn.click();
	}
}
