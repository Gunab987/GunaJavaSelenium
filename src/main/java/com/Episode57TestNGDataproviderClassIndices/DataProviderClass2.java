package com.Episode57TestNGDataproviderClassIndices;

import org.testng.annotations.DataProvider;

public class DataProviderClass2 {

	// create DataProvider and assign name and this name need to mention the @Test below.
	// we use indices to run the particular rows 
	@DataProvider (name = "login", indices = {1 ,0})
	public String[][] getData() {
		String [][] data = new String [2][2];
		//row 1
		data [0][0] = "Guna.b98@gmail.com";
		data [0][1] = "pass@123";
		
		//row 2
		data [1][0] = "Guna.b987@gmail.com";
		data [1][1] = "pass@12345";
		
		return data;
	}
	
}
