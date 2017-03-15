package additionalTasks;

public class ComputePI {

	public static void main(String[] args) {
		
	    double p = 1.0;
	    int k = 1;
	    for (double i=3.0; i<10000.0; i+=2)
	    {
	        if (k % 2 == 0)
	            p += (1/i);
	        else
	            p -= (1/i);
	        k += 1;
	    }
	    p *= 4;
	    System.out.println("Calculated Pi = " + p);
	    System.out.println("Math Pi = " + Math.PI);
	}
}
