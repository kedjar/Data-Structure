// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class TestHashMap {

	
	public static void main(String[] args) {
		HashMap<String , Integer> hm = new HashMap<String , Integer>();
		hm.put("Godin", 25);
		hm.put("Tessier", 43);
		hm.put("Michel", 18);
		
		Set s = hm.keySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()){
			System.out.printf("%d ", hm.get(iter.next()));			
		}
		hm.remove("Tessier");
		System.out.println("The size of HashMap = " +hm.size());
	}

}
