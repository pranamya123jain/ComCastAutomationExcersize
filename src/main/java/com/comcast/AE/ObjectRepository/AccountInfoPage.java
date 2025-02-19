package com.comcast.AE.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.AE.webdriverUtility.WebDriverUtility;

public class AccountInfoPage {
	WebDriver driver;
	WebDriverUtility wLib=new WebDriverUtility();
	public AccountInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory .initElements(driver, this);
	}
@FindBy(xpath = "//b[.='Enter Account Information']")
private WebElement AccInfHeaderMsg;

@FindBy(xpath = "//input[@id='id_gender2']")
private WebElement titleRadioBtn;

@FindBy(xpath = "//input[@id='password']")
private WebElement passwordTxtBox;

@FindBy(xpath = "//select[@id='days']")
private WebElement dayDD;

@FindBy(xpath = "//select[@id='months']")
private WebElement monthDD;

@FindBy(xpath = "//select[@id='years']")
private WebElement yearsDD;

@FindBy(xpath = "//input[@id='newsletter']")
private WebElement checkBox1;

@FindBy(xpath = "//input[@id='optin']")
private WebElement checkBox2;

@FindBy(xpath = "//input[@id='first_name']")
private WebElement firstNameTxt;

@FindBy(xpath = "//input[@id='last_name']")
private WebElement lastNameTxt;

@FindBy(xpath = "//input[@id='address1']")
private WebElement add1Txt;

@FindBy(xpath = "//select[@id='country']")
private WebElement countryDD;

@FindBy(xpath = "//input[@id='state']")
private WebElement stateTxt;

@FindBy(xpath = "//input[@id='city']")
private WebElement cityTxt;

@FindBy(xpath = "//input[@id='zipcode']")
private WebElement zipcodeTxt;

@FindBy(xpath = "//input[@id='mobile_number']")
private WebElement mobileNoTxt;

@FindBy(xpath = "//button[.='Create Account']")
private WebElement createAccountBtn;

@FindBy(xpath = "//b[.='Account Created!']")
private WebElement accountCreatedHeaderMsg;

@FindBy(xpath = "//a[text()='Continue']")
private WebElement continueBtn;

//=============================================================
public WebElement getAccInfHeaderMsg() {
	return AccInfHeaderMsg;
}
public WebElement getTitleRadioBtn() {
	return titleRadioBtn;
}
public WebElement getPasswordTxtBox() {
	return passwordTxtBox;
}
public WebElement getDayDD() {
	return dayDD;
}
public WebElement getMonthDD() {
	return monthDD;
}
public WebElement getYearsDD() {
	return yearsDD;
}
public WebElement getCheckBox1() {
	return checkBox1;
}
public WebElement getCheckBox2() {
	return checkBox2;
}
public WebElement getFirstNameTxt() {
	return firstNameTxt;
}
public WebElement getLastNameTxt() {
	return lastNameTxt;
}
public WebElement getAdd1Txt() {
	return add1Txt;
}
public WebElement getCountryDD() {
	return countryDD;
}
public WebElement getStateTxt() {
	return stateTxt;
}
public WebElement getCityTxt() {
	return cityTxt;
}
public WebElement getZipcodeTxt() {
	return zipcodeTxt;
}
public WebElement getMobileNoTxt() {
	return mobileNoTxt;
}
public WebElement getCreateAccountBtn() {
	return createAccountBtn;
}
public WebElement getAccountCreatedHeaderMsg() {
	return accountCreatedHeaderMsg;
}
public WebElement getContinueBtn() {
	return continueBtn;
}
//===========================================
public void FillDetails() {
	getTitleRadioBtn().click();
	getPasswordTxtBox().sendKeys("pranamya123");
}
public void FillDD1(){
	wLib.selectByValue(dayDD, "1");
	wLib.selectByVisibleText("January", monthDD);
	wLib.selectByVisibleText("2021", yearsDD);
	getCheckBox1().click();
	getCheckBox2().click();
}
public void AddInfo() {
	getFirstNameTxt().sendKeys("pranamya");
	getLastNameTxt().sendKeys("ap");
	getAdd1Txt().sendKeys("2nd main 3rd cross");
	
	wLib.selectByVisibleText("India", countryDD);
	
	getStateTxt().sendKeys("karnataka");
	getCityTxt().sendKeys("Bangalore");
	getZipcodeTxt().sendKeys("560001");
	getMobileNoTxt().sendKeys("9874562589");
}
}
