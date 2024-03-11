package Pattern;

public class pattern_83 {

	public static void main(String[] args) {
//		// *****
//		   * * *
//		   *****
//		   * * *
//		   *****

		 int rows = 5;
	        
	        // Outer loop for rows
	        for (int i = 1; i <= rows; i++) {
	            
	            // Inner loop for columns
	            for (int j = 1; j <= 5; j++) {
	                // Check if it's the middle row or if it's an even row
	                if (i == 5 || i % 2 != 0) {
	                    System.out.print("*");
	                } else {
	                    // If it's an odd row
	                    if (j % 2 != 0) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	            System.out.println(); // Move to the next line after printing each row
	        }
		
	}

}
