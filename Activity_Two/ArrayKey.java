
import java.util.*;
public class ArrayKey
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,input;
	 System.out.println("Enter the size of array");
	n=sc.nextInt();
        
	int a[]=new int[20];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++)
	    {input=sc.nextInt();
	     if(input<0)
	     {System.out.println("Invalid Input");
	     System.exit(0);
	       
	     }
	     else
	     a[i]=input;
	    }
	  int key,count=0;
	System.out.println("Enter the element whose occurance is to be found out");
	  key=sc.nextInt();
	  for(int i=0;i<n;i++)
	    {
	        if(a[i]==key)
	            {
	                count++;
	            }
	        
	    }
	    if(count!=0){
	  System.out.println("Element Occured"+count+"times");}
	  else
	  { System.out.println("Invalid Input");}
	   
	}
}
