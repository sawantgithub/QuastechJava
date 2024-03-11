package Pattern;

public class pattern_82 {

	public static void main(String[] args) {
//		// 1
//		  21
//		 321
//	    4321
//	   54321

		 int rows = 5;

	        for (int i = 0; i < rows; i++) {
	            // Print spaces for alignment
	            for (int k = 0; k < rows - i - 1; k++) {
	                System.out.print(" ");
	            }

	            // Print numbers in decreasing order
	            for (int j = i; j >= 0; j--) {
	                System.out.print(j + 1);
	            }
	            System.out.println();
	        }
	}

}
