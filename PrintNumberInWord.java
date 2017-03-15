package additionalTasks;

import java.util.Scanner;

public class PrintNumberInWord {
	
	public static void main(String[] args) {

		System.out.println("Please enter integer number from 0 to 9");
	
		Scanner inputData = new Scanner(System.in);
		int number = inputData.nextInt();
		inputData.close();
	
		String numberString;
		switch (number) {
    		case 0:  numberString = "Zero";
    			 	break;
    		case 1:  numberString = "One";
                 	break;
    		case 2:  numberString = "Two";
    				break;
    		case 3:  numberString = "Tree";
                 	break;
    		case 4:  numberString = "Four";
                 	break;
    		case 5:  numberString = "Five";
                 	break;
    		case 6:  numberString = "Six";
                 	break;
    		case 7:  numberString = "Seven";
                 	break;
    		case 8:  numberString = "Eight";
                 	break;
    		case 9:  numberString = "Nine";
                 	break;
    		default: numberString = "Your number isn't integer or outside 0-9";
                 break;
    }
    
    System.out.println(numberString);
	}
}
