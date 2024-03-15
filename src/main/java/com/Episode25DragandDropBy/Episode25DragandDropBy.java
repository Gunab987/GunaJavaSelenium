package com.Episode25DragandDropBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Episode25DragandDropBy {
	
	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("draggable"));
		Actions bulder = new Actions(driver);
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		bulder.dragAndDropBy(element, x+200, y+150).perform();
			
		
	}
	
	

}
