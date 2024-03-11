package javaProblem;

import java.util.Scanner;

public class problem_66 {

	public static void main(String[] args) {
// Find the absolute value of anumber entered through the keyboard.
		Scanner scanner = new Scanner(System.in);

		// Input a number
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();

		// Calculate the absolute value
		double absoluteValue = Math.abs(number);

		// Display the absolute value
		System.out.println("Absolute value of " + number + " is: " + absoluteValue);

		scanner.close();
	}

}
