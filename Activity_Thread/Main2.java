import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String match[]=new String[5];
	String score[]=new String[5];
	int i;
	CalculateScores[] ss=new CalculateScores[5];
	for(i=0;i<3;i++)
	{
		System.out.println("Enter the match : ");
		match[i]=br.readLine();
		System.out.println("Enter the Score :  ");
		score[i]=br.readLine();
		ss[i]=new CalculateScores(match[i],score[i]);
	}
	System.out.println("Ordered List :  ");
	for(i=0;i<3;i++) {
		ss[i].start();
		try
		{
			ss[i].join(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		ss[i].getScores();
		}
	}
}