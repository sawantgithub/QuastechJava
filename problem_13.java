package javaProblem;
import java.util.Scanner;

public class problem_13 {

	public static void main(String[] args) {
		// Write a program to print multiplication tables

		// number n for which we have to print the
		// multiplication table.
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Please Enter any Number: ");
	        int N = sc.nextInt();

		// looping from 1 to 10 to print the multiplication
		// table of the number.
		// using for loop
		for (int i = 1; i <= 10; i++) {
			// printing the N*i,ie ith multiple of N.
			System.out.println(N + " * " + i + " = " + N * i);
		}

	}

}
