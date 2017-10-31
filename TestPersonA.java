// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Arrays;


public class TestPersonA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonA[] contestants = new PersonA[6];
		contestants[0] = new PersonA("John" , "Smith" , 20);
		contestants[1] = new PersonA("Jane" , "Doe" , 45);
		contestants[2] = new PersonA("David" , "Johnson" , 30);
		contestants[3] = new PersonA("M'Hand" , "Kedjar" , 27);
		contestants[4] = new PersonA("Garry" , "Kasparov" , 48);
		contestants[5] = new PersonA("Bobby" , "Fischer" , 24);
		
		
		System.out.println("Sorting by age:");
		Arrays.sort(contestants , PersonA.AgeComparator);		
		for(PersonA p : contestants)
			System.out.println("    "+p);
		
		System.out.println("Sorting by last name:");
		Arrays.sort(contestants);		
		for(PersonA p : contestants)
			System.out.println("    "+p);
		
		

	}

}
