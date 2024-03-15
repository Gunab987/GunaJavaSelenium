package com.Episode20Alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Episode20Alart {
	
	public static void main (String arg[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//Accept alert
////		driver.findElement(By.xpath("//*[contains(text(),'Simple Alert')]")).click();
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Print text - >>"+text);
		alert.accept();
		
//		Prompt alert and print text
		driver.findElement(By.id("prompt")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.sendKeys("Gunasekaran");
		alert.accept();
		String text3 = driver.findElement(By.id("myName")).getText();
		System.out.println(text3);
		

	
	}

}
