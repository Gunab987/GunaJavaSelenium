package com.Episode23Maximize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode23Maximize {

	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//or
		
		Options options = driver.manage();
		Window window2 = options.window();
		window2.maximize();
	}
}
