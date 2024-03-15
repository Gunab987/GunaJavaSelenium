package com.Episode53TestNGGroups;

import org.testng.annotations.Test;

public class AttributePriority {
	
	//if not mentioned any priority then it will run as per the ASCII table
	
	
	@Test (groups = {"smoke"})
	public void signup() {
		System.out.println("signup");
	}
	
	@Test (groups = {"reg"})
	public void login() {
		System.out.println("login");
	}
	
	@Test	(groups = {"reg"})					
	public void productsearch() {
		System.out.println("productsearch");
		
	}
	
	@Test	(groups = {"sanity"})					
	public void payment() {
		System.out.println("payment");
	}
	
	@Test (groups = {"smoke"})
	public void addToCart() {
		System.out.println("addtoCart");
	}

	
	
}
