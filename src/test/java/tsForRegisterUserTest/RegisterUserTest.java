package tsForRegisterUserTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcas.AE.baseTest.BaseClass;
import com.comcast.AE.ObjectRepository.AccountInfoPage;
import com.comcast.AE.ObjectRepository.Homepage;
import com.comcast.AE.ObjectRepository.LoginPage;
import com.comcast.AE.webdriverUtility.WebDriverUtility;

public class RegisterUserTest extends BaseClass{
	@Test
	public void registerTest() throws InterruptedException {
		wLib.maximizeWindow(driver);
		wLib.waitForPageLoad(driver);
		/*
		 * verify the home page
		 */
		Homepage hp=new Homepage(driver);
		String s = hp.getHomeTxt().getText();
		assertEquals(s, "Home");
		Thread.sleep(2000);
		System.out.println("home page is visible successfully");
		/*
		 * click on login button and Verify 'New User Signup!' is visible
		 */
		hp.getLoginBtn().click();
		LoginPage lP=new LoginPage(driver);
		String s1 = lP.getUserSignupHeaderMsg().getText();
		assertEquals(s1, "New User Signup!");
		System.out.println("New User Signup is visible");
		/*
		 * login
		 */
		lP.signInToApp();
		/*
		 * verify ENTER ACCOUNT INFORMATION
		 */
		AccountInfoPage aInfo=new AccountInfoPage(driver);
		String s2 = aInfo.getAccInfHeaderMsg().getText();
		Thread.sleep(2000);
		assertEquals(s2, "ENTER ACCOUNT INFORMATION");
		System.out.println("Enter Account Information is visible");
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
		/*
		 * Verify that 'ACCOUNT CREATED!' is visible
		 */
		WebElement ele7=aInfo.getAccountCreatedHeaderMsg();
		String s3 = ele7.getText();
		assertEquals(s3, "ACCOUNT CREATED!");
		System.out.println("Verify that 'ACCOUNT CREATED!' is visible");
		/*
		 * Click 'Continue' button Logged in as pranamya
		 */
		aInfo.getContinueBtn().click();	
		WebElement ele8=hp.getLoginUserNAmeHeaderMsg();
	
		String s4 = ele8.getText();
		assertEquals(s4, "pranamya");
		System.out.println("Logged in as pranamya");
		/*
		 * delete account
		 */
		hp.getDeleteUserBtn().click();		
		System.out.println("Account is deleted");
	}

}
