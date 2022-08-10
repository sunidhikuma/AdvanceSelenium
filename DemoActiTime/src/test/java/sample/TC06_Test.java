package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC06_Test {
	WebDriver driver;
	
	@Test
	@Parameters("BrowserName")
	public void methodBrowser(String browser) {
		if(browser.equals("chrome"))
			driver=new FirefoxDriver();
		else if(browser.equals("firefox")){
			driver= new ChromeDriver();
		}
	}
}
