package javaProblem;

public class problem_37 {

	public static void main(String[] args) {
//Write a program to print all armstrong numbers between 1 to 1000

		int number, n, total = 0;
		System.out.println("Armstrong numbers between 1 to 1000:");
		for (int a = 1; a <= 1000; a++) {
			number = a;
			while (number > 0) {
				n = number % 10;
				total = total + (n * n * n);
				number = number / 10;
			}
			if (total == a) {
				System.out.print(a + " ");
			}
			total = 0;
		}

	}

}
