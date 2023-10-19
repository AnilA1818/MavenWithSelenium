package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anila\\eclipse-workspace\\MavenWithSelenium\\FeatureFile\\Fb.feature",
glue="stepDefination")
public class TestRunner {

}
