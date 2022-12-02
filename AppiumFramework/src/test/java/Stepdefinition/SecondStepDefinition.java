package Stepdefinition;

import org.apache.log4j.LogManager; 
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.basefile;
import Screen.FourthScreen;
import cucumber.api.java.en.And;

public class SecondStepDefinition extends basefile{
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Logger log = LogManager.getLogger(firststepdefinition.class.getName());

	@Test(priority = 18)
	@And("^the user select the job and press submit$")
	public void the_user_select_the_job_and_press_submit() throws Throwable {
	FourthScreen fr = new FourthScreen();
	fr.job_ption();
	Thread.sleep(150);
	fr.joboption();
	Thread.sleep(150);
	fr.suboption();
	Thread.sleep(150);
	fr.doneoption();
	
	log.info("The user select the different the credential successfully");
	Thread.sleep(1000);
	}
}