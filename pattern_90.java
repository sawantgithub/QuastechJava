package Pattern;

public class pattern_90 {

	public static void main(String[] args) {
//		// 123456789
//		    1234567
//		     12345
//		      123
//		       1
		
		 int rows = 5;

	        for (int i = rows; i >= 1; i--) {
	            // Print spaces for indentation
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print(" ");
	            }

	            // Print numbers in each row
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	}

}
