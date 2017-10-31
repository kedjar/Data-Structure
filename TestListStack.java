// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class TestListStack {
	public static void main(String[] args) {
	ListStack stack = new ListStack();
	System.out.println("At the beginning the stack is empty?: "+stack.empty());
	stack.push("12");
	stack.push("13");
	stack.push("14");
	stack.push("15");
	stack.push("16");
	stack.push("17");
	System.out.println("Checking the first element of the stack: "+stack.peek());
	System.out.println("Removing the 1st element of the stack: "+stack.pop());
	System.out.println("Is the stack is empty?: "+stack.empty());
	System.out.println("Removing the 2nd element of the stack: "+stack.pop());
	System.out.println("Is the stack is empty?: "+stack.empty());
	System.out.println("Removing the 3rd element of the stack: "+stack.pop());
	System.out.println("Is the stack is empty?: "+stack.empty());
	System.out.println("Removing the 4th element of the stack: "+stack.pop());
	System.out.println("Is the stack is empty?: "+stack.empty());
	System.out.println("Removing the 5th element of the stack: "+stack.pop());
	System.out.println("Is the stack is empty?: "+stack.empty());
	System.out.println("Removing the 6th element of the stack: "+stack.pop());
	System.out.println("Is the stack is empty?: "+stack.empty());
	}

}
	
