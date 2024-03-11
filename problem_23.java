package javaProblem;

import java.util.Scanner;

public class problem_23 {

	public static void main(String[] args) {
// Write a program to find the Factorial Value of any number
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer (n): ");
		int number = scanner.nextInt();
//		int number = 5; // Replace with the desired number
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }

	}


