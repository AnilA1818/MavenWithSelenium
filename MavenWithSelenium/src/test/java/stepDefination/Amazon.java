package stepDefination;

 
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver driver;
	@Given("Open chrome browser")
	public void open_chrome_browser() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	}

	@When("Navigate to Amazon")
	public void navigate_to_amazon() {
	   driver.get("https://www.amazon.com"); 
	}

	@When("Pass item")
	public void pass_item() throws InterruptedException {
		WebElement sname=driver.findElement(By. xpath("//input[@id='twotabsearchtextbox']"));
		sname.sendKeys("Mobile");
		Thread.sleep(3000);
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		 //jse.executeScript("document.getElementById('twotabsearchtextbox').value='ggxg'");
		//WebElement sname=driver.findElement(By. xpath("//input[@id='twotabsearchtextbox']"));
	     js.executeScript("argument[0].value='Mobile'"); */
	}
	@When("Scrolldown the page")
	public void scrolldown_the_page() throws InterruptedException {
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(1,1000)");
	     Thread.sleep(3000);
	     js.executeScript("scroll(0,1000)");
	     
	     Thread.sleep(3000);
	}

	@When("Take screenshot")
	public void take_screenshot() throws IOException, InterruptedException {
		  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(file, new File("C:\\Users\\anila\\OneDrive\\Desktop\\Screenshots\\amazon.png"));
		  Thread.sleep(3000);
		  System.out.println("Screenshot success");
	}



	@Then("quit the browser")
	public void quit_the_browser() {
		
	    driver.quit();
	}



}
