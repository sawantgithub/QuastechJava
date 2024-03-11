package javaProblem;

import java.util.Scanner;

public class problem_21 {

	public static void main(String[] args) {
// Write a program to find sum of all odd numbers between 1 to n
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number (n): ");
		int number = sc.nextInt();
		int oddSum = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}

		System.out.println("\nThe sum of odd numbers from 1 to " + number + " is: " + oddSum);
	}

	}


