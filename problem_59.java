package javaProblem;
import java.util.Scanner;

public class problem_59 {

	public static void main(String[] args) {
// Write a program to input angles of a triangle 
// and check whether triangle is vaild or not

		 Scanner in = new Scanner(System.in);

	        System.out.print("Enter the first angle: ");
	        int angle1 = in.nextInt();

	        System.out.print("Enter the second angle: ");
	        int angle2 = in.nextInt();

	        System.out.print("Enter the third angle: ");
	        int angle3 = in.nextInt();

	        int angleSum = angle1 + angle2 + angle3;

	        if (angleSum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
	            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
	                System.out.println("Acute-angled Triangle");
	            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
	                System.out.println("Right-angled Triangle");
	            } else {
	                System.out.println("Obtuse-angled Triangle");
	            }
	        } else {
	            System.out.println("Triangle is not possible");
	        }
		
		
	}

}
