package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\dssri\\eclipse-workspace\\maven\\Features\\MyApplication.feature",
				glue="StepDefination",
				plugin={"pretty","html:target/cucumber-html-report",
						"json:target/cucumber.json",
						"pretty:target/cucumber-pretty.txt",
						"usage:target/cucumber-usage.json",
						"junit:target/cucumber-result.xml"},
						 monochrome = true, dryRun = false,strict = true )
public class TestRunner {

}
