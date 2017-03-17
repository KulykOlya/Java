package calculator;

public class UtilCalculator {
	
	public static double check(double op){
		if (op < 1 || op > 4){
		System.out.println("Incorrect number of operation. Please, ignore the Result");}
		return -1.0;}
	
	public static double add(double a, double b){
		 return a+b;}
	
	public static double sub(double a, double b){
		return a-b;}
	
	public static double mult(double a, double b){
		return a*b;}
	
	public static double div(double a, double b){
		if (b == 0){
			System.out.println("Divide by 0 error. Please, ignore the Result");
			}
		return a/b;}
}
