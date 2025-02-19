package tsForRegisterUserTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcas.AE.baseTest.BaseClass;
import com.comcast.AE.ObjectRepository.AccountInfoPage;
import com.comcast.AE.ObjectRepository.Homepage;
import com.comcast.AE.ObjectRepository.LoginPage;

public class LoginToYourAccountTest extends BaseClass {
	@Test
	public void signUpUserTest() {
		wLib.maximizeWindow(driver);
		wLib.waitForPageLoad(driver);
		
		Homepage hp=new Homepage(driver);
		hp.getLoginBtn().click();
		
		LoginPage lP=new LoginPage(driver);
		lP.signInToApp();
		
		AccountInfoPage aInfo=new AccountInfoPage(driver);
		/*
		 * fill the detail
		 * date of birth dropdown
		 * Select checkbox 'Sign up for our newsletter!' Select checkbox 'Receive
		 * special offers from our partners!'
		 * Fill details: First name, Last name, Company, Address, Address2, Country,
		 * State, City, Zipcode, Mobile Number
		 * Click 'Create Account button'
		 */
		aInfo.FillDetails();
		aInfo.FillDD1();
		aInfo.AddInfo();
		aInfo.getCreateAccountBtn().click();	
		
		aInfo.getContinueBtn().click();	
	}
	
	@Test
	public void LoginUserWithCorrectEmailAndPassword() throws InterruptedException {
		/*
		 * click on login button and Verify 'Login to your account' is visible
		 *  Enter correct email address and password
		 *  Click 'login' button
		 */
		Homepage hp=new Homepage(driver);
		hp.getLoginBtn().click();
		LoginPage lP=new LoginPage(driver);
		String s1 = lP.getUserLoginHeaderMsg().getText();
		assertEquals(s1, "Login to your account");
		System.out.println("Login to your account");
		
		lP.loginToApp();
}
}