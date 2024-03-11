package javaProblem;
import java.util.Scanner;

public class problem_65 {

	public static void main(String[] args) {
//A five-digit number is entered through the keyboard write a 
//  program to obtain the reversed number and to determine whether
//  the original and reversed numbers are equal or not

  Scanner scanner = new Scanner(System.in);

  // Input a five-digit number
  System.out.print("Enter a five-digit number: ");
  int number = scanner.nextInt();

  // Calculate the reversed number
  int reversedNumber = reverseNumber(number);

  // Check if the original and reversed numbers are equal
  boolean isEqual = number == reversedNumber;

  // Display the original and reversed numbers and the result of equality check
  System.out.println("Original number: " + number);
  System.out.println("Reversed number: " + reversedNumber);
  System.out.println("Original and reversed numbers are" + (isEqual ? " " : " not ") + "equal.");

  scanner.close();
}

// Method to reverse a number
public static int reverseNumber(int number) {
  int reversedNumber = 0;
  while (number != 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number /= 10;
  }
  return reversedNumber;
  
	}

}
