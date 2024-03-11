package Pattern;

public class pattern_84 {

	public static void main(String[] args) {
//		// 1
//		  1 2
//		 1 2 3
//		1 2 3 4
//	   1 2 3 4 5
		
		 int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces for alignment
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print(" ");
	            }

	            // Print numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	                if (j != i) {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	}

}
