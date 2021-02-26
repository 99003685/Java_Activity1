
import java.util.*;
public class String_One
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String");
		String a=sc.next();
		System.out.println("Enter the Second String");
			String b=sc.next();
			StringBuffer a1=new StringBuffer(a);
			
				int n1=a1.length();
		
            a1.setCharAt(0,Character.toUpperCase(a1.charAt(0)));
            a1.setCharAt(n1-1,Character.toUpperCase(a1.charAt(n1-1)));
            	
           String b1= b.toUpperCase();
            	System.out.println("Final String is "+a1+" "+b1);
			
	}
}
