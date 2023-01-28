package HookStepDefinition;

import io.cucumber.java.en.*;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/HookReature", glue = {"HookStepDefinition"})
public class TestRunnerForHook {

}
