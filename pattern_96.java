package Pattern;

public class pattern_96 {

	public static void main(String[] args) {
	// 	*****
//		*   *
//		*****
//		*   *
//		*   *

		
		int rows = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for columns
            for (int j = 1; j <= rows; j++) {
                if ((i == 2 || i == 4 || i == 5) && (j == 2 || j == 3 || j == 4)) {
                    // For the second, fourth, and fifth rows, print spaces in the first and last columns
                    System.out.print(" ");
                } else {
                    // Print asterisks for other positions
                    System.out.print("*");
                }
            }

            // Move to the next line after printing each row
            System.out.println();
        }
	}

}
