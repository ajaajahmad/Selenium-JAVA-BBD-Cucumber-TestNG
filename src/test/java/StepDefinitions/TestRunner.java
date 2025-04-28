package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepsDefinitions" }, monochrome = true, plugin = {
		"pretty", "junit:target/JUnitReport.xml", "pretty", "json:target/JSONReport.json", "pretty",
		"html:target/HTMLReport.html" }, tags = "@smoketest")
public class TestRunner {
}