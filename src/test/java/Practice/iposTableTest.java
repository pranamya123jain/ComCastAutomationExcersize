package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iposTableTest {
	@Test
	public void tableTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nasdaq.com/market-activity/ipos");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SearchContext shadowHost = driver.findElement(By.xpath("//div[@class='jupiter22-ipo-calendar__upcoming calendar-container show']/descendant::nsdq-table-sort")).getShadowRoot();
		String txt = shadowHost.findElement(By.cssSelector("div[data-row-index='1']")).getText();
		System.out.println(txt);
		
		SearchContext shadowHost1 = driver.findElement(By.xpath("//div[@class='jupiter22-ipo-calendar__priced calendar-container show']/descendant::nsdq-table-sort")).getShadowRoot();
		String txt1 = shadowHost1.findElement(By.cssSelector("div[data-row-index='1']")).getText();
		System.out.println(txt1);
		
		
	}

}
