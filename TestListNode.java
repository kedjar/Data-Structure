// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class TestListNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// start with an empty list, head is reference to first node
		ListNode head = null;
		// create the first node, result in a list with one node
		head = new ListNode("bb" , null);
		// create a second node appended to the first node
		ListNode node1 = new ListNode("cc" , null);
		head.setNext(node1);
		// append a third node to the end of the list
		ListNode node2 = new ListNode("dd" , null);
		node1.setNext(node2);
		System.out.println("first node value is: "+head.getValue());
		System.out.println("first node points to: "+head.getNext());
		System.out.println("second node value is: "+node1.getValue());
		System.out.println("second node points to: "+node1.getNext());
		System.out.println("third node value is: "+node2.getValue());
		System.out.println("third node points to: "+node2.getNext());
	}

}
