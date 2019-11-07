package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Cucumber\\FreeCrmBDDFramework\\src\\main\\java\\Features\\login.feature"
		,glue={"stepDefinitions"}
		,format = {"pretty","html:report.html"}
		)

public class TestRunner {
	System.out.println("Hello");

}
