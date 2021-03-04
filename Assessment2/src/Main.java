import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws ParseException, NumberFormatException, IOException {
		// TODO Auto-generated method stub

BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of players:");
int n = Integer.parseInt(reader.readLine());
PlayerExam [] pl = new PlayerExam[n];
for(int i=0;i<n;i++) {

	
	String s = reader.readLine();
	pl[i]=PlayerExam. createPlayer(s);
}
HashMap<String, Integer> hash = new HashMap<String, Integer>(); 

//Iterate through array of words 
for (int i = 0; i < n; i++) { 
 // If word already exist in HashMap then increase it's count by 1 
 if (hash.containsKey(pl[i].nationality)) { 
     hash.put(pl[i].nationality, hash.get(pl[i].nationality) + 1); 
 } 
 // Otherwise add word to HashMap 
 else { 
     hash.put(pl[i].nationality, 1); 
 }
 Set<Map.Entry<String, Integer> > set = hash.entrySet(); 
 String key = ""; 
 int value = 0; 

 for (Map.Entry<String, Integer> me : set) { 
     // Check for word having highest frequency 
     if (me.getValue() > value) { 
         value = me.getValue(); 
         key = me.getKey(); 
     } 
 } 


 // Return word having highest frequency 
System.out.println("The nationality with maximum players: "+key);


} 
} 

	}