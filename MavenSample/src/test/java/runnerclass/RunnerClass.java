package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Shruthi Keerthi\\eclipse-workspace\\MavenSample\\src\\test\\resources\\features", glue = {
		"stepdef" })
public class RunnerClass {
}
