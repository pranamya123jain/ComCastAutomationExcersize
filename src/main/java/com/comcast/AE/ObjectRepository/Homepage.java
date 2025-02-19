package com.comcast.AE.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[text()=' Home']")
private WebElement homeTxt;

@FindBy(xpath = "//a[text()=' Signup / Login']")
private WebElement loginBtn;

@FindBy(xpath = "//b[text()='pranamya']")
private WebElement loginUserNAmeHeaderMsg;

@FindBy(xpath = "//a[@href=\"/delete_account\"]")
private WebElement deleteUserBtn;
//=================================
public WebElement getHomeTxt() {
	return homeTxt;
}

public WebElement getLoginBtn() {
	return loginBtn;
}

public WebElement getLoginUserNAmeHeaderMsg() {
	return loginUserNAmeHeaderMsg;
}

public WebElement getDeleteUserBtn() {
	return deleteUserBtn;
}

}
