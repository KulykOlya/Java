package additionalTasks;

public class HarmonicSum {
	
	public static void main(String[] args) {
		
		double harmonic = 0.0;
		
		for(int i = 1; i <= 5000; i++){
			harmonic += (double) 1/i;
		}
		
		System.out.println("Harmonic = " + harmonic);
	}

}
