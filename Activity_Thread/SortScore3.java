import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortScore3 extends Thread {
	int lowerRange;
	int upperRange;
	
	
	

	
	public SortScore3(int lowerRange, int upperRange) {
		super();
		this.lowerRange = lowerRange;
		this.upperRange = upperRange;
	}
	int counteven=0;
	int countodd=0;
	int [] even;
	int [] odd;
	public void run()
	{
		{ 
			even=new int[30];
			odd=new int[30];
			for(int i=lowerRange;i<=upperRange;i++) {
				if(i%2==0) {
					even[counteven]=i;
					counteven++;
				}
				else {
					odd[countodd]=i;
					countodd++;
				}
			}
		}
	}
	public void getScores()
	{	
		
		System.out.println("Odd scores in given range");
		for(int i=0;i<countodd;i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println("");
		System.out.println("Even scores in given range");

		for(int i=0;i<counteven;i++) {
			System.out.print(even[i]+" ");
		}
		
	}
	

}
