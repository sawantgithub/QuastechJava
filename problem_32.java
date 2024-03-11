package javaProblem;
import java.util.ArrayList;

import java.util.Scanner;

public class problem_32 {
	static String isStrong(int n) {
		// Convert the number to an array of digits
		ArrayList<Integer> digits = new ArrayList<>();
		int temp = n;

		// Loop through each digit
		while (temp != 0) {
			digits.add(0, temp % 10);
			temp /= 10;
		}

		int factorialSum = 0;

		// Calculate the factorial of each digit and add to
		// the sum
		for (int d : digits) {
			int f = 1;
			for (int i = 1; i <= d; i++) {
				f *= i;
			}
			factorialSum += f;
		}

		// Check if the sum of factorials is equal to the
		// original number
		if (factorialSum == n) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {
		// Write a program to check whether a number is a strong number or not
		// Test case
		int n = 145;

		// Displaying whether the number is strong or not
		System.out.println(isStrong(n));
	}

}
