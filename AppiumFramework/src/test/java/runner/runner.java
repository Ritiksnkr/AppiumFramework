package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features = {"src//test//java//Feature//"},
		glue={"Stepdefination"},
		tags= {"tag1","tag2","tag3","tag4","test1","tes2","test3","test4","test5"}
         )
public class runner extends AbstractTestNGCucumberTests{

}
