package runner	;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "Feature"
		,glue = {"stepDefinition"}
	//	,plugin = {"com.aventstk.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	//	,plugin = { "pretty", "json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/cucumberreport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		,monochrome = true
		,publish = true
		
		)
	

	public class run extends AbstractTestNGCucumberTests {

//    }
    }

	

