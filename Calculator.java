package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	double a;
	double b;
	double result;
	int op;
	
	
	System.out.println("Please enter two double numbers for calculating");
	
	Scanner inputData = new Scanner(System.in);
	a = inputData.nextDouble();
	b = inputData.nextDouble();
	
	System.out.println("Please choose the number of operation.\n 1.a+b;\n 2.a-b;\n 3.a*b;\n 4.a/b");
	
	op = inputData.nextInt();
	inputData.close();
	
	switch (op) {
		case 1:  result = UtilCalculator.add(a, b);
		break;
		case 2:  result = UtilCalculator.sub(a, b);
             	break;
		case 3:  result = UtilCalculator.mult(a, b);
		break;
		case 4:  result = UtilCalculator.div(a, b);
             	break;
		default: result =UtilCalculator.check(op);
		break;}
	
	System.out.println("Result: " + result);
}}
