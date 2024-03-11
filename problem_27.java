package javaProblem;

import java.util.Scanner;

public class problem_27 {

	public static void main(String[] args) {
// Write a program to check whether a given number is prime or not
		int number; // Replace with your desired number
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
	     number = sc.nextInt(); 

		boolean isPrime = true;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}

}
