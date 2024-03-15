package com.Episode27HandleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Episode27HandleDropdown {
	
	public static void main (String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement drop = driver.findElement(By.id("fruits"));
		Select myfrt = new Select(drop);
		myfrt.selectByVisibleText("Apple");
		WebElement cmd = driver.findElement(By.className("subtitle"));
		System.out.println(cmd.getText());
		System.out.println(myfrt.isMultiple());
		List<WebElement> opt = myfrt.getOptions();
		opt.forEach(i->System.out.println(i.getText()));
		
		//Using Select key word
		WebElement country = driver.findElement(By.id("country"));
		Select mycountry = new Select(country);
		//Using selectByValue for select option
		mycountry.selectByValue("Colombia");
		mycountry.selectByValue("India");
		WebElement option = mycountry.getFirstSelectedOption();
		System.out.println(option.getText());
		

		WebElement findElement = driver.findElement(By.id("country"));
		Select select = new Select(findElement);
		select.selectByValue("Bolivia");
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		WebElement hero = driver.findElement(By.id("superheros"));
		Select myFriute = new Select(hero);
		boolean multiple = myFriute.isMultiple();
		myFriute.selectByIndex(0);
		myFriute.selectByValue("bt");
		System.out.println("Is Multiple "+ multiple);
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
