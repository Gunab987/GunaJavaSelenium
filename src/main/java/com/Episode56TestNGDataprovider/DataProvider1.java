package com.Episode56TestNGDataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProvider1 {
	// create DataProvider and assign name and this name need to mention the @Test below.
	@DataProvider (name = "login")
	public String[][] getData() {
		String [][] data = new String [2][2];
		//row 1
		data [0][0] = "Guna.b98@gmail.com";
		data [0][1] = "pass@123";
		
		//row 2
		data [1][0] = "Guna.b987@gmail.com";
		data [1][1] = "pass@12345";
		
		return data;
	}
	
	// we can use Dataprovider name "login" and call the data or another method we can use the method name getData() in the below dataProvider = "getData"
	@Test(dataProvider = "login")
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
