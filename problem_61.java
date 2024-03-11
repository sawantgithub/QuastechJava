package javaProblem;
import java.util.Scanner;

public class problem_61 {

	public static void main(String[] args) {
//	write a program to find all roots of a quadratic equation
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of a:");
		double a = scanner.nextDouble();

		System.out.println("Enter the value of b:");
		double b = scanner.nextDouble();

		System.out.println("Enter the value of c:");
		double c = scanner.nextDouble();

		scanner.close();

		double determinant = (b * b) - (4 * a * c);

		if (determinant > 0) {
			// Two real and distinct roots
			double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("Root 1 = %.2f and Root 2 = %.2f%n", root1, root2);
		} else if (determinant == 0) {
			// Two real and equal roots
			double root = -b / (2 * a);
			System.out.format("Root 1 = Root 2 = %.2f%n", root);
		} else {
			// Complex roots
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
			System.out.format("Root 1 = %.2f + %.2fi%n", realPart, imaginaryPart);
			System.out.format("Root 2 = %.2f - %.2fi%n", realPart, imaginaryPart);
		}

	}

}
