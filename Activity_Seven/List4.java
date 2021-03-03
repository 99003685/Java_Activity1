package com.ltts;

import java.io.*;
import java.util.*;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>ar = new ArrayList <>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Team Name:");
		int i;
		for(i=0;i<5;i++) {
			String name = sc.nextLine();
			ar.add(name);
		}
			
		System.out.println("Enter the Swap Position:");
	int position=sc.nextInt();
Collections.swap(ar,0,position);
for(String s:ar)
{
System.out.println(s);
}
sc.close();
	}

}

