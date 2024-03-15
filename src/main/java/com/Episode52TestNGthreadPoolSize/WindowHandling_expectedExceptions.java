package com.Episode52TestNGthreadPoolSize;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowHandling_expectedExceptions {
	
	// expectedExceptions is forcefully changed the test case as a "PASS" even it can be a error.
	@Test (expectedExceptions = {NoSuchElementException.class} )
	public void main() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/windows");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println("First URL" + windowHandle);
		// we are changed element id "home" to "hom" intentionally due to need NoSuchElementException.
		driver.findElement(By.id("hom")).click();
		
		Set<String> windowHandles = driver.getWindowHandles(); //****Set cannot accept the get functions so we can convert Set to List***.
		List<String> list = new ArrayList<String>(windowHandles);
		System.out.println(driver.getCurrentUrl()); // print before switch window 
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl()); // print after switch window 
		
		driver.switchTo().window(list.get(0)); // switch to 1st URL
		driver.close();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		List<String> list2 = new ArrayList<String>(windowHandles2); //Again create the list set and switch to next URN then print it
	//	list.addAll(windowHandles2);
		driver.switchTo().window(list2.get(0));
		System.out.println(driver.getCurrentUrl());
		
		{
			Thread.sleep(2000);
		}
		driver.quit();
	}

	
}
