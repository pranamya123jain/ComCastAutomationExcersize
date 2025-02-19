package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TablePractice {
	@Test
	public void tableGetAllColumnDetails() throws Throwable, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sportskeeda.com/go/international-league-t20/points-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> listrow = driver.findElements(By.xpath("//tr"));
		int totalrowCount = listrow.size();
		System.out.println(totalrowCount);

		List<WebElement> tableData = driver.findElements(By.xpath("//tr/*"));
		int totalDataCount = tableData.size();
		System.out.println(totalDataCount);

		List<WebElement> tableColumn = driver.findElements(By.xpath("//tr/th"));
		int totalColumnCount = tableColumn.size();
		System.out.println(totalColumnCount);
		
		int count=0;
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\pointsTable.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		
		for (int i = 0; i < totalrowCount; i++) {
			Row row = wb.getSheet("Sheet1").createRow(i);
			for (int j = 0; j < totalColumnCount; j++) {
				String data = tableData.get(count).getText();
				row.createCell(j).setCellValue(data);
				System.out.print(data + " ");
				count++;	
			}
			FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\pointsTable.xlsx");
			wb.write(fos);
			System.out.println();
		}

	}

}
