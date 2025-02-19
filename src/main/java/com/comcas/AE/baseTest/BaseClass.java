package com.comcas.AE.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.AE.webdriverUtility.WebDriverUtility;

public class BaseClass {
	public WebDriverUtility wLib=new WebDriverUtility();
	public WebDriver driver;
	@BeforeSuite
	public void configBS() {
		System.out.println("connect to DB");
	}
@BeforeClass
public void configBC() {
	 driver=new ChromeDriver();
	System.out.println("lounch the browser");
}
@BeforeMethod
public void configBM() {
	driver.get("http://automationexercise.com");
	System.out.println("login to application");
}
@AfterMethod
public void configAm() {
	System.out.println("logout from application");
}
@AfterClass
public void configAC() {
	// driver.quit();
	System.out.println("close the browser");
}
@AfterSuite
public void configAS() {
	System.out.println("Close db connection");
}
}
