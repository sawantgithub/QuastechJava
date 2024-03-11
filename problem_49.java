package javaProblem;

public class problem_49 {

	public static void main(String[] args) {
//	Write a program to check whether a number is negative positive or zero
		
		 // Number to be checked
        int num = 912;

        // Check if the number is greater than 0
        if (num > 0) {
            System.out.println("The number is positive.");
        }
        // Check if the number is less than 0
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
        // Execute when the above two conditions return false
        else {
            System.out.println("The number is zero.");
        }

	}

}
