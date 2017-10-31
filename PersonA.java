// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Comparator;
public class PersonA {
	private String firstName;
	private String lastName;
	private int age;
	public PersonA(String fname , String lname, int years){
		firstName = fname;
		lastName = lname;
		age = years;
	}
	
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public int getAge(){return age;}
	
	public String toString(){
		return firstName + " " + lastName + ", age " + age;
	}
	
	public int compareTo(Object other){
		String name = getLastName().toUpperCase() + " "
				    + getFirstName().toUpperCase();
		PersonA otherPerson = (PersonA)other;
		String otherName = otherPerson.getLastName().toUpperCase() + " "
				         + otherPerson.getFirstName().toUpperCase();
		return name.compareTo(otherName);
	}
	
	public static Comparator AgeComparator = new Comparator(){
		public int compare(Object obj1 , Object obj2){
			return ((PersonA)obj1).getAge() - ((PersonA)obj2).getAge();
		}
	}; // That is an inner class
}
