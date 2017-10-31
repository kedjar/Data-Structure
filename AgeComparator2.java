// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None
public class AgeComparator2 implements java.util.Comparator {
	private boolean ascending;
	
	public AgeComparator2(){ascending = true;}
	public AgeComparator2(boolean a){ascending = a;}
	
	public int compare(Object obj1 , Object obj2){
		int d = ((Person)obj1).getAge() - ((Person)obj2).getAge();
		if(!ascending) d = -d;
		return d;
	}
}
