package bubbleSortAndBinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		System.out.println("Please enter the length of array");
		Scanner inputData = new Scanner(System.in);
		int k = inputData.nextInt();

		int[] arrayForSort = new int[k];
		
		System.out.println("Please enter " + k + " integer numbers for sorting.");
		for (int i = 0; i < arrayForSort.length; i++)
			    {			        
			        arrayForSort[i] = inputData.nextInt();
			    }

		int[] SortedArray = UtilMethods.bubbleSort(arrayForSort);
		
		System.out.println("Please enter element for searching in sorted array");
		int p = inputData.nextInt();
		
		inputData.close();
		
		int position = UtilMethods.binarySearch(SortedArray, p, 0, (SortedArray.length-1));
		if (position != -1){
			System.out.print("Element " + p + " in " + Arrays.toString(SortedArray) + " has posotoin # " + position);
		}	
	}
}
