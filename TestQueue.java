// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.LinkedList;
import java.util.Queue;


public class TestQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println("Initially the Queue is empty?: "+queue.isEmpty());
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		
		System.out.println("Check the first element of the queue "+queue.peek());
		System.out.println("remove the 1st element of the queue "+queue.remove());
		System.out.println("remove the 2nd element of the queue "+queue.remove());
		System.out.println("remove the 3rd element of the queue "+queue.remove());
		System.out.println("remove the 4th element of the queue "+queue.remove());
		System.out.println("remove the 5th element of the queue "+queue.remove());
		System.out.println("remove the 6th element of the queue "+queue.remove());
		
		System.out.println("Is the Queue is empty?: "+queue.isEmpty());

	}

}
