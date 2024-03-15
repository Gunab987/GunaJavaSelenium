package com.Vikatan;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Vikatan {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://books.vikatan.com/");
		
		//shop by Category
		
		driver.findElement(By.className("icon-down-arrow")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		ArrayList<String> list =new ArrayList<>();
		List<WebElement> options = driver.findElements(By.cssSelector(".category-menu-list>li>a"));
		for (WebElement option : options) {
		//	System.out.println(option.getAttribute("href"));
		list.add(option.getAttribute("href"));
			System.out.println(option.getText());
		}
		
		 // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook();
		
		for( int i = 0; i < list.size() ; i++){
		driver.navigate().to(list.get(i));
		
		System.out.println("*********************************");
		//List<WebElement> li1 = driver.findElements(By.xpath("//ul[@class='product-list']//li"));
		List<WebElement> li1 = driver.findElements(By.cssSelector(".product-list>li>h6"));
		List<WebElement> amount = driver.findElements(By.cssSelector(".product-list>li>div>span>span"));
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // no need to use Implicitly wait more than one time
		int s1 = li1.size();
		System.out.println("Book Size "+s1);
		
		// Create a new sheet in the workbook
        Sheet sheet = workbook.createSheet("Category_" + i);
        
        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Book Title");
        headerRow.createCell(1).setCellValue("Price");
		
		for (int j =1; j<=s1; j++) {
			System.out.println(driver.findElement(By.cssSelector(".product-list>li:nth-of-type("+j+")>h6")).getText()+"===>"+driver.findElement(By.cssSelector(".product-list>li:nth-of-type("+j+")>div>span>span")).getText());
			
			// Create a new row in the sheet
            Row row = sheet.createRow(j);
         /*   row.createCell(0).setCellValue(bookTitle);
            row.createCell(1).setCellValue(price);*/
		} 
		
		/*
		 * for (WebElement l1 : li1) { String t1 = l1.getText(); System.out.println(t1);
		 * }
		 */
		System.out.println("*********************************");
		
		
		}
		
		
		/*
		 * WebElement linksContainer =driver.findElement(By.xpath("//li[@class='main-category']//ul[1]"));
		 * List<WebElement> Links = linksContainer.findElements(By.tagName("a")); 
		 * for(WebElement link : Links) { 
		 * Thread.sleep(500); 
		 * link.click();
		 * driver.navigate().back(); }
		 * 
		 * Thread.sleep(1000);
		 */

		
		
		
		
/*		List<WebElement> list2 = driver.findElements(By.xpath("//li[@class='main-category']//li"));
		List<WebElement> a1 = driver.findElements(By.cssSelector("li ul li a"));
		int cate = a1.size();
		System.out.println("Category size "+cate);
		
		// Print List text
		for (WebElement print : list2) {
			String text1 = print.getText();
			System.out.println(text1);
			
		}
		System.out.println("-----------------------------------------");
		
		// Click 1st List and print All the Book name
		
		driver.findElement(By.xpath("(//ul[@class='category-menu-list']//span)[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> li1 = driver.findElements(By.xpath("//ul[@class='product-list']//li"));
		int s1 = li1.size();
		System.out.println("அறிவியல் - ஆய்வு - தொழில்நுட்பம் Books Size "+ s1);
		
		for (WebElement l1 : li1) {
			String t1 = l1.getText();
			System.out.println(t1);
		}
		driver.navigate().back();
		System.out.println("-----------------------------------------");
		
		// Click 2nd List and print All the Book name
		
		driver.findElement(By.xpath("//span[text()='Shop by Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@class='category-menu-list']//span)[2]")).click();
		
		List<WebElement> li2 = driver.findElements(By.xpath("//ul[@class='product-list']//li"));
		int s2 = li2.size();
		System.out.println("ஆன்மிக வரலாறு Books Size " +s2 );
		for (WebElement l2 : li2) {
			String t2 = l2.getText();
			System.out.println(t2);
		}
		driver.navigate().back();
	*/	
		}
		
	}


