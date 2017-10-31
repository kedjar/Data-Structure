// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.LinkedList;
public class ListStack {
	private LinkedList<Object> items;
	public ListStack(){items = new LinkedList<Object>();}
	public boolean empty(){return items.isEmpty();}
	public void push(Object x){items.addFirst(x);}
	public Object pop(){return items.removeFirst();}
	public Object peek(){return items.getFirst();}
}
