// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TestTreeMap {

	
	public static void main(String[] args) {
		TreeMap<String , Integer> tm = new TreeMap<String , Integer>();
		tm.put("Claude", 26);
		tm.put("Yves" , 47);
		tm.put("Alain", 35);
		
		Set s = tm.keySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()){
			System.out.printf("%d \n" , tm.get(iter.next()));
			//System.out.printf("%s \n" , iter.next());
		}
		tm.remove("Claude");
		System.out.println("The size of Treemap = " +tm.size());
	}

}


