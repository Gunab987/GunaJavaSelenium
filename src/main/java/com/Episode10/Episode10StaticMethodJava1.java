package com.Episode10;

public class Episode10StaticMethodJava1 {

	 
	public static void displayName() {
		System.out.println("Guna");
	}

	public static void main(String args[]) {
		Episode10StaticMethodJava1 is = new Episode10StaticMethodJava1();
		//is.displayName();
		//displayName();
		Episode10StaticMethodJava1.displayName();	
		//1. without using the object, we can use the static method within the same class.
		//2. if we need to call static method from different class, we can use the object and call the static method
		
		String a = "10";
		String b = "10";
		
		System.out.println(a+b); //a and b is declared as a String. so we need to convert the string to integer
		
		int c = Integer.parseInt(a); // without using object we can used to Integer Class to convert String to integer
		int d = Integer.parseInt(b); // This conversion only happen when it is a Static function. 
		System.out.println(c+d);
		
	}
}
