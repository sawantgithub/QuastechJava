package Pattern;

public class pattern_86 {

	public static void main(String[] args) {
//		//  1
//		   2 1
//		  3 2 1
//		 4 3 2 1
//		5 4 3 2 1
		
		  int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces for alignment
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print(" ");
	            }

	            // Print numbers in each row
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	}

}
