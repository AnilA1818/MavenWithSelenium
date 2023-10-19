package simplePackage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefination.LoginPage;

public class FbLoginPage extends LoginPage {
	
	 

	public FbLoginPage(WebDriver driver) {
		super(driver);
		 
	}

	WebDriver driver=null;
	
	 LoginPage lo=new LoginPage(driver);
	 @Given("Open a chrome browser")
	 public void open_a_chrome_browser() {
	     lo.launchBrowser();
	 }

	 @When("Navigate to Fb")
	 public void navigate_to_fb() throws InterruptedException {
	    lo.navigateToUrl("https://www.facebook.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	 }

	 @When("Enter username and password")
	 public void enter_username_and_password() {
	     lo.enterUserName("Anil"); 
	 }

	 @Then("click on submit button")
	 public void click_on_submit_button() {
		 lo.navigate("login");
	      
	 }




}
