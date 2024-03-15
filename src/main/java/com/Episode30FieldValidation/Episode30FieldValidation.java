package com.Episode30FieldValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode30FieldValidation {
	public static void main (String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
		
		// 1. isDisplayed - used to check if the element is Displayed or rendered
		WebElement logIn = driver.findElement(By.linkText("Log in"));
		boolean displayed = logIn.isDisplayed();
		System.out.println("Login btn "+ displayed);
//		Thread.sleep(4000);
//		driver.quit();
		
		//2. isEnabled - if the element is intractable
		
		driver.get("https://letcode.in/edit");
		WebElement edit = driver.findElement(By.id("noEdit"));
		System.out.println(edit.isEnabled());
		
		driver.get("https://letcode.in/buttons");
		WebElement element = driver.findElement(By.id("isDisabled"));
		System.out.println("Button is :" + element.isEnabled());
		
		driver.get("https://semantic-ui.com/elements/button.html");
		WebElement button = driver.findElement(By.xpath("//button[text()[normalize-space()='Followed']]"));
		System.out.println(button.isEnabled());
		String attribute = button.getAttribute("class");
		System.out.println(attribute.contains("disabled"));
		
		
		//3. isSelected - if the element is already selected - radio, check box
		driver.get("https://letcode.in/radio");
		WebElement select = driver.findElement(By.xpath("(//label[@class='checkbox']//input)[1]"));
		boolean radio = select.isSelected();
		System.out.println("Radio button is selected :"+radio);
		
		Thread.sleep(4000);
		driver.quit();
	}

}
