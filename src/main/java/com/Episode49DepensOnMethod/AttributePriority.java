package com.Episode49DepensOnMethod;

import org.testng.annotations.Test;

public class AttributePriority {
	
	//if not mentioned any priority then it will run as per the ASCII table
	
	@Test   	//Priority is run as per the int value which we have mentioned.
	public void signup() {
		System.out.println("signup");
	}
	
	@Test(dependsOnMethods = "signup", priority = 1)
	public void login() {
		System.out.println("login");
	}
	
	@Test	(dependsOnMethods = "login" )					//if not mentioned any priority then it will run as per the ASCII table
	public void productsearch() {
		System.out.println("productsearch");
	}
	
	@Test(dependsOnMethods = "productsearch" )
	public void addToCart() {
		System.out.println("addtoCart");
	}
	
	@Test(dependsOnMethods = "addToCart" )
	public void signOut() {
		System.out.println("signOut");
	}
	
	
}
