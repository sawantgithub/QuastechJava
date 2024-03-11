package javaProblem;
import java.io.*;

public class problem_41 {
	public static boolean isPalindrome(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
	}

	public static void main(String[] args) {
// Write a program to check given string is a palindrome or not
		String input = "geeks";
		input = input.toLowerCase(); // Convert to lowercase for case-insensitive comparison
		boolean result = isPalindrome(input);
		System.out.println(result); // Output: false
	}

}
