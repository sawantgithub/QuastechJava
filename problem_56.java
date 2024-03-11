package javaProblem;
import java.util.Scanner;

public class problem_56 {

	public static void main(String[] args) {
// Write a program to check whether a character is uppercase or lowercase alphabet

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a character:");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an UpperCase character");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a LowerCase character");
		} else {
			System.out.println(ch + " is not an alphabetic character");
		}
	}

}
