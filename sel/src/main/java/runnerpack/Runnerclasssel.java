package runnerpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Akash\\git\\practiceform\\sel\\src\\main\\java\\allbasesset\\test_learn.feature",
		 glue={"demostepdefinition","stepDefinition"},
		 monochrome=true,
		 plugin={"pretty", "html:sampleECOM"},
		 dryRun=false	
)
public class Runnerclasssel 
{
}
