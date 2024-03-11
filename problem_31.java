package javaProblem;

public class problem_31 {

	public static void main(String[] args) {
//	Write a program to find number and 
//	sum of all integer between 100 and 200 which are divisible by 9
		int sum = 0; // Initialize the sum to 0

		System.out.println("Numbers between 100 and 200, divisible by 9:");
		for (int i = 101; i < 200; i++) {
			if (i % 9 == 0) {
				System.out.print(i + " "); // Print the number
				sum += i; // Add the divisible number to the sum
			}

		}

	}
}
