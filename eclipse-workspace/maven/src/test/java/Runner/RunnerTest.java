package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="./Features/Gmailverification.feature",glue = "StepDefination",plugin = "pretty",dryRun = true,strict= true,
				monochrome=true,tags = {"~@regression","~@smoketest","~@endtoend"})
				 
public class RunnerTest {
	



}
