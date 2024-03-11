package Pattern;

public class pattern_75 {

	public static void main(String[] args) {
//		// ABCDE
//		   FGHIJ
//		   KLMNO
//		   PQRST
//		   UVWXY
		
		 int rows = 5;
	        char startChar = 'A';
	        int charsPerRow = 5;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < charsPerRow; j++) {
	                char currentChar = (char) (startChar + i * charsPerRow + j);
	                System.out.print(currentChar);
	            }
	            System.out.println();
	        }

	}

}
