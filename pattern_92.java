package Pattern;

public class pattern_92 {

	public static void main(String[] args) {
//		// 1
//		  21
//		 321
//		4321
//	   54321

		 int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces for indentation
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print(" ");
	            }

	            // Print numbers in descending order
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	}

}
