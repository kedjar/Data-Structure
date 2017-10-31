// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Scanner;


public class PrintTree {
    public static void main (String[] args) {

	int treeHeight;
	char treeChar;

	// Get the height of the tree and the character
	// to use to print the tree.
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the height of the tree: ");
	treeHeight = in.nextInt();
	System.out.print("Enter the character to use to print the tree: ");
	treeChar = in.next().charAt(0);
	
	// Loop once for each row of the tree.
	for (int h=1; h <= treeHeight; h++) {
	    
	    // Print the number of spaces in row h of
	    // the tree.
	    for (int sp=1; sp <= treeHeight-h; sp++) {
		System.out.print(" ");
	    }

	    // Print out the character(s) that represent
	    // row h of the tree.
	    for (int t=1; t <= (2*h - 1); t++) {
		System.out.print(treeChar);
	    }
	    // Go on to the next line of the tree.
	    System.out.println();
	}	
	// Print the trunk of the tree.  The trunk will
	// be 3 characters wide and 1/4 as high as the
	// tree.
	for (int tr=1; tr <= treeHeight/4; tr++) {
	    
	    // Print out the leading spaces.
	    for (int sp=1; sp <= treeHeight - 2; sp++) {
		System.out.print(" ");
	    }

	    // Print out the trunk.
	    System.out.print(treeChar);
	    System.out.print(treeChar);
	    System.out.println(treeChar);
	}
    }
}

