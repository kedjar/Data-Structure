// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class Person implements Comparable{
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String fname, String lname, int years){
		firstName = fname;
		lastName = lname;
		age = years;
	}
	
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public int getAge(){return age;}
	
	public int compareTo(Object other){
		String name = getLastName().toUpperCase() + " "
				    + getFirstName().toUpperCase();
		Person otherPerson = (Person)other;
		String otherName = otherPerson.getLastName().toUpperCase() + " "
				         + otherPerson.getFirstName().toUpperCase();
		return name.compareTo(otherName);
	}
	
	public String toString(){
		return firstName + " " + lastName + ", age " + age;
	}
	
	public int hashCode(){
		return getFirstName().hashCode() 
			 + getLastName().hashCode();
	}

}
