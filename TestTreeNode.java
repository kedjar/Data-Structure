// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class TestTreeNode {

	
	public static void main(String[] args) {
		TreeNode f = new TreeNode("F");
		TreeNode b = new TreeNode("B");		
		TreeNode g = new TreeNode("G");
		f.setLeft(b);
		f.setRight(g);
		
		TreeNode a = new TreeNode("A");
		TreeNode d = new TreeNode("D");
		b.setLeft(a);
		b.setRight(d);
		
		TreeNode c = new TreeNode("C");		
		TreeNode e = new TreeNode("E");		
		d.setLeft(c);
		d.setRight(e);
		
		TreeNode i = new TreeNode("I");
		TreeNode h = new TreeNode("H");
		g.setRight(i);
		i.setLeft(h);
		
		System.out.print("Preorder:  ");
		a.traversePreorder(f);
		System.out.println();
		System.out.print("Postorder: ");
		a.traversePostorder(f);
		System.out.println();
		System.out.print("Inorder:   ");
		a.traverseInorder(f);
		System.out.println();
		System.out.println(a.find(f, "D"));
	}

}
