package com.Episode32SubmitFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode32SubmitFunction {
	
	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/signin");
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		
		// submit() - if the login button in inside the form, we can use submit()
		driver.findElement(By.xpath("//button[@class='button is-primary']")).submit();
		
	}

}
