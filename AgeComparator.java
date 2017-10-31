// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None
public class AgeComparator implements java.util.Comparator{
	public int compare(Object obj1 , Object obj2){
		return ((Person)obj1).getAge() - ((Person)obj2).getAge();
	}
}
