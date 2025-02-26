package Practice;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FnpComFindPerfume {
	@Test
	public void findPerfumeTest() {
		
//		ChromeOptions options1=new ChromeOptions();
//		options1.addArguments("--force-device-scale-factor=0.8");
//		WebDriver driver=new ChromeDriver(options1);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.fnp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='0.9'");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='On Trend']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//div[@id='ontrend']/descendant::a[text()='Perfumes']")).click();
		driver.quit();
		//WebElement body = driver.findElement(By.tagName("body"));
		//body.sendKeys(Keys.CONTROL,Keys.SUBTRACT,Keys.SUBTRACT);
		

	}

}
