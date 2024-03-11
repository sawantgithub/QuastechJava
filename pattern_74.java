package Pattern;

public class pattern_74 {

	public static void main(String[] args) {
//		// ABCDE
//		   ABCDE
//		   ABCDE
//		   ABCDE
//		   ABCDE
		
		int rows = 5;
        char startChar = 'A';
        char endChar = 'E';

        for (int i = 1; i <= rows; i++) {
            for (char ch = startChar; ch <= endChar; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

	}

}
