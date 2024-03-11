package Pattern;

public class pattern_78 {

	public static void main(String[] args) {
//		// EDCBA
//		   EDCB
//		   EDC
//		   ED
//		   E

		
		 int rows = 5;

	        for (int i = 0; i < rows; i++) {
	            char currentChar = 'E';
	            for (int j = 0; j < rows - i; j++) {
	                System.out.print(currentChar--);
	            }
	            System.out.println();
	        }
	}

}
