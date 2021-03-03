import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hashset_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player of the match");
		int n= sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			String name = sc.next();
			al.add(name);
		}

		long distinctCount = new HashSet<>(al).size();
	      System.out.println(distinctCount);
	    
	      
	     System.out.println(al.get(i));
	}

}