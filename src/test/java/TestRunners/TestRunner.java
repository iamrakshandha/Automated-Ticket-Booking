package TestRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefinitions", tags="@run",monochrome=true,strict=true,
		plugin = {"pretty","html:target/SpiceJet","json:target/SpiceJet.json","junit:target/SpiceJet.xml"})
public class TestRunner {

}
