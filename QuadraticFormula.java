package quadraticEquation;

import java.util.Scanner;

public class QuadraticFormula {
	
	public static void main(String[] args) {
	
	double x1;
	double x2;	
		
	System.out.println("Please input coefficients a, b, c. Use gap as delimiter." + "\n"); 
	Scanner inputdata = new Scanner(System.in);												//read input parameters
	double a = inputdata.nextDouble();
	double b = inputdata.nextDouble();
	double c = inputdata.nextDouble();
	inputdata.close();
	
	
	if (a == 0.0){
		System.out.println("Arithmetic error: division by 0\n");
		return;
	}
		
	double D = Math.sqrt(Math.pow(b, 2) - 4*a*c);											//discriminant counting
	
	if ((int)D == 0.0){																		//if D<0
		System.out.println("The equation hasn't rational solutions\n");
	} else if (D == 0.0){ 
			x1 = -b/(2*a);
			System.out.println("The equation has only one solution x = " + x1);
		} else {
			x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
			x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
			System.out.println("x1 = " + x1 + ";  " +  "x2 = " + x2);
		}		
	}
	
}