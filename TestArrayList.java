// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		int number;
		for(int i = 0; i < 10; i++){
			number = intRandomGenerate(1, 100);
			list1.add(number);
			list2.add(number);
		}		
		System.out.print("ArrayList genreated:  ");
		print(list1);
		System.out.println();
		System.out.print("LinkedList genreated: ");
		print(list2);
		System.out.println();
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < list1.size(); i++){
			sum1 += ((Integer)list1.get(i)).intValue();
			sum2 += ((Integer)list2.get(i)).intValue();
		}
		System.out.println("The sum1 is: "+sum1);	
		System.out.println("The sum2 is: "+sum2);
		System.out.println("The sum3 is: "+sum(list1));	
		System.out.println("The sum4 is: "+sum(list2));	
		
		
		// comparing access time
		long t1 = 0;
		long t2 = 0;
		int position = 9;
		System.out.println("Access time ArrayList: ");
		// 1. inserting an element
		t1 = System.currentTimeMillis();
		list1.add(position, 430);
		t2 = System.currentTimeMillis();		
		System.out.println("Adding an element : "+(t2 - t1));
		
		// 2. removing an element
		t1 = System.currentTimeMillis();
		list1.remove(position);
		t2 = System.currentTimeMillis();		
		System.out.println("Removing an element : "+(t2 - t1));
		
		// 3. setting an element
		t1 = System.currentTimeMillis();
		list1.set(position , 439);
		t2 = System.currentTimeMillis();		
		System.out.println("Setting an element : "+(t2 - t1));
		
		// 4. getting an element
		t1 = System.currentTimeMillis();
		list1.get(position);
		t2 = System.currentTimeMillis();		
		System.out.println("Getting an element : "+(t2 - t1));
		
		System.out.println("Access time LinkedList: ");
		// 1. inserting an element
		t1 = System.currentTimeMillis();
		list2.add(position, 430);
		t2 = System.currentTimeMillis();		
		System.out.println("Adding an element : "+(t2 - t1));
		
		// 2. removing an element
		t1 = System.currentTimeMillis();
		list2.remove(position);
		t2 = System.currentTimeMillis();		
		System.out.println("Removing an element : "+(t2 - t1));
		
		// 3. setting an element
		t1 = System.currentTimeMillis();
		list2.set(position , 439);
		t2 = System.currentTimeMillis();		
		System.out.println("Setting an element : "+(t2 - t1));
		
		// 4. getting an element
		t1 = System.currentTimeMillis();
		list2.get(position);
		t2 = System.currentTimeMillis();		
		System.out.println("Getting an element : "+(t2 - t1));
		
	}
	// sum method
	static int sum(ArrayList<Integer> arraylist){
		
		int sum = 0;
		Iterator<Integer> iter = arraylist.iterator();
		while(iter.hasNext()){
			Integer x = (Integer)iter.next();
			sum += x.intValue();
		}
		return sum;
	}
	
	static int sum(LinkedList<Integer> linkedlist){
		
		int sum = 0;
		Iterator<Integer> iter = linkedlist.iterator();
		while(iter.hasNext()){
			Integer x = (Integer)iter.next();
			sum += x.intValue();
		}
		return sum;
	}
	
	// generate integer random numbers
	static int intRandomGenerate(int start , int finish){
		return (int)((Math.random()) * (finish - start) + 1);
	}
	// print method
	static void print(ArrayList<Integer> arraylist){
		for(int i = 0; i < arraylist.size(); i++){
			System.out.print(" "+arraylist.get(i));
		}
	}
	static void print(LinkedList<Integer> linkedlist){
		for(int i = 0; i < linkedlist.size(); i++){
			System.out.print(" "+linkedlist.get(i));
		}
	}

}
