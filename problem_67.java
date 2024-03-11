package javaProblem;

import java.util.Scanner;

public class problem_67 {

	public static void main(String[] args) {
// Given the Length and Breadth of rectangle write 
//  a program to find whether the area of the reactangle is greater than its 
//  perimeter for example the area of the rectangle with lenght =5
//  and breath = 4 is greater than its perimeter

		Scanner scanner = new Scanner(System.in);

		// Input length and breadth of the rectangle
		System.out.print("Enter length of the rectangle: ");
		double length = scanner.nextDouble();

		System.out.print("Enter breadth of the rectangle: ");
		double breadth = scanner.nextDouble();

		// Calculate area and perimeter
		double area = length * breadth;
		double perimeter = 2 * (length + breadth);

		// Check if area is greater than perimeter
		boolean isAreaGreaterThanPerimeter = area > perimeter;

		// Display the result
		System.out.println("Area of the rectangle: " + area);
		System.out.println("Perimeter of the rectangle: " + perimeter);
		if (isAreaGreaterThanPerimeter) {
			System.out.println("The area of the rectangle is greater than its perimeter.");
		} else {
			System.out.println("The area of the rectangle is not greater than its perimeter.");
		}

		scanner.close();

	}

}
