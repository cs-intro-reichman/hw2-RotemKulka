// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		for (int i=1; i<=n; i++){
			int x = i;
			int count = 1;
			if (mode.equals("v")) {System.out.print(x + " ");}
			do {
			if (x%2 == 0){
			x=x/2;
			} else {
			x=(x*3)+1;
			}
			if (mode.equals("v")) {System.out.print(x + " ");}
			count++;
			} while (x>1);
			if (mode.equals("v")) {
				System.out.print("(" + count + ")" );
				System.out.println();
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
