package Stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\user\\eclipse-workspace\\HYBRID\\src\\main\\java\\features",
		glue="Stepdefinition"
		)
public class parallelrun {
	

}
