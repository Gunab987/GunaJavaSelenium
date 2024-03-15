package com.Episode34Interface;

public interface InterfaceRBI {
	
	// **** In the class, there must be a constructor; only then can we create an object.*******
	
	//Variable declaration
	int UPILimit = 100000; //Static final - what are the variables declared in interface, it can be comes under "Static final". It is fixed.
	
	// in interface, by default all the functions are public
	void adharManditory(); // there is no accessModifier, so it is default
	
	void adharManditory(boolean a);
	
	boolean panManditory();
	
	default void housingLoan() {
		System.out.println("get Loan");
	}
	
	static void bikeLoan() {
		System.out.println("Bike Loan");
	}
	
	// 1. we cannot be use interface in directly. we can use interface from different class.
}
