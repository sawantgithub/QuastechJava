package javaProblem;

import java.util.Scanner;

public class problem_25 {

	public static void main(String[] args) {
	// Write a program to reverse the given Digits
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer (n): ");
		int num = scanner.nextInt();
//		int num = 1234567; // Replace with your desired number
        int reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);

	}

}
