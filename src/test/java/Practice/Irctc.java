package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Irctc {
	@Test
	public void bookTicketTest() {
		String pWindow;
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications--");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Flight opens a new window']"));
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
		ele.click();
		
		 pWindow=driver.getWindowHandle();
		Set<String> alwh=driver.getWindowHandles();
		
		for(String wh:alwh) {
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("IRCTC Next Generation eTicketing System")) {
				break;
			}		
			}
	}
}
