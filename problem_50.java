package javaProblem;
import java.util.Scanner;

public class problem_50 {

	public static void main(String[] args) {
// Write a program to check whether a number is divided by 5 and 11 or not
	
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number to check whether it is divisible by 5 and 11: ");
        int number = sc.nextInt();

        if ((number % 5 == 0) && (number % 11 == 0)) {
            System.out.println("\nGiven number " + number + " is divisible by 5 and 11.");
        } else {
            System.out.println("\nGiven number " + number + " is not divisible by 5 and 11.");
        }
	}

}
