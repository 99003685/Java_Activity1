import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> al= new HashSet<>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player of the match");
		int n= sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			String name = sc.next();
			al.add(name);
		}

	      for(String j:al)
	      {
	     System.out.println(j);}
	}

}
