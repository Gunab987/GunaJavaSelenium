package com.Episode19Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Episode19Screenshot {

	//static WebDriver driver;
	public static void main(String arg[]) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Typecasting
		TakesScreenshot screen=(TakesScreenshot)driver;
		
		//capturing screenshot
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		
		//set the location
		File Screenshotto = new File("C:\\Users\\gunab\\eclipse-workspace\\LetsCodewithKousik\\Screenshot"+System.currentTimeMillis()+".png" );
		
		// take the data and save to the location
		FileHandler.copy(screenshotAs, Screenshotto);
		
//Elements Screenshots
		
		WebElement element = driver.findElement(By.id("color"));
		File as = element.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\gunab\\eclipse-workspace\\New_Project\\Screenshot"+System.currentTimeMillis()+".png");
		FileHandler.copy(as, file);
		
//Particular area screenshot
		
		WebElement info = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/div/div"));
		
		 as = info.getScreenshotAs(OutputType.FILE);
		
		file = new File("C:\\Users\\gunab\\eclipse-workspace\\New_Project\\Screenshot"+System.currentTimeMillis()+".png");
		
		FileHandler.copy(as,file);
		
		
	
	}
	
}
