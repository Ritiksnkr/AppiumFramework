package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.AppDriver;
import Base.basefile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SecondScreen {
	
public static  AppiumDriver<MobileElement> wd;
	
	public SecondScreen() {
//		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()),this);
		PageFactory.initElements(new AppiumFieldDecorator(basefile.wd),this);
		}
	
	//getting the elements by their Xpath and id///
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_delhi")
	public MobileElement optionbtn;
	
	@FindBy(id= "in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
	public MobileElement locationTEXT;
	
	@FindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public MobileElement clickbtn;
	
	///Declaring the method to perform some action with it///
public void location_option() {
		optionbtn.click();
	}
	
	public void location(String area) {
		locationTEXT.sendKeys(area);
	}
	public void submitbtn() {
		clickbtn.click();
	}


}
