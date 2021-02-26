import java.util.*;
public class InningsMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a1,a2,b1,b2;
		int c1,c2;
Innings i1=new Innings();

System.out.println("Enter the Teamname1:");
a1=sc.nextLine();
System.out.println("Enter the Session:");

b1=sc.nextLine();
System.out.println("Enter the Runs:");

c1=sc.nextInt();

i1.setTeamname(a1); 
i1.setInningsname(b1);
i1.setRuns(c1);

Innings i2=new Innings();
Scanner s=new Scanner(System.in);

System.out.println("Enter the Teamname2:");

a2=s.nextLine();
System.out.println("Enter the Session:");

b2=s.nextLine();
System.out.println("Enter the Runs:");

c2=s.nextInt();
i2.setTeamname(a2); 
i2.setInningsname(b2);
i2.setRuns(c2);
i1.displayInningsDetails();
i2.displayInningsDetails1();


 sc.close();

	}

}
