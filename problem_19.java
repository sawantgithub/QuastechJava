package javaProblem;
import java.util.Scanner;

public class problem_19 {

	public static void main(String[] args) {
//   Write a program to find sum of all natural number
//	 between 1 to n

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer (n): ");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			int sum = calculateSum(n);
			System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
		}

		scanner.close();
	}
	
	   public static int calculateSum(int n) {
	        // Formula for sum of first n natural numbers: n * (n + 1) / 2
	        return n * (n + 1) / 2;
	    }

}
