package javaProblem;

public class problem_45 {

	public static void main(String[] args) {
// Write java program to find the (GCD)Greatest Common Divisor
		int x = 12, y = 8, gcd = 1;

		// Running loop from 1 to the smallest of both numbers
		for (int i = 1; i <= x && i <= y; i++) {
			// Check if both conditions are satisfied
			if (x % i == 0 && y % i == 0)
				gcd = i; // Store the value of i in the variable gcd
		}

		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
	}

}
