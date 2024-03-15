package com.Episode18HandlingButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Episode18HandlingButtons {
	
	public static void main(String arg[]) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
//		driver.findElement(By.id("position")).getLocation();
		
		WebElement element = driver.findElement(By.id("position"));
		Point point = element.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x->"+x+"y->"+y);
		
		//find the color of the button
		WebElement color = driver.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);
		
		//Find the height & width of the button
		Rectangle width = driver.findElement(By.id("property")).getRect();
		System.out.println(width.getHeight());
		System.out.println(width.getWidth());
				//both are same
		Dimension dim = width.getDimension();
		System.out.println(dim);
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		//Confirm button is disabled
		boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(enabled);
		
		//Click and Hold Button
		
	}
	}


