
import java.util.*;
public class String_Two
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
System.out.println("Enter First Player name");
	String p1=sc.nextLine();
System.out.println("Enter Second Player name");
	String p2=sc.nextLine();
	String[] split1=p1.split("\\s+");
	String[] split2=p2.split("\\s+");
if(split1[1].equals(split2[1]))
{
   System.out.println("YES");
}
else
{
   System.out.println("NO");
}

	}
}
