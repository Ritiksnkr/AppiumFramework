package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;
import Base.basefile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ThirdScreen {
	
public static  AppiumDriver<MobileElement> wd;
	
	public ThirdScreen() {
//		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
		PageFactory.initElements(new AppiumFieldDecorator(basefile.wd),this);
		}
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	public MobileElement Genderbtn;
	
	@FindBy(id= "in.workindia.nileshdungarwal.workindiaandroid:id/rb_hsc")
	public MobileElement qualificationbtn;
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/cb_english")
	public MobileElement mediumbtn;
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_3")
	public MobileElement languagebtn;
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	public MobileElement experiencebtn;
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_age")
	public MobileElement yearbtn;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")
	public MobileElement agebtn;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.CheckBox")
	public MobileElement interestbtn;
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public MobileElement donebtn;
	
	public void genderoption() {
		 Genderbtn.click();
	}
	
	public void qualificationoption() {
		qualificationbtn.click();
		
	}
	public void mediumoption() {
		 mediumbtn.click();

	}
	
	public void languageoption() {
		languagebtn.click();
	}
	
	 public void experienceoption() {
		 experiencebtn.click();
	 }
	 
	 public void yearoption() {
		 yearbtn.click();
	 }
	 
	 public void agetption() {
		 agebtn.click();
	 }
	 
	 public void interestoption() {
		 interestbtn.click();
	 }
	 
	 public void doneoption() {
		 donebtn.click();
	 }

}
