package com.Episode57TestNGDataproviderClassIndices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


// 1st Type we can use Inheritance "Extend" key words and call the Data provider
public class DataProvider2 {
// 2nd type we can use DataProviderClass and call the data
	@Test(dataProvider = "login", dataProviderClass = DataProviderClass2.class)
	public void login(String email, String pass) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
		
	}

}
