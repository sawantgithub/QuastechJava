package javaProblem;

import java.util.Scanner;

public class problem_51 {

	public static void main(String[] args) {
// write a program to check whether a number is even or odd
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = reader.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

	}

}
