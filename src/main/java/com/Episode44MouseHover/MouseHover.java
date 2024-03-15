package com.Episode44MouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main (String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
	//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[.='✕']")).click();
		Actions bulder = new Actions(driver);
		WebElement elem = driver.findElement(By.xpath("//span/span[.='Electronics']"));
		bulder.moveToElement(elem).perform();
		WebElement mob = driver.findElement(By.xpath("//a[.='MobileAccessory']"));
		bulder.moveToElement(mob).perform();
		WebElement all = driver.findElement(By.linkText("All"));
		bulder.moveToElement(all).perform();
		all.click();
	
	}

}
