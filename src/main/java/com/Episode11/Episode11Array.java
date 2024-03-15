package com.Episode11;

import java.util.Arrays;

public class Episode11Array {
	
	public static void main (String args[]) {
		
		String [] gun = {"AKM","M416","M762","AWM","Groza"};
		System.out.println(gun[3]);
		System.out.println(gun[0]);
		System.out.println(gun.length);
		System.out.println(gun[gun.length-1]);
		System.out.println(Arrays.toString(gun));
		
		int[] a= new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		System.out.println(a[2]);
		System.out.println(Arrays.toString(a));
	}

}
