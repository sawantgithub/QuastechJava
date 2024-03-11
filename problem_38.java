package javaProblem;

public class problem_38 {

	public static void main(String[] args) {
// Write a program to check armstrong number or not
		int number = 371; // Change this to the desired number
		int originalNumber, remainder, result = 0;
		originalNumber = number;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}

}
