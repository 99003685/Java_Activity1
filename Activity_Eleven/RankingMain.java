package com.ltts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;

public class RankingMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Ranking> r=new ArrayList<>();
		System.out.println("Please provide the number of players ");
		int size = Integer.parseInt(reader.readLine());
		int c=1;
		int d=1;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the name of the player "+c);
			c++;
			 String s1 = reader.readLine();
		System.out.println("Enter the score of the player "+d);
		d++;
		int i1 = Integer.parseInt(reader.readLine());
		r.add(new Ranking(s1,i1));
		
		
		}
		Collections.sort(r);
		int c3=1;
		System.out.println("Player Details by Score(High to Low)");
		for(Ranking st:r) {
			
			System.out.println(c3+" "+st.getName()+" "+st.getScore());
			c3++;
		}

		



	}

}
