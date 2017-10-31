// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.PriorityQueue;


public class TestPriorityQueue {

	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(12);
		pq.add(8);
		pq.add(10);
		
		while(!pq.isEmpty()){
			System.out.printf("%d ",pq.peek());
			pq.remove();
		}

	}

}
