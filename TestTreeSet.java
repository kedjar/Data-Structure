// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Iterator;
import java.util.TreeSet;


public class TestTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Montreal");
		ts.add("Victoria");
		ts.add("Calgary");
		ts.add("Halifax");		
		
		System.out.printf("Highest element: %s\n" , ts.last());
		System.out.printf("Number elements: %d\n" , ts.size());
		
		Iterator<String> iter = ts.iterator();
		while(iter.hasNext()){
			String c = iter.next();
			System.out.printf("%s ", c);
		}

	}

}
