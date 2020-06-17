package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeatureFiles",
		glue="stepDefinitions",
		dryRun = true,
		monochrome = true,
		plugin= {"html:Report/webReport.html", "json:Report/JsonReport.json", "junit:Report/XmlReport.xml"},
		tags = "@All"
		)
public class RunnerClass {

}
