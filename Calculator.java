package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
	System.out.println("Please enter two double numbers for calculating");
	
	Scanner inputData = new Scanner(System.in);
	double a = inputData.nextDouble();
	double b = inputData.nextDouble();
	
	System.out.println("Please choose the number of operation.\n 1.a+b;\n 2.a-b;\n 3.a*b;\n 4.a/b");
	
	int op = inputData.nextInt();
	inputData.close();
	
	double result;
	switch (op) {
		case 1:  result = UtilCalculator.add(a, b);
			 	break;
		case 2:  result = UtilCalculator.sub(a, b);
             	break;
		case 3:  result = UtilCalculator.mult(a, b);
				break;
		case 4:  result = UtilCalculator.div(a, b);
             	break;
		default: result = -1.0;
             break;
	}
	
	if (result == -1.0){
		System.out.println("Error with choosing the operation.");
		return;
		}
	
	if (b == 0 & op == 4){
		System.out.println("Divide by 0 error");
		return;
		}
	
	System.out.println("Result: " + result);
	}
	
}