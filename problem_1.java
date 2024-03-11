package javaProblem;
import java.util.Scanner;

public class problem_1 {

	public static void main(String[] args) {
//	 1. Create a simple Calculator Program that takes
//		two number and an operator(+,-,*,/) as input.
//		Perform the corresponding operation and 
//		display the result.if an invalid operator
//		is entered print an error message.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second Number: ");
		double num2= sc.nextDouble();
		
		System.out.println("Enter Operator(+,-,*,/): ");
		char operator = sc.next().charAt(0);
		
		double result;
	
		
		if( operator=='+') {
			result = num1+num2;
		}
		 else if ( operator=='-') {
			 result = num1-num2;
		}
		 else if ( operator=='*') {
			 result = num1*num2;
		}
		 else if ( operator=='/') {
		     if (num2 != 0) {
	                result = num1 / num2;
	            } else {
	                System.out.println("Error: Division by zero!");
	                return;
	            }
		}
		 else {
			 System.out.println("Error");
			 return;
		 }
        // Display the result
        System.out.println("Result: " + result);

        sc.close();
		
		

	}

}
