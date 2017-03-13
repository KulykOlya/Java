package bubbleSortAndBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("Please enter the length of array");
		Scanner inputArray = new Scanner(System.in);
		int k = inputArray.nextInt();
		
		int[] arrayForSort = new int[k];
		System.out.println("Please enter " + k + " integer numbers for sorting.");
		for (int i = 0; i < arrayForSort.length; i++)
			    {			        
			        arrayForSort[i] = inputArray.nextInt();
			    }
		inputArray.close();
		
		System.out.println("Sorted array: " + Arrays.toString(UtilMethods.bubbleSort(arrayForSort)));
	}
}