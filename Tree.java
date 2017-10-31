// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

abstract class NodeA {

    public NodeA(int l) {
        label = l;
    }

    int getLabel() {
        return label;
    }

    int label;
}


class InnerNode extends NodeA {

    public InnerNode(int l, NodeA left, NodeA right) { 
        super(l);
        leftChild = left;
        rightChild = right;
    }

    public NodeA getLeftChild() {
        return leftChild;
    }

    public NodeA getRightChild() {
        return rightChild;
    }


    public void setLeftChild(NodeA n) {
        leftChild = n;
    }

    public void setRightChild(NodeA n) {
        rightChild = n;
    }

    NodeA leftChild;
    NodeA rightChild;
}


class Leaf extends NodeA {

    public Leaf(int l) {
        super(l);
    }

}




public class Tree {

    // Replace this "procedural" way of printing the tree with an
    // object-oriented approach by implementing a visitor pattern.

    public static void printTree(NodeA n) {
        if (n == null)
            return;
        else if (n instanceof InnerNode) {
            InnerNode m = (InnerNode) n;
            printTree(m.getLeftChild());
            System.out.print(m.getLabel() + " ");
            printTree(m.getRightChild());
        }
        else
            System.out.print(n.getLabel() + " ");
    }

    public static void main(String args[]) {
        NodeA n = new InnerNode(8, 
                        new InnerNode(4, 
                             new InnerNode(2, 
                                     new Leaf(1),
                                     null),
                             new Leaf(7)),
                         new InnerNode(14,
                              new InnerNode(11,
                                      null,
                                      new Leaf(12)),
                              new Leaf(17)));

        printTree(n);
        System.out.println();
    }
}
