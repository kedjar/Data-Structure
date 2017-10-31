// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.HashSet;
import java.util.Iterator;


public class TestHashSet {

	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Montreal");
		hs.add("Calgary");
		hs.add("Halifax");
		
		
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()){
			String c = iter.next();
			System.out.printf("%s ", c);
		}

	}

}
