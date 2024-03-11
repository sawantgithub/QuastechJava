package javaProblem;

public class problem_35 {

	static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
// Write a program to print All perfect number 1 to 10000
		for (int i = 1; i <= 10000; i++) {
			if (isPerfectNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
