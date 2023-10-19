package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\anila\\OneDrive\\Documents\\chromedriver.exe");
		 WebDriver driver;
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
		 
	}

}
