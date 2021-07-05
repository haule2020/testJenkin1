package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

//test
@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, features = "resources/Feature/policyEnquery.feature",
glue = {"stepDefinitions"}, plugin = { "json:target/cucumber-reports/Cucumber.json",
				"html:target/cucumber-reports/cucumber-pretty" })
public class ApiRunnerTest {
}


