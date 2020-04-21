package module01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
		 
		 map.put("January", 31);
		 map.put("February",28);
		 map.put("March",31);
		 map.put("April",30);
		 map.put("May", 31);
		 
		 System.out.println("Hashmap key values and there elements are: ");
		 
		 Iterator<HashMap.Entry<String, Integer>> itr = map.entrySet().iterator(); 
         
	        while(itr.hasNext()) 
	        { 
	             Map.Entry<String, Integer> entry = itr.next(); 
	             System.out.println("Key = " + entry.getKey() +  
	                                 ", Value = " + entry.getValue()); 
	        } 
		 

	}

}
