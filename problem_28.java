package javaProblem;
import java.util.Scanner;
public class problem_28 {

	public static void main(String[] args) {
		// Write a program to calculate  Highest Common Factor (HCF)  HCF of Two given number
		long n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        n1 = sc.nextLong();
        System.out.println("Enter number 2:");
        n2 = sc.nextLong();
        long result = hcfCal(n1, n2);
        System.out.println("HCF of two numbers: " + result);
    }

    static long hcfCal(long a, long b) {
        long temp;
        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
	}


