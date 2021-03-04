import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlayerClass1Main {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 PlayerClass1 p1=new PlayerClass1();
		 PlayerClass1 p2=new PlayerClass1();
		
	
		
			System.out.println("Enter player 1 detail:");
			String s1 = reader.readLine();
			
			String s[]=s1.split(",");
			
			p1.setName(s[0]);
			
			  SimpleDateFormat f1=new SimpleDateFormat("dd-MM-yyyy");  
			  Date date1=f1.parse(s[1]);
			p1.setDateOfBirth(date1);
			p1.setSkill(s[2]);
			p1.setNumberOfMatches(Integer.parseInt(s[3]));
			p1.setRuns(Integer.parseInt(s[4]));
			p1.setWickets(Integer.parseInt(s[5]));
			p1.setNationality(s[6]);
			p1.setPowerRating(Double.parseDouble(s[7]));
		
			
			
			System.out.println("Enter player 1 detail:");
			String s2 = reader.readLine();
			String ss[]=s2.split(",");
			p2.setName(ss[0]);
			
			 SimpleDateFormat f2=new SimpleDateFormat("dd-MM-yyyy");  
			  Date date2=f2.parse(ss[1]);
			p1.setDateOfBirth(date2);
			p2.setSkill(ss[2]);
			p2.setNumberOfMatches(Integer.parseInt(ss[3]));
			p2.setRuns(Integer.parseInt(ss[4]));
			p2.setWickets(Integer.parseInt(ss[5]));
			p2.setNationality(ss[6]);
			p2.setPowerRating(Double.parseDouble(ss[7]));
			
			
			
			
		if(s[0].equals(ss[0])&&s[2].equals(ss[2])&&s[6].equals(ss[6]))
		{
			System.out.println("Player 1:");
			System.out.println(p1);
			System.out.println("\n");
			System.out.println("Player 2:");
			System.out.println(p2);
			System.out.println("Player 1 is same as Player 2");
			
		}
		else
		{	System.out.println("Player 1:");
			System.out.println(p1);
			System.out.println("\n");
			System.out.println("Player 2:");
			System.out.println(p2);
			System.out.println("\n");
			System.out.println("Player 1 and Player 2 are different ");
		}
		
		
		

	}

}
