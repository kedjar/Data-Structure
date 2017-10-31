// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class TreeNode {
	private Object value;
	private TreeNode left;
	private TreeNode right;
	
	// Constructors
	public TreeNode(Object v){
		value = v;
		right = null;
		left = null;
	}
	public TreeNode(Object v, TreeNode lt, TreeNode rt){
		value = v;
		left = lt;
		right = rt;		
	}
	// Methods
	public Object getValue(){return value;}
	public TreeNode getLeft(){return left;}
	public TreeNode getRight(){return right;}
	public void setValue(Object v){value = v;}
	public void setLeft(TreeNode lt){left= lt;}
	public void setRight(TreeNode rt){right = rt;}
	
	// count nodes
	public int countNodes(TreeNode root){
		if(root == null)
			return 0;
		else
			return 1 + countNodes(root.getLeft()) 
					 + countNodes(root.getRight());					
	}
	
	// copy a tree node
	public TreeNode copy(TreeNode root){
		if(root == null)
			return null;
		else
			return new TreeNode(root.getValue(), 
					            copy(root.getLeft()),
					            copy(root.getRight()));
		}
	// Pre order Traversal
	public void traversePreorder(TreeNode root){
		if(root != null){
			System.out.print(root.getValue() + " ");
			traversePreorder(root.getLeft());
			traversePreorder(root.getRight());			
		}		
	}
	//Post order Traversal
	public void traversePostorder(TreeNode root){
		if(root != null){			
			traversePostorder(root.getLeft());
			traversePostorder(root.getRight());	
			System.out.print(root.getValue() + " ");
		}		
	}
	//In order Traversal
	public void traverseInorder(TreeNode root){
		if(root != null){			
			traverseInorder(root.getLeft());
			System.out.print(root.getValue() + " ");
			traverseInorder(root.getRight());				
		}		
	}
	
	public Object find(TreeNode root , String target){
		if(root == null)
			return null;
		int compareResult = target.compareTo((String)root.getValue());
		
		if(compareResult == 0)
			return root.getValue();
		else if(compareResult < 0)
			return find(root.getLeft() , target);
		else
			return find(root.getRight() , target);
	}
	
	
}
