package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/java/Features/Folder2"
                   }, format ={"json:target/cucumber.json", "html:target/site/cucumber-pretty"},

        glue ={"Steps"}
        )



public class TestRunner extends AbstractTestNGCucumberTests {
}
