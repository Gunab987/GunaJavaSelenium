package com.Episode51TestNGAlwaysRunEnableDiscription;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class AttributePriority {
	
	//if not mentioned any priority then it will run as per the ASCII table
	
	// enabled is not even consider as a Test functions.
	@Test (enabled = false , alwaysRun =true )  	
	public void signup() {
		System.out.println("signup");
	}
	
	@Test (description = "Loging is run as per the ASCII" )
	public void login() {
		System.out.println("login");
	}
	
	@Test						
	public void productsearch() {
		System.out.println("productsearch");
		throw new NoSuchElementException("Element not there");
	}
	 // Always Run, it can be run at any situation even if we can set any failure dependency 
	@Test(dependsOnMethods = "Episode51MavanAlwaysRunEnableDiscription.AttributePriority.productsearch" , alwaysRun = true) 
	public void addToCart() {
		System.out.println("addtoCart");
	}

	
	
}
