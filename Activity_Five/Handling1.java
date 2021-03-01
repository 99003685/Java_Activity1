package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Handling1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int runs,overs;
		double run_rate;
	try {
		System.out.println("Enter the total runs scored:");
		runs=Integer.parseInt(reader.readLine());
		System.out.println("Enter the total overs faced:");
		overs=Integer.parseInt(reader.readLine());
		run_rate=runs/overs;
		System.out.print("Current Run Rate:");
		System.out.println(run_rate);
		
	} catch (Exception e) {
	    if (e instanceof NumberFormatException) {
	        System.out.println("NumberFormatException");
	       
	    } else {
	    	System.out.println("DivideByZeroException");
	    } 
	}

	}

}
