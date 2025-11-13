// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double count = 1;
		double denominator = 1;
		for (int i=1; i<num; i++){
			denominator = denominator + 2;
			if (i%2 == 0){
				count = count + (1/denominator);
			} else {
				count = count - (1/denominator);
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4*count);
	}
}
