package com.ltts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class List3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<String> set1 = new HashSet<>(); 
		Set<String> set2 = new HashSet<>(); 
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++)
			{String a=sc.nextLine();
		set1.add(a);}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{String a=sc.nextLine();
	set2.add(a);}

		//System.out.println(set1);
		
		 set1.retainAll(set2); 
		 System.out.println("Consistent run scorers");
		 for(Object i4:set1) {
				System.out.println(i4);}
			
		
	sc.close();

	}

}
