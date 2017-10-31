// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.ArrayDeque;


public class TestDeque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		deque.addFirst(1);
		deque.addLast(9);
		deque.addFirst(2);
		deque.addLast(10);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque.peekFirst() + " " + deque.peekLast());

	}

}
