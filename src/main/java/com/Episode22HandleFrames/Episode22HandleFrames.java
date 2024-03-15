package com.Episode22HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode22HandleFrames {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(findElement);
// or	//driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Guna");
		driver.findElement(By.name("lname")).sendKeys("Baskar");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("Gunasekaran");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("Add");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
	}

}
