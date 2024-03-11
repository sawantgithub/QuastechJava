package Pattern;

public class pattern_76 {

	public static void main(String[] args) {
//		// A
//		   AB
//		   ABC
//		   ABCD
//		   ABCDE

		  int rows = 5;

	        for (int i = 0; i < rows; i++) {
	            char currentChar = 'A';
	            for (int j = 0; j <= i; j++) {
	                System.out.print(currentChar++);
	            }
	            System.out.println();
	        }
		
	}

}
