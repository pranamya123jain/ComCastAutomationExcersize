package com.comcast.AE.webdriverUtility;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
public void waitForPageLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
public void waitForElementToBeclickable(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void selectByValue(WebElement element, String value) {
	Select se = new Select(element);
	se.selectByValue(value);
}
public void selectByVisibleText(String value,WebElement element) {
	Select se1 = new Select(element);
	se1.selectByVisibleText(value);
}
	
}
