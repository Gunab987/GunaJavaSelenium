package com.Episode55TestNGParametersInDetail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameters2 {
	RemoteWebDriver driver;
	
	@Parameters ({"email", "pass", "browser"})
	@Test
	public void login(String email, String pass, String browser) {	
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			
			break;
		case "edge":
			driver = new EdgeDriver();

		default:
			System.err.println("browser is not define");
			break;
		}
		
	//	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		
		
		
	}

}
