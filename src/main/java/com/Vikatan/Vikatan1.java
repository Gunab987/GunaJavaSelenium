package com.Vikatan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Vikatan1 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://books.vikatan.com/");

		// shop by Category
		driver.findElement(By.className("icon-down-arrow")).click();

		ArrayList<String> list = new ArrayList<>();
		List<WebElement> options = driver.findElements(By.cssSelector(".category-menu-list>li>a"));
		for (WebElement option : options) {
			list.add(option.getAttribute("href"));
			System.out.println(option.getText());
		}

		// Create a new Excel workbook
		Workbook workbook = new XSSFWorkbook();

		for (int i = 0; i < list.size(); i++) {
			driver.navigate().to(list.get(i));

			System.out.println("*********************************");
			List<WebElement> li1 = driver.findElements(By.cssSelector(".product-list>li>h6"));
			List<WebElement> amount = driver.findElements(By.cssSelector(".product-list>li>div>span>span"));
			int s1 = li1.size();
			System.out.println("Book Size " + s1);

			// Create a new sheet in the workbook
			Sheet sheet = workbook.createSheet("Category_" + i);

			// Create header row
			Row headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("Book Title");
			headerRow.createCell(1).setCellValue("Price");

	
				for (int j = 1; j <= s1; j++) {	
				String bookTitle = driver.findElement(By.cssSelector(".product-list>li:nth-of-type(" + j + ")>h6")).getText();
				String price = driver.findElement(By.cssSelector(".product-list>li:nth-of-type(" + j + ")>div>span>span")).getText();
				
				// Create a new row in the sheet
				Row row = sheet.createRow(j);
				row.createCell(0).setCellValue(bookTitle);
				row.createCell(1).setCellValue(price);

				System.out.println(bookTitle + "===>" + price);
			}
		}

		// Save the workbook to a file
		File file = new File("C:\\Users\\gunab\\eclipse-workspace\\GunaMaven\\DataFile2.xlsx");
		
		 FileOutputStream outputStream = new FileOutputStream(file); 
			workbook.write(outputStream);
			workbook.close();
	/*	} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Close the workbook to release resources
			try {
				
			} catch (IOException e) {
				e.printStackTrace(); 
			}*/
		

		// Close the WebDriver
		driver.quit();
	}
}
