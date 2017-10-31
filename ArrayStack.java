// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.ArrayList;


public class ArrayStack {
	private ArrayList<Object> g;
	public ArrayStack(){
		g = new ArrayList<Object>();
	}
	public boolean empty(){return g.isEmpty();}
	public void push(Object x){g.add(x);}
	public Object pop(){return g.remove(g.size() - 1);}
	public Object peek(){return g.get(g.size() - 1);}

}
