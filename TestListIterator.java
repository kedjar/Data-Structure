// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.LinkedList;
import java.util.ListIterator;
public class TestListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> courses = new LinkedList<String>();
		courses.addFirst("Biology");
		courses.addFirst("Physics");
		courses.addFirst("Chemistry");
		
		// declares a list-iterator that starts at the end of the linkedList
		ListIterator<String> iter = courses.listIterator(courses.size());
		while(iter.hasPrevious()){
			String c = iter.previous();
			System.out.printf("%s ", c);
		}
	}
}
