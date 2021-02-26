import java.util.*;
public class Customer_Class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer s=new Customer(); 
		System.out.println("Enter the name:");
		String s1=sc.nextLine();
		System.out.println("Enter the Address:");
		String s2=sc.nextLine();
		System.out.println("Enter the Mobile:");
		String s3=sc.nextLine();
		
		s.setName(s1); 
		s.setAddress(s2);
		s.setMobile(s3);
		System.out.println("Employee Details:");
		System.out.println("Name:"+s.getName());  
		System.out.println("Address:"+s.getAddress());  
		System.out.println("Mobile:"+s.getMobile());  
sc.close();
	}

}
