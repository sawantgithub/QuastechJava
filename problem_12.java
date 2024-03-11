package javaProblem;
import java.util.Scanner;

public class problem_12 {

	public static void main(String[] args) {
	// Write a program to print all natural number in reverse.
		int number, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();	
		
		for(i = number; i >= 1; i--)
		{
			System.out.print(i +" "); 
		}	

	}

}
