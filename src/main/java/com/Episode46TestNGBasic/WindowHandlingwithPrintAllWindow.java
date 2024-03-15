package com.Episode46TestNGBasic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlingwithPrintAllWindow {
	
	@Test
	public void main() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
		Set<String> multiwindow = driver.getWindowHandles();
		list.clear();
		list.addAll(multiwindow);
		driver.switchTo().window(list.get(0));
		driver.findElement(By.id("multi")).click();
		
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles1);
		driver.switchTo().window(list.get(0));
		
		for (String string : list) {
			driver.switchTo().window(string); // switch to all the URL then print
			String title = driver.getCurrentUrl();
			
			System.out.println(title);	
		}
		Thread.sleep(2000);
//		driver.close();
		
		
		
	}

}
