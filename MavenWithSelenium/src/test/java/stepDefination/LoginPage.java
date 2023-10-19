package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void launchBrowser() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
	}
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	By username=By.id("email");
	By password=By.id("passContainer");
	By navigate=By.id("click");
	By title=By.id("nav-logo-sprites");
	public void enterUserName(String userName) {
		WebElement ele1=driver.findElement(username);
		ele1.sendKeys(userName);
	}
	public void enterPassword(String passWord) {
		WebElement ele2=driver.findElement(password);
		ele2.sendKeys(passWord);
	}
	public void navigate(String click) {
		WebElement ele3=driver.findElement(password);
		ele3.click();
	}
	

}
