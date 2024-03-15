package com.Episode08;

public class Episode08Constructor01 {
	
//	public Episode08Constructor01() { //Constructor - When we required to change instance value, we need to use constructor
//		 this.x=1000; 
//		 this.name=ss;	
//	}
	public Episode08Constructor01(int x) { //Constructor - When we required to change instance value, we need to use constructor
		this.x=x;
	}
	public Episode08Constructor01(int xx, String s) { //Constructor - When we required to change instance value, we need to use constructor
		this.x=xx;
		this.name=s;
	}
	
	int x; //Instance
	String name;
	
	void display() {
		System.out.println(x+"--->"+name);
	}
	public static void main(String[] args) {
		Episode08Constructor01 Is = new Episode08Constructor01(1000, "B");
		Is.display();
		Episode08Constructor01 Is1 = new Episode08Constructor01(100,"Guna");
		Is1.display();
	}
}
