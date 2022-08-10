package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	public POM(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	 @FindBy(xpath="//a[text()='Log In']")
	 private WebElement login;
	 @FindBy(id="email")
	 private WebElement username;
	 @FindBy(id="pass")
	 private WebElement password;
	 @FindBy(xpath="//button[text()='Log In']")
	 private WebElement log;
	 public void pom1(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 public void Login() {
		 login.click();
	 }
	 public void Usernamre() {
		 username.sendKeys("admin");
	 }
	 public void Password() {
		 password.sendKeys("manager");
	 }
	 public void Login1() {
		 log.click();
	}

}
