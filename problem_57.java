package javaProblem;
import java.util.Scanner;

public class problem_57 {

	public static void main(String[] args) {
//Write a program to input week numbrt and print Week day

		 System.out.println("Print week name for given week in Java");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter a Week number (1-7):");
	        int num = sc.nextInt();

	        if (num == 1)
	            System.out.println("Sunday");
	        else if (num == 2)
	            System.out.println("Monday");
	        else if (num == 3)
	            System.out.println("Tuesday");
	        else if (num == 4)
	            System.out.println("Wednesday");
	        else if (num == 5)
	            System.out.println("Thursday");
	        else if (num == 6)
	            System.out.println("Friday");
	        else if (num == 7)
	            System.out.println("Saturday");
	        else
	            System.out.println("Please enter a valid number between 1 and 7.");	
	}

}
