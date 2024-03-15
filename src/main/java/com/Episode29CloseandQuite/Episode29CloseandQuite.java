package com.Episode29CloseandQuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode29CloseandQuite {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		Thread.sleep(2000);
		
		// When we can use the Close, the Window only closed and the data will run in the system performance.
		
		// When we can use the Quit, the window will be terminated completely 
		
		driver.quit();
		
	}

}
