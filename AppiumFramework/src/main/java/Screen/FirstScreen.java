package Screen;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basefile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FirstScreen {
	public FirstScreen() {

		PageFactory.initElements(new AppiumFieldDecorator(basefile.wd), this);

	}

	// getting the elements by their id///
	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	public MobileElement username;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	public MobileElement phoneno;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	public MobileElement clickbtn;

	/// Declaring the method to perform some action with it///
	public void username(String Username) {
		username.sendKeys(Username);
	}

	public void phoneno(String password) {
		phoneno.sendKeys(password);
	}

	public void submitbtn() {
		clickbtn.click();
	}

}
