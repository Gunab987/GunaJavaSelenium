package com.Episode28GetTextvsGetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode28GetTextvsGetAttribute {
	
	public static void main(String args[]) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		// get Text
		WebElement header = driver.findElement(By.tagName("h1"));
		String h1 = header.getText();
		System.out.println(h1);
		
		String linktext = driver.findElement(By.linkText("Sign up")).getText();
		System.out.println(linktext);
		
		String cardContent = driver.findElement(By.className("card-content")).getText();
		System.out.println(cardContent);
		
		//get Attribute
		
		String attribute = driver.findElement(By.id("join")).getAttribute("value");
		System.out.println(attribute);
		
		String attribute2 = driver.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println(attribute2);
		
		String attribute3 = driver.findElement(By.id("join")).getAttribute("join");
		System.out.println(attribute3);
	}

	

}
