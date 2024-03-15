package com.Episode17DriverNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode17DriverNavigation {
	
	public static void main(String arg[]) throws InterruptedException {
		//open chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		//print current URL in console
		String buttonpage = driver.getCurrentUrl();
		System.out.println(buttonpage);
		Thread.sleep(3000);
		
		//Click to home button
		WebElement element = driver.findElement(By.id("home"));
		element.click();
		
		//print home page URL in the console
		Thread.sleep(3000);
		String homepage = driver.getCurrentUrl();
		System.out.println(homepage);
		
		//navigate Back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//navigate forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//close window
		driver.close();
		
		//or we use the below format to the same
		
//		Navigation navigate = driver.navigate();
//		Thread.sleep(1000);
//		navigate.back();Thread.sleep(1000);
//		navigate.forward();Thread.sleep(1000);
//		navigate.refresh();Thread.sleep(1000);
//		navigate.to("https://www.makemytrip.com/");
		
		
	
	}

}
