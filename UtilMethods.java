package bubbleSortAndBinarySearch;

import java.util.Arrays;


public class UtilMethods {
	
	
	public static int[] bubbleSort(int[] a){
			
		int k;
			
		for (int i = 0; i < a.length; i++){
			
			for (int j = a.length-1; j > i; j-- ){
				
				if (a[j] < a[j-1]){
					k = a[j];
					a[j] = a[j-1];
					a[j-1] = k;
					}
			} 
		};
		return a;
	}
	
	
	
	public static int binarySearch(int[] a, int k, int low, int high){
		
		if (high < low)
			System.out.println("Element not found");
		
	     int mid = (low + high)/2;
	     
	     if (mid < 1 || k < a[low] || k > a[high]){
	    	 System.out.println("Element not found");
	    	 return -1;
	     }
	     else if(a[mid] > k){
	    	 binarySearch(a, k, low, mid);
	    	 }
	     else if (a[mid] < k){
	    	 binarySearch(a, k, mid, high);
	     }
	     else
	    	 System.out.print("Element " + k + " in " + Arrays.toString(a) + " has posotoin # ");
	     return mid;
	} 
	

}
