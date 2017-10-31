// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetTestEmployee {

	public static void main(String[] args) {
		class EmployeeComparator implements Comparator<Employee>{
			public int compare(Employee p1 , Employee p2){
				if(p1.getSalary() < p2.getSalary())
					return -1;
				if(p1.getSalary() == p2.getSalary())
					return 0;
				return 1;
			}
		}
		Comparator<Employee> comp = new EmployeeComparator();
		Set<Employee> employees = new TreeSet<Employee>(comp);
		employees.add(new Employee(250 , "Manon"));
		employees.add(new Employee(190 , "Louise"));
		employees.add(new Employee(250 , "Manon"));
		employees.add(new Employee(230 , "Julie"));
		
		Employee p1 = new Employee(230 , "Mhand");
		Employee p2 = new Employee(230 , "Lynda");
		
		for(Employee p:employees)
			System.out.println(p);
		System.out.println(comp.compare(p1, p2));
		
	}

}
