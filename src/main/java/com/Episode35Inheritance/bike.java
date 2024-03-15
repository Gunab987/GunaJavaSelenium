package com.Episode35Inheritance;

public class bike extends Vehicle {
	
	public boolean hadDisc() {
		return true;
	}
	
	public void hornmust() {
		
		super.hornmust(); //Its refer to Parent class "Vehicle"
	//	super.applyBrake(); //Its refer to Parent class "Vehicle"
		System.out.println("Bike - Horned");
	}
	}


