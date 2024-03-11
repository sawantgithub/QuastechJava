package Pattern;

public class pattern_79 {

	public static void main(String[] args) {
//		// 10101
//		   01010
//		   10101
//		   01010
//		   10101

		 int rows = 5;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < rows; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println();
	        }
	}

}
