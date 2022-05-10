package bdd;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;


@CucumberOptions(features = "src/test/java/bdd", glue = {"bdd"}
,plugin = {"pretty" , "html:target/cucumber-html-report"})
public class RunnerTest extends TestBase {

}
