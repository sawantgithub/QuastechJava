package javaProblem;

import java.util.Arrays;

public class problem_10 {

	public static void main(String[] args) {
//      Write a program that finds the common
//		elements between two arrays and prints them
			
// Declare and initialize two integer arrays, array1 and array2.
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };

		// Print the original contents of array1 and array2.
		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));

		// Iterate through both arrays to find and print common elements.
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				// Check if elements in array1 and array2 are equal.
				if (array1[i] == (array2[j])) {
					// Print the common element.
					System.out.println("Common element is : " + (array1[i]));
				}
			}
		}
	}
}