import java.io.*;
import java.util.Scanner;


public class Handling2{
  public static void main(String[ ] args) {
Scanner sc=new Scanner(System.in);
	  
	  try {
		  
		  System.out.println("Enter the number of overs");
      int over=sc.nextInt();
      System.out.println(" Enter the number of runs for each over");
      int overs []=new int[over];
      for(int i=0;i<over;i++)
      {
    	  overs[i]=sc.nextInt();
      }
      System.out.println("Enter the over number");
      int key=sc.nextInt();
      System.out.println("Runs scored in this over :"+overs[key-1]);
      
	  
	  
	  } 
	  
	  
	  catch (Exception e) {
		    if (e instanceof ArrayIndexOutOfBoundsException) {
		        System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		       
		    } else {
		    	System.out.println("java.lang.NegativeArraySizeException");
		    } 
		}
  }
}