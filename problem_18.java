package javaProblem;

public class problem_18 {

	public static void main(String[] args) {
// Write a program to find sum of all odd numbers between 1 to 100

		int number = 100;
		System.out.print("List of even numbers from 1 to " + number + ": ");
		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}

		}

	}

}
