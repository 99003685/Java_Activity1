package com.ltts;
import java.util.*;
import java.util.ArrayList;


public class Ten{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		ArrayList l1=new ArrayList();
		System.out.println("Enter the player details");
		System.out.println("Enter the player name");
		String name=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter country");
		String country=sc1.nextLine();
		l1.add(name);
		l1.add(age);
		l1.add(country);
		for(int i=0;i<l1.size();i++)
			
		{System.out.println(l1.get(i));}
		System.out.println("Enter Skill");
		String skill=sc1.nextLine();
//		l1.add(skill);
		System.out.println("Enter the position to add the skill");
		int position=sc1.nextInt();
		System.out.println(l1);
		l1.set(position,skill);
		for(Object i1:l1) {
		System.out.println(i1);}
		
		System.out.println("Enter the position of the detail to be removed");
		int remove=sc1.nextInt();
		l1.remove(remove);
		for(Object i2:l1) {
			System.out.println(i2);}
		
		
		
		
		
		

	}

}
