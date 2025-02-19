package com.comcast.AE.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.AE.webdriverUtility.JavaUtility;

public class LoginPage {
	WebDriver driver;
	JavaUtility jlib = new JavaUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='New User Signup!']")
	private WebElement userSignupHeaderMsg;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement nameTxtbox;

	@FindBy(xpath = "//input[@type='text']/parent::form/input[@type='email']")
	private WebElement emailTxtbox;

	@FindBy(xpath = "//input[@type='text']/parent::form/button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//h2[text()='Login to your account']")
	private WebElement userLoginHeaderMsg;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailAddTxtbox;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTxtbox;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginBtn;

	// ====================================================

	public WebElement getUserSignupHeaderMsg() {
		return userSignupHeaderMsg;
	}

	public WebElement getNameTxtbox() {
		return nameTxtbox;
	}

	public WebElement getEmailTxtbox() {
		return emailTxtbox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public WebElement getUserLoginHeaderMsg() {
		return userLoginHeaderMsg;
	}

	public WebElement getEmailAddTxtbox() {
		return emailAddTxtbox;
	}

	public WebElement getPasswordTxtbox() {
		return passwordTxtbox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void signInToApp() {
		getNameTxtbox().sendKeys("pranamya");
		getEmailTxtbox().sendKeys("pranamya" + jlib.getRandomNumber() + "@gmail.com");
		getSubmitBtn().click();
	}
	public void loginToApp() {
		getEmailAddTxtbox().sendKeys("pranamya" + jlib.getRandomNumber() + "@gmail.com");
		getPasswordTxtbox().sendKeys("pranamya"+ jlib.getRandomNumber());
		getLoginBtn().click();
	}
}
