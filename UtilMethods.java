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
		
	     if (high < low || k < a[low] || k > a[high]){
	    	 System.out.println("Element not found");
	    	 return -1;
	     }
	     
	     int mid = (low + high)/2;
	     
	     if (a[mid] == k){
	    	 return mid;
	     }
	     else if(a[mid] > k){
	    	 return binarySearch(a, k, low, mid -1);
	    	 }
	     else if (a[mid] < k){
	    	 return binarySearch(a, k, mid + 1, high);
	     }
	     
	     return -1;
	} 
	

}
