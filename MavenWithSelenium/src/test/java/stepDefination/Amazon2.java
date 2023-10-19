package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
 

public class Amazon2 {
	WebDriver driver;
	 
	@Test
	public void login() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		//String url="https://www.amazon.com";
		driver.get("https://www.amazon.com");
		
	}

}
