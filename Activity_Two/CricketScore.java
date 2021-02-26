
import java.util.*;
public class CricketScore
{
    static void findCricketerId(int array[], int size, int score)
    {
        
        for(int i=0;i<size;i++)
        {
            if(array[i]>score)
                {
                   System.out.println(array[i-1]);
                }
            
        }
        
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size");
	int size=sc.nextInt();
	if(size<0)
	     {System.out.println("Invalid array size");
	         System.exit(0);}
	int array[]=new int[size];
    int input;
	for(int i=0;i<size;i++)
	    {
	       input=sc.nextInt();
	     if(input<0)
	     {System.out.println("Invalid Input");
	     System.exit(0);
	       
	     }
	     else
	     array[i]=input;
	        
	        }
	        
	    
	     int score=sc.nextInt();
	     if(score<0)
	     {System.out.println("Invalid Score");
	         System.exit(0);}
    
    findCricketerId(array,size,score);
	
	}
}
