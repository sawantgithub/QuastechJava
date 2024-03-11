package javaProblem;

public class problem_53 {

	public static void main(String[] args) {
// Write a program to check whether a character is alphabet or no
 
		char c = '*';
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

	}

}
