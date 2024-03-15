package com.Episode16Handling_Inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode16Handling_Inputs {
	
	//To avoid if condition warning, we used @SuppressWarnings
	@SuppressWarnings("unused")
	public static void main(String arg[]) {
		//Login Page
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		//Enter Name
		WebElement test = driver.findElement(By.id("fullName"));
		test.sendKeys("Gunasekaran");
		
		//Add text and press TAB button
		WebElement addtext = driver.findElement(By.id("join"));
		addtext.sendKeys(" Person",Keys.TAB);
		
		//get the string and print in console
		String text = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(text);
		
		//Print the text and clear the velue
		String text2 = driver.findElement(By.id("clearMe")).getAttribute("value");
		System.out.println(text2);
		driver.findElement(By.id("clearMe")).clear();
		
		//Check the field is enabled or not ?
		boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enabled);
		
		// Using if confition to check the field is editable of not
		String notedit = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		if (false)
		{
		System.out.println("It is Editable Field");
		}
		else
		{
		System.out.println("It is Non Editable field");
		}
		}
	}


