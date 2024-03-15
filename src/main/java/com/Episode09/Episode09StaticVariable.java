package com.Episode09;

public class Episode09StaticVariable {
	
	int x = 0; //Instance variable - always belongs to Object (Episode09StaticVariable Is = new Episode09StaticVariable();)
				// If we create object again and again, instance will run from 1st
	
	static int y =0; // Static variable - always belongs to Class (Episode09StaticVariable)
					// It's only initialize in first time, it will continue next to next. 
	
	void counter() {
		x++;
		y++;
		
		System.out.println("Non-Static =>"+x+"Static =>"+y);
	}
		public static void main(String args[]) {
			Episode09StaticVariable Is = new Episode09StaticVariable(); // Object 
			Is.counter();
			Is.counter();
			Episode09StaticVariable Is2 = new Episode09StaticVariable();
			Is2.counter();
			
		}
		
	}


