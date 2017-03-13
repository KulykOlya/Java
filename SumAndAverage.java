package additionalTasks;

public class SumAndAverage {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++){
			sum += i;
			}
		
		System.out.println("Sum of numbers from 1 to 100 = " + sum);
		
		double avg = (double) sum/100.0;
		System.out.println("Average of numbers from 1 to 100 = " + avg);
		
	}

}
