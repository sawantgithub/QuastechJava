package javaProblem;

public class problem_39 {

	public static void main(String[] args) {
// Write a program to check Prime number or not
		int num = 29; // Replace with the number you want to check

		boolean isPrime = true;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

}
