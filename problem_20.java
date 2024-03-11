package javaProblem;
import java.util.Scanner;

public class problem_20 {

	public static void main(String[] args) {
// Write a program to find sum of all even numbers between 1 to n
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number (n): ");
		int number = sc.nextInt();
		int evenSum = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}

		System.out.println("\nThe sum of even numbers from 1 to " + number + " is: " + evenSum);
	}

}
