package javaProblem;

public class problem_3 {

	static int sum() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0; // initialize sum
		int i;

		// Iterate through all elements and add them to sum
		for (i = 0; i < array.length; i++)
			sum += array[i];

		return sum;
	}

	public static void main(String[] args) {
		// Write a program to sum of element in an array.

		{
	System.out.println("Sum of given array is " + sum());
		}

	}
}
