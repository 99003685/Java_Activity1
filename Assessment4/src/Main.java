import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void countFrequencies(ArrayList<String> list) 
    { 
        
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        for (String i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
  
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                               + "occurs"
                               + ": " + val.getValue() + " times"); 
        } 
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		//TreeMap<Player,Integer>map = new TreeMap<Player,Integer >();
		ArrayList<String> list = new ArrayList<String>(); 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		 int n =Integer.parseInt(reader.readLine());
		 for(int i=0;i<n;i++)
		 {
			 String Details = reader.readLine();
			 String[] player= Details.split(",");
//			 Player p = new Player();
//			 p.setNationality(player[6]);
			 list.add(player[6]);
			
		 }
		 countFrequencies(list); 
	}
}
