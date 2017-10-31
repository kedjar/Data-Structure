// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: This class implements a simple TreePlay
// Place: At home
// Known Bugs: None

public class TreePlay {
	
	public static void main(String[] args) {
		Node root = new Node(62);
		
		root.left = new Node(42);		
		root.left.left = new Node(32);
		root.left.right = new Node(39);
		root.left.left.left = new Node(22);
		root.left.left.right = new Node(29);
		root.left.right.left = new Node(14);
		root.left.right.right = new Node(33);
		
		root.right = new Node(59);
		root.right.left = new Node(44);
		root.right.right = new Node(13);
		root.right.left.left = new Node(17);
		root.right.left.right = new Node(30);
		root.right.right.left = new Node(9);
		
		// Compute and display sum of all nodes values
		System.out.println("Sum of all values of all nodes is: " +getSum(root));
		
		// print the tree nicely
		printTree(root);
	}
	
	static int getSum(Node node){
		// base case
		if(node == null)
			return 0;	
		// recursive case
		return getSum(node.left) + node.value + getSum(node.right);
	}
	// wrapper method
	static void printTree(Node node){
		printTreeRecursive(node , 0);
	}
	
	static void printTreeRecursive(Node node , int level){
		if(node == null){
			return;
		}
		
		if(node.left == null && node.right == null){
			for(int i = 0; i <= level - 1; i++){
				System.out.printf("\t");
			}
			for(int i = level - 1; i <= level - 1; i++){
				System.out.printf("+--");
			}
			System.out.println(node.value);
		}
		else{
			for(int i = 0; i <= level - 1; i++){
				System.out.printf("\t");
			}
			for(int i = level - 1; i <= level - 1; i++){
				System.out.printf("+--");
			}
			System.out.println(node.value);
			if(node.left != null){
				printTreeRecursive(node.left , level + 1);
			}
			if(node.right != null){
				printTreeRecursive(node.right , level + 1);
			}
		}
	
		
	}
}

class Node{
	
	Node left, right;
	int value;
	public Node(int v){
		value = v;
		left = null;
		right = null;
	}	
}
