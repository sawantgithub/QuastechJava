package javaProblem;
import java.util.Scanner;
public class problem_55 {

	public static void main(String[] args) {
// Write a program to input any character 
//	and check whether it is alphabet digit or special character

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        if ((inputChar >= 65 && inputChar <= 90) || (inputChar >= 97 && inputChar <= 122)) {
            System.out.println("Alphabet");
        } else if (inputChar >= 48 && inputChar <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
		
	}

}
