package javaProblem;
import java.util.Scanner;

public class problem_46 {

	public static void main(String[] args) {
// Write java program to find the (LCM)Lowest Common Multiple

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		int lcm = calculateLCM(num1, num2);

		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

		scanner.close();
	}

	public static int calculateLCM(int a, int b) {
		return (a * b) / calculateGCD(a, b);
	}

	public static int calculateGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
