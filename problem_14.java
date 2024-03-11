package javaProblem;
import java.util.Scanner;

public class problem_14 {

	public static void main(String[] args) {
// Write a program to print reverse tables
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Please Enter any Number: ");
	        int N = sc.nextInt();

		// looping from 1 to 10 to print the multiplication
		// table of the number.
		// using for loop
		for (int i = 10; i >= 1; i--) {
			// printing the N*i,ie ith multiple of N.
			System.out.println(i + " * " + N + " = " + N * i);
		}
		

	}

}
