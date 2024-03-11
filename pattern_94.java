package Pattern;

public class pattern_94 {

	public static void main(String[] args) {
//		//  ABA
//		   ABCBA
//		  ABCDCBA
//		 ABCDEDCBA
//		ABCDEFEDCBA

		 int rows = 6;
	        char startChar = 'A';

	        for (int i = 1; i < rows; i++) {
	            // Print spaces for indentation
	            for (int k = 0; k < rows - i - 1; k++) {
	                System.out.print(" ");
	            }

	            // Print characters in increasing order
	            for (int j = 0; j <= i; j++) {
	                System.out.print((char)(startChar + j));
	            }

	            // Print characters in decreasing order
	            for (int j = i - 1; j >= 0; j--) {
	                System.out.print((char)(startChar + j));
	            }

	            System.out.println();
	        }
	}

}
