package com.Episode34Interface;

public class customer {
	
	
	// Different between interface & abstract class :
	// 1. interface - should be use all the functions
	// 2. abstract - not mandatory to use in the all functions. If there is any exceptions, we can use only the which are the functions we needed.
	
	public static void main(String[] args) {
		
		InterfaceImplementAxis mybank = new InterfaceImplementAxis();
		mybank.adharManditory();
		boolean panManditory = mybank.panManditory();
		System.out.println(panManditory);
		System.out.println(InterfaceImplementAxis.UPILimit);
		
		
		// **** In the class, there must be a constructor; only then can we create an object.*******
		// InterfaceRBI myRBI = new InterfaceRBI (); It is showing error "InterfaceRBI"
		InterfaceRBI myRBI = new InterfaceImplementAxis(); // Video time 16:00
		myRBI.housingLoan(); //object using method
		InterfaceRBI.bikeLoan(); //Static method
		
	}

}
