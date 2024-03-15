package com.Episode40WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		WebElement table1 = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table1.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
			
		}
		List<WebElement> allRows = table1.findElements(By.cssSelector("tbody tr"));
		int size = allRows.size();
		System.out.println(size);
		if (size ==3) {
			System.out.println("pass");
		}else System.out.println("fail");
		
//		for (WebElement rows : allRows) {
//			List<WebElement> names = rows.findElements(By.tagName("td"));
//			WebElement firstColum = names.get(0);
//			System.out.println(firstColum.getText());
//		}
		
		for (int i=0; i<size; i++) {
			List<WebElement> allRows1 = table1.findElements(By.cssSelector("tbody tr"));
			List<WebElement> rows1 = allRows1.get(i).findElements(By.tagName("td"));
			WebElement Lastname = rows1.get(1);
			String text = Lastname.getText();
			System.out.println(text);
			if(text.equals("Raj")) {
				WebElement option = rows1.get(3).findElement(By.tagName("input"));
				option.click();
				break;
			}
			
		}
		
	//	driver.quit();
	}
	
}
