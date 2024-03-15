package com.Episode38FindElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementPrint {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit");
		List<WebElement> list = driver.findElements(By.tagName("label"));
		WebElement sizeLast = list.get(list.size()-2); // print with particular GetText
		System.out.println("Last get test" + sizeLast.getText());
//----------------------------------------------------
		int size2 = list.size(); // To check whether the 6 get text is available or not
		if(size2 == 3) {
			System.out.println("Test case pass");
		}else 
			System.out.println("Test case Fail");
//-----------------------------------------------------		
		int size = list.size();  // Total count of the get
		System.out.println(size);
		for (WebElement list1 : list) {
			System.out.println(list1.getText()); // Print all the GetTexts
			
		
		}	
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			
		}
		
		List<WebElement> findElements = driver.findElements(By.tagName("input"));
		int size3 = findElements.size();
		System.out.println(size3);
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getAttribute("id"));
		}
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement links : link) {
			System.out.println(links.getAttribute("href"));
		}
		
		
	}

}
