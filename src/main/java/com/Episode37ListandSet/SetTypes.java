package com.Episode37ListandSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {
	
	public static void main(String[] args) {
		
		//HashSet is based on the Run the program it will sort the lines. its called HashSet
		//All the functions from list we can use in the Set. (Except get).
		// No get function.
		Set<String> set = new HashSet<String>(); // Set remove's the duplicate 
		set.add("guna");
		set.add("Cycle");
		set.add("baskar");
		set.add("alamelu");
		set.add("gowri");
		set.add("Cycle");
		
		for (String string : set) {
			System.out.println(string);
			
		}
		
		System.out.println("--------------");
		Set<String> set1 = new TreeSet<String>(); // TreeSet is convert the ascending order 
		set1.add("guna");
		set1.add("cycle");
		set1.add("baskar");
		set1.add("alamelu");
		set1.add("gowri");
		set1.add("cycle");
		
		for (String string1 : set1) {
			System.out.println(string1);	
		}
		
		System.out.println("--------------");
		Set<String> set2 = new LinkedHashSet<String>(); // LinkedHashSet is printed with same order which we have declared.
		set2.add("guna");
		set2.add("cycle");
		set2.add("baskar");
		set2.add("alamelu");
		set2.add("gowri");
		set2.add("cycle");
		
		for (String string2 : set2) {
			System.out.println(string2);	
		}
	}

}
