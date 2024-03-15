package com.Episode35Inheritance;

//Class to class - Extends
//	Class to interface - implements
public class BMW extends bike {

	int milage = 20;

	String getColor() {
		return "red";
	}

	public static void main (String args[]) {
		BMW myBike = new BMW();
		String color = myBike.getColor();
		System.out.println(color);
		
		int milage2 = myBike.milage;
		System.out.println(milage2);
		
		myBike.applyBrake();
		
		myBike.hornmust();
		
		boolean disc = myBike.hadDisc();
		System.out.println(disc);
		
		Vehicle newbike = new Vehicle();
		newbike.hornmust();
	}
}
