package javaProblem;

import java.util.Scanner;

public class problem_60 {

	public static void main(String[] args) {
// Write a program to input all sides of triangle and 
//		check whether triangle is vaild or not 

		Scanner scanner = new Scanner(System.in);

		// Input sides of the triangle
		System.out.println("Enter the lengths of the sides of the triangle:");
		System.out.print("Side 1: ");
		double side1 = scanner.nextDouble();
		System.out.print("Side 2: ");
		double side2 = scanner.nextDouble();
		System.out.print("Side 3: ");
		double side3 = scanner.nextDouble();

		// Check if the triangle is valid
		boolean isValid = checkTriangleValidity(side1, side2, side3);

		if (isValid) {
			System.out.println("Triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is valid.");
		} else {
			System.out.println("Triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is not valid.");
		}

		scanner.close();
	}

	// Method to check triangle validity
	public static boolean checkTriangleValidity(double side1, double side2, double side3) {
		// Triangle inequality theorem states that sum of any two sides must be greater
		// than the third side for a triangle to be valid
		return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
	}

}
