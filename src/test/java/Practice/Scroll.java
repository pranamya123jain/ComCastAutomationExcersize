package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll {
@Test
public void srollToEle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
	//WebElement ele = driver.findElement(By.xpath("//section[text()='Shadow Root Elements']"));
	WebElement ele = driver.findElement(By.xpath("//section[text()='Others']"));

	Actions act=new Actions(driver);
	act.scrollToElement(ele).perform();
	System.out.println("hii");
}
@Test
public void scrollByJS_tillElement() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
	System.out.println("hhhh");	
}

}
