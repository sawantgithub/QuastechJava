package Pattern;

public class pattern_71 {

	public static void main(String[] args) {
		// 54321
//		5432
//		543
//		54
//		5
		
		 int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 5; j >= i; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	}

}
