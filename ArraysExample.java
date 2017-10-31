// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Arrays;


public class ArraysExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aa[] = {1, 2 ,3 ,6 , 7, 9};
		double dd[] = {3.4 , 7.4, 2.1, 9.2, 4.6};
		int cc[] = new int[10];
		
		Arrays.fill(cc , 4);
		System.out.println("cc :"+cc.toString());
		
		Arrays.sort(dd);
		boolean b = Arrays.equals(aa , cc);
		int p = Arrays.binarySearch(aa, 6);
		System.out.println("b: "+b);
		System.out.println("p: "+p);
		

	}

}
