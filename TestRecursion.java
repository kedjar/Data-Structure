// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: 
// Place: At home
// Known Bugs: None

import java.io.Serializable;
import java.util.ArrayList;


public class TestRecursion {

	/**
	 * @param args
	 */
	static int numberCalls;
	public static void main(String[] args) {
		int n = 3;
		System.out.printf("factorial(%d) = %d \n" , n, fact(n));
		
		numberCalls = 0;
		String s = "abc";
		System.out.printf("The reverse of %s is %s\n", s , reverse(s));		
			
		System.out.printf("The reverse (without recursion) of %s is %s\n", s , reverseWithoutRecursion(s));
		
		numberCalls = 0;
		double x = 2.0;
		int m = 50;
		System.out.printf("%5.0f ^ %d = %5.0f \n", x , m , pow(x , m));
		
		numberCalls = 0;
		System.out.println("Recursion with lists:");
		recursionArrayList();
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.printf("permuations of %s are: \n", sb);
		permutations(sb , 3);		
	}
	
	static int fact(int n){
		numberCalls++;
		System.out.println("Number Calls: "+numberCalls);
		int product;
		if(n <= 1){
			return 1;
		}
		product = n * fact(n - 1);
		return product;
	}
	
	static String reverse(String s){
		numberCalls++;
		System.out.println("Number Calls: "+numberCalls);
		if(s.length() < 2){
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	static String reverseWithoutRecursion(String s){
		String r = "";
		for(int i = s.length() - 1; i >= 0; i--){
			r += s.charAt(i);
		}
		return r;
	}
	
	static double pow(double x, int n){
		numberCalls++;
		System.out.println("Number Calls: "+numberCalls);
		
		if(n == 0)
			return 1.0;
		double y = pow(x , n / 2);
		y *= y;
		if(n % 2 != 0)
			y *= x;
		return y;
	}
	
	static void recursionArrayList(){
		numberCalls++;
		System.out.println("Number Calls: "+numberCalls);
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apples");
		fruits.add("bananas");
		
		ArrayList<String> snacks = new ArrayList<String>();
		snacks.add("chips");
		snacks.add("pretzels");
		
		ArrayList<Serializable> food = new ArrayList<Serializable>();
		food.add("Fruits");
		food.add(fruits);
		food.add("Snacks");
		food.add(snacks);
		
		System.out.println(food);
	}
	
	static void permutations(StringBuffer str , int n)
	{
		if(n <= 1)
			System.out.println(str);
		else{
			for(int i = 0; i < n ; i++){
				swap(str , i , n-1);
				permutations(str , n-1);
				swap(str, n - 1, i);				
			}
		}			
	}

	private static void swap(StringBuffer str, int i, int j) {
		char c1 = str.charAt(i);
		char c2 = str.charAt(j);
		str.setCharAt(i , c2);
		str.setCharAt(j , c1);		
	}
	
	static long fibonnaci(int n){
		if(n < 2)
			return 1;
		else
			return fibonnaci(n - 2) + fibonnaci(n - 1);
	}
	
	static long fibonnaciWithoutRecursion(int n){
		long f1 = 1;
		long f2 = 1;
		long next;
		while(n > 2){
			next = f1 + f2;
			f1 = f2;
			f2 = next;
			n--;
		}
		return f2;
		
	}
	
	

}
