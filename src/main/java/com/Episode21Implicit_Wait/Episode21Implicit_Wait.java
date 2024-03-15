package com.Episode21Implicit_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode21Implicit_Wait {
		
	public static void main (String []args) {
	
	//ImplicitlyWait
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Guna.sriram");
		driver.findElement(By.id("pass")).sendKeys("gunasriram");
		driver.findElement(By.name("login")).click();
		
	//	driver.close();
		
	}

}
