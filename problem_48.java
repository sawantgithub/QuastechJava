package javaProblem;

public class problem_48 {

	public static void main(String[] args) {
// Write a program to find maximum Between three number
		double n1 = -4.5, n2 = 3.9, n3 = 2.5;
        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");
        else
            System.out.println(n3 + " is the largest number.");
	}

}
