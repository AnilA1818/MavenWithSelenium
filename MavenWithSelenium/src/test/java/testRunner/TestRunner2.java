package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="MavenWithSelenium/FeatureFile/Fb.feature",glue="simplePackage")

 public class TestRunner2 {

}
