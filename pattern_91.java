package Pattern;

public class pattern_91 {

	public static void main(String[] args) {
//		//      *
//             **
//            ***
//           ****
//          *****
		
	      int rows = 5;

	        for (int i = 0; i < rows; i++) {
	            // Print spaces for indentation
	            for (int k = 0; k < rows - i - 1; k++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 0; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
