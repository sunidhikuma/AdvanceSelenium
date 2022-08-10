package login;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.LoginPage;

public class TestCaseID extends BaseClass {
	@Test
	public void testCaseDescription() {
	LoginPage loginElements = new LoginPage(driver);
	 loginElements.getLoginLink().click();
	 loginElements.getEmailTextField().sendKeys("sunidhikumari543@gmail.com");
	 loginElements.getPasswordTextField().sendKeys("Chhoti9695!");
	 loginElements.getLoginButton().click();
	 		
	
		
	}

}
