package javaProblem;
import java.util.Scanner;

public class problem_47 {

	public static void main(String[] args) {
// Write a program to find maximum Between two number
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second integer number: ");
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is maximum among the two.");
        else
            System.out.println(num2 + " is maximum among the two.");
	}

}
