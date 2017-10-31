// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class ListNode {
	private Object value;
	private ListNode next;
	
	public ListNode(Object v, ListNode nx){
		value = v;
		next = nx;		
	}
	
	public Object getValue(){ return value;}
	public ListNode getNext(){ return next;}
	public void setValue(Object v){ value = v;}
	public void setNext(ListNode nx){ next = nx;}
}
