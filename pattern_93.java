package Pattern;

public class pattern_93 {

	public static void main(String[] args) {
//		// *****
//		    ****
//		     ***
//		      **
//		       *
		
	       int rows = 5;

	        for (int i = 0; i < rows; i++) {
	            // Print spaces for indentation
	            for (int k = 0; k < i; k++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 0; j < rows - i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
