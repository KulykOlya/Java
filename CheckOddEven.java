package additionalTasks;

import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your integer number");
		
		Scanner inputData = new Scanner(System.in);
		int k = inputData.nextInt();
		inputData.close();
		
		if (k == 0){
			System.out.println("That's zero, somebody think it's Even Number, somebody exclude it");
		}
		else if (k % 2 != 0){
			System.out.println("Even Numbe");
		}else{
			System.out.println("Odd Number");
		}
		
	}

}
