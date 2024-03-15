package com.Episode07;

public class Episode07LocalandInstanceVariableThiskey {
	
	int c = 15; //instance variable or Global Variable
	
	int num() { //current class function
		return 1;
		
	}
	
	void addTwonumber (int a , int b) { //Default access modifier
		int c=25; //local variable
		System.out.println(a+b+c);
		System.out.println(this.c); // "this" keyword is refer to current class instance variable 
		System.out.println(this.num()); //"this keyword is refer to current class functions"
		System.out.println(c);
	}

	public static void main(String[] args) {
		Episode07LocalandInstanceVariableThiskey add = new Episode07LocalandInstanceVariableThiskey();
		add.addTwonumber(10, 20);
		
		
	}
}
