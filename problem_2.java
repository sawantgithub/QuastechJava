package javaProblem;
import java.util.Scanner;

public class problem_2 {

	public static void main(String[] args) {
//		Bulid a program that prompts the user
//		to enter a character is vowel or a consonant 
//		and display the result.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is consonant");

	}

}
