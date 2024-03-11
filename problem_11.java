package javaProblem;
import java.util.Scanner;

public class problem_11 {

	public static void main(String[] args) {
	// Write a program to print all natural number from 1 to n

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Please Enter any Number: ");
	        int number = sc.nextInt();

	        for (int i = 1; i <= number; i++) {
	            System.out.print(i + "");
	        }
		
	}

}
