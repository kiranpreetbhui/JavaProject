package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
				features="C:\\Users\\Home-PC\\git\\JavaProject\\KiranCucumber\\src\\test\\java\\Feature\\multiplelogin.feature",
	
				glue="StepDefinition",
				dryRun=false
				
			)
public class runner {

}
