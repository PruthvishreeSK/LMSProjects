package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\src\\test\\java\\features\\amazon.feature",
				glue= {"steps"},
				plugin= {"pretty","html:target/cucumberreport1.html"}
		)

public class CucumberRunner {

}
