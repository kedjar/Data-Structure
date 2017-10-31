// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Stack;


public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("M'Hand");
		st.push("Bobby");
		st.push("Garry");
		System.out.printf("%s ", st.peek());
		while(!st.isEmpty()){
			System.out.printf("%s ", st.pop());
		}

	}

}
