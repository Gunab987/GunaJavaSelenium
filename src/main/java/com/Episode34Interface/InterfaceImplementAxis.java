package com.Episode34Interface;

public class InterfaceImplementAxis implements InterfaceRBI  {

	
	public void interestFreeLoan() {
		
		System.out.println("Free loan");	
	}
	
	@Override
	public void adharManditory() {
		System.out.println("Adhar Added");
		
	}

	@Override
	public boolean panManditory() {
		return true;
	}

	@Override
	public void adharManditory(boolean a) {
		System.out.println(a);
		
	}

}
