// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

public class TestHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int hashmethod(String insertKey){
		int sum = 0;
		int HTSize = 5;
		for(int j = 0; j <= insertKey.length(); j++)
			sum += (int)(insertKey.charAt(j));
		return (sum % HTSize);
	}

}
