// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class Employee {
	private double salary;
	private String id;
	
	public Employee(double aSalary , String aID){
		salary = aSalary;
		id = aID;
	}
	
	public double getSalary(){return salary;}
	public String getID(){return id;}
	public String toString(){
		return "Employee[salary = " +salary + ", ID = " +id +"]" ;
	}
}
