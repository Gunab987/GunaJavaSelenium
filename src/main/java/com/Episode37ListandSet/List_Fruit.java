package com.Episode37ListandSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Fruit {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("guna");
		list.add("baskar");
		list.add("alamelu");
		list.add("gowri");
		list.add("cycle");
		Collections.sort(list); //sort
		
		int size = list.size();
		System.out.println(size);
		
		String get = list.get(1);
		System.out.println(get);
		System.out.println("---------");
		
		for (String listAll : list) {
			System.out.println(listAll);
		}
		System.out.println("---------");
		boolean remove = list.remove("Cycle");
		
		for (String listAll : list) {
			System.out.println(listAll);
		}
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		System.out.println("----------");
		
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("apple");
//		list.add("mango");
//		list.add("apple");
//		list.add("pine");
//		list.add("grape");
		
		
//		int size = list.size();			 //size
//		System.out.println("Size " + size);
//		
//		boolean contains = list.contains("apple"); //contains
//		System.out.println("Its contains is there : " +contains);
//		System.out.println("---------------");
//		
//		String string1 = list.get(0); 	//get
//		System.out.println(string1);
//		System.out.println("------------");
//		for (String eachFruit : list) { // print before delete
//			System.out.println(eachFruit);	
//		}
//		list.remove("apple"); 			//remove
//		System.out.println("------------");
//		for (String eachFruit : list) {
//			System.out.println(eachFruit);	// print after delete
//		}
//		int size1 = list.size();		 //size
//		System.out.println("Size " + size1);
//		
//		boolean empty = list.isEmpty(); // It check its empty or not
//		System.out.println("Is empty " +empty );
//		
//		list.clear(); 					//Clear
//		System.out.println(list.isEmpty());
//		
	}

}
