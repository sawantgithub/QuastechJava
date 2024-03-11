package javaProblem;

public class problem_34 {

	public static void main(String[] args) {
// Write a program to print all Strong number 1 t0 100000
		for (int i = 1; i <= 100000; i++) {
			if (isItStrong(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean isItStrong(int num) {
		int originalNumber = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += factorial(digit);
			num /= 10;
		}
		return sum == originalNumber;
	}

	static int factorial(int digit) {
		int fact = 1;
		for (int j = digit; j > 1; j--) {
			fact *= j;
		}
		return fact;
	}
}
