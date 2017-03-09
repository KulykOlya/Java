package bubbleSortAndBinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

	public void main(String[] args) {
		
		System.out.println("Sorted array: \n" + Arrays.toString(bubbleSort(readInputData())));
	}
		
	
	public int[] readInputData(){
		
		System.out.println("Please enter the length of array, you would like to sort");
		
		Scanner inputlength = new Scanner(System.in);
		int k = inputlength.nextInt();
		
		
		int[] arrayForSort = new int[k];
		
		System.out.println("Please enter " + k + " integer numbers for sorting.");
		
		Scanner inputdata = new Scanner(System.in);
		
		for (int i = 0; i < arrayForSort.length; i++)
			    {			        
			        arrayForSort[i] = inputdata.nextInt();
			    }
		inputlength.close();
		inputdata.close();
		return arrayForSort;
	}
	
	public  int[] bubbleSort(int[] a){
			
		int k;
		
			for (int i = 0; i < a.length; i++)
		    {
				for (int j = a.length-1; j > i; j-- )
			    {
					if (a[j] < a[j-1])
					{
						k = a[j];
						a[j] = a[j-1];
						a[j-1] = k;
					}
			    } 
		    }
			return a;
			
	}	
}
		
		
		
		
		
	


