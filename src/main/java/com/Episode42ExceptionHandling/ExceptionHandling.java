package com.Episode42ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		
		try {								//Try is the positive note - if the run time output is valid it can be continue with "try".
			int num = sc.nextInt();
			int a = num % 0;
			System.out.println(a);
		} catch (ArithmeticException e) {   // Catch is the negative note - if the error accrue in the run time, catch can be ignore the exceptions. 
			System.out.println(e);			// it can ignore the error exceptions
			System.err.println("Dividible 0 is not possible");
			e.printStackTrace();     		//printStackTrace is given output along with the error exceptions.
			System.out.println(e.getMessage()); //It only display the message (/ by Zero )
		} catch (InputMismatchException e) {
			System.err.println("Input must be Number"); // err is displayed with red color.
		} catch (Exception e) {				// exception is a parent of the all the exception. so it will ignore all the exceptions.
			System.out.println("Unknown error"); 
		} finally {
			sc.close();						// Scanner "sc" is getting warning bcz we are not closed the sc operation. so we can closed that warning in "finally".
		}
		
											// "One Try block and multiple Catch block is possible"
		System.out.println("Completed");
	}

}
