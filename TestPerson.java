// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Arrays;


public class TestPerson {

	
	public static void main(String[] args) {
		Person[] contestants = new Person[6];
		contestants[0] = new Person("John" , "Smith" , 20);
		contestants[1] = new Person("Jane" , "Doe" , 45);
		contestants[2] = new Person("David" , "Johnson" , 30);
		contestants[3] = new Person("M'Hand" , "Kedjar" , 27);
		contestants[4] = new Person("Garry" , "Kasparov" , 48);
		contestants[5] = new Person("Bobby" , "Fisher" , 61);
		
		Person p1 = new Person("Bobby" , "Fisher" , 61);
		System.out.println("Sorting by age:");
		Arrays.sort(contestants , new AgeComparator2(false));		
		for(Person p : contestants)
			System.out.println("    "+p);
		
		System.out.println("Sorting by last name:");
		Arrays.sort(contestants);		
		for(Person p : contestants)
			System.out.println("    "+p);
		
		System.out.println("The Hascode for p1 is: "+p1.hashCode());
	}

}
