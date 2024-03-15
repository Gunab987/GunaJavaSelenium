package com.Episode33InteractwithoutfindingElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode33InteractwithoutfindingElement {
	
	public static void main (String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		// activeElement() - when we can use the activeElement(), interact without finding the element or locators. (active element eg:blinking cursor ) 
		
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("admin@123", Keys.TAB,"password@123",Keys.ENTER);
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
