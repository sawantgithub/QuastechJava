package Pattern;

public class pattern_77 {

	public static void main(String[] args) {
//		// A
//		   BB
//		   CCC
//		   DDDD
//		   EEEEE
		
		int rows = 5;

        for (int i = 0; i < rows; i++) {
            char currentChar = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar);
            }
            System.out.println();
        }

	}

}
