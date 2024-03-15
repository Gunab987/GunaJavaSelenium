package com.Episode39WindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingwithPrintAllWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
