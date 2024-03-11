package Pattern;

public class pattern_81 {

	public static void main(String[] args) {
//		// 54321
//		   4321
//		   321
//		   21
//		   1

		
		int rows = 5;

        for (int i = 0; i < rows; i++) {
            int currentNum = 5 - i;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(currentNum--);
            }
            System.out.println();
        }
	}

}
