package com.ltts;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c1=0,c2=0;
		ArrayList <Integer> l1=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			l1.add(a);
			if(l1.get(i)>=50&&l1.get(i)<100)
			{
				c1++;
				
			}
			if(l1.get(i)>=100)
			{
				c2++;
			}
		}
		System.out.println(c1);
		System.out.println(c2);

		
		
	sc.close();

	}

}
