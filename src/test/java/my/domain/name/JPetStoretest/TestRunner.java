package my.domain.name.JPetStoretest;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"feature/"},
	glue= {"steps"},
	plugin = {"html:target/cucumber-html-repo" }
	,monochrome = true
)
public class TestRunner
{
	

}


