// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.ArrayList;
import java.util.Stack;


public class TowerOfHanoi {

	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<Integer>();
		for(int i = 10; i < 0; i--){
			st1.add(i);
		}
		
		Stack<Integer> st2 = new Stack<Integer>();
		st2 = hanoiTowers(st1);
	}

	private static Stack<Integer> hanoiTowers(Stack<Integer> st) {		
		Stack<Integer> result = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();
		int item = st.pop();
		temp.push(item);
		return result;
		
		
		
		
		
		
	}

}
