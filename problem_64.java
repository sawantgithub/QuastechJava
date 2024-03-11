package javaProblem;
import java.util.Scanner;

public class problem_64 {

	public static void main(String[] args) {
// Write a program to input basic salary of an employee and calculate
// its Gross salary according to following
// Basic Salary <=10000: HRA = 20%,DA =80%
// Basic Salary <=20000: HRA = 25%,DA =90%		
// Basic Salary >20000: HRA = 30%,DA =95%
		
		Scanner scanner = new Scanner(System.in);

        // Input basic salary
        System.out.print("Enter basic salary of the employee: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA and DA based on basic salary
        double hra, da;
        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.30 * basicSalary;
            da = 0.95 * basicSalary;
        }

        // Calculate gross salary
        double grossSalary = basicSalary + hra + da;

        // Display the gross salary
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
		
	}

}
