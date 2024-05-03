package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Login.feature", dryRun = false, glue = { "stepdefinitions",
		"hooks" }, plugin = { "pretty", "html:report/cucumber-reports/report.html", "json:report/cucumber-reports/report.json","junit:report/cucumber-reports/report.xml" }, monochrome = true)
public class MyRunner extends AbstractTestNGCucumberTests {

}
