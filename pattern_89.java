package Pattern;

public class pattern_89 {

	public static void main(String[] args) {
//		//  1
//		   333
//		  55555
//		 7777777
//		999999999

		int rows = 5;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int j = 0; j < num; j++) {
                System.out.print(num);
            }

            // Increase num for next row
            num += 2;

            System.out.println();
        }
	}

}
