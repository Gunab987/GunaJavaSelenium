package com.Episode43ThrowVSThrows;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowVSThrows {
	
	public void code() {
		try {
			Thread.sleep(2000);			// we can using try catch instead of throws exceptions
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThrowVSThrows thr= new ThrowVSThrows ();
	//	thr.code();									// in the above, we used try catch so error not throw in this object.
		thr.test();
	}
	
	public void test(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		try {
			driver.findElement(By.name("email1")).sendKeys("koushik350@gmail.com");	// we are given input as a error "email1"
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			throw new RuntimeException();
		}
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.quit();
	}



}