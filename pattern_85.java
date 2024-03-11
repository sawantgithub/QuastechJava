package Pattern;

public class pattern_85 {

	public static void main(String[] args) {
//		// * * * * *
//		    * * * *
//             * * *
//              * *
//               *
		
		int size = 5;

        for (int i = 0; i < size; i++) {
            // Print spaces for indentation
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            // Print stars for the pattern
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
