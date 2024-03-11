package javaProblem;
import java.util.Scanner;

public class problem_58 {

	public static void main(String[] args) {
//Write a program to input month number and print month name
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter month number
	        System.out.print("Enter month number (1-12): ");
	        int monthNumber = scanner.nextInt();

	        // Check if the entered month number is valid
	        if (monthNumber < 1 || monthNumber > 12) {
	            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
	        } else {
	            // Print the corresponding month name
	            String monthName = getMonthName(monthNumber);
	            System.out.println("Month name for " + monthNumber + " is: " + monthName);
	        }

	        scanner.close();
	    }

	    // Method to get month name based on month number
	    public static String getMonthName(int monthNumber) {
	        switch (monthNumber) {
	            case 1:
	                return "January";
	            case 2:
	                return "February";
	            case 3:
	                return "March";
	            case 4:
	                return "April";
	            case 5:
	                return "May";
	            case 6:
	                return "June";
	            case 7:
	                return "July";
	            case 8:
	                return "August";
	            case 9:
	                return "September";
	            case 10:
	                return "October";
	            case 11:
	                return "November";
	            case 12:
	                return "December";
	            default:
	                return "Invalid Month";
	        }
		
	}

}
