package javaProblem;
import java.util.Scanner;

public class problem_63 {

	public static void main(String[] args) {
//// write a program to input marks of five subjects physics,
// chemistry,biology,mathematics and computer calculate 
// percentage and grade according to following:
//	 percentage > = 90:Grade A
//	 percentage > = 80:Grade B
//	 percentage > = 70:Grade C
//	 percentage > = 60:Grade D
//	 percentage > = 40:Grade E
//	 percentage < 40:Grade F
		
		Scanner scanner = new Scanner(System.in);

        // Input marks of five subjects
        System.out.println("Enter marks of five subjects (Physics, Chemistry, Biology, Mathematics, Computer):");
        System.out.print("Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Biology: ");
        int biology = scanner.nextInt();
        System.out.print("Mathematics: ");
        int mathematics = scanner.nextInt();
        System.out.print("Computer: ");
        int computer = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (double) totalMarks / 5;

        // Determine grade based on percentage
        char grade = calculateGrade(percentage);

        // Display result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Method to calculate grade based on percentage
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'F';
        }
	}

}
