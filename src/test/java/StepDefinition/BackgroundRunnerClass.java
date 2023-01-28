package StepDefinition;
import io.cucumber.java.en.*;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Background", glue = {"BackgroundStepDefinition"}, monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml"})
public class BackgroundRunnerClass {

}
