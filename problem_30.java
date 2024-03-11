package javaProblem;

import java.util.Scanner;

public class problem_30 {

	public static void main(String[] args) {
//	 Write a program to enter the number till the user wants and
//  at the end the program should display the
//	largest and smallest number entered

		Scanner scanner = new Scanner(System.in);

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		char choice;

		do {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

			// Update largest and smallest numbers if necessary
			largest = Math.max(largest, num);
			smallest = Math.min(smallest, num);

			System.out.print("Do you want to enter another number? (y/n): ");
			choice = scanner.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

		System.out.println("Largest number entered: " + largest);
		System.out.println("Smallest number entered: " + smallest);

		scanner.close();

	}

}
