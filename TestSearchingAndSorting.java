// Author: M'Hand KEDJAR
// Date: March, 2012 
// Course: Data Structures and Algorithms - Winter 2012 - CCCS-315-761
// Description: This class implements some searching and sorting algorithms
// Place: At home
// Known Bugs: None

import java.util.Arrays;


public class TestSearchingAndSorting {
	
	static final int COUNT = 100;
	static final int MAX_RAND = 100;
	public static void main(String[] args) {
		
		int[] array = new int[COUNT];
		for (int i = 0; i<COUNT; i++) {
			int n = (int) (Math.random()*MAX_RAND )+ 1;
			//System.out.println("n = "+n);
			array[i] = n;
		}
		
		System.out.println("Sequential Search: " 
				 +sequentialSearch(array , 10));
		
		int array_c[] = array;
		Arrays.sort(array_c);
		System.out.println("Sequential Search: " 
				 +sequentialSearch( array_c, 10));
	}
	
	public static int sequentialSearch(int[] dat , int value){
		for(int i = 0; i < dat.length; i++){
			if(value == (dat[i]))
				return i;
		}
		return -1;
	}
	
	// dat[] should be sorted.
	public int binarySearch(int[] dat , int value , int left , int right){
		if(right < left)
			return -1;	// Not found
		int middle = (left + right) / 2;
		if(value == dat[middle])
			return middle;
		else if(value < dat[middle])
			return binarySearch(dat , value , left , middle - 1);
		else // if(value > dat[middle])
			return binarySearch(dat , value , middle + 1, right);
		
	}
	
	public int binarySearch2 (int [ ] dat, int value, int left, int
			right){
			while (left <= right){
				int middle = (left + right) / 2;
				if ( value == dat[middle] )
					return middle;
				else if ( value < dat[middle] )
					right = middle - 1;
				else // if ( value > dat[middle] )
					left = middle + 1;
			}
			return -1; // Not found
	}
	
	public void selectionSort (int[ ] dat)	{
		int n = dat.length;
		while (n > 1) {
			int maxPos = 0;
			for (int k = 1; k < n; k++)
				if (dat [k] > dat [maxPos] )
					maxPos = k;
			int temp = dat [maxPos];
			dat [maxPos] = dat [n-1];
			dat [n-1] = temp;
			n--;
		}
	}
	
	public void bubbleSort (double[ ] dat) {
		int n = dat.length;
		boolean disorder = true;
		while (n > 1 && disorder) {
			disorder = false;
			for (int i = 1; i < n; i++){
				if ( dat [ i ] < dat [ i - 1 ] ) {
					double temp = dat [ i ];
					dat [ i ] = dat [ i - 1 ];
					dat [i - 1] = temp;
					disorder = true;
				}
			n--;
			}
		}	
	}
	
	public static void mergeSort(int array[],int lo, int n){
	  int low = lo;
	  int high = n;
	  if (low >= high) {
		  return;
	  }
	
	  int middle = (low + high) / 2;
	  mergeSort(array, low, middle);
	  mergeSort(array, middle + 1, high);
	  int end_low = middle;
	  int start_high = middle + 1;
	  while ((lo <= end_low) && (start_high <= high)) {
		  if (array[low] < array[start_high]) {
			  low++;
		  } else {
			  int Temp = array[start_high];
			  for (int k = start_high- 1; k >= low; k--) {
				  array[k+1] = array[k];
			  }
			  array[low] = Temp;
			  low++;
			  end_low++;
			  start_high++;
		  }
	  }
	}  
	
	int partition(int arr[], int left, int right){
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];	     

	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;

	            while (arr[j] > pivot)
	                  j--;

	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	      return i;
	}

	 

	void quickSort(int arr[], int left, int right) {

	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);

	      if (index < right)
	            quickSort(arr, index, right);

	}
}

