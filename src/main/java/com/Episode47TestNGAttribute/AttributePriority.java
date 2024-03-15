package com.Episode47TestNGAttribute;

import org.testng.annotations.Test;

public class AttributePriority {
	
	//if not mentioned any priority then it will run as per the ASCII table
	
	@Test (priority = -5)   	//Priority is run as per the int value which we have mentioned.
	public void signup() {
		System.out.println("signup");
	}
	
	@Test(priority = 1)
	public void login() {
		System.out.println("login");
	}
	
	@Test						//if not mentioned any priority then it will run as per the ASCII table
	public void productsearch() {
		System.out.println("productsearch");
	}
	
	@Test(priority = 3)
	public void addToCart() {
		System.out.println("addtoCart");
	}
	
	@Test(priority = -1)
	public void signOut() {
		System.out.println("signOut");
	}
	
	
}
