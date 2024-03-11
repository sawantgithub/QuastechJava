package Pattern;

public class pattern_88 {

	public static void main(String[] args) {
//		//  1
//		   121
//		  12321
//		 1234321
//		123454321
		
		int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

	}

}
